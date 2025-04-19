//Explicação: Cria-se um novo objeto (instâncias) usando o construtor de  cada classe. Passamos os valores como o nome, habitat, alimentação, etc. para o construtor de cada classe. Chama-se o exibirInfo() para cada um dos animais. Ele exibirá as informações detalhadas, incluindo os novos atributos específicos de cada animal.

package main;

import model.Anfibio;
import model.Ave;
import model.Mamifero;
import model.Peixe;
import model.Reptil;
import model.enums.ModoLocomocao;
import model.enums.TipoPele;
import model.enums.TipoRespiracao;

public class Main {

    public static void main(String[] args) {
        
        // Criando instâncias de anfíbios com dados específicos e exibindo as informações
        Anfibio sapoCururu = new Anfibio("Sapo-cururu", "Rhinella marina", "Brejos e matas", "Insetívoro", TipoPele.UMIDA,TipoRespiracao.CUTANEA_PULMONAR, ModoLocomocao.SALTA, "Croc croc", true, true);

        Anfibio raVerde = new Anfibio("Rã-verde", "Hypsiboas pulchellus", "Lagos, áreas úmidas", "Insetívoro", TipoPele.UMIDA, TipoRespiracao.CUTANEA_PULMONAR, ModoLocomocao.SALTA, "Coaxar agudo", true, true);

        Anfibio salamandra = new Anfibio("Salamandra", "Salamandra salamandra", "Florestas úmidas", "Carnívoro", TipoPele.UMIDA, TipoRespiracao.CUTANEA_PULMONAR, ModoLocomocao.ANDA, "Sons suaves", true, true);

        Anfibio axolote = new Anfibio("Axolote", "Ambystoma mexicanum", "Lagos do México", "Carnívoro", TipoPele.UMIDA, TipoRespiracao.CUTANEA_PULMONAR, ModoLocomocao.NADA, "Assobios subaquáticos", false, true);

        Anfibio perereca = new Anfibio("Perereca", "Hyla spp.", "Árvores e matas", "Insetívoro", TipoPele.UMIDA, TipoRespiracao.CUTANEA_PULMONAR, ModoLocomocao.SALTA, "Coaxar leve", true, true);

        sapoCururu.exibirInfo();
        raVerde.exibirInfo();
        salamandra.exibirInfo();
        axolote.exibirInfo();
        perereca.exibirInfo();


         // Criando instâncias de aves com dados específicos e exibindo as informações
        Ave aguia = new Ave("Águia", "Aquila chrysaetos", "Montanhas", "Carnívora", TipoPele.PENAS, TipoRespiracao.PULMONAR, ModoLocomocao.VOA, "Grito agudo", true, "Curvo");

        Ave pinguim = new Ave("Pinguim-imperador", "Aptenodytes forsteri", "Regiões polares", "Peixes", TipoPele.PENAS, TipoRespiracao.PULMONAR, ModoLocomocao.NADA, "Grasnado", false, "Curto e reto");

        Ave canario = new Ave("Canário", "Serinus canaria", "Ambientes urbanos", "Sementes", TipoPele.PENAS, TipoRespiracao.PULMONAR, ModoLocomocao.VOA, "Canto melódico", true, "Fino");

        Ave avestruz = new Ave("Avestruz", "Struthio camelus", "Savanas e desertos", "Vegetais", TipoPele.PENAS, TipoRespiracao.PULMONAR, ModoLocomocao.CORRE, "Urrado grave", false, "Largo");

        Ave tucano = new Ave("Tucano-toco", "Ramphastos toco", "Florestas tropicais", "Frutas", TipoPele.PENAS, TipoRespiracao.PULMONAR, ModoLocomocao.VOA, "Sons curtos e secos", true, "Longo e largo");

        aguia.exibirInfo();
        pinguim.exibirInfo();
        canario.exibirInfo();
        avestruz.exibirInfo();
        tucano.exibirInfo();


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

        // Criando instâncias de peixes com dados específicos e exibindo as informações
        Peixe tubarao = new Peixe("Tubarão-branco", "Carcharodon carcharias", "Oceano aberto", "Carnívora", TipoPele.ESCAMAS, TipoRespiracao.BRANQUIAL, ModoLocomocao.NADA, 
        "Cliques/silêncio", true, true);

        Peixe salmao = new Peixe("Salmão", "Salmo salar", "Rios e oceanos", "Insetos e pequenos peixes", TipoPele.ESCAMAS, TipoRespiracao.BRANQUIAL, ModoLocomocao.NADA,
        "Ruídos suaves", false, true);

        Peixe peixePalhaco = new Peixe("Peixe-palhaço", "Amphiprion ocellaris", "Recifes de coral", "Plâncton", TipoPele.ESCAMAS, TipoRespiracao.BRANQUIAL, ModoLocomocao.NADA,
        "Quase inaudível", true, true);

        Peixe pirarucu = new Peixe("Pirarucu", "Arapaima gigas", "Rios da Amazônia", "Carnívoro", TipoPele.ESCAMAS, TipoRespiracao.BRANQUIAL, ModoLocomocao.NADA,
        "Estalo", false, true);

        Peixe lampreia = new Peixe("Lampreia", "Petromyzon marinus", "Água doce e salgada", "Parasita", TipoPele.ESCAMAS, TipoRespiracao.BRANQUIAL, ModoLocomocao.NADA,
        "Silencioso", true, false);

        tubarao.exibirInfo();
        salmao.exibirInfo();
        peixePalhaco.exibirInfo();
        pirarucu.exibirInfo();
        lampreia.exibirInfo();      


        // Criando instâncias de repteis com dados específicos e exibindo as informações
        Reptil cobra = new Reptil("Cobra-real", "Ophiophagus hannah", "Florestas tropicais", "Carnívora",
        TipoPele.ESCAMAS, TipoRespiracao.PULMONAR, ModoLocomocao.RASTEJA,
        "Silvo", true, "Rastejante");

        Reptil camaleao = new Reptil("Camaleão", "Chamaeleo calyptratus", "Árvores", "Insetívora",
        TipoPele.ESCAMAS, TipoRespiracao.PULMONAR, ModoLocomocao.ANDA,
        "Silencioso", false, "Quadrúpede lento");

        Reptil jacare = new Reptil("Jacaré-açu", "Melanosuchus niger", "Rios da Amazônia", "Carnívoro",
        TipoPele.ESCAMAS, TipoRespiracao.PULMONAR, ModoLocomocao.NADA,
        "Rugido grave", false, "Nadador e andador");

        Reptil tartaruga = new Reptil("Tartaruga-verde", "Chelonia mydas", "Oceanos tropicais", "Herbívora",
        TipoPele.ESCAMAS, TipoRespiracao.PULMONAR, ModoLocomocao.NADA,
        "Quase inaudível", false, "Nadadora");

        Reptil teiu = new Reptil("Lagarto teiú", "Salvator merianae", "Cerrado e florestas", "Onívoro",
        TipoPele.ESCAMAS, TipoRespiracao.PULMONAR, ModoLocomocao.ANDA,
        "Estalo curto", false, "Quadrúpede ágil");

        // Exibir informações
        cobra.exibirInfo();
        camaleao.exibirInfo();
        jacare.exibirInfo();
        tartaruga.exibirInfo();
        teiu.exibirInfo();

    }
}
