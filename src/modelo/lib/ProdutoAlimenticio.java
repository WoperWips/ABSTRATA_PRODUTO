package src.modelo.lib;

public class ProdutoAlimenticio extends Produto {
    private final String dataValidade;
    private final String informacoesNutricionais;

    public ProdutoAlimenticio(String nome, double precoCusto, double precoVenda, String dataValidade, String informacoesNutricionais) {
        super(nome, precoCusto, precoVenda);
        this.dataValidade = dataValidade;
        this.informacoesNutricionais = informacoesNutricionais;
    }

    @Override
    public void salvar() {
        super.salvar();
        System.out.println("Produto Alimentício " + super.getNome() + " salvo com informações nutricionais.");
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public String getInformacoesNutricionais() {
        return informacoesNutricionais;
    }
}
