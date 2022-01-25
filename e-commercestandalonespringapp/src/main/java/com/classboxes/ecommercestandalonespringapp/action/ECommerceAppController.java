package com.classboxes.ecommercestandalonespringapp.action;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.classboxes.ecommercestandalonespringapp.dao.Customer;
import com.classboxes.ecommercestandalonespringapp.dao.Product;
import com.classboxes.ecommercestandalonespringapp.service.IECommerceAppService;

@RestController
@RequestMapping("/eCommerce")
public class ECommerceAppController {
	@Autowired
	IECommerceAppService ecpService;
	
	@GetMapping("/products")	
	List<Product> getProducts(){
		return ecpService.getProducts();	
	}
    @GetMapping("/customers")
    List<Customer> getCustomers(){
		return ecpService.getCustomers();
    }
    @PostMapping("/addProducts")
    Product addProduct(@RequestBody Product pro) {
		return ecpService.addProduct(pro);
    }
    @PostMapping("/addCustomers")
    Customer addCustomer(@RequestBody Customer cust) {
		return ecpService.addCustomer(cust);
    }
    @GetMapping("/find/{id}")	
    Optional<Product> findProductById(@PathVariable(name="id") int pro_Id){
		return ecpService.findProductById(pro_Id);
    	
    }
    @GetMapping("/get/{find}")
    Optional<Customer> findCustomerById(@PathVariable(name="find") int cust_Id){
		return ecpService.findCustomerById(cust_Id);
    	
    }
	
   
   
    
}
