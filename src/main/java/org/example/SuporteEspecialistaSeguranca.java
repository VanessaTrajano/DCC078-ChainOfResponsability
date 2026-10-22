package org.example;

public class SuporteEspecialistaSeguranca extends Suporte {

    public SuporteEspecialistaSeguranca(Suporte superior) {
        listaChamados.add(TipoChamadoVazamento.getTipoChamadoVazamento());
        setSuporteSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "EspecialistaSeguranca";
    }
}
