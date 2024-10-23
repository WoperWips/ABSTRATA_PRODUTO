package src.modelo.lib;

import src.ProdutoVestuario;

public class Main {
    public static void main(String[] args) {
        // Criando um produto genérico
        Produto produto1 = new Produto("Produto Genérico", 10.0, 15.0);
        produto1.salvar();
        System.out.println("Lucro: " + produto1.calcularLucro());
        produto1.atualizar();
        produto1.deletar();

        // Criando um produto alimentício
        ProdutoAlimenticio produtoAlimenticio = new ProdutoAlimenticio(
                "Arroz", 5.0, 8.0, "2024-12-31", "200 calorias por porção");
        produtoAlimenticio.salvar();
        System.out.println("Lucro: " + produtoAlimenticio.calcularLucro());
        produtoAlimenticio.atualizar();
        produtoAlimenticio.deletar();

        // Criando um produto de vestuário
        ProdutoVestuario produtoVestuario = new ProdutoVestuario(
                "Camisa", 20.0, 30.0, "M", "Azul", "Algodão");
        produtoVestuario.salvar();
        System.out.println("Lucro: " + produtoVestuario.calcularLucro());
        produtoVestuario.atualizar();
        produtoVestuario.deletar();
    }
}
