package TestNG;

import org.testng.annotations.DataProvider;

public class DataPro2 {
	@DataProvider
	public Object[] getData() {
		Object[][] data=new Object[3][4];
		data[0][0] = "geeta";
		data[0][1] = "varde";
		data[0][2] = "geeta";
		data[0][3] = 32;
		
		data[1][0] = "vir";
		data[1][1] = "shende";
		data[1][2] = "Rohan";
		data[1][3] = 27;
		
		data[2][0] = "seema";
		data[2][1] = "aher";
		data[2][2] = "sita";
		data[2][3] = 29;
		return data;

	}

}
