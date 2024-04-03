public class Carro {
    protected String marca;
    protected String modelo;
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    public void mostrarDetalhes(){
        System.out.println("Marca:" + getMarca());
        System.out.println("Modelo:" + getModelo());
    }
}
