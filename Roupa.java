class Roupa extends Produto{
    private double valorTotal;
    private double frete;

    public Roupa(String nome, double preco) {
        super(nome, preco);
        this.valorTotal = valorTotal;
        this.frete = frete;
    }

    @Override
    public double calcularDesconto(double porcentagem){
        frete = 49.90;
        valorTotal = getPreco() + frete;
        if (valorTotal >= 1000){
            porcentagem = 20;
            return getPreco() - (getPreco() * porcentagem / 100);
        } else {
            System.out.println("Valor não recebe desconto, nem frete gratis.");
            return getPreco() + frete;
        }
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }
}
