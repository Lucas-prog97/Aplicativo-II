package atividade2_2;
import java.util.Scanner;
public class Atividade2_2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);
        double numero1;
        double numero2;
        
        System.out.println("::::::Comparação numeral:::::");
        System.out.println("Digite um número: ");
        numero1 = leitura.nextDouble();
        System.out.println("Digite outro número: ");
        numero2 = leitura.nextDouble();
        
        if( numero1 == numero2){
            System.out.println("Os números "+numero1+" e "+numero2+" são iguais.");
        }
        else{
            System.out.println("Os números "+numero1+" e "+numero2+" são diferentes.");
        }
    }
    
}
