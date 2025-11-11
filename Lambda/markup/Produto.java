public class Produto {
    private String nome;
    private double preco;
    private double percentualMarkup = 10.0; // valor inicial padrão (10%)

    public Supplier<Double> precoComMarkup = () ->
            preco + (preco * percentualMarkup / 100);

    public Consumer<Double> atualizarMarkup = novoMarkup ->
            this.percentualMarkup = novoMarkup;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getPercentualMarkup() {
        return percentualMarkup;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", percentualMarkup=" + percentualMarkup +
                "%}";
    }
}