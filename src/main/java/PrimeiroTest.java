import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class PrimeiroTest {

    //Primeira execução utilizando apenas selenium (sem JUnit)
    //Entendendo o funcionamento do selenium webdriver
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", new File("").getAbsolutePath().concat("/src/test/resources/driver/chromedriver.exe"));
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com.br/");
        System.out.println(driver.getTitle());
    }

}
