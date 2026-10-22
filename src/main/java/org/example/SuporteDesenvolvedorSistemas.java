package org.example;

public class SuporteDesenvolvedorSistemas extends Suporte {

    public SuporteDesenvolvedorSistemas(Suporte superior) {
        listaChamados.add(TipoChamadoBug.getTipoChamadoBug());
        setSuporteSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "DesenvolvedorSistemas";
    }
}
