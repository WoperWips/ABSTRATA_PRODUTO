package src.modelo.lib; 

public class ProdutoAlimenticio extends Produto { // Classe ProdutoAlimenticio que estende a classe Produto
    private final String dataValidade; // Atributo privado final para a data de validade do produto
    private final String informacoesNutricionais; // Atributo privado final para informações nutricionais

    // Construtor da classe ProdutoAlimenticio, inicializa os atributos
    public ProdutoAlimenticio(String nome, double precoCusto, double precoVenda, String dataValidade, String informacoesNutricionais) {
        super(nome, precoCusto, precoVenda); // Chama o construtor da classe pai (Produto)
        this.dataValidade = dataValidade; // Inicializa a data de validade
        this.informacoesNutricionais = informacoesNutricionais; // Inicializa as informações nutricionais
    }

    // Sobrescreve o método salvar da classe pai
    @Override
    public void salvar() {
        super.salvar(); // Chama o método salvar da classe pai
        System.out.println("Produto Alimentício " + super.getNome() + " salvo com informações nutricionais."); // Mensagem de sucesso específica
    }

    // Método para obter a data de validade do produto
    public String getDataValidade() {
        return dataValidade; // Retorna a data de validade
    }

    // Método para obter as informações nutricionais do produto
    public String getInformacoesNutricionais() {
        return informacoesNutricionais; // Retorna as informações nutricionais
    }
}
