package PageObjects;
import Utils.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.openqa.selenium.By.xpath;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;


public class PO_GuiaMedico extends Base {
    WebDriver driver;
    JavascriptExecutor executor;

    public PO_GuiaMedico(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.executor = (JavascriptExecutor) this.driver;
        PageFactory.initElements(driver, this);
    }

//Montagem de elementos
public String Titulo="Guia Médico - Site Institucional";

@FindBy(id = "react-tabs-2")
    WebElement BuscaAvancada;

@FindBy(id = "react-select-4-input")
WebElement Estado;

@FindBy(css = ".Button")
  WebElement btnPesquisar;

@FindBy(xpath = "//*[@id=\"province-input\"]/div")
WebElement FieldEstadoBusca;

@FindBy(xpath = "//*[@id=\"gm-v3-root\"]/div/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[4]/button[1]")
WebElement Card1;

@FindBy(xpath = "//*[@id=\"gm-v3-root\"]/div/div[2]/div[2]/div[1]/div[3]/button")
WebElement btnProximaPagina;

@FindBy(xpath = "//*[contains(text(), '/SP')]")
    WebElement SAMPA;


//Metodos

public void ClicaAbaAvancada() {
    this.BuscaAvancada.click();
}
public void InformaEstado() {

    this.Estado.sendKeys("Rio de Janeiro");
    this.Estado.sendKeys(Keys.ENTER);
}


public void ClicaPesquisa(){
    btnPesquisar.click();
    }

    public boolean ValidaPesquisa(){
String UFBusca=this.FieldEstadoBusca.getText();

            try {
                UFBusca.equals("Rio de Janeiro");
                return true;
            }
            catch (org.openqa.selenium.NoSuchElementException e) {
                return false;
            }
        }

    public void aguardaCard() {
        ExpectedConditions.visibilityOf(Card1);
    }

    public void avancaPagina(){
    btnProximaPagina.click();
        }

        public boolean buscaSP(){
            return SAMPA != null;
        }


}

