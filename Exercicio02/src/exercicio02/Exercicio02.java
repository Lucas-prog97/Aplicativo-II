
package exercicio02;
import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        
        double raio;
        double diametro;
        double quadrante;
         
        Scanner leitura= new Scanner (System.in);
        
        System.out.println("Digite o valor do raio: ");
        raio = leitura.nextDouble();
        diametro = (raio*2);
        quadrante = ((raio*2)/4);
        System.out.println("O valor do diâmetro é: "+ diametro);
        
        System.out.println("O valor do quadrante é: "+ quadrante);
        
    }
    
}
