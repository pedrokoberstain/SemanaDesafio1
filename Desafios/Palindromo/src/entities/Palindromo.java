package entities;

public class Palindromo {

    public static boolean simPalindromo(String str) {
        String textFormat = str.replaceAll("[^a-zA-Z]", "").toLowerCase();

        String textInvert = new StringBuilder(textFormat).reverse().toString();

        return textFormat.equals(textInvert);
    }
}
