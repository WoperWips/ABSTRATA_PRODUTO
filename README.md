ABSTRATA_PRODUTO:Nesse reprositorio foi feito com o intuito de auxiliar logica de progamação orientada objeto.

🚀 Começando Projeto: Sistema de Gestão de Produtos
Este projeto implementa um sistema básico de gestão de produtos, categorizados como produtos alimentícios e de vestuário, em Java. O sistema demonstra o uso de herança, polimorfismo e encapsulamento, além de operações CRUD básicas (Salvar, Atualizar e Deletar).

Estrutura de Classes
Classe Abstrata Produto:

A classe Produto é a classe base, contendo os atributos comuns a todos os produtos, como nome, preço de custo e preço de venda.
Possui o método concreto calcularLucro, que calcula a diferença entre o preço de venda e o preço de custo.
Define métodos abstratos salvar(), deletar() e atualizar() que devem ser implementados nas subclasses.
Classe ProdutoAlimenticio:

Herda de Produto.
Atributos específicos: data de validade e informações nutricionais.
Implementa os métodos salvar(), deletar() e atualizar() com funcionalidades específicas para produtos alimentícios.
Classe ProdutoVestuario:

Herda de Produto.
Atributos específicos: tamanho, cor e material.
Implementa os métodos salvar(), deletar() e atualizar() com funcionalidades específicas para produtos de vestuário.
Funcionalidades
Salvar: Registra o produto no sistema.
Atualizar: Atualiza os dados do produto.
Deletar: Remove o produto do sistema.
Calcular Lucro: Calcula o lucro do produto com base nos preços de custo e venda.

📋 Pré-requisitos Visual Studio + extensões do Java

🔧 Instalação Cada programa pode ser executado individualmente. Basta compilar o código em seu ambiente Java e executar o arquivo correspondente.

🛠️ Construído com Ferramentas utilizadas e bibliotecas Visual Studio

📌 Versão Versão 1.0

✒️ Autores Herick Marlon - Trabalho Inicial - ABSTRATA_PRODUTO
