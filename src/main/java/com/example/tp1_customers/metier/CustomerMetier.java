package com.example.tp1_customers.metier;

import com.example.tp1_customers.dao.CustomerDaoDump;
import com.example.tp1_customers.dao.ICustomerDao;
import com.example.tp1_customers.entities.Customer;

import java.util.List;

public class CustomerMetier implements ICustomerMetier{

    private ICustomerDao dao = new CustomerDaoDump();

    @Override
    public Customer addCustomer(Customer customer) throws Exception {
        if(!customer.getEmail().contains("gmail"))
            throw new RuntimeException("email invalid !!! ");
        if(customer.getId() == null)
            throw new RuntimeException("id must be defined");

        return dao.addCustomer(customer);


    }

    @Override
    public Customer updateCustomer(Customer customer) throws Exception {
        return null;
    }

    @Override
    public Customer deleteCustomer(Customer customer) throws Exception {
        return null;
    }

    @Override
    public Customer getCustomer(Long id) throws Exception {
        return null;
    }

    @Override
    public List<Customer> getCustomers() throws Exception {
        return dao.getCustomers();
    }

    @Override
    public void initData() {
        dao.initData();
    }
}
