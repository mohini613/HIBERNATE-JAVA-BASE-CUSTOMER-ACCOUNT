package com.CustomerAcc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "account_details")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int AccountNumber;

    private String IFSC_Code;
    private String BankName;

    @OneToOne(mappedBy = "ac")
    private Customer customer;
    
    public Account() {
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getIFSC_Code() {
        return IFSC_Code;
    }

    public void setIFSC_Code(String iFSC_Code) {
        IFSC_Code = iFSC_Code;
    }

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String bankName) {
        BankName = bankName;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
