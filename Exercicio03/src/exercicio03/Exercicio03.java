package exercicio03;
import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        
        double a;
        double resultado1, resultado2, resultado3, resultado4, resultado5;
        Scanner leitura= new Scanner (System.in);
        
        System.out.println("Digite um número: ");
        a = leitura.nextDouble();
        resultado1 = (a * 2);
        resultado2 = (resultado1 * 3);
        resultado3 = (resultado2/2);
        resultado4 = (a * a);
        resultado5 = (resultado1/5);
        
        System.out.println("O dobro de "+a+" é igual á: "+resultado1);
        System.out.println("O triplo do dobro de "+a+" é igual á: "+ resultado2);
        System.out.println("A metade do triplo do dobro de "+a+" é ogual á: "+resultado3);
        System.out.println("O quadrado de "+a+" é igual á: "+resultado4);
        System.out.println("A quinta parte do dobro de "+a+" é igual á "+resultado5);
        
        
        
        
        
    }
    
}
