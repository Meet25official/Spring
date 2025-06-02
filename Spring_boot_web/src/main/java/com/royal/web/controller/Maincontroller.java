package com.royal.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Maincontroller {
	
	@GetMapping("/")
	public String homePage() {
		return "home";
	}
	
	@GetMapping("/employee")
	public String employee() {
		return "employee";
	}
	
	@GetMapping("/user")
	public String user() {
		return "user";
	}
	
	@PostMapping("/employees")
    public String EmployeeForm(
            @RequestParam("name") String name,
            @RequestParam("dept") String dept,
            @RequestParam("salary") double salary,
            @RequestParam("exp") int exp,
            @RequestParam("joinDate") String joinDate,
            @RequestParam("dob") String dob,
            @RequestParam("address") String address,
            @RequestParam("city") String city,
            @RequestParam("state") String state,
            @RequestParam("country") String country,
            @RequestParam("zipcode") String zipcode) {
		
		 String firstName = "";
		 String lastName = "";
		 String[] nameParts = name.trim().split("\\s+");
		 
		 if (nameParts.length >= 2) {
			 firstName = nameParts[0];
			 lastName = nameParts[1];
		 } else if (nameParts.length == 1) {
			 firstName = nameParts[0];
			 lastName = ""; 
		 }

        System.out.println("Employee Form Submitted:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Department: " + dept);
        System.out.println("Salary: " + salary);
        System.out.println("Experience: " + exp);
        System.out.println("Join Date: " + joinDate);
        System.out.println("DOB: " + dob);
        System.out.println("Address: " + address);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Country: " + country);
        System.out.println("Zipcode: " + zipcode);

        return "home";
    }
	
	@PostMapping("/users")
    public String UserForm(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("password") String password) {

        System.out.println("User Form Submitted:");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);

        return "home";
    }
}
