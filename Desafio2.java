//Leia um vetor de 20 posições. Contar e escrever quantos valores pares e ímpares ele possui. Imprimir na tela
package desafio2;
import java.util.Scanner;
import java.util.ArrayList;
public class Desafio2 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        ArrayList <Integer> lista = new ArrayList();
        ArrayList <Integer> lista2 = new ArrayList();
        ArrayList <Integer> lista3 = new ArrayList();
        int n = 0;
        
        for(int c = 1; c < 21; c++){
            System.out.println("Digite o nuúmero "+ c );
            n=ler.nextInt();
            lista.add(n); 
        
                if(n %2==0){
                lista2.add(n);
                
                }else{
                lista3.add(n);
                }
        }
        System.out.println(lista.size());
        System.out.println("Resultado: ");
        System.out.println("");
        System.out.println("Numeros digitados: "+lista);
        System.out.println("");
        System.out.println("Números pares "+ lista2);
        System.out.println("");
        System.out.println("Números ímpares "+ lista3); 
        
       }
    }
    

