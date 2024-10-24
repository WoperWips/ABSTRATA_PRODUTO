package src.modelo.lib;

public class ProdutoVestuario extends Produto { // Classe ProdutoVestuario que estende a classe Produto
    private String tamanho; // Atributo privado para o tamanho do produto
    private String cor; // Atributo privado para a cor do produto
    private String material; // Atributo privado para o material do produto

    // Construtor da classe ProdutoVestuario, inicializa os atributos
    public ProdutoVestuario(String nome, double precoCusto, double precoVenda, String tamanho, String cor, String material) {
        super(nome, precoCusto, precoVenda); // Chama o construtor da classe pai (Produto)
        this.tamanho = tamanho; // Inicializa o tamanho do produto
        this.cor = cor; // Inicializa a cor do produto
        this.material = material; // Inicializa o material do produto
    }

    // Sobrescreve o método salvar da classe pai
    @Override
    public void salvar() {
        super.salvar(); // Chama o método salvar da classe pai
        System.out.println("Produto Vestuário " + super.getNome() + " salvo com tamanho " + tamanho + " e cor " + cor + "."); // Mensagem de sucesso específica
    }

    // Método para obter a cor do produto
    public String getCor() {
        return cor; // Retorna a cor do produto
    }

    // Método para definir a cor do produto
    public void setCor(String cor) {
        this.cor = cor; // Inicializa a cor do produto
    }

    // Método para obter o material do produto
    public String getMaterial() {
        return material; // Retorna o material do produto
    }

    // Método para definir o material do produto
    public void setMaterial(String material) {
        this.material = material; // Inicializa o material do produto
    }

    // Método para definir o tamanho do produto
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho; // Inicializa o tamanho do produto
    }
}
