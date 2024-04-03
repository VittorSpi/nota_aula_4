public class Aluno {
    String nome;
    int idade;
    int matricula;
    public Aluno(String nome, int idade, int matricula){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.nome = nome;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public int getMatricula(){
        return matricula;
    }
}
