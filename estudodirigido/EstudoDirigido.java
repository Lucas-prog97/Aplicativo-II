
package estudodirigido;
import java.util.Scanner;
public class EstudoDirigido {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        desconto d1 = new desconto();

        System.out.println("Digite seu nome: ");
        d1.setNome(leitura.nextLine());
        System.out.println("Digite o valor do produto: ");
        d1.setValor(leitura.nextDouble());
        System.out.println("");
        System.out.println("Calculando desconto");
        
        
        
        
        System.out.println(d1.toString());
    }
    
}
