package com.nst.Netbanking;

import java.util.Date;
import java.util.Random;

public class NetbankingService {

	public String createAccount(String aadhar,double initialAmt, String type)
	{
		return "Account is opened "+ new Random().nextLong(500000000l);
	}
	
	
	public String withdrawAmount(String accno , Double Amount)
	{
		return Amount+" is debited from Account Number "+ accno + " on "+ new Date();
	}
	
	public String depositeAmount(String accno , Double Amount)
	{
		return Amount+" is credited to Account Number "+ accno +" on "+ new Date();
	}
	
	
	
	
	
	public String closeAccount()
	{
		return "Account is closed";
	}
}
