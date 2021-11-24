package TestNG;

import org.testng.annotations.DataProvider;

public class DataPro1 {
	@DataProvider
	public Object[] getData() {
		Object[][] data=new Object[3][4];
		data[0][0] = "Rohini";
		data[0][1] = "Bangar";
		data[0][2] = "Rohini";
		data[0][3] = 25;
		
		data[1][0] = "Rohan";
		data[1][1] = "shinde";
		data[1][2] = "Rohan";
		data[1][3] = 30;
		
		data[2][0] = "sita";
		data[2][1] = "kad";
		data[2][2] = "sita";
		data[2][3] = 22;
		return data;

	}

}
