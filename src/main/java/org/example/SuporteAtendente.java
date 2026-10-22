package org.example;

public class SuporteAtendente extends Suporte {

    public SuporteAtendente(Suporte superior) {
        listaChamados.add(TipoChamadoAcesso.getTipoChamadoAcesso());
        setSuporteSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Atendente";
    }
}
