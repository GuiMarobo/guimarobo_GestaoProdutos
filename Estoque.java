import java.util.ArrayList;
import java.util.List;

class Estoque {
    private List<Produto> produtosDisponiveis;

    public Estoque(){
        this.produtosDisponiveis = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto){
        produtosDisponiveis.add(produto);
    }

    public void removerProduto(Produto produto){
        produtosDisponiveis.remove(produto);
    }

    public void exibirPrecosComDesconto(List<Produto> produtos, double porcentagem){
        for (Produto produto : produtosDisponiveis) {
            double precoComDesconto = produto.calcularDesconto(porcentagem);
            System.out.println(produto.getNome() + " custa: R$" + String.format("%.2f", precoComDesconto));
        }
    }

    public List<Produto> getProdutosDisponiveis(){
        return produtosDisponiveis;
    }
}
