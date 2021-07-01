package segundoteste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.PageHome;
import pages.SimpleFormPage;
import util.BaseTest;

//Utilizando o conceito de heranca para utilizar o driver criado na classe BaseTest
public class SeleniumEasyTest extends BaseTest {

    @Test
    public void recusarAlert(){
        //Mapeamento do elemento alert
        WebElement alert = driver.findElement(By.id("image-darkener"));

        //Verificação da presença do Alert ao abrir o site
        if(alert.isDisplayed()){
            //Ação de Clicar no botão para recusar o alert
            driver.findElement(By.xpath("//*[@id=\"at-cv-lightbox-button-holder\"]/a[2]")).click();
        }
    }

    @Test
    public void acessarSimpleForm(){
        //Mapeamento do elemento alert
        WebElement alert = driver.findElement(By.id("image-darkener"));

        //Verificação da presença do Alert ao abrir o site
        if(alert.isDisplayed()){
            //Ação de Clicar no botão para recusar o alert
            driver.findElement(By.xpath("//*[@id=\"at-cv-lightbox-button-holder\"]/a[2]")).click();
        }

        //Ação de Clicar nos links para abrir a página Simple Form Demo, mapeados por LinkText
        //O selenium irá buscar os primeiros elementos do código marcado por HTML
        //que possuir os textos a seguir de tipo LINK (href)
        driver.findElement(By.linkText("Input Forms")).click();
        driver.findElement(By.linkText("Simple Form Demo")).click();
    }


    //Organização de código
    //Retirando iteração do driver do método de teste
    @Test
    public void validarInputMessage(){
        PageHome.acessarSimpleForm();
        SimpleFormPage.escreverMensagemEClicarNoBotaoShowMessage();

        //Validação do JUnit
        //Validando se o texto inserido é o mesmo que está sendo apresentado no elemento id=display
        Assertions.assertEquals("TESTE", driver.findElement(By.id("display")).getText());
    }

}
