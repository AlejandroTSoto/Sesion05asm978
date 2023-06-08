package ual.hmis.sesion05.ejercicio03;

public class Ejercicio03 {

	public String encriptarPassword(String password) {

        if (password.length() < 5) {
            return "password demasiado corto";
        } else if (password.length() >= 5 && password.length() <= 8) {
            return "********";
        } else if (password.length() >= 12 && password.length() <= 40) {
            return "************";
        } else if (password.length() > 40) {
            return "password demasiado largo";
        } else {
        	return "";
        }
    }
}

