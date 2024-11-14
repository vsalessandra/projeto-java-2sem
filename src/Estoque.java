import java.util.ArrayList;

public class Estoque {
    private int capacidade;
    private ArrayList<Produto> produtos;

    public Estoque(int capacidade){
        this.capacidade = capacidade;
        this.produtos = new ArrayList<>();
    }

    public int getCapacidade(){
        return capacidade;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void adicionarProdutos(Produto produto){
        produtos.add(produto);
    }

}
