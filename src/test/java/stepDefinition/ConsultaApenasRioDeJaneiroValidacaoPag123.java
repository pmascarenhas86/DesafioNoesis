package stepDefinition;

import PageObjects.PO_GuiaMedico;
import PageObjects.PO_HomePage;
import Utils.Base;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static Utils.Base.PastaEvidencia;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class ConsultaApenasRioDeJaneiroValidacaoPag123 {
    public WebDriver driver;
    PO_GuiaMedico Guia;
    PO_HomePage Home;

    public void Start(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
    }

    @E("validar que nas paginas 1,2 e 3 nao exista retorno de São Paulo")
    public void validaRetornoPesquisa() throws Exception {
        Start();
        Home = new PO_HomePage(driver);
        .AcessarSite();

    }

    public boolean validaPagina1() {
        if(driver.getPageSource().contains("São Paulo"))
        {return true; }
        else
        {return false;}
    }

    public boolean validaPagina2(){
        if(driver.getPageSource().contains("São Paulo"))
        {return true; }
        else
        {return false;}
    }

      public boolean validaPagina3(){
          if(driver.getPageSource().contains("São Paulo"))
          {return true; }
          else
          {return false;}
      }
    }

