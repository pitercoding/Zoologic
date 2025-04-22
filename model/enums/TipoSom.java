package model.enums;

public enum TipoSom {
    VOCALIZACAO_AGUDA("Vocalizações agudas"),
    VOCALIZACAO_GRAVE("Vocalizações graves"),
    CANTORIA_ASSOBIO("Cantorias e assobios"),
    SONS_SUAVES("Sons suaves ou discretos"),
    SILENCIO("Silêncio ou quase inaudível"),
    COMUNICACAO_HUMANA("Comunicação humana");

    private final String descricao;

    TipoSom(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

