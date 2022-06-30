package com.example.tp1_customers.dao;

import com.example.tp1_customers.entities.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDaoDump implements ICustomerDao{

    private static List<Customer> customers = new ArrayList<>();

    public void initData(){
        customers.add(new Customer(1L,"ahmed","ahmed@gmail.com"));
        customers.add(new Customer(2L,"sanaa","sanaa@gmail.com"));
    }

    @Override
    public Customer addCustomer(Customer customer) throws Exception {
        customers.add(customer);
        return customer;
    }

    @Override
    public Customer updateCustomer(Customer customer) throws Exception {
        for(Customer cs : customers){
            if(cs.getId() == customer.getId()){
                cs.setName(customer.getName());
                cs.setEmail(customer.getEmail());
            }
        }
        return customer;
    }

    @Override
    public Customer deleteCustomer(Customer customer) throws Exception {
        for(int i=0; i<customers.size(); i++){
            if(customers.get(i).getId() == customer.getId()){
                customers.remove(i);
            }
        }
        return customer;
    }

    @Override
    public Customer getCustomer(Long id) throws Exception {
        for(Customer cs : customers){
            if(cs.getId() == id){
                return cs;
            }
        }
        return null ;
    }

    @Override
    public List<Customer> getCustomers() throws Exception {
        return customers;
    }
}
