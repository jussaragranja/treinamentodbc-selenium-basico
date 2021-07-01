package primeiroteste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import util.BaseTest;

public class GoogleTest extends BaseTest {

    //Para executar esse método de teste, favor alterar a url da BaseTest
    @Test
    public void validarTituloGoogle(){
        Assertions.assertEquals("Google", driver.getTitle());
    }

}
