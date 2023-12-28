package times;

import entities.Mensagens;

import java.time.LocalTime;

public class Horarios {

    public static String saudacoes() {
        int horaAtual = LocalTime.now().getHour();
        if (horaAtual >=6 && horaAtual <=11) {
            return Mensagens.Msg[0];
        } else if (horaAtual >=12 && horaAtual <=17) {
            return Mensagens.Msg[1];
        } else if (horaAtual >=18 && horaAtual <=23) {
            return Mensagens.Msg[2];
        } else {
            return Mensagens.Msg[3];
        }
    }
}
