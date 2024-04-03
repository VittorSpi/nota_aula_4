import java.util.Scanner;
public class Main{
    public static void main(String[]args){
       Professor p1 = new Professor("Carlos", 35, 2000);
       Aluno a1 = new Aluno("Gabriel", 18, 2023210520);
        System.out.println("-----Professor-----");
        System.out.println("Nome:" + p1.getNome());
        System.out.println("Idade:" + p1.getIdade());
        System.out.println("Salário:" + p1.getSalario());
        System.out.println("-----Aluno-----");
        System.out.println("Nome:" + a1.getNome());
        System.out.println("Idade:" + a1.getIdade());
        System.out.println("Matricula:" + a1.matricula);
    }
}