package exercicio_11;
import java.util.Scanner;
public class Exercicio_11 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Cachorro c1 = new Cachorro();
        Papagaio p1 = new Papagaio();
        Mosca m1 = new Mosca();
        
        
        System.out.println("Digite a cor do pelo do seu cachorro: ");
        c1.setCorPelo(leitura.nextLine());
        System.out.println("Digite a cor da pena do seu papagaio: ");
        p1.setCorPena(leitura.nextLine());
        System.out.println("Digite a quantidade de patas da mosca: ");
        m1.setQtdPatas(leitura.nextInt());
        
        System.out.println(":::::::::::::::::::::::::::::::::::::::");
        System.out.println(":::::::::::::::::::::::::::::::::::::::");
        System.out.println("");
        System.out.println("");
        System.out.println(":::::::::::::::::::::::::::::::::::::::");
        System.out.println(":::::::::::::::::::::::::::::::::::::::");
        System.out.println("");
        System.out.println("Cor do seu cachorro: "+c1.getCorPelo());
        System.out.println("");
        System.out.println("Cor da pena do seu papagaio: "+p1.getCorPena());
        System.out.println("");
        System.out.println("Quantidade de perna da mosca: "+m1.getQtdPatas());
        
        
    }
    
}
