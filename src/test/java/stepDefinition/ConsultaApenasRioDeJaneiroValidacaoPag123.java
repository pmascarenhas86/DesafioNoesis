package stepDefinition;

import io.cucumber.java.pt.E;
import org.openqa.selenium.WebDriver;
import PageObjects.PO_GuiaMedico;
import Utils.Base;
import static Utils.Base.PastaEvidencia;

public class ConsultaApenasRioDeJaneiroValidacaoPag123{
    public WebDriver driver;


    @E("validar que nas paginas 1,2 e 3 nao exista retorno de São Paulo")
    public void validaRetornoPesquisa() throws Exception {
        PO_GuiaMedico Guia=new PO_GuiaMedico(driver);
        assert (Guia.buscaSP());
      Base.print(driver, PastaEvidencia+"Pag1.png");
       Guia.avancaPagina();
        assert (Guia.buscaSP());
        Base.print(driver, PastaEvidencia+"Pag2.png");
       Guia.avancaPagina();
        assert (Guia.buscaSP());
        Base.print(driver, PastaEvidencia+"Pag3.png");
    }

//Fim da classe
}

