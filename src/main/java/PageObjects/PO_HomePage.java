package PageObjects;

import Utils.Base;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class PO_HomePage extends Base {
    WebDriver driver;
    JavascriptExecutor executor;

    public PO_HomePage(WebDriver driver) {
        super(driver);
      this.driver = driver;
        this.executor = (JavascriptExecutor) this.driver;
        PageFactory.initElements(driver, this);
}


//Elementos PaginaInicial
   @FindBy(xpath="/html/body/div[1]/header/div/nav[2]/div/div/ul/li[4]/div")
    private WebElement CampoBusca;

@FindBy(linkText="ENCONTRE UM MÉDICO")
public WebElement LinkPesquisaMedico;



    public PO_GuiaMedico BuscaMedico() throws InterruptedException {
        ExpectedConditions.visibilityOf(LinkPesquisaMedico);
        LinkPesquisaMedico.click();
return new PO_GuiaMedico(driver);
    }


    public boolean ValidaHP() {
        try {
            CampoBusca.isDisplayed();
            return true;
        }
        catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }




}
