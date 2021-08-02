package stepDefinition;

import PageObjects.PO_GuiaMedico;
import PageObjects.PO_HomePage;
import Utils.Base;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static Utils.Base.PastaEvidencia;
import static org.junit.Assert.assertEquals;



public class ConsultaApenasRioDeJaneiro {
    public WebDriver driver;
    PO_GuiaMedico Guia;
    PO_HomePage Home;

    public void Start() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
    }

    @Dado("que eu acesse a Pagina da Unimed")
    public void AcessarSite() throws Exception {
    Start();
    Home = new PO_HomePage(driver);
    driver.get(Base.SiteDesejado);
        Base.takeSnapShot(driver, PastaEvidencia+"Step1.png");
    }

    @E("clique em Encontre um Medico")
    public void ClicarEncontreUmMedico() throws Exception {
                Home.BuscaMedico();
        Guia= new PO_GuiaMedico(driver);
                assertEquals(Guia.Titulo,driver.getTitle());
        Base.takeSnapShot(driver, PastaEvidencia+"Step2.png");
    }
    @E("efetue uma consulta avançada por Médicos no Rio de Janeiro")
    public void ConsultaAvancadaRJ() throws Exception {
          Guia.ClicaAbaAvancada();
        Base.takeSnapShot(driver, PastaEvidencia+"Step3.png");

    }
    @Então("devo conseguir verificar a Especialidade e a Cidade do Médico localizado")
    public void ValidaEspecialidadeEEstado() throws Exception {
       Guia.InformaEstado();
        Base.takeSnapShot(driver, PastaEvidencia+"Step4.png");
       Guia.ClicaPesquisa();
       Guia.aguardaCard();
        Base.takeSnapShot(driver, PastaEvidencia+"Step5.png");

           }
}
