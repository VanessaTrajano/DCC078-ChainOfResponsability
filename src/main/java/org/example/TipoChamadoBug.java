package org.example;

public class TipoChamadoBug implements TipoChamado {

    private static TipoChamadoBug tipoChamadoBug = new TipoChamadoBug();

    private TipoChamadoBug() {};

    public static TipoChamadoBug getTipoChamadoBug() {
        return tipoChamadoBug;
    }
}
