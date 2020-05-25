package com.SaiJava.HibernateHql;

import java.util.List;
import java.util.Random;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	Configuration cfg=new Configuration().configure().addAnnotatedClass(Student.class);
    	org.hibernate.service.ServiceRegistry rg=new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry(); 
    	SessionFactory sf=cfg.buildSessionFactory(rg);
    	Session session=sf.openSession();
    	org.hibernate.Transaction tx=session.beginTransaction();
    	Query q=session.createQuery("from student");
    	                                                       //for paricluar column data           --.Query q=sesson.createQuery("from student where sid=7");
    	                                                       // Object[] student=(Object[])q.uniqueResult();
    	              List<Student> s=q.list();
    	              for(Student s1:s)
    	              {
    	            	  System.out.print(s);
    	              }
    	//Random r=new Random();
    	//for(int i=0; i<=10; i++)
    	//{
    		//Student s=new Student();
    		//s.setSid(i);
    		//s.setSname("name"+i);
    		//s.setSmarks(r.nextInt(100));
    		//session.save(s);
    	//}
    	//tx.commit();
    	//session.close();
    }
}
