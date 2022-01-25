package com.sierra.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Queue;




public class EmployeeDAO implements IEmployeeDAO{
	
	@Override
	public List<Employee> getEmployees() {
		Connection connection = DBUtil.getDBConnection();
		List<Employee> empList=null;
		try {
			//step3: get the Statement object to send SQL queries to DB
			Statement statement = connection.createStatement();
			//step4 : Execute the query
			ResultSet resultSet = statement.executeQuery("select EMP_ID, EMPNAME, SALARY, PASSWORD, DEPT_ID from EMPLOYEE");
			empList=new ArrayList<Employee>();
			while(resultSet.next()) {
				Employee emp=new Employee();
				emp.setEmpID(resultSet.getInt("EMP_ID"));  // extracting the data from resultset and setting into Employee 
				emp.setName(resultSet.getString("EMPNAME"));
				emp.setSalary(resultSet.getFloat("SALARY"));
				emp.setPassword(resultSet.getString("PASSWORD"));
				emp.setDeptID(resultSet.getInt("DEPT_ID"));
				empList.add(emp);
			}
			/* Batch object send multiple queries with multiple records to the DB
			statement.addBatch("insert query1");
			statement.addBatch("insert query2");
			statement.executeBatch();*/
			
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empList;
	}

	@Override
	public int addEmployee(Employee emp) {
		Connection connection=DBUtil.getDBConnection();
		int recordsInserted=0;
		try {
			//Statement(I) <-- PreparedStatement(I) <-- CallableStatement(I)
			//Statement sends a single query with single record
			//PreparedStatement sends a single query with multiple records = reduces the DB hits = improves perfomrance of application
			//step3:
			/*Statement statement=connection.createStatement();
			//step4:
			recordsInserted =statement.executeUpdate("insert into EMPLOYEE(EMP_ID, EMPNAME, SALARY, PASSWORD, DEPT_ID) values("+emp.getEmpID()+",'"+emp.getName()+"',"+emp.getSalary()+",'"+emp.getPassword()+"',"+emp.getDeptID()+")");
		 */
			//step3:
			PreparedStatement prepareStatement = connection.prepareStatement("insert into EMPLOYEE(EMP_ID, EMPNAME, SALARY, PASSWORD,DEPT_ID) values(?,?,?,?,?)");
			prepareStatement.setInt(1, emp.getEmpID());
			prepareStatement.setString(2, emp.getName());
			prepareStatement.setDouble(3, emp.getSalary());
			prepareStatement.setString(4, emp.getPassword());
			prepareStatement.setInt(5, emp.getDeptID());
			
			recordsInserted=prepareStatement.executeUpdate(); //step4
			
			/*CallableStatement callableStatement = connection.prepareCall("{CALL myProcedure(?,?,?,?,?)}");
			callableStatement.setInt(1, emp.getEmpID());      //step3
			callableStatement.setString(2, emp.getName());
			callableStatement.setDouble(3, emp.getSalary());
			callableStatement.setString(4, emp.getPassword());
			callableStatement.setInt(5, emp.getDeptID());
			recordsInserted=callableStatement.executeUpdate();  //step4 */
			 
		
			connection.close();  //step5
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return recordsInserted;
	
		
	}

	@Override
	public List<Integer> addEmployees(List<Employee> empList) {
	
		Connection connection=DBUtil.getDBConnection();
		List<Integer> recordsList=new ArrayList<>();
		try {
			PreparedStatement prepareStatement= connection.prepareStatement("insert into EMPLOYEE(EMP_ID, EMPNAME, SALARY, PASSWORD,DEPT_ID) values(?,?,?,?,?)");
			for (Employee employee : empList) {
				prepareStatement.setInt(1, employee.getEmpID());
				prepareStatement.setString(2, employee.getName());
				prepareStatement.setDouble(3, employee.getSalary());
				prepareStatement.setString(4, employee.getPassword());
				prepareStatement.setInt(5, employee.getDeptID());
				recordsList.add(prepareStatement.executeUpdate()); 
			}
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return recordsList;
	}
		
	

	@Override
	public int addEmployeesWithQueue(Queue<Employee> emp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Employee findEmployeeById(int eid) {
		// TODO Auto-generated method stub
				Connection connection=DBUtil.getDBConnection();
				Employee emp=new Employee();
				try {
					PreparedStatement prepareStatement= connection.prepareStatement("select * from EMPLOYEE where EMP_ID=?");
					prepareStatement.setInt(1, eid);
					ResultSet resultSet = prepareStatement.executeQuery();
					if(resultSet.next()) {
						emp.setEmpID(resultSet.getInt("EMP_ID"));  // extracting the data from resultset and setting into Employee 
						emp.setName(resultSet.getString("EMPNAME"));
						emp.setSalary(resultSet.getFloat("SALARY"));
						emp.setPassword(resultSet.getString("PASSWORD"));
						emp.setDeptID(resultSet.getInt("DEPT_ID"));
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return emp;
	}

	@Override
	public int addEmployeesWithMap(int key, Employee emp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Employee updateEmployeeSalaryWithMap(int eid, double salary) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Properties getEmployeesWithProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean logincheck(int empID, String password) {
		Connection connection=DBUtil.getDBConnection();
		boolean check=false;
		try {
			PreparedStatement prepareStatement= connection.prepareStatement("select * from EMPLOYEE where EMP_ID=? and PASSWORD=?");
			prepareStatement.setInt(1, empID);
			prepareStatement.setString(2, password);
			
			ResultSet resultSet = prepareStatement.executeQuery();
			if(resultSet.next()) {
				check=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}

}

