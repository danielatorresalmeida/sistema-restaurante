package pt.restaurante;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SistemaRestauranteTest {

    @Test
    public void deveAceitarLogar(){
        SistemaRestaurante autenticar = new SistemaRestaurante();

        boolean resultado= autenticar.login("admin@restaurante.pt", "123456");
        assertTrue(resultado);
    }


    @Test
    public void deveRecusarSenhaIncorreta(){
        SistemaRestaurante autenticar = new SistemaRestaurante();

        boolean resultado= autenticar.login("admin@restaurante.pt", "12345");
            assertFalse(resultado);



    }
}
