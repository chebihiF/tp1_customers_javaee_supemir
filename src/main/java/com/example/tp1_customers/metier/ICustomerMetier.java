package com.example.tp1_customers.metier;

import com.example.tp1_customers.entities.Customer;

import java.util.List;

public interface ICustomerMetier {
    public Customer addCustomer(Customer customer) throws Exception;
    public Customer updateCustomer(Customer customer) throws Exception;
    public Customer deleteCustomer(Customer customer) throws Exception;
    public Customer getCustomer(Long id) throws Exception;
    public List<Customer> getCustomers() throws Exception;
    public void initData();
}
