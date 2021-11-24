package Selenium;

import java.util.Calendar;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 

public class calendertest1
{
    static int currentDay=0,
             currentMonth=0,
             currentYear=0;
    
    static int targetDay=0,
                targetMonth=0,
                targetYear=0;
    
    static int jumpMonthBy=0;
    static int jumpYearBy=0;
    
    static boolean increment=true;
    
    public static void main(String[] args) throws InterruptedException 
    {
        String DateToSet="02/11/2022";
        
        getCurrentDayDateandMonth();
        System.out.println(currentDay +" " +currentMonth + " " + currentYear);
        
        getTargetDayMonthandYear(DateToSet);
        System.out.println(targetDay+ " " +targetMonth + " " + targetYear);
    
        DiffinTagetandCurrent();
        System.out.println("Month jump by " + jumpMonthBy);
        System.out.println(increment);
        
        DiffinTagetandCurrentYear();
        System.out.println("Year jump By " + jumpYearBy );
        System.out.println(increment);
        
        System.setProperty("webdriver.chrome.driver", "/Users/Mithun/Documents/chromedriver");
       
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://way2automation.com/way2auto_jquery/datepicker.php#load_box");
        driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));
		
        driver.findElement(By.xpath("/html/body/p/input")).click();
        
        for(int i=0;i<jumpMonthBy;i++)
        {
            if(increment==true)
            {
                driver.findElement(By.xpath("//a[@data-handler='next']")).click();
            }
            else
            {
                driver.findElement(By.xpath("//a[@data-handler='prev']")).click();
            }
            Thread.sleep(3000L);
        }
    
        driver.findElement(By.linkText(String.valueOf(targetDay))).click();
    }
    
    public static void getCurrentDayDateandMonth()
    {
        Calendar cal= Calendar.getInstance();
        currentDay=cal.get(Calendar.DAY_OF_MONTH);
        currentMonth =cal.get(Calendar.MONTH)+1;
        currentYear =cal.get(Calendar.YEAR);
        
    }
    public static void getTargetDayMonthandYear(String DateToSet)
    {
        String day=DateToSet.substring(0,2);
        targetDay=Integer.parseInt(day);
        String month=DateToSet.substring(3,5);
        targetMonth=Integer.parseInt(month);
        String year=DateToSet.substring(6,10);
        targetYear=Integer.parseInt(year);
        
        
        
    }
    public static void DiffinTagetandCurrent()
    {
        if((targetMonth-currentMonth)>0)
        {
            jumpMonthBy=targetMonth-currentMonth;
        }
        else
        {
            jumpMonthBy=currentMonth-targetMonth;
            increment=false;
        }
    }

 


public static void DiffinTagetandCurrentYear()
{
    if((targetYear-currentYear)>0)
    {
        jumpYearBy=targetYear-currentYear;
    }
    else
    {
        jumpYearBy=currentYear-targetYear;
        increment=false;
    }
}
}