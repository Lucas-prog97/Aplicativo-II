package estudodirigido;
public class desconto {
    private String nome;
    private double valor;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
   public double calcularDesconto (){
       
       this.valor = ((this.valor*2.5)/100);
       return valor;
   }
   
   @Override
    public String toString(){
        return "Nome: "+ this.nome +"\n"       
                +"Valor do desconto: "+calcularDesconto();
                
    }
   
    
}
