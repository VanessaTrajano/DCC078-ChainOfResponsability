package org.example;

public class TipoChamadoNotificacao implements TipoChamado {

    private static TipoChamadoNotificacao tipoChamadoNotificacao = new TipoChamadoNotificacao();

    private TipoChamadoNotificacao() {};

    public static TipoChamadoNotificacao getTipoChamadoNotificacao() {
        return tipoChamadoNotificacao;
    }
}
