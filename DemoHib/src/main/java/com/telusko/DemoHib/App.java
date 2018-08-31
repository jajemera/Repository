package com.telusko.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.spi.SessionFactoryServiceInitiator;
import org.hibernate.service.spi.SessionFactoryServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        AlienName an = new AlienName();
        an.setFname("Joseph Allen");
        an.setMname("Rarela");
        an.setLname("Jemera");
        
        Alien telusko = new Alien();
        telusko.setAid(102);
        telusko.setAname(an);
//        telusko.setAname("Joseph");
        telusko.setColor("Orange");
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        
        SessionFactory sf = con.buildSessionFactory();
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        
        
        session.save(telusko);
        
        
        // Data retrieval 
//        telusko = (Alien) session.get(Alien.class, 102);
        
        tx.commit();
        
        
        
        System.out.println(telusko);
    }
}
