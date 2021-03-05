package exercicio4_1;

import java.util.Scanner;

public class Exercicio4_1 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Cliente c1 = new Cliente();

        System.out.println("Digite seu nome: ");
        c1.nome = leitura.nextLine();

        System.out.println("Digite sua idade: ");
        c1.setIdade(leitura.nextInt());

        System.out.println("Digite a sua renda: ");
        c1.setRenda(leitura.nextDouble());

        System.out.println("::::::::Classificando sua classe social::::::::");
        System.out.println(":::::::::::::::::::::::::");
        System.out.println("Nome: " + c1.nome);
        System.out.println(":::::::::::::::::::::::::");
        System.out.println("Idade: " + c1.getIdade() + " (" + c1.classificarIdade() + ")"
                + ""
                + ""
                + "");
        System.out.println(":::::::::::::::::::::::::");
        System.out.println("Classe social: " + c1.classificarRenda());
        System.out.println(":::::::::::::::::::::::::");

    }

}
