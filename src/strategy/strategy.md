# Atividade: Strategy

## Contexto
Um carrinho (`Cart`) possui um `subtotal` e pode aplicar diferentes descontos:
- Sem desconto
- Percentual
- Valor fixo

## Instruções

### Parte 1: Criar a Interface Strategy
1. Crie a interface `DiscountStrategy` com o método:
    - `double apply(double subtotal);`

### Parte 2: Criar as Estratégias Concretas
1. Crie a classe `NoDiscount`:
    - retorna o `subtotal` sem alterar
2. Crie a classe `PercentageDiscount`:
    - recebe `double percent` no construtor (ex.: `10` para 10%)
    - aplica: `subtotal * (1 - percent/100)`
3. Crie a classe `FixedDiscount`:
    - recebe `double amount` no construtor (ex.: `20`)
    - aplica: `subtotal - amount`
    - o total **não pode ficar negativo** (mínimo 0)

### Parte 3: Criar o Context
1. Crie a classe `Cart` com:
    - atributo `private double subtotal;`
    - atributo `private DiscountStrategy strategy;`
    - construtor que recebe `subtotal` e `strategy`
    - método `setDiscountStrategy(DiscountStrategy strategy)`
    - método `double total()` que retorna `strategy.apply(subtotal)`

### Parte 4: Utilizar o Pattern
1. No `main`, crie um carrinho com subtotal `200` e demonstre:
    - Sem desconto
    - Desconto de 10%
    - Desconto fixo de 20
    - Troca de estratégia em tempo de execução usando `setDiscountStrategy(...)`

## Requisitos
- Usar interface para definir o contrato da estratégia
- Permitir troca de estratégia em tempo de execução
- O valor total nunca deve ser negativo

## Exemplo de Saída Esperada
```
Total (sem desconto): 200.0
Total (10%): 180.0
Total (-20): 180.0
```