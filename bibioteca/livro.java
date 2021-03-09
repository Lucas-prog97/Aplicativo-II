package bibioteca;

public class livro {

    public String titulo;
    public String autor;
    private String genero;
    private int ano;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    private double preco;  ;
    
    public String verificarPreco(){
        String resposta1;
        double calculo;
        if(this.preco > 80){
            calculo = this.preco * 20/100;
            resposta1 = "A sua compra terá desconto de: "+calculo;
        }
        else{
            resposta1 = "A sua compra não terá desconto!";
        }
        return resposta1;
    }


}
