public class mainProduto {
    public static void main(String []args){
        Produto produto1 = new Produto("Camisa", 49.99, "Camisa Polo Azul");
        Produto produto2 = new Produto("Calça", 99.99, "Calça jeans preta");
        System.out.println("Produto:" + produto1.getProduto());
        System.out.println("Preço:" + produto1.getPreco());
        System.out.println("Modelo:" + produto1.getModelo());
        System.out.println("-------------------");
        System.out.println("Produto:" + produto2.getProduto());
        System.out.println("Preço:" + produto2.getPreco());
        System.out.println("Modelo:" + produto2.getModelo());
    }

}
