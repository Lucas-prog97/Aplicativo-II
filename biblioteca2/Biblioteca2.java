package biblioteca2;
import java.util.Scanner;
public class Biblioteca2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Livro li = new Livro();
        Cliente c1 = new Cliente();
        
        System.out.println("Vamos fazer o seu cadastro");
        System.out.println("Digite seu nome: ");
        c1.setNome(leitura.nextLine());
        System.out.println("Digite sua idade: ");
        c1.idade = leitura.nextInt(); 
        System.out.println("Digite seu e-mail: ");
        c1.setEmail(leitura.nextLine());
       
        System.out.println(":::::::::::::::::::::::::::::::::::::::::");
        
        System.out.println("Cadastro realizado!");
        System.out.println("Agora digite os dados do seu livro");
        System.out.println("Digite o titulo do livro: ");
        li.setTitulo(leitura.nextLine());
        System.out.println("Digite o gênero do livro: ");
        li.genero = leitura.nextLine();
        System.out.println("Digite o valot do livro: ");
        li.valor = leitura.nextDouble();
        System.out.println("");
        System.out.println("Sobre o desconto: ");
        
        
        
        
        System.out.println("Ja estão prontos os seus dados!");
        System.out.println("::::::::::::::::::::::");
        System.out.println(c1.toString());
        System.out.println("Dados do livro: ");
        System.out.println("::::::::::::::::::::::");
        System.out.println(li.toString());
        
        
        
        
    }
    
}
