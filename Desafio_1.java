 /*
Faça um programa para ler um vetor com valor indeterminado. 
Após isto, ler mais um número qualquer, calcular (soma) 
e escrever quantas vezes esse número aparece no vetor. 
Sempre imprimir na tela os processos do vetor.
 */
package desafio_1;
import java.util.Scanner;
import java.util.ArrayList;
public class Desafio_1 {
    public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
        ArrayList <Integer> lista = new ArrayList();
        
        
        int n=0;
        int soma = 0;
        
        
        System.out.println("::::::::::::::::::::::::::::::::::::::::::");
        System.out.println(":::::::       Menu principal       :::::::");
        System.out.println("::::::::::::::::::::::::::::::::::::;:::::");
        System.out.println("");
        System.out.println("Digite um número qualquer para cadastrar");
        System.out.println("");
        System.out.println("Para parar o cadastro digite 0");
        

            do{
                System.out.println("Digite um número para cadastro");
                n = ler.nextInt();        
                lista.add(n);
                System.out.println("");
                System.out.println("Número cadastrado com sucesso!");
                System.out.println("");
            }

                
       while (n != 0);
        
        System.out.println("Lista de números "+lista);
        System.out.println("    ");
        System.out.println("Digite mais um número");
        n = ler.nextInt();
        lista.add(n);
        System.out.println("");
        System.out.println("Nova lista de números"+lista);
        
        for(int novonumero : lista)
        {soma = soma + novonumero;
        }
        System.out.println("Soma dos números "+ soma);
       
        int p=0;
        while (p!=0);
        
        System.out.println("Digite um número para procurar na sua lista");
        p=ler.nextInt();
        
        int contar = 0;
        
        for(int i : lista)
        {
            if (i == p)
            {
                contar ++;
            }
        }
        
        System.out.println("O número " + p + " apareceu " + contar + " vezes");
    
    }         
 }
    
