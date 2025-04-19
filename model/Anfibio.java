//A classe Anfibio herda todas as propriedades de Chordata e adiciona características específicas dessa classe de animais, como a metamorfose e a fase aquática inicial.

package model;

import model.enums.ClasseAnimal;
import model.enums.ModoLocomocao;
import model.enums.TipoPele;
import model.enums.TipoRespiracao;

public class Anfibio extends Chordata {

    // Atributos específicos de Anfíbios
    private boolean passaPorMetamorfose;
    private boolean faseAquaticaInicial;

    // Construtor
    public Anfibio(String nomePopular, String nomeCientifico, String habitat, String alimentacao, TipoPele tipoPele, TipoRespiracao tipoRespiracao, ModoLocomocao modoLocomocao, String somEmitido, boolean passaPorMetamorfose, boolean faseAquaticaInicial) {

        super(nomePopular, nomeCientifico, ClasseAnimal.ANFIBIO, habitat, alimentacao, tipoPele, tipoRespiracao, modoLocomocao, somEmitido);

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
}
