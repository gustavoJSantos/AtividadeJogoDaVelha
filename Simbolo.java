package atividadeFinal_JogoDaVelha;

public class Simbolo extends Jogador {
private String simbolo;
	
	public Simbolo (String nome, String simbolo, int vitorias){
		super(nome, vitorias);
		this.simbolo = simbolo;
	}
	public String getSimbolo(){
		return simbolo;
	}
	
	public boolean vencer(JogoDaVelha t1){
		if((t1.achaJV(0,0) == simbolo && t1.achaJV(0,1) == simbolo && t1.achaJV(0,2) == simbolo) ||(t1.achaJV(1,0) == simbolo && t1.achaJV(1,1) == simbolo && t1.achaJV(1,2) == simbolo) ||(t1.achaJV(2,0) == simbolo && t1.achaJV(2,1) == simbolo && t1.achaJV(2,2) == simbolo) ||(t1.achaJV(0,0) == simbolo && t1.achaJV(1,0) == simbolo && t1.achaJV(2,0) == simbolo) ||(t1.achaJV(0,1) == simbolo && t1.achaJV(1,1) == simbolo && t1.achaJV(2,1) == simbolo) || (t1.achaJV(0,2) == simbolo && t1.achaJV(1,2) == simbolo && t1.achaJV(2,2) == simbolo) || (t1.achaJV(0,0) == simbolo && t1.achaJV(1,1) == simbolo && t1.achaJV(2,2) == simbolo) || (t1.achaJV(0,2) == simbolo && t1.achaJV(1,1) == simbolo && t1.achaJV(2,0) == simbolo)){
			return true;
		}else{
			return false;
		}
	}

}
