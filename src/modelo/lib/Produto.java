package src.modelo.lib;

public class Produto {
    protected String nome;
    private double precoCusto;
    private final double precoVenda;

    public Produto(String nome, double precoCusto, double precoVenda) {
        this.setNome(nome);
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    public String getNome() {
        return nome;
        
    }

    public final void setNome(String nome) {
        this.nome = nome;
        
    }

    public double calcularLucro() {
        return precoVenda - precoCusto;
    }

    public void salvar() {
        // Lógica para salvar o produto (simulação)
        System.out.println("Produto " + getNome() + " salvo com sucesso.");
    }

    public void atualizar() {
        // Lógica para atualizar o produto (simulação)
        System.out.println("Produto " + getNome() + " atualizado com sucesso.");
    }

    public void deletar() {
        // Lógica para deletar o produto (simulação)
        System.out.println("Produto " + getNome() + " deletado com sucesso.");
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }
}
