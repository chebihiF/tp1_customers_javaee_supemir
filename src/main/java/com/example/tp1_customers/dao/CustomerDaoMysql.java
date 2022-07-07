package com.example.tp1_customers.dao;

import com.example.tp1_customers.entities.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

public class CustomerDaoMysql implements ICustomerDao{

    private SessionFactory factory = HibernateUtil.getFactory();
    private Session session;

    @Override
    public Customer addCustomer(Customer customer) throws Exception {
        try {
            session = factory.openSession();
            session.beginTransaction();
            Long customer_id = (Long) session.save(customer);
            customer.setId(customer_id);
            session.getTransaction().commit();
        }catch (Exception e) {
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
        return customer;
    }

    @Override
    public Customer updateCustomer(Customer customer) throws Exception {
        try {
            session = factory.openSession();
            session.beginTransaction();
            session.update(customer);
            session.getTransaction().commit();
        }catch (Exception e) {
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
        return customer;
    }

    @Override
    public Customer deleteCustomer(Customer customer) throws Exception {
        try {
            session = factory.openSession();
            session.beginTransaction();
            session.delete(customer);
            session.getTransaction().commit();
        }catch (Exception e) {
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
        return customer;
    }

    @Override
    public Customer getCustomer(Long id) throws Exception {
        Customer customer = null ;
        try {
            session = factory.openSession();
            session.beginTransaction();
            customer = session.find(Customer.class, id);
            session.getTransaction().commit();
        }catch (Exception e) {
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
        return customer;
    }

    @Override
    public List<Customer> getCustomers() throws Exception {
        List<Customer> customers = new ArrayList<>();
        try {
            session = factory.openSession();
            session.beginTransaction();
            customers = session.createQuery("from Customer c",Customer.class).getResultList();
            session.getTransaction().commit();
        }catch (Exception e) {
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
        return customers;
    }

    @Override
    public void initData() {

    }
}
