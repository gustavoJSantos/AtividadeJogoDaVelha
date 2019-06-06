package atividadeFinal_JogoDaVelha;

public class Jogador {
	private String nome;
	private int vitorias;
	
	public Jogador(String n, int v){
		nome = n;
		vitorias = v;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setVitorias(int v){
		this.vitorias = this.vitorias + v;
	}
	
	public int getVitorias(){
		return vitorias;
	}
}
