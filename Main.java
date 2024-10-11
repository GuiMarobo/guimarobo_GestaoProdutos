public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Produto camiseta = new Roupa("Camiseta", 299.99);
        Produto carroNovo = new Carro("Lamborghini Urus", 3000000, 2021);
        Produto carroAntigo = new Carro("Corsa", 26000, 2016);

        estoque.adicionarProduto(camiseta);
        estoque.adicionarProduto(carroNovo);
        estoque.adicionarProduto(carroAntigo);

        estoque.exibirPrecosComDesconto(estoque.getProdutosDisponiveis(), 15);
    }
}