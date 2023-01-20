package ProjetoJava;

public class Produto {
	private String nome;
    private String descricao;
    private double valor;
    private int qtde;
    private int categoria;

    public Produto(int categoria, double valor, int qtde, String nome, String descricao) {
        this.categoria = categoria;
        this.qtde = qtde;
        this.valor = valor;
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
}