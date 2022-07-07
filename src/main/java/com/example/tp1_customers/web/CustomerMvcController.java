package com.example.tp1_customers.web;

import com.example.tp1_customers.entities.Customer;
import com.example.tp1_customers.metier.ICustomerMetier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerMvcController {

    private final ICustomerMetier metier ;

    public CustomerMvcController(ICustomerMetier metier) {
        this.metier = metier;
    }

    @GetMapping
    public String getCustomers(Model model) throws Exception{
        List<Customer> customers = metier.getCustomers();
        model.addAttribute("customers",customers);
        return "customers";
    }
}

