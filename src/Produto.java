
public class Produto {
    private String nome;
    private double peso;
    private int valor;

    public Produto(String nome, double peso, int valor){
        this.nome = nome;
        this.peso = peso;
        this.valor = valor;
    }

    public String getNome(){
        return nome;
    }

    public double getPeso(){
        return peso;
    }

    public int getValor(){
        return valor;
    }

}