package com.nst.Netbanking;

import java.util.Random;

public class NetbankingService {

	public String createAccount(String aadhar,double initialAmt, String type)
	{
		return "Account is opened "+ new Random().nextLong(500000000l);
	}
}
