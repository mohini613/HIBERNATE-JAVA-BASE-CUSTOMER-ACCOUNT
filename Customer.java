package com.CustomerAcc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customer_details")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     private int C_Id;

    private String Customer_Name;

    private int Aadhar_Card;

    private String PanCard;

    private int MobileNo;
    
    @OneToOne
    @JoinColumn(name = "account_id") 
    private Account ac;

    public int getC_Id() {
        return C_Id;
    }

    public void setC_Id(int c_Id) {
        C_Id = c_Id;
    }

    public String getCustomer_Name() {
        return Customer_Name;
    }

    public void setCustomer_Name(String customer_Name) {
        Customer_Name = customer_Name;
    }

    public int getAadhar_Card() {
        return Aadhar_Card;
    }

    public void setAadhar_Card(int aadhar_Card) {
        Aadhar_Card = aadhar_Card;
    }

    public String getPanCard() {
        return PanCard;
    }

    public void setPanCard(String panCard) {
        PanCard = panCard;
    }

    public int getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(int mobileNo) {
        MobileNo = mobileNo;
    }

    public Account getAccount() {
        return ac;
    }

    public void setAccount(Account ac) {
        this.ac = ac;
    }
}
