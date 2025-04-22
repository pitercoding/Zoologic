//A classe Reptil herda todas as propriedades de Chordata e adiciona características específicas dessa classe de animais, como a "venenoso" (Indica se o réptil é venenoso ou não) e  "tipoLocomocaoDetalhado"(Rastejante, nadador, quadrúpede, bípede, etc.).

package model;

import model.enums.*;

public class Reptil extends Chordata {

    // Atributos específicos dos répteis
    private boolean venenoso;
    private String tipoLocomocaoDetalhado;

    // Construtor
    public Reptil(String nomePopular, String nomeCientifico, String habitat, TipoAlimentacao alimentacao,
                  TipoPele tipoPele, TipoRespiracao tipoRespiracao, ModoLocomocao modoLocomocao,
                  String somEmitido, TipoSom tipoSom, boolean venenoso, String tipoLocomocaoDetalhado) {

        super(nomePopular, nomeCientifico, ClasseAnimal.REPTIL, habitat, alimentacao, tipoPele, tipoRespiracao, modoLocomocao, somEmitido, tipoSom);

        this.venenoso = venenoso;
        this.tipoLocomocaoDetalhado = tipoLocomocaoDetalhado;
    }

    // Getters e Setters
    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    public String getTipoLocomocaoDetalhado() {
        return tipoLocomocaoDetalhado;
    }

    public void setTipoLocomocaoDetalhado(String tipoLocomocaoDetalhado) {
        this.tipoLocomocaoDetalhado = tipoLocomocaoDetalhado;
    }

    // Sobrescrevendo exibirInfo()
    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Exibe atributos herdados de Chordata
        System.out.println("Venenoso?                 : " + (venenoso ? "Sim" : "Não"));
        System.out.println("Tipo de locomoção detalhado: " + tipoLocomocaoDetalhado);
        System.out.println("=================================\n");
    }

    @Override
    public String toString() {
    return "Réptil: " + getNomePopular() + " (" + getNomeCientifico() + "), Habitat: " + getHabitat();
}

}
