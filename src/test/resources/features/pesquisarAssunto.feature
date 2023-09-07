# language: pt


Funcionalidade: Fazer uma pesquisa de um assunto qualquer

  @pesquisarAssunto_sucesso
  Cenario: Pesquisar um assunto  com sucesso
    Dado que estou na tela home do Blog AGI
    E preencho o campo pesquisar
    Quando clico em Pesquisar
    Então vejo uma lista com as pesquisas feitas com sucesso

