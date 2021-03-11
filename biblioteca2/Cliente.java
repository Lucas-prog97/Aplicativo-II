package biblioteca2;
public class Cliente {
    
    private String nome;
    public int idade;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String verificarIdade(){
        if(this.idade>=18){
            return "Você é maior de idade, todos gêneros disponíveis";
        }else{
            return "Você é menor de idade, alguns gêneros estarão bloqueados";
        }
    }
    @Override
    public String toString(){
        return "Nome: "+ this.nome+ "\n"
                + "Idade: "+ this.idade+ "\n"
                + "E-mail: "+ this.email+ "\n"
                + this.verificarIdade();
    }
    
}
