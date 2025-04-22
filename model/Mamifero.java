//A classe Mamifero representa mamíferos específicos (como leão, baleia, humano, etc). Ela herda de Chordata e pode: Ter atributos adicionais, se necessário. Usar todos os atributos/métodos herdados. Ser uma classe concreta (pode ser instanciada). Serve como base para classes como Leao.java, Elefante.java, etc.

package model;

import model.enums.ClasseAnimal;
import model.enums.ModoLocomocao;
import model.enums.TipoAlimentacao;
import model.enums.TipoPele;
import model.enums.TipoRespiracao;

public class Mamifero extends Chordata {

    // Atributos específicos dos mamíferos
    private int gestacaoEmDias;
    private boolean possuiPelos;
    private boolean amamentaFilhotes;

    // Construtor da classe Mamifero
    public Mamifero(String nomePopular, String nomeCientifico, String habitat, TipoAlimentacao alimentacao,TipoPele tipoPele, TipoRespiracao tipoRespiracao, ModoLocomocao modoLocomocao, String somEmitido, int gestacaoEmDias, boolean possuiPelos, boolean amamentaFilhotes) {
        
        super(nomePopular, nomeCientifico, ClasseAnimal.MAMIFERO, habitat, alimentacao, tipoPele, tipoRespiracao, modoLocomocao, somEmitido);

        this.gestacaoEmDias = gestacaoEmDias;
        this.possuiPelos = possuiPelos;
        this.amamentaFilhotes = amamentaFilhotes;
    }

    // Getters e Setters específicos de Mamifero
    public int getGestacaoEmDias() {
        return gestacaoEmDias;
    }

    public void setGestacaoEmDias(int gestacaoEmDias) {
        this.gestacaoEmDias = gestacaoEmDias;
    }

    public boolean isPossuiPelos() {
        return possuiPelos;
    }

    public void setPossuiPelos(boolean possuiPelos) {
        this.possuiPelos = possuiPelos;
    }

    public boolean isAmamentaFilhotes() {
        return amamentaFilhotes;
    }

    public void setAmamentaFilhotes(boolean amamentaFilhotes) {
        this.amamentaFilhotes = amamentaFilhotes;
    }

    // Sobrescrevendo o método exibirInfo() para incluir as informações de Mamifero
    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Chama o método da classe Chordata
        System.out.println("Gestação (dias)   : " + gestacaoEmDias);
        System.out.println("Possui pelos?     : " + (possuiPelos ? "Sim" : "Não"));
        System.out.println("Amamenta filhotes?: " + (amamentaFilhotes ? "Sim" : "Não"));
        System.out.println("=================================\n");
    }

    @Override
    public String toString() {
    return "Mamífero: " + getNomePopular() + " (" + getNomeCientifico() + "), Habitat: " + getHabitat();
}

}
