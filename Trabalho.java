import java.util.Scanner;
public class Trabalho{
    public static void main(String[]args){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Seja bem vindo a Iron Fight Club!");
        System.out.println("Qual o seu nome?");
        String nome = entrada.nextLine();
        System.out.println ("Qual seu CPF?");
        long CPF = entrada.nextLong();
        System.out.println("Qual sua idade?");
        long idade = entrada.nextLong();
        System.out.println("Digite o seu telefone:");
        long telefone = entrada.nextLong();
        System.out.println("Qual o seu email?");
        String email = entrada.next();
        System.out.println("Digite uma senha:");
        String senha = entrada.nextLine();
        System.out.println("Qual o seu endereco?");
        String endereço = entrada.nextLine();
        System.out.print("qual o seu genero?");
        String genero = entrada.nextLine();
        System.out.println("Qual o seu peso?");
        float peso = entrada.nextFloat();
        System.out.println("Qual e sua altura?");
        float altura = entrada.nextFloat();



    }
}