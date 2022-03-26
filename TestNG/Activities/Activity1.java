package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.support.Color;
//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;

public class Activity1
{
    WebDriver driver;
    @BeforeClass
    public void openBrowser() throws Exception
    {
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
    }
    @Test
    //Check the title of the page
    public void matchTitle()
    {
        String title = driver.getTitle();
        //print the title
        System.out.println("Title of the page is : "+title);
        Assert.assertEquals(title , "SuiteCRM");
    }
    @Test
    //check the url of header
    public void activity2()
    {
        String header_Url = driver.findElement(By.xpath("//img[@alt='SuiteCRM']")).getAttribute("src");
        //print the Header URL
        System.out.println("Header URL is - "+header_Url);
    }

    //Activity 3 - get the first footer text
    @Test
    public void activity3()
    {
        String first_footer_text = driver.findElement(By.id("admin_options")).getText();
        //print the text
        System.out.println("Text of first Copy right symbol is: "+first_footer_text);
    }

    //Activity 4 - Login to Home page
    @Test
    public void activity4()
    {
        //select Username and enter the text
        driver.findElement(By.id("user_name")).sendKeys("admin");
        //select password field and enter text
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");

        //click on login button
        driver.findElement(By.name("Login")).click();

        //verify Home page opened
        String homePage_Url="https://alchemy.hguy.co/crm/index.php?module=Home&action=index";
        //Actual result
        String actual_homepage_url = driver.getCurrentUrl();

        //assert to verify home page has opened
        Assert.assertEquals(actual_homepage_url,homePage_Url);
    }

    //get the color of nav menu- Activity5
    @Test
    public void activity5()
    {
        String color = driver.findElement(By.id("toolbar")).getCssValue("color");
        String color_text = Color.fromString(color).asHex();
        //print the color
        System.out.println("Color of the tool bar is: "+color_text);
    }
    //check Activity menu exists
    @Test
    public void activity6()
    {
        //Navigation menu display
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='desktop-toolbar']")).isDisplayed());

        //Activities menu exist check
        Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Activities']")).isDisplayed());

        //Locate the menu item by mouse hover on it
        Actions menu_activity = new Actions(driver);
        menu_activity.moveToElement(driver.findElement(By.xpath("//a[text()='Activities']"))).build().perform();

        //check menu item 'Home' is available in Activity menu
        Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Calendar']")).isDisplayed());
    }

    //Click on sales then Leads - Activity7
    @Test
    public void activity7()
    {
        Actions menu_sales = new Actions(driver);
        //Sales Menu and Leads option
        WebElement sales = driver.findElement(By.xpath("//*[text()='Sales']"));
        //Click on SALES menu then Leads
        menu_sales.moveToElement(sales).build().perform();
        //click on Leads
        WebElement leads_option = driver.findElement(By.xpath("//*[text='Leads']"));
        leads_option.click();
        //click on additional details
        WebElement add_details= driver.findElement(By.xpath("(//tr[@class='oddListRowS1']/td[10])[1]"));
        add_details.click();

        //get the phone number
        WebElement phone_number = driver.findElement(By.xpath("//span[@class='phone']"));
        System.out.println("Phone number is - "+phone_number.getText());
    }


    //closebrowser
    @AfterClass
    public void closeBrowser()
    {
        driver.close();
    }


}
