package com.CustomerAcc;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.OneToManyStud.Student;
import com.OneToManyStud.Teacher;

public class MainCA {
	public static void main(String[] args) {
	       SessionFactory sf = HibernateUutil.getSessionFactory();
	       
	        Session session = sf.openSession();
	        Transaction tx = session.beginTransaction();
	
	        Account ac= new Account();
	        ac.setAccountNumber(01);
	        ac.setBankName("SBI");
        	ac.setIFSC_Code("5556SWD6DE4");
        	
        	Account ac2= new Account();
	        ac2.setAccountNumber(010);
	        ac2.setBankName("SBI");
        	ac2.setIFSC_Code("5556SWD6DE4");
        	
        	Account ac3= new Account();
	        ac3.setAccountNumber(0100);
	        ac3.setBankName("SBI");
        	ac3.setIFSC_Code("5556SWD6DE4");
        	
        	Account ac4= new Account();
	        ac4.setAccountNumber(015);
	        ac4.setBankName("SBI");
        	ac4.setIFSC_Code("5556SWD6DE4");
        	
        	Account ac5= new Account();
	        ac5.setAccountNumber(001);
	        ac5.setBankName("SBI");
        	ac5.setIFSC_Code("5556SWD6DE4");
        	
        	Customer c= new Customer();
	        c.setC_Id(01);
	        c.setCustomer_Name("Mohini Gaikwad");
        	c.setAadhar_Card(632545123);
        	c.setMobileNo(963258744);
        	c.setPanCard("E6SS5F2E");
            c.setAccount(ac);

        	
        	Customer c2= new Customer();
	        c2.setC_Id(02);
	        c2.setCustomer_Name("Revati Kamble");
        	c2.setAadhar_Card(4563218);
        	c2.setMobileNo(962548121);
        	c2.setPanCard("D58RG8R4");
            c2.setAccount(ac2);

        	
        	Customer c3= new Customer();
	        c3.setC_Id(03);
	        c3.setCustomer_Name("Sakshi Chafekar");
        	c3.setAadhar_Card(445651323);
        	c3.setMobileNo(2961154);
        	c3.setPanCard("DE54D3D");
            c3.setAccount(ac3);

        	
        	Customer c4= new Customer();
	        c4.setC_Id(04);
	        c4.setCustomer_Name("Durga Shitole");
        	c4.setAadhar_Card(874512956);
        	c4.setMobileNo(963416538);
        	c4.setPanCard("21F5G511V2");
            c4.setAccount(ac4);

        	
        	Customer c5= new Customer();
	        c5.setC_Id(05);
	        c5.setCustomer_Name("Vaishnavi  B");
        	c5.setAadhar_Card(69646314);
        	c5.setMobileNo(486966287);
        	c5.setPanCard("H1G8G6513F");
            c5.setAccount(ac5);

            session.save(ac);
            session.save(ac2);
            session.save(ac3);
            session.save(ac4);
            session.save(ac5);

            
            session.save(c);
            session.save(c2);
            session.save(c3);
            session.save(c4);
            session.save(c5);

            tx.commit();
        	sf.close();
           session.close();
	
}
}