package com.mybank.domain;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class Customer implements Serializable{

	  private String firstName;

	  private String lastName;

	  private Account[] accounts;
	  private int numberOfAccounts;

	  public Customer(String f, String l) {
	    firstName = f;
	    lastName = l;
	    // initialize accounts array
	    accounts = new Account[10];
	    numberOfAccounts = 0;
	  }

	  public String getFirstName() {
	    return firstName;
	  }

	  public String getLastName() {
	    return lastName;
	  }

	  public void addAccount(Account acct) {
	    int i = numberOfAccounts++;
	    accounts[i] = acct;
	  }

	  public int getNumOfAccounts() {
	    return numberOfAccounts;
	  }

	  public Account getAccount(int account_index) {
	    return accounts[account_index];
	  }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(accounts);
		result = prime * result + Objects.hash(firstName, lastName, numberOfAccounts);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Arrays.equals(accounts, other.accounts) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName) && numberOfAccounts == other.numberOfAccounts;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", accounts=" + Arrays.toString(accounts)
				+ ", numberOfAccounts=" + numberOfAccounts + "]";
	}
	
	  



}





