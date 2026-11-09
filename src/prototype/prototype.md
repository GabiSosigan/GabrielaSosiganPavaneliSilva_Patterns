# Atividade: Prototype

## Contexto
Um sistema de jogos precisa criar vários **personagens semelhantes**.

Cada personagem possui:
- Nome
- Classe
- Nível
- Vida
- Ataque

Criar todos os personagens manualmente pode ser repetitivo. Por isso, o sistema utilizará o **padrão Prototype** para **clonar personagens existentes e modificar apenas algumas propriedades**.

## Instruções

### Parte 1: Criar a Classe do Produto
1. Crie a classe `Personagem` com os atributos:
    - `nome`
    - `classe`
    - `nivel`
    - `vida`
    - `ataque`

### Parte 2: Implementar o Prototype
1. Implemente o método `clone()` na classe `Personagem` que retorna uma cópia do objeto

### Parte 3: Utilizar o Pattern
1. Crie 1 personagem base com todos os atributos definidos
2. Clone pelo menos **3 personagens** a partir dele
3. Modifique apenas o **nome** de cada clone
4. Exiba todos os personagens criados

## Requisitos
- Implementar o método `clone()` na classe `Personagem`
- Criar um personagem base
- Clonar pelo menos 3 personagens a partir do base
- Exibir os personagens criados

## Exemplo de Saída Esperada
```
=== Personagem Base ===
Nome: Guerreiro Base | Classe: Guerreiro | Nível: 1 | Vida: 100 | Ataque: 15

=== Personagens Clonados ===
Nome: Arthur | Classe: Guerreiro | Nível: 1 | Vida: 100 | Ataque: 15
Nome: Merlin | Classe: Guerreiro | Nível: 1 | Vida: 100 | Ataque: 15
Nome: Lancelot | Classe: Guerreiro | Nível: 1 | Vida: 100 | Ataque: 15
```