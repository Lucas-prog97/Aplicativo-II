package ativdade2_3;
import java.util.Scanner;
public class Ativdade2_3 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero;
        
        System.out.println("Digite um número inteiro");
        numero = leitura.nextInt();
        
        if (numero % 2 == 0){
            System.out.println("O número "+numero+" é par!");
            
        }
        else {
            System.out.println("O número "+numero+" é ímpar");
        }
    }
    
}
