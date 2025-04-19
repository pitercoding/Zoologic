//Explicação do código: Criando Instâncias - Para cada mamífero, criamos um novo objeto usando o construtor da classe Mamifero. Passamos os valores como o nome, habitat, alimentação, etc., para o construtor de Mamifero. Chamando exibirInfo(): Depois de criar as instâncias, chamamos o método exibirInfo() para cada um dos animais. Ele exibirá as informações detalhadas, incluindo os novos atributos de gestação, pelos e amamentação.

package main;

import model.Anfibio;
import model.Mamifero;
import model.enums.ModoLocomocao;
import model.enums.TipoPele;
import model.enums.TipoRespiracao;

public class Main {

    public static void main(String[] args) {
        
        // Criando instâncias de anfíbios com dados específicos e exibindo as informações
        Anfibio sapoCururu = new Anfibio("Sapo-cururu", "Rhinella marina", "Brejos e matas", "Insetívoro", TipoPele.UMIDA, TipoRespiracao.CUTANEA_PULMONAR, ModoLocomocao.SALTA, "Croc croc", true, true);

        Anfibio raVerde = new Anfibio("Rã-verde", "Hypsiboas pulchellus", "Lagos, áreas úmidas", "Insetívoro", TipoPele.UMIDA, TipoRespiracao.CUTANEA_PULMONAR, ModoLocomocao.SALTA, "Coaxar agudo", true, true);

        Anfibio salamandra = new Anfibio("Salamandra", "Salamandra salamandra", "Florestas úmidas", "Carnívoro", TipoPele.UMIDA, TipoRespiracao.CUTANEA_PULMONAR, ModoLocomocao.ANDA, "Sons suaves", true, true);

        Anfibio axolote = new Anfibio("Axolote", "Ambystoma mexicanum", "Lagos do México", "Carnívoro", TipoPele.UMIDA, TipoRespiracao.CUTANEA_PULMONAR, ModoLocomocao.NADA, "Assobios subaquáticos", false, true);

        Anfibio perereca = new Anfibio("Perereca", "Hyla spp.", "Árvores e matas", "Insetívoro", TipoPele.UMIDA, TipoRespiracao.CUTANEA_PULMONAR, ModoLocomocao.SALTA, "Coaxar leve", true, true);

        sapoCururu.exibirInfo();
        raVerde.exibirInfo();
        salamandra.exibirInfo();
        axolote.exibirInfo();
        perereca.exibirInfo();


        // Criando instâncias de mamíferos com dados específicos e exibindo as informações
        Mamifero leao = new Mamifero("Leão", "Panthera leo", "Savana africana", "Carnívoro", TipoPele.PELOS, TipoRespiracao.PULMONAR, ModoLocomocao.CORRE, "Rugido", 110, true, true);

        Mamifero elefante = new Mamifero("Elefante", "Loxodonta africana", "Floresta e savana", "Herbívoro", TipoPele.PELOS, TipoRespiracao.PULMONAR, ModoLocomocao.ANDA, "Barulho grave", 660, false, true);

        Mamifero baleia = new Mamifero("Baleia Azul", "Balaenoptera musculus", "Oceano", "Carnívoro", TipoPele.PELOS, TipoRespiracao.PULMONAR, ModoLocomocao.NADA, "Canto subaquático", 365, false, true);

        Mamifero humano = new Mamifero("Humano", "Homo sapiens", "Terra", "Onívoro", TipoPele.PELOS, TipoRespiracao.PULMONAR, ModoLocomocao.ANDA, "Fala", 280, true, true);

        Mamifero cavalo = new Mamifero("Cavalo", "Equus ferus caballus", "Campos e estepes", "Herbívoro", TipoPele.PELOS, TipoRespiracao.PULMONAR, ModoLocomocao.CORRE, "Relincho", 340, true, false);

        leao.exibirInfo();
        elefante.exibirInfo();
        baleia.exibirInfo();
        humano.exibirInfo();
        cavalo.exibirInfo();
    }
}
