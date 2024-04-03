public class Produto {
    protected String produto;
    protected double preco;
    protected String modelo;
    public Produto(String produto, double preco, String modelo){
        this.produto = produto;
        this.preco = preco;
        this.modelo = modelo;
    }
    public String getProduto(){
        return produto;
    }
    public double getPreco(){
        return preco;
    }
    public String getModelo(){
        return modelo;
    }
}
