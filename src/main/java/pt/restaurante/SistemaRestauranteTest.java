package pt.restaurante;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class SistemaRestauranteTest {

    //Teste Senha Incorreta
    @Test
    public void deveRecusarSenhaIncorreta() {
        SistemaRestaurante autenticar = new SistemaRestaurante();

        boolean resultado = autenticar.login("admin@restaurante.pt", "12345");
        assertFalse(resultado);
    }
    // Teste Password Nula
    @Test
    public void deveRecusarPasswordNula() {
        SistemaLogin login = new SistemaLogin();

        boolean resultado = login.autenticar("admin", null);
        assertFalse(resultado);
    }
}
