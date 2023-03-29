package nopCommerce.Demo.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Utils
{
    WebDriver driver;

    public Utils(WebDriver driver)
    {
        this.driver=driver;

    }

    public WebElement getElement(By locator)
    {
        WebElement element=driver.findElement(locator);
        return element;
    }

    public void doClick(By locator)
    {
        getElement(locator).click();

    }
    public void doSendkey(By locator,String Value)
    {
        getElement(locator).sendKeys(Value);
    }
}
