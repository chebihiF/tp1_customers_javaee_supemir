package com.example.tp1_customers.dao;

import com.example.tp1_customers.entities.Customer;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory factory ;
    static{
        factory = new Configuration()
                .configure()
                .addAnnotatedClass(Customer.class)
                .buildSessionFactory();
    }
    public static SessionFactory getFactory() {
        return factory;
    }
}
