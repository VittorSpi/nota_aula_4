public class Professor {
    protected String nome;
    protected int idade;
    protected double salario;
    public Professor(String nome, int idade, double salario){
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.nome = nome;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public double getSalario(){
        return salario;
    }
}
