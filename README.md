# 🪓 Jogo da Forca - Java Console

Projeto simples de um **jogo da forca** desenvolvido em **Java**, utilizando os princípios da **Programação Orientada a Objetos (POO)**. O jogo é executado no console e simula o tradicional jogo da forca com palavras variadas.

---

## 📌 Funcionalidades

- Menu interativo para iniciar ou sair do jogo.
- Palavra secreta gerada aleatoriamente.
- Validação de letras repetidas.
- Exibição do boneco da forca de forma progressiva conforme os erros.
- Mensagens de vitória ou derrota ao final.

---

## 🧱 Estrutura de Classes

- `Main.java` – Classe principal que inicia o jogo.
- `Menu.java` – Menu de navegação do jogo.
- `Forca.java` – Gerencia o estado da forca, tentativas e exibição do boneco.
- `PalavraSecreta.java` – Gera a palavra e controla as letras reveladas.

---

## 📁 Estrutura de Pastas

```

JogoDaForca/
├── Main.java
└── jogo/
├── Menu.java
├── Forca.java
└── PalavraSecreta.java

````

---

## 🚀 Como Executar

1. Compile os arquivos:

```bash
javac Main.java jogo/*.java
````

2. Execute o programa:

```bash
java Main
```

---

## ✨ Exemplo de Gameplay

```
--- JOGO DA FORCA ---
1. Iniciar novo jogo
2. Sair
Escolha uma opção: 1

-----
|    |
|    0
|   /|\\
|   / \\
|
=====
Palavra: _ _ _ _ _ _
Digite uma letra:
```

---

## 👨‍💻 Desenvolvido por

Otávio Guedes – Estudante de Engenharia de Software 🧠
💻 Foco em Back-end com Python e Java
