package atividade2_1;
import java.util.Scanner;
public class Atividade2_1 {

   
    public static void main(String[] args) {
        
        int numero;
        Scanner leitura = new Scanner (System.in);
        
        System.out.println("Digite um número: ");
        numero = leitura.nextInt();
        if (numero >= 0){
            System.out.println("O número "+numero+" é positivo!");
        }
        else{
            System.out.println("O número "+numero+" é negativo!");}
        
    }
    
}
