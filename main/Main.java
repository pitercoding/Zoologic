//Explicação: Cria-se um novo objeto (instâncias) usando o construtor de  cada classe. Passamos os valores como o nome, habitat, alimentação, etc. para o construtor de cada classe. Chama-se o exibirInfo() para cada um dos animais. Ele exibirá as informações detalhadas, incluindo os novos atributos específicos de cada animal.

package main;

import java.util.ArrayList;
import java.util.List;

import model.*;
import model.enums.*;
import service.AnimalService;
import view.MainMenu;

public class Main {

    public static void main(String[] args) {
        
         List<Chordata> animais = new ArrayList<>();

        //ANIMAIS
        Anfibio sapoCururu = new Anfibio("Sapo-cururu", "Rhinella marina", "Brejos e matas",
    TipoAlimentacao.INSETIVORO, TipoPele.UMIDA, TipoRespiracao.CUTANEA_PULMONAR,
    ModoLocomocao.SALTA, "Croc croc", true, true);
animais.add(sapoCururu);

Anfibio raVerde = new Anfibio("Rã-verde", "Hypsiboas pulchellus", "Lagos, áreas úmidas",
    TipoAlimentacao.INSETIVORO, TipoPele.UMIDA, TipoRespiracao.CUTANEA_PULMONAR,
    ModoLocomocao.SALTA, "Coaxar agudo", true, true);
animais.add(raVerde);

Anfibio salamandra = new Anfibio("Salamandra", "Salamandra salamandra", "Florestas úmidas",
    TipoAlimentacao.CARNIVORO, TipoPele.UMIDA, TipoRespiracao.CUTANEA_PULMONAR,
    ModoLocomocao.ANDA, "Sons suaves", true, true);
animais.add(salamandra);

Anfibio axolote = new Anfibio("Axolote", "Ambystoma mexicanum", "Lagos do México",
    TipoAlimentacao.CARNIVORO, TipoPele.UMIDA, TipoRespiracao.CUTANEA_PULMONAR,
    ModoLocomocao.NADA, "Assobios subaquáticos", false, true);
animais.add(axolote);

Anfibio perereca = new Anfibio("Perereca", "Hyla spp.", "Árvores e matas",
    TipoAlimentacao.INSETIVORO, TipoPele.UMIDA, TipoRespiracao.CUTANEA_PULMONAR,
    ModoLocomocao.SALTA, "Coaxar leve", true, true);
animais.add(perereca);

Ave aguia = new Ave("Águia", "Aquila chrysaetos", "Montanhas",
    TipoAlimentacao.CARNIVORO, TipoPele.PENAS, TipoRespiracao.PULMONAR,
    ModoLocomocao.VOA, "Grito agudo", true, "Curvo");
animais.add(aguia);

Ave pinguim = new Ave("Pinguim-imperador", "Aptenodytes forsteri", "Regiões polares",
    TipoAlimentacao.PISCIVORO, TipoPele.PENAS, TipoRespiracao.PULMONAR,
    ModoLocomocao.NADA, "Grasnado", false, "Curto e reto");
animais.add(pinguim);

Ave canario = new Ave("Canário", "Serinus canaria", "Ambientes urbanos",
    TipoAlimentacao.GRANIVORO, TipoPele.PENAS, TipoRespiracao.PULMONAR,
    ModoLocomocao.VOA, "Canto melódico", true, "Fino");
animais.add(canario);

Ave avestruz = new Ave("Avestruz", "Struthio camelus", "Savanas e desertos",
    TipoAlimentacao.HERBIVORO, TipoPele.PENAS, TipoRespiracao.PULMONAR,
    ModoLocomocao.CORRE, "Urrado grave", false, "Largo");
animais.add(avestruz);

Ave tucano = new Ave("Tucano-toco", "Ramphastos toco", "Florestas tropicais",
    TipoAlimentacao.FRUTIVORO, TipoPele.PENAS, TipoRespiracao.PULMONAR,
    ModoLocomocao.VOA, "Sons curtos e secos", true, "Longo e largo");
animais.add(tucano);

Mamifero leao = new Mamifero("Leão", "Panthera leo", "Savana africana",
    TipoAlimentacao.CARNIVORO, TipoPele.PELOS, TipoRespiracao.PULMONAR,
    ModoLocomocao.CORRE, "Rugido", 110, true, true);
animais.add(leao);

Mamifero elefante = new Mamifero("Elefante", "Loxodonta africana", "Floresta e savana",
    TipoAlimentacao.HERBIVORO, TipoPele.PELOS, TipoRespiracao.PULMONAR,
    ModoLocomocao.ANDA, "Barulho grave", 660, false, true);
animais.add(elefante);

Mamifero baleia = new Mamifero("Baleia Azul", "Balaenoptera musculus", "Oceano",
    TipoAlimentacao.CARNIVORO, TipoPele.PELOS, TipoRespiracao.PULMONAR,
    ModoLocomocao.NADA, "Canto subaquático", 365, false, true);
animais.add(baleia);

Mamifero humano = new Mamifero("Humano", "Homo sapiens", "Terra",
    TipoAlimentacao.ONIVORO, TipoPele.PELOS, TipoRespiracao.PULMONAR,
    ModoLocomocao.ANDA, "Fala", 280, true, true);
animais.add(humano);

Mamifero cavalo = new Mamifero("Cavalo", "Equus ferus caballus", "Campos e estepes",
    TipoAlimentacao.HERBIVORO, TipoPele.PELOS, TipoRespiracao.PULMONAR,
    ModoLocomocao.CORRE, "Relincho", 340, true, false);
animais.add(cavalo);

Peixe tubarao = new Peixe("Tubarão-branco", "Carcharodon carcharias", "Oceano aberto",
    TipoAlimentacao.CARNIVORO, TipoPele.ESCAMAS, TipoRespiracao.BRANQUIAL,
    ModoLocomocao.NADA, "Cliques/silêncio", true, true);
animais.add(tubarao);

Peixe salmao = new Peixe("Salmão", "Salmo salar", "Rios e oceanos",
    TipoAlimentacao.PISCIVORO, TipoPele.ESCAMAS, TipoRespiracao.BRANQUIAL,
    ModoLocomocao.NADA, "Ruídos suaves", false, true);
animais.add(salmao);

Peixe peixePalhaco = new Peixe("Peixe-palhaço", "Amphiprion ocellaris", "Recifes de coral",
    TipoAlimentacao.PLANCTIVORO, TipoPele.ESCAMAS, TipoRespiracao.BRANQUIAL,
    ModoLocomocao.NADA, "Quase inaudível", true, true);
animais.add(peixePalhaco);

Peixe pirarucu = new Peixe("Pirarucu", "Arapaima gigas", "Rios da Amazônia",
    TipoAlimentacao.CARNIVORO, TipoPele.ESCAMAS, TipoRespiracao.BRANQUIAL,
    ModoLocomocao.NADA, "Estalo", false, true);
animais.add(pirarucu);

Peixe lampreia = new Peixe("Lampreia", "Petromyzon marinus", "Água doce e salgada",
    TipoAlimentacao.PARASITA, TipoPele.ESCAMAS, TipoRespiracao.BRANQUIAL,
    ModoLocomocao.NADA, "Silencioso", true, false);
animais.add(lampreia);

Reptil cobra = new Reptil("Cobra-real", "Ophiophagus hannah", "Florestas tropicais",
    TipoAlimentacao.CARNIVORO, TipoPele.ESCAMAS, TipoRespiracao.PULMONAR,
    ModoLocomocao.RASTEJA, "Silvo", true, "Rastejante");
animais.add(cobra);

Reptil camaleao = new Reptil("Camaleão", "Chamaeleo calyptratus", "Árvores",
    TipoAlimentacao.INSETIVORO, TipoPele.ESCAMAS, TipoRespiracao.PULMONAR,
    ModoLocomocao.ANDA, "Silencioso", false, "Quadrúpede lento");
animais.add(camaleao);

Reptil jacare = new Reptil("Jacaré-açu", "Melanosuchus niger", "Rios da Amazônia",
    TipoAlimentacao.CARNIVORO, TipoPele.ESCAMAS, TipoRespiracao.PULMONAR,
    ModoLocomocao.NADA, "Rugido grave", false, "Nadador e andador");
animais.add(jacare);

Reptil tartaruga = new Reptil("Tartaruga-verde", "Chelonia mydas", "Oceanos tropicais",
    TipoAlimentacao.HERBIVORO, TipoPele.ESCAMAS, TipoRespiracao.PULMONAR,
    ModoLocomocao.NADA, "Quase inaudível", false, "Nadadora");
animais.add(tartaruga);

Reptil teiu = new Reptil("Lagarto teiú", "Salvator merianae", "Cerrado e florestas",
    TipoAlimentacao.ONIVORO, TipoPele.ESCAMAS, TipoRespiracao.PULMONAR,
    ModoLocomocao.ANDA, "Estalo curto", false, "Quadrúpede ágil");
animais.add(teiu);


        AnimalService animalService = new AnimalService(animais);
        MainMenu menu = new MainMenu(animalService);
        menu.exibir();

    }
}
