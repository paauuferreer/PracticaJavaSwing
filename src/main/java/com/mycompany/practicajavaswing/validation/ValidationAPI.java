package com.mycompany.practicajavaswing.validation;

public class ValidationAPI {

    public static boolean comencaPerMajuscula(String text) {
        if (text == null) {
            return false;
        }
        String net = text.trim();
        if (net.isEmpty()) {
            return false;
        }
        char primer = net.charAt(0);
        return Character.isUpperCase(primer);
    }

    public static boolean esTextNoBuit(String text) {
        return text != null && !text.trim().isEmpty();
    }

    public static boolean esTelefonValid(String telefon) {
        if (telefon == null) {
            return false;
        }
        String net = telefon.trim();
        return net.matches("\\d{9}");
    }

    public static boolean esDniValid(String dni) {
        if (dni == null) {
            return false;
        }
        String net = dni.trim().toUpperCase();
        return net.matches("\\d{8}[A-Z]");
    }
}
