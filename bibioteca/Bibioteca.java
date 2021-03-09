package bibioteca;
import java.util.Scanner;
public class Bibioteca {
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);
        livro l1 = new livro();
        
        System.out.println("Digite o nome do título: ");
        l1.titulo = leitura.nextLine();
        System.out.println("Digite o nome do autor:");
        l1.autor = leitura.nextLine();
        System.out.println("Digite o gênero do livro: ");
        l1.setGenero(leitura.nextLine());
        System.out.println("Digite o ano do livro: ");
        l1.setAno(leitura.nextInt());
        System.out.println("Digite o preço do livro: ");
        l1.setPreco(leitura.nextDouble());
        
        
        System.out.println("::::::::::::::::::::::::::::::");
        System.out.println("::::::::::::::::::::::::::::::");
        System.out.println("::::::::::::::::::::::::::::::");
        
        
        System.out.println("Nome do titulo do livro: "+l1.getTitulo());
        System.out.println("Nome do autor: "+l1.getAutor());
        System.out.println("DGênero do livro: "+l1.getGenero());
        System.out.println("Ano do livro: "+l1.getAno());
        System.out.println("Preço do livro: "+l1.getPreco());
        System.out.println(l1.verificarPreco());
        
                
    }
    
}
