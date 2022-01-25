package com.classboxes.ecommercestandalonespringapp.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.classboxes.ecommercestandalonespringapp.dao.Customer;
import com.classboxes.ecommercestandalonespringapp.dao.Product;
import com.classboxes.ecommercestandalonespringapp.service.IECommerceAppService;

@Controller
@RequestMapping("/ecomm")
public class ECommerceAppAction {
	@Autowired
	IECommerceAppService ecpService;
	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("login", new Customer());
		return "cLogin";
	}
	@GetMapping("/cust")
    public String customer(Model model){
    model.addAttribute("cust" , new Customer());
	return "ass18Customer";
 }
	@PostMapping("/add")
	public String customerreg(Customer cust) {
		ecpService.addCustomer(cust);
		return "cHome";
	}
	@PostMapping("/ladd")
	public void loging(int cust_Id, String email) {
		
	}
	
	
//	@GetMapping("/plogin")
//	public String log() {
//		return "pLogin";
//	}
//	@GetMapping("/product")
//	public String product(Model model) {
//		model.addAttribute("product", new Product());
//		return "ass18Product";
//	}
//	@PostMapping("/addition")
//	public String production(Product pro) {
//	  ecpService.addProduct(pro);
//	  return "pHome";	
//	}
//	
}
