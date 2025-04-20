# 🐾Zoologic
 
 **Zoologic** é um projeto Java em desenvolvimento que simula um sistema de classificação e gerenciamento de animais vertebrados do filo Chordata. Criado com fins didáticos por um estudante de Java, o objetivo é aplicar conceitos de **Programação Orientada a Objetos (POO)**, organização de pacotes, uso de **Enums, encapsulamento, herança, polimorfismo** e boas práticas de código.

## 📌 Sobre o Projeto
O sistema permite cadastrar e exibir informações detalhadas sobre diferentes classes de animais:

* 🦁 Mamíferos
* 🐦 Aves
* 🐍 Répteis
* 🐟 Peixes
* 🐸 Anfíbios

Cada classe animal possui atributos específicos e métodos próprios que sobrescrevem comportamentos comuns da superclasse `Chordata`.

## 📂 Estrutura de Pacotes
```
zoologic/
│
├── model/               // Classes das espécies animais
│   ├── Mamifero.java
│   ├── Ave.java
│   ├── Reptil.java
│   ├── Peixe.java
│   └── Anfibio.java
│
├── model/enums/         // Enums usados para classificação
│   ├── ClasseAnimal.java
│   ├── TipoPele.java
│   ├── TipoRespiracao.java
│   ├── ModoLocomocao.java
│
├── service/             // Serviços auxiliares
│   └── AnimalService.java
│
└── Main.java            // Ponto de entrada da aplicação

```

## ✅ Funcionalidades atuais

- 📋 Cadastro de diferentes animais por classe
- 🔍 Filtro por tipo de respiração
- 🔍 Filtro por modo de locomoção
- 🧪 Listagem de animais venenosos
- 🔠 Busca por nome popular

### 🚧 Em desenvolvimento
Algumas funcionalidades estão previstas para versões futuras:

- 🔁 Simulação de interações alimentares ("quem come quem")
- 📝 Interface gráfica (GUI)
- 🌐 Armazenamento e leitura de dados via arquivos ou banco de dados
- ✅ Testes unitários automatizados

## 🤝 Contribuições
Este projeto está aberto para contribuições! Se você também está aprendendo Java ou quer ajudar com ideias e melhorias, sinta-se à vontade para abrir um Pull Request ou Issue.

## 👨‍💻 Autor
Projeto desenvolvido por um estudante de Java com fins educacionais e de aprendizado pessoal. Se quiser trocar ideia ou colaborar, é só chamar!

## 📄 Licença
Este projeto está sob a licença MIT. Sinta-se livre para usar, modificar e compartilhar.
