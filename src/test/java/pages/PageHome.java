package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.BaseTest;

public class PageHome extends BaseTest {

    public static void acessarSimpleForm(){
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

}
