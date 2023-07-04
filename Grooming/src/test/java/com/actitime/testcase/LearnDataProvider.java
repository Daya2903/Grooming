package com.actitime.testcase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataProvider {
	@DataProvider
public Object[][] iHaveData() {
	Object[][]data=new Object[3][3];
	data[0][0]=18;
	data[0][1]="ViratKohli";
	data[0][2]="RCB";
	data[1][0]=7;
	data[1][1]="M.S.Dhoni";
	data[1][2]="CSK";
	data[2][0]=45;
	data[2][1]="Rohit Sharma";
	data[2][2]="MI";
	return data;
}
@Test(dataProvider = "iHaveData")
public void getTheData(int id,String name, String team) {
System.out.println
("ID: "+id+"--> Name of the player: "+ name+"--> player's team: "+ team);
}
}
