package com.test.utility;

import java.util.ArrayList;

import XLS_reader.Xls_Reader;


public class TestUtil 
{
	static Xls_Reader reader;
	public static ArrayList<Object[]> getDataFromExcel()
	{
		ArrayList<Object[]>mydata= new ArrayList<Object[]>();
			reader=new Xls_Reader("C:\\Users\\Jogesh\\Documents\\workspace-spring-tool-suite-4-4.8.1.RELEASE\\UniversalClassApplication\\TestDataSubscribe.xlsx");
			for(int rowNum = 2; rowNum <= reader.getRowCount("Sheet1"); rowNum++)
			{
				String Firstname=reader.getCellData("Sheet1", "Firstname", rowNum);
				String Lastname=reader.getCellData("Sheet1", "Lastname", rowNum);
				String email=reader.getCellData("Sheet1", "email", rowNum);
				String password=reader.getCellData("Sheet1", "password", rowNum);
				
				Object ob[]= {Firstname,Lastname,email,password};
				mydata.add(ob);
				
			}
			return mydata;
	
	}

}
