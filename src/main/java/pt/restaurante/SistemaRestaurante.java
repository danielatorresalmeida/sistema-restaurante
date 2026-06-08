package pt.restaurante;

public class SistemaRestaurante {

    public boolean login(String email, String password) {
        if (email == null || email.isBlank()) {
            return false;
        }

        if (password == null || password.isBlank()) {
            return false;
        }

        return email.equals("admin@restaurante.pt") && password.equals("123456");
    }
}