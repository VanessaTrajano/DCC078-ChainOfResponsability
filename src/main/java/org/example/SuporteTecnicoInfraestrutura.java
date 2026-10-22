package org.example;

public class SuporteTecnicoInfraestrutura extends Suporte {

    public SuporteTecnicoInfraestrutura(Suporte superior) {
        listaChamados.add(TipoChamadoHardware.getTipoChamadoHardware());
        setSuporteSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "TecnicoInfraestrutura";
    }
}
