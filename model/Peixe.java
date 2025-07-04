//A classe Peixe herda todas as propriedades de Chordata e adiciona características específicas dessa classe de animais, como a "aguaSalgada" (permite distinguir peixes de rios e oceanos -> ex: salmão vs. tubarão) , "possuiBarbatanas" (quase todos têm, mas essa opção permite flexibilidade para espécies raras.) e  "ModoLocomocao.NADA" padrão para peixes, mas está flexível se quiser variar no futuro.

package model;

import model.enums.*;

public class Peixe extends Chordata {

    // Atributos específicos dos peixes
    private boolean aguaSalgada;
    private boolean possuiBarbatanas;

    // Construtor
    public Peixe(String nomePopular, String nomeCientifico, String habitat, TipoAlimentacao alimentacao,
            TipoPele tipoPele, TipoRespiracao tipoRespiracao, ModoLocomocao modoLocomocao,
            String somEmitido, TipoSom tipoSom, boolean aguaSalgada, boolean possuiBarbatanas) {

        super(nomePopular, nomeCientifico, ClasseAnimal.PEIXE, habitat, alimentacao,
                tipoPele, tipoRespiracao, modoLocomocao, somEmitido, tipoSom);

        this.aguaSalgada = aguaSalgada;
        this.possuiBarbatanas = possuiBarbatanas;
    }

    // Getters e Setters
    public boolean isAguaSalgada() {
        return aguaSalgada;
    }

    public void setAguaSalgada(boolean aguaSalgada) {
        this.aguaSalgada = aguaSalgada;
    }

    public boolean isPossuiBarbatanas() {
        return possuiBarbatanas;
    }

    public void setPossuiBarbatanas(boolean possuiBarbatanas) {
        this.possuiBarbatanas = possuiBarbatanas;
    }

    // Sobrescrevendo exibirInfo()
    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Informações herdadas
        System.out.println("Água salgada?       : " + (aguaSalgada ? "Sim" : "Não"));
        System.out.println("Possui barbatanas?  : " + (possuiBarbatanas ? "Sim" : "Não"));
        System.out.println("=================================\n");
    }

    @Override
    public String toString() {
        return "Peixe: " + getNomePopular() + " (" + getNomeCientifico() + "), Habitat: " + getHabitat();
    }

}
