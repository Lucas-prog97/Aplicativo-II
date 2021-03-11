package biblioteca2;
public class Livro {
    
    private String titulo;
    public String genero;
    public double valor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public double verificarDesconto(){
        if(this.valor >= 50){
            System.out.println("Sua compra possui desconto");
            this.valor = ((valor*15)/100);
            System.out.println("O valor do seu desconto foi de: "+this.valor);
        }else{
            System.out.println("Sua compra não possui desconto");
            System.out.println("O valor da sua compra foi de: "+this.valor);
        }
        return valor;
        
    }
    @Override
    public String toString(){
        return "Título: "+ this.titulo +"\n"
                + "Gênero: "+ this.genero +"\n"
                +"Valor do desconto: "+this.valor;          
    }
    
}



