//A classe Anfibio herda todas as propriedades de Chordata e adiciona características específicas dessa classe de animais, como a metamorfose e a fase aquática inicial.

package model;

import model.enums.*;

public class Anfibio extends Chordata {

    // Atributos específicos de Anfíbios
    private boolean passaPorMetamorfose;
    private boolean faseAquaticaInicial;

    // Construtor
    public Anfibio(String nomePopular, String nomeCientifico, String habitat, TipoAlimentacao alimentacao, TipoPele tipoPele, TipoRespiracao tipoRespiracao, ModoLocomocao modoLocomocao, String somEmitido, TipoSom tipoSom, boolean passaPorMetamorfose, boolean faseAquaticaInicial) {

        super(nomePopular, nomeCientifico, ClasseAnimal.ANFIBIO, habitat, alimentacao, tipoPele, tipoRespiracao, modoLocomocao, somEmitido, tipoSom);

        this.passaPorMetamorfose = passaPorMetamorfose;
        this.faseAquaticaInicial = faseAquaticaInicial;
    }

    // Getters e Setters
    public boolean isPassaPorMetamorfose() {
        return passaPorMetamorfose;
    }

    public void setPassaPorMetamorfose(boolean passaPorMetamorfose) {
        this.passaPorMetamorfose = passaPorMetamorfose;
    }

    public boolean isFaseAquaticaInicial() {
        return faseAquaticaInicial;
    }

    public void setFaseAquaticaInicial(boolean faseAquaticaInicial) {
        this.faseAquaticaInicial = faseAquaticaInicial;
    }

    // Sobrescrevendo o método exibirInfo()
    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Mostra as informações herdadas
        System.out.println("Passa por metamorfose? : " + (passaPorMetamorfose ? "Sim" : "Não"));
        System.out.println("Fase aquática inicial? : " + (faseAquaticaInicial ? "Sim" : "Não"));
        System.out.println("=================================\n");
    }

    @Override
    public String toString() {
    return "Anfíbio: " + getNomePopular() + " (" + getNomeCientifico() + "), Habitat: " + getHabitat();
}
}
