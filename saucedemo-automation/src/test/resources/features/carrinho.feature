Feature: Carrinho de Compras

  Scenario: Adicionar dois produtos ao carrinho
    Given que o usuário acessa o site da loja virtual
    And informa credenciais válidas
    When adiciona dois produtos distintos à sacola
    Then o sistema deve exibir o número 2 no carrinho
