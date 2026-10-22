package org.example;

import java.util.ArrayList;

public abstract class Suporte {
    protected ArrayList listaChamados = new ArrayList();
    private Suporte suporteSuperior;

    public Suporte getSuporteSuperior() {
        return suporteSuperior;
    }

    public void setSuporteSuperior(Suporte suporteSuperior) {
        this.suporteSuperior = suporteSuperior;
    }

    public abstract String getDescricaoCargo();

    public String assinarChamado(Chamado chamado) {
        if (listaChamados.contains(chamado.getTipoChamado())) {
            return getDescricaoCargo();
        }
        else {
            if (suporteSuperior != null) {
                return suporteSuperior.assinarChamado(chamado);
            }
            else
            {
                return "Sem correção";
            }
        }
    }
}
