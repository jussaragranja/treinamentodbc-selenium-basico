package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class SimpleFormPage extends BaseTest {

    public static void escreverMensagemEClicarNoBotaoShowMessage(){
        //Ação de escrever mensagem no campo input, mapeado por ID
        driver.findElement(By.id("user-message")).sendKeys("TESTE");


        //Ação de clicar no botão SHOW MESSAGE, mapeado por XPATH
        driver.findElement(By.xpath("//*[@id=\"get-input\"]/button")).click();
    }

}
