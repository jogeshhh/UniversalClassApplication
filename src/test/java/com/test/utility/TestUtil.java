package com.test.utility;

import java.io.IOException;
import java.util.ArrayList;

import XLS_reader.XLs_Reader2;

public class TestUtil 
{
	static XLs_Reader2 reader;
	public static ArrayList<Object[]> getSubscribeDataFromExcel() throws IOException
	{
		ArrayList<Object[]> mydata = new ArrayList<Object[]>();
			reader=new XLs_Reader2("D:\\Capgemini\\Sprint 2 -Dec files\\TestData.xlsx");
			for(int rowNum = 2; rowNum <= reader.getRowCount("SubscribeSheet"); rowNum++)
			{
				String Firstname=reader.getCellData("SubscribeSheet", rowNum, 1);
				String Lastname=reader.getCellData("SubscribeSheet", rowNum, 2);
				String email=reader.getCellData("SubscribeSheet", rowNum, 3);
				String password=reader.getCellData("SubscribeSheet", rowNum, 4);
				
				Object ob[]= {Firstname,Lastname,email,password};
				mydata.add(ob);
				
			}
		return mydata;
	
	}
	
	public static ArrayList<Object[]> getPaymentDataFromExcel() throws IOException
	{
		ArrayList<Object[]> mydata = new ArrayList<Object[]>();
		reader=new XLs_Reader2("D:\\Capgemini\\Sprint 2 -Dec files\\TestData.xlsx");
			for(int rowNum = 2; rowNum <= reader.getRowCount("PaymentSheet"); rowNum++)
			{
				String CCNo=reader.getCellData("PaymentSheet", rowNum, 1);
				String CVV=reader.getCellData("PaymentSheet", rowNum, 2);
				String country=reader.getCellData("PaymentSheet", rowNum, 3);
				String phoneNo=reader.getCellData("PaymentSheet", rowNum, 4);
				
				Object ob[]= {CCNo,CVV,country,phoneNo};
				mydata.add(ob);
				
			}
		return mydata;
	
	}
	
	public static ArrayList<Object[]> getSignInDataFromExcel() throws IOException
	{
		ArrayList<Object[]> mydata = new ArrayList<Object[]>();
		reader=new XLs_Reader2("D:\\Capgemini\\Sprint 2 -Dec files\\TestData.xlsx");
			for(int rowNum = 2; rowNum <= reader.getRowCount("SignInSheet"); rowNum++)
			{
				String email=reader.getCellData("SignInSheet", rowNum, 1);
				String password=reader.getCellData("SignInSheet", rowNum, 2);
				
				Object ob[]= {email,password};
				mydata.add(ob);
				
			}
		return mydata;		
	}
	
	public static ArrayList<Object[]> getForgotPasswordDataFromExcel() throws IOException
	{
		ArrayList<Object[]> mydata = new ArrayList<Object[]>();
		reader=new XLs_Reader2("D:\\Capgemini\\Sprint 2 -Dec files\\TestData.xlsx");
			for(int rowNum = 2; rowNum <= reader.getRowCount("ForgotPasswordSheet"); rowNum++)
			{
				String email=reader.getCellData("ForgotPasswordSheet", rowNum,1);				
				Object ob[]= {email};
				mydata.add(ob);
				
			}
		return mydata;		
	}

}
