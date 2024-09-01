package com.CustomerAcc;

import java.util.List;
import java.util.Random;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "account_details")
public class Account {
 @Id
    private int AccountNumber;

    private String IFSC_Code;
    private String BankName;

    @OneToOne(mappedBy = "ac")
    private Customer customer;
    
    public Account() {
        this.AccountNumber = generateAccountNumber();
    }

    // Method to generate a random account number
    private int generateAccountNumber() {
        Random random = new Random();
        return 10000000 + random.nextInt(90000000); // Generates an 8-digit random number
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

/*package com.CustomerAcc;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Account {
	
	@OneToMany(mappedBy = "Account")
	private List<Customer> Customer;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int AccountNumber;

private String IFSC_Code;

private String BankName;

public List<Customer> getCustomer() {
	return Customer;
}

public void setCustomer(List<Customer> customer) {
	Customer = customer;
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

public void setAccount(Account ac) {
	// TODO Auto-generated method stub
	
}
}*/
