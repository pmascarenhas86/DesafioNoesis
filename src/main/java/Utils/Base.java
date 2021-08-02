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


    public static void print(WebDriver webdriver, String fileWithPath) throws Exception{
        TakesScreenshot scrShot =((TakesScreenshot)webdriver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File(fileWithPath);
        FileUtils.copyFile(SrcFile, DestFile);
    }


}
