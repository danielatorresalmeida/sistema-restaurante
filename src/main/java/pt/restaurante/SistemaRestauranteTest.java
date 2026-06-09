package pt.restaurante;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SistemaRestauranteTest {

    // Teste Login Correto
    @Test
    public void deveAceitarLogar() {
        SistemaRestaurante autenticar = new SistemaRestaurante();

        boolean resultado = autenticar.login("admin@restaurante.pt", "123456");

        assertTrue(resultado);
    }

    // Teste Senha Incorreta
    @Test
    public void deveRecusarSenhaIncorreta() {
        SistemaRestaurante autenticar = new SistemaRestaurante();

        boolean resultado = autenticar.login("admin@restaurante.pt", "12345");

        assertFalse(resultado);
    }

    // Teste Utilizador Nulo
    @Test
    public void deveRecusarLoginComUtilizadorNulo() {
        SistemaRestaurante autenticar = new SistemaRestaurante();

        boolean resultado = autenticar.login(null, "123456");

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