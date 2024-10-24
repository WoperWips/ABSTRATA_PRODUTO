package src.modelo.lib;

public class Produto { // Definição da classe Produto
    protected String nome; // Atributo protegido para o nome do produto
    private double precoCusto; // Atributo privado para o preço de custo do produto
    private final double precoVenda; // Atributo privado final para o preço de venda do produto

    // Construtor da classe Produto, inicializa os atributos
    public Produto(String nome, double precoCusto, double precoVenda) {
        this.setNome(nome); // Chama o método setNome para inicializar o nome
        this.precoCusto = precoCusto; // Inicializa o preço de custo
        this.precoVenda = precoVenda; // Inicializa o preço de venda
    }

    // Método para obter o nome do produto
    public String getNome() {
        return nome; // Retorna o nome do produto
    }

    // Método final para definir o nome do produto, não pode ser sobrescrito
    public final void setNome(String nome) {
        this.nome = nome; // Inicializa o nome do produto
    }

    // Método para calcular o lucro do produto
    public double calcularLucro() {
        return precoVenda - precoCusto; // Retorna a diferença entre o preço de venda e o preço de custo
    }

    // Método para salvar o produto (simulação)
    public void salvar() {
        // Lógica para salvar o produto (simulação)
        System.out.println("Produto " + getNome() + " salvo com sucesso."); // Mensagem de sucesso
    }

    // Método para atualizar o produto (simulação)
    public void atualizar() {
        // Lógica para atualizar o produto (simulação)
        System.out.println("Produto " + getNome() + " atualizado com sucesso."); // Mensagem de sucesso
    }

    // Método para deletar o produto (simulação)
    public void deletar() {
        // Lógica para deletar o produto (simulação)
        System.out.println("Produto " + getNome() + " deletado com sucesso."); // Mensagem de sucesso
    }

    // Método para obter o preço de custo do produto
    public double getPrecoCusto() {
        return precoCusto; // Retorna o preço de custo
    }

    // Método para definir o preço de custo do produto
    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto; // Inicializa o preço de custo
    }
}
