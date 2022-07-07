package com.example.tp1_customers.web;

import com.example.tp1_customers.entities.Customer;
import com.example.tp1_customers.metier.CustomerMetier;
import com.example.tp1_customers.metier.ICustomerMetier;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

//@WebServlet("/customers")
public class CustomerController extends HttpServlet {

    private ICustomerMetier metier = new CustomerMetier();

    @Override
    public void init() throws ServletException {
        metier.initData();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            List<Customer> customers = metier.getCustomers();
            req.setAttribute("customers", customers);
            req.getRequestDispatcher("WEB-INF/views/customers.jsp").forward(req,resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
