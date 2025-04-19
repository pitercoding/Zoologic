//A classe Ave herda todas as propriedades de Chordata e adiciona características específicas dessa classe de animais, como a "voa" (Se a ave voa ou não - nem todas voam, como pinguins e emas) e "tipo de bico" (Ex: curvo, fino, largo, longo etc.) que ajuda a relacionar com a alimentação (bico curvo → carnívoro; longo → néctar).

package model;

import model.enums.ClasseAnimal;
import model.enums.ModoLocomocao;
import model.enums.TipoPele;
import model.enums.TipoRespiracao;

public class Ave extends Chordata {

    // Atributos específicos de aves
    private boolean voa;
    private String tipoDeBico;

    // Construtor
    public Ave(String nomePopular, String nomeCientifico, String habitat, String alimentacao,
               TipoPele tipoPele, TipoRespiracao tipoRespiracao, ModoLocomocao modoLocomocao,
               String somEmitido, boolean voa, String tipoDeBico) {

        super(nomePopular, nomeCientifico, ClasseAnimal.AVE, habitat, alimentacao,
              tipoPele, tipoRespiracao, modoLocomocao, somEmitido);

        this.voa = voa;
        this.tipoDeBico = tipoDeBico;
    }

    // Getters e Setters
    public boolean isVoa() {
        return voa;
    }

    public void setVoa(boolean voa) {
        this.voa = voa;
    }

    public String getTipoDeBico() {
        return tipoDeBico;
    }

    public void setTipoDeBico(String tipoDeBico) {
        this.tipoDeBico = tipoDeBico;
    }

    // Sobrescrevendo o método exibirInfo()
    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Informações herdadas de Chordata
        System.out.println("Voa?                : " + (voa ? "Sim" : "Não"));
        System.out.println("Tipo de bico        : " + tipoDeBico);
        System.out.println("=================================\n");
    }
}

