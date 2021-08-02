package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;


public class Base {
public static void main(String[] args){}

    public WebDriver driver;

    public Base(WebDriver driver){
        this.driver = driver;
            }
public static String SiteDesejado="https://www.unimed.coop.br/site/";
    public static String PastaEvidencia="src/test/resources/evidencias/";
    public static String errado="arguments[0].setAttribute('style', 'background: yellow; border: 3px solid red;');";
    public static String correto="arguments[0].setAttribute('style', 'background: yellow; border: 3px solid teal;');";




    public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception{
        TakesScreenshot scrShot =((TakesScreenshot)webdriver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File(fileWithPath);
        FileUtils.copyFile(SrcFile, DestFile);
    }

    public Boolean visivel(WebElement element){
        try
    {
        return element.isDisplayed();}
        catch(org.openqa.selenium.NoSuchElementException e){return false;}}

    public void clicar(By locator){
        driver.findElement(locator).click();
            }

}
