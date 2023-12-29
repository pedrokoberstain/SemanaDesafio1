package entities;

public class Emoticons {
    public static int contarEmot(String mensagem, String emoticon) {
        int count = 0;
        int index = mensagem.indexOf(emoticon);
        while (index != -1) {
            count++;
            index = mensagem.indexOf(emoticon, index + 1);
        }
        return count;
    }
    
}
