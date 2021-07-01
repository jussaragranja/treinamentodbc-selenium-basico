package util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Classe Base para execução dos testes
public class BaseTest {

    public static WebDriver driver;

    //Método a ser executado antes de cada método de teste
    @BeforeEach
    public void before(){
        System.setProperty("webdriver.chrome.driver", "C://Users/jussa/Downloads/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        //driver.get("https://www.google.com.br");
        driver.get("https://www.seleniumeasy.com/test/");
    }

    //Método a ser executado depois de cada método de teste
    @AfterEach
    public void after(){
        if (driver != null){
            driver.quit();
        }
    }

}
