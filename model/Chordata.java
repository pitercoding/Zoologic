package model;

import model.enums.*;

public abstract class Chordata {

    // Atributos comuns a todos os animais do filo Chordata
    protected String nomePopular;
    protected String nomeCientifico;
    protected ClasseAnimal classeAnimal;
    protected String habitat;
    protected TipoAlimentacao alimentacao;
    protected TipoPele tipoPele;
    protected TipoRespiracao tipoRespiracao;
    protected ModoLocomocao modoLocomocao;
    protected String somEmitido;
    protected TipoSom tipoSom;

    // Construtor
    public Chordata(String nomePopular, String nomeCientifico, ClasseAnimal classeAnimal,
                    String habitat, TipoAlimentacao alimentacao, TipoPele tipoPele,
                    TipoRespiracao tipoRespiracao, ModoLocomocao modoLocomocao, String somEmitido, TipoSom tipoSom) {
        this.nomePopular = nomePopular;
        this.nomeCientifico = nomeCientifico;
        this.classeAnimal = classeAnimal;
        this.habitat = habitat;
        this.alimentacao = alimentacao;
        this.tipoPele = tipoPele;
        this.tipoRespiracao = tipoRespiracao;
        this.modoLocomocao = modoLocomocao;
        this.somEmitido = somEmitido;
        this.tipoSom = tipoSom;
    }

    // Métodos comuns

    public void emitirSom() {
        System.out.println(nomePopular + " emite o som: " + somEmitido);
    }

    public void locomover() {
        System.out.println(nomePopular + " se locomove por: " + modoLocomocao);
    }

    public void exibirInfo() {
        System.out.println("=== INFORMAÇÕES DO ANIMAL ===");
        System.out.println("Nome popular     : " + nomePopular);
        System.out.println("Nome científico  : " + nomeCientifico);
        System.out.println("Classe           : " + classeAnimal);
        System.out.println("Habitat          : " + habitat);
        System.out.println("Alimentação      : " + alimentacao);
        System.out.println("Tipo de pele     : " + tipoPele);
        System.out.println("Respiração       : " + tipoRespiracao);
        System.out.println("Locomoção        : " + modoLocomocao);
        System.out.println("Som emitido      : " + somEmitido);
        System.out.println("=================================\n");
    }

    //Getters → servem para obter o valor de um atributo privado ou protegido. Setters → servem para alterar o valor desses atributos.

    // Getters
        public String getNomePopular() {
            return nomePopular;
        }
    
        public String getNomeCientifico() {
            return nomeCientifico;
        }
    
        public ClasseAnimal getClasseAnimal() {
            return classeAnimal;
        }
    
        public String getHabitat() {
            return habitat;
        }
    
        public TipoAlimentacao getAlimentacao() {
            return alimentacao;
        }
    
        public TipoPele getTipoPele() {
            return tipoPele;
        }
    
        public TipoRespiracao getTipoRespiracao() {
            return tipoRespiracao;
        }
    
        public ModoLocomocao getModoLocomocao() {
            return modoLocomocao;
        }
    
        public String getSomEmitido() {
            return somEmitido;
        }
    
        // Setters
        public void setNomePopular(String nomePopular) {
            this.nomePopular = nomePopular;
        }
    
        public void setNomeCientifico(String nomeCientifico) {
            this.nomeCientifico = nomeCientifico;
        }
    
        public void setClasseAnimal(ClasseAnimal classeAnimal) {
            this.classeAnimal = classeAnimal;
        }
    
        public void setHabitat(String habitat) {
            this.habitat = habitat;
        }
    
        public void setAlimentacao(TipoAlimentacao alimentacao) {
            this.alimentacao = alimentacao;
        }
    
        public void setTipoPele(TipoPele tipoPele) {
            this.tipoPele = tipoPele;
        }
    
        public void setTipoRespiracao(TipoRespiracao tipoRespiracao) {
            this.tipoRespiracao = tipoRespiracao;
        }
    
        public void setModoLocomocao(ModoLocomocao modoLocomocao) {
            this.modoLocomocao = modoLocomocao;
        }
    
        public void setSomEmitido(String somEmitido) {
            this.somEmitido = somEmitido;
        }
        
        public TipoSom getTipoSom() {
            return tipoSom;
        }
    
        public void setTipoSom(TipoSom tipoSom) {
            this.tipoSom = tipoSom;
        }
}
