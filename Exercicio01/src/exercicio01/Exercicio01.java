package exercicio01;
import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
       
        double nota1, nota2, nota3;
        String nome;
        Scanner leitura= new Scanner (System.in);
        
        System.out.println ("Sabendo que a média é 7 calcule sua nota");
        System.out.println ("::::::::::Cálculo da média::::::::::");
        
        System.out.println ("::::::::::Digite o seu nome:::::::::  ");
        nome = leitura.nextLine();
        
        System.out.println ("Digite o valor da sua primeira nota:  ");
        nota1 = leitura.nextDouble();
        
        System.out.println ("Digite o valor da sua segunda nota:  ");
        nota2 = leitura.nextDouble();
        
        System.out.println ("Digite o valor da sua terceira nota:  ");
        nota3 = leitura.nextDouble();
           double media;
           media = ((nota1+nota2+nota3)/3);
      
           if (media >= 6){
               System.out.println("Parabéns "+nome);
               System.out.println("Você passou!");
               System.out.println("Sua nota foi:   "+media);
           }
           else{
               System.out.println("Você não teve êxito em sua conclusão "+ nome + "." );
               System.out.println("Tente da próxima vez.");
               System.out.println("Sua média foi de: "+media);
           
           }
           {
           
           }
           

    }
    
}
