//package com.quynhtadinh.thetd.controller;
//
//import com.quynhtadinh.thetd.entity.Customer;
//import com.quynhtadinh.thetd.service.CustomerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//@RequestMapping("/customer")
//public class CustomerController {
//
//    @Autowired
//    private CustomerService customerService;
//
//    @GetMapping("/{id}")
//    public String viewCustomerDetails(@PathVariable Long id, Model model) {
//        Customer customer = customerService.getCustomerById(id);
//        model.addAttribute("customer", customer);
////        model.addAttribute("creditCards", customer.getCreditCards());
//        return "customer/details";
//    }
//
//
//
//
//}
