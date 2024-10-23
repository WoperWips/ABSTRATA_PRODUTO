package src;

import src.modelo.lib.Produto;

public class ProdutoVestuario extends Produto {
    private String tamanho;
    private String cor;
    private String material;

    public ProdutoVestuario(String nome, double precoCusto, double precoVenda, String tamanho, String cor, String material) {
        super(nome, precoCusto, precoVenda);
        this.tamanho = tamanho;
        this.cor = cor;
        this.material = material;
    }

    @Override
    public void salvar() {
        super.salvar();
        System.out.println("Produto Vestuário " + super.getNome() + " salvo com tamanho " + tamanho + " e cor " + cor + ".");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}
