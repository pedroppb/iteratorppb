package iteratorppb;

public class Peca {
    private String nome;
    private double valorLoja;
    private double valorDesconto;

    public Peca(String nome, double valorLoja, double valorDesconto){
        this.nome=nome;
        this.valorLoja=valorLoja;
        this.valorDesconto=valorDesconto;
    }
    public boolean pagoComDesconto() {
        return valorDesconto!=0;
    }
    public double valorComDesconto(){
        return valorLoja-valorDesconto;
    }
}
