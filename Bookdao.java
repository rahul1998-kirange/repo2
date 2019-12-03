package com.dao;
import com.book.*;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.book.Book;
import com.book.Images;
import com.user.AddToCart;
import com.user.UserRegister;

public class Bookdao {
	public static Book showBook(String Book_Id)
	{
		Book b=null;
		Session session=null;
		try
		{
	   StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

	   Metadata data=new MetadataSources(ssr).getMetadataBuilder().build();
	  
	   SessionFactory factory=data.getSessionFactoryBuilder().build();
	   
	   session=factory.openSession();
	  
	   Transaction tr=session.beginTransaction();
	   
	   Object obj=session.load(Book.class,new String(Book_Id));
	  
	   b=(Book)obj;
	   
	   System.out.println(b.getBook_Name());
	   tr.commit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		return b;
		
	}
	public static String insert(UserRegister u)
	{
		String i=null;
		Session session=null;
	
		try {
			
			
		   StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		  
		   Metadata data=new MetadataSources(ssr).getMetadataBuilder().build();
		
		   SessionFactory factory=data.getSessionFactoryBuilder().build();
		  
		   session=factory.openSession();
		  
		   Transaction tr=session.beginTransaction();
		  
		   i=(String)session.save(u);
		  
		   tr.commit();
		   }catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return i;
	}
	
	public static UserRegister login(String uname)
	{
		UserRegister u=null;
		Session session=null;
		try
		{
	   StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	   System.out.println("1");
	   Metadata data=new MetadataSources(ssr).getMetadataBuilder().build();
	   System.out.println("2");
	   SessionFactory factory=data.getSessionFactoryBuilder().build();
	   System.out.println("3");
	   session=factory.openSession();
	   System.out.println("4");
	   Transaction tr=session.beginTransaction();
	   System.out.println("5");
	   Object obj=session.load(UserRegister.class,new String(uname));
	   System.out.println("6");
	   u=(UserRegister)obj;
	   System.out.println(u.getPass());
	   tr.commit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		return u;
		
	}
	public static Images viewImages(String Book_Id)
	{
		Images i=null;
		Session session=null;
		try
		{
	   StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	
	   Metadata data=new MetadataSources(ssr).getMetadataBuilder().build();
	  
	   SessionFactory factory=data.getSessionFactoryBuilder().build();
	 
	   session=factory.openSession();
	  
	   Transaction tr=session.beginTransaction();
	   
	   Object obj=session.load(Images.class,new String(Book_Id));
	   
	   i=(Images)obj;
	   System.out.println("imagespath:"+i.getImage());
	   tr.commit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		return i;
	}
	public static String insertCart(AddToCart a)
	{
		String i=null;
		Session session=null;
	
		try {
			
			
		   StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		  
		   Metadata data=new MetadataSources(ssr).getMetadataBuilder().build();
		
		   SessionFactory factory=data.getSessionFactoryBuilder().build();
		  
		   session=factory.openSession();
		  
		   Transaction tr=session.beginTransaction();
		  
		   i=(String)session.save(a);
		  
		   tr.commit();
		   }catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return i;
		
	}
	public static AddToCart showCart(String Book_Id)
	{
		AddToCart a=null;
		Session session=null;
		try
		{
	   StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

	   Metadata data=new MetadataSources(ssr).getMetadataBuilder().build();
	  
	   SessionFactory factory=data.getSessionFactoryBuilder().build();
	   
	   session=factory.openSession();
	  
	   Transaction tr=session.beginTransaction();
	   
	   Object obj=session.load(Book.class,new String(Book_Id));
	  
	   a=(AddToCart)obj;
	   
	   System.out.println(a.getBook_Name());
	   tr.commit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		return a;
	}
	public static int customer_login(Customer c)
	{
		int i=0;
		Session session=null;
	
		try {
			
			
		   StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		  
		   Metadata data=new MetadataSources(ssr).getMetadataBuilder().build();
		
		   SessionFactory factory=data.getSessionFactoryBuilder().build();
		  
		   session=factory.openSession();
		  
		   Transaction tr=session.beginTransaction();
		  
		   i=(Integer)session.save(c);
		  
		   tr.commit();
		   }catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return i;
	}

	
}
