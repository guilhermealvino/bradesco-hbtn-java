package Classes_Objetos.metodos;

public class PersonagemGame {
    private int saudeAtual;
    private String nome;

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        if (saudeAtual < 0) {
            this.saudeAtual = 0;
        } else if (saudeAtual > 100) {
            this.saudeAtual = 100;
        } else {
            this.saudeAtual = saudeAtual;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void tomarDano(int quantidadeDeDano) {
        if (quantidadeDeDano < 0) return;
        
        int novaSaude = this.saudeAtual - quantidadeDeDano;
        setSaudeAtual(novaSaude); 
    }

    public void receberCura(int quantidadeDeCura) {
        if (quantidadeDeCura < 0) return;
        
        int novaSaude = this.saudeAtual + quantidadeDeCura;
        setSaudeAtual(novaSaude);
    }
}
