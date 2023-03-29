package nopCommerce.Demo.Pages;

import nopCommerce.Demo.Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage
{
 WebDriver driver;
 Utils utils;


 By RegisterLink= By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
 By Gender=By.id("gender-female");
 By Firstname=By.id("FirstName");
 By Lastname=By.id("LastName");
 By daydob = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]");
 By monthdob=By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]");
 By yeardob=By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]");
 By email=By.id("Email");
 By Company =By.id("Company");
 By Password=By.id("Password");
 By Confirmpassword=By.id("ConfirmPassword");
 By RegisterButton=By.id("register-button");

        public RegisterPage(WebDriver driver)
        {
         this.driver = driver;
         utils = new Utils(driver);
        }

        public void clickDoRegisterLink()
        {
             utils.doClick(RegisterLink);
        }

        public void clickOnRegisterLink()
        {
             utils.doClick(RegisterLink);
        }
        public  void clickOnRegister()
        {
            utils.doClick(RegisterLink);
        }

        public void clickOnGender()
        {
            utils.doClick(Gender);
        }

        public void doRegister(String gender,String firstname,String lastname,String dayDOB,String monthDOB,String yearDOB,String mail,String companyname, String password,String confirmpassword)
        {

           utils.doSendkey(Gender,gender);
           utils.doSendkey(Firstname,firstname);
           utils.doSendkey(Lastname,lastname);
           utils.doSendkey(daydob,dayDOB);
           utils.doSendkey(monthdob,monthDOB);
           utils.doSendkey(yeardob,yearDOB);
           utils.doSendkey(email,mail);
           utils.doSendkey(Company,companyname);
           utils.doSendkey(Password,password);
           utils.doSendkey(Confirmpassword,confirmpassword);
           utils.doClick(RegisterButton);
        }


}
