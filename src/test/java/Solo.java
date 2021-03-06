// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import java.util.*;
public class Solo {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
                js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void testCase1() {
        driver.manage().window().maximize();
        driver.get("https://www.unimed.coop.br/site/");
            driver.findElement(By.linkText("ENCONTRE UM MÉDICO")).click();
          driver.findElement(By.id("react-tabs-2")).click();
          driver.findElement(By.cssSelector(".Select--invalid-field > .css-1hwfws3")).click();
          driver.findElement(By.id("react-select-4-input")).sendKeys("Rio de Janeiro");
          driver.findElement(By.id("react-select-4-input")).sendKeys(Keys.ENTER);
          driver.findElement(By.cssSelector(".Button")).click();
        }
    }

