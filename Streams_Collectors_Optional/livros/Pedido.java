

import java.util.List;

public class Pedido {
    private int codigo;
    private List<Produto> produtos;
    private Cliente cliente;

    public Pedido(int codigo, List<Produto> produtos, Cliente cliente) {
        this.codigo = codigo;
        this.produtos = List.copyOf(produtos); // Defensive copy
        this.cliente = cliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public List<Produto> getProdutos() {
        return List.copyOf(produtos); // Defensive copy
    }

    public Cliente getCliente() {
        return cliente;
    }
}
