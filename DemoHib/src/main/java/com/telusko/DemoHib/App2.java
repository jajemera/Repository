package com.telusko.DemoHib;

import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.spi.SessionFactoryServiceInitiator;
import org.hibernate.service.spi.SessionFactoryServiceRegistryBuilder;

/**
 * Hello world! 
 * Used for student logic that uses HQL.
 *
 */
public class App2 
{
    public static void main( String[] args )
    {
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
        
        SessionFactory sf = con.buildSessionFactory();
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        Random r = new Random();
        
//        for(int i=1; i<=50;i++) {
//        	Student s = new Student();
//        	s.setRollno(i);
//        	s.setName("Name " + i);
//        	s.setMarks(r.nextInt(100));
//        	session.save(s);
//        }
        
//        Query<Student> q = session.createQuery("from Student where marks > 50");
//        List<Student> students = q.list();
//        
//        for(Student s: students) {
//        	System.out.println(s);
//        }
        
        
//        Query<Student> q = session.createQuery("from Student where rollno=7");
//        Student student = (Student)q.uniqueResult();
//        System.out.println(student);
        
        
//        Query q = session.createQuery("select rollno, name, marks from Student where marks>60");
//        List<Object[]> students = (List<Object[]>) q.list();
//        
//        
//        for(Object[] student: students) {
//        	System.out.println(student[0] + " : " + student[1] + " : " + student[2]);
//            
//        }
//        
        
        int b = 60;
        Query q = session.createQuery("select sum(marks) from Student where marks> :b" );
        q.setParameter("b",  b);
        Long marks = (Long) q.uniqueResult();
        
        
        System.out.println(marks);
        
      
        session.getTransaction().commit();
        
        
        
    }
}
