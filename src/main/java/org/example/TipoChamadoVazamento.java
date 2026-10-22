package org.example;

public class TipoChamadoVazamento implements TipoChamado {

    private static TipoChamadoVazamento tipoChamadoVazamento = new TipoChamadoVazamento();

    private TipoChamadoVazamento() {};

    public static TipoChamadoVazamento getTipoChamadoVazamento() {
        return tipoChamadoVazamento;
    }
}
