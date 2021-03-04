package atividade2_4;
import java.util.Scanner;
public class Atividade2_4 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
          double numero1;
          double numero2;
          
          System.out.println("Digite um número: ");
          numero1 = leitura.nextDouble();
          System.out.println("Digite outro número: ");
          numero2 = leitura.nextDouble();
          
          if(numero1 > numero2){
              System.out.println("O número "+numero1+" é maior que o número "+numero2+".");
          }
          else if(numero1 < numero2){
              System.out.println("O numero "+numero2+" é maior que o número "+numero1+".");
    }
          else {
              System.out.println("Os números "+numero1+" e "+numero2+" são iguais.");
          }
               
    }
    
}
