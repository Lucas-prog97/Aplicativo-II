package exercicio4_1;

public class Cliente {

    public String nome;
    int idade;
    double renda;

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

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public String classificarRenda() {
        String resposta;
        if (this.renda >= 15000) {
            resposta = "Você é rico";
        } else {
            resposta = "Você é pobre";
        }
        return resposta;
    }

    public String classificarIdade() {
        String respostaI;
        if (this.idade >= 18) {
            respostaI = "Maior de idade";
        } else {
            respostaI = "Menor de idade";
        }

        return respostaI;

    }

}
