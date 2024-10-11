class Carro extends Produto{
    private int ano;

    public Carro(String nome, double preco, int ano){
        super(nome, preco);
        this.ano = ano;
    }

    @Override
    public double calcularDesconto(double porcentagem) {
        if (ano >= 2020){
            System.out.println(getNome() + " recebe desconto de: " + String.format("%.0f", porcentagem) + "%");
            return getPreco() - (getPreco() * (porcentagem / 100));
        } else {
            System.out.println(getNome()+ " não recebe desconto.");
            return getPreco();
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
