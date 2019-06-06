package atividadeFinal_JogoDaVelha;

public class JogoDaVelha {
	static String jogoVelha [][] = new String [3][3];

	public JogoDaVelha(){
		jogoVelha [0][0] = "7";
		jogoVelha [0][1] = "8";
		jogoVelha [0][2] = "9";
		jogoVelha [1][0] = "4";
		jogoVelha [1][1] = "5";
		jogoVelha [1][2] = "6";
		jogoVelha [2][0] = "1";
		jogoVelha [2][1] = "2";
		jogoVelha [2][2] = "3";
	}
	
	public String achaJV(int a, int b){
		return jogoVelha[a][b];
	}
	
	public String mostraJogo(){
		return "|"+jogoVelha[0][0]+"|     |"+jogoVelha[0][1]+"|     |"+jogoVelha[0][2]+"|\n-----------------\n|"+jogoVelha[1][0]+"|     |"+jogoVelha[1][1]+"|     |"+jogoVelha[1][2]+"|\n-----------------\n|"+jogoVelha[2][0]+"|     |"+jogoVelha[2][1]+"|     |"+jogoVelha[2][2]+"|";
	}
	
	public boolean validarJogada(int zona, Simbolo j, Simbolo j2){
		int cont = 0;
		switch(zona){
		case 7:
			if(achaJV(0,0) == j.getSimbolo() || achaJV(0,0) == j2.getSimbolo()){
				cont++;
			}
			break;
		case 8:
			if(achaJV(0,1) == j.getSimbolo() || achaJV(0,1) == j2.getSimbolo()){
				cont++;
			}
			break;
		case 9:
			if(achaJV(0,2) == j.getSimbolo() || achaJV(0,2) == j2.getSimbolo()){
				cont++;
			}
			break;
		case 4:
			if(achaJV(1,0) == j.getSimbolo() || achaJV(1,0) == j2.getSimbolo()){
				cont++;
			}
			break;
		case 5:
			if(achaJV(1,1) == j.getSimbolo() || achaJV(1,1) == j2.getSimbolo()){
				cont++;
			}
			break;
		case 6:
			if(achaJV(1,2) == j.getSimbolo() || achaJV(1,2) == j2.getSimbolo()){
				cont++;
			}
			break;
		case 1:
			if(achaJV(2,0) == j.getSimbolo() || achaJV(2,0) == j2.getSimbolo()){
				cont++;
			}
			break;
		case 2:
			if(achaJV(2,1) == j.getSimbolo() || achaJV(2,1) == j2.getSimbolo()){
				cont++;
			}
			break;
		case 3:
			if(achaJV(2,2) == j.getSimbolo() || achaJV(2,2) == j2.getSimbolo()){
				cont++;
			}
			break;
		}
		if(cont != 0){
			return false;
		} else{
			return true;
		}
	}
	
	public void jogar(int zona, Simbolo j){
		switch(zona){
		case 7:
			jogoVelha [0][0] = j.getSimbolo();
			break;
		case 8:
			jogoVelha [0][1] = j.getSimbolo();
			break;
		case 9:
			jogoVelha [0][2] = j.getSimbolo();
			break;
		case 4:
			jogoVelha [01][0] = j.getSimbolo();
			break;
		case 5:
			jogoVelha [1][1] = j.getSimbolo();
			break;
		case 6:
			jogoVelha [1][2] = j.getSimbolo();
			break;
		case 1:
			jogoVelha [2][0] = j.getSimbolo();
			break;
		case 2:
			jogoVelha [2][1] = j.getSimbolo();
			break;
		case 3:
			jogoVelha [2][2] = j.getSimbolo();
			break;
		default:
			break;
		}
	}
	
	/*public static void main(String[] args) {
		int numero;
		Operacoes v = new Operacoes();
		
		while(!j.vencer(c) && !j2.vencer(c)){
			if(jogada.getRodada() % 2 == 1){
				numero = Integer.parseInt(JOptionPane.showInputDialog(null,j.getNome()+" digite onde quer colocar algo\n|"+jogoVelha[0][0]+"|     |"+jogoVelha[0][1]+"|     |"+jogoVelha[0][2]+"|\n-----------------\n|"+jogoVelha[1][0]+"|     |"+jogoVelha[1][1]+"|     |"+jogoVelha[1][2]+"|\n-----------------\n|"+jogoVelha[2][0]+"|     |"+jogoVelha[2][1]+"|     |"+jogoVelha[2][2]+"|"));
				switch(numero){
					case 7:
						jogada.rodadaPlus();
						jogoVelha [0][0] = j.getSimbolo();
						break;
					case 8:
						jogada.rodadaPlus();
						jogoVelha [0][1] = j.getSimbolo();
						break;
					case 9:
						jogada.rodadaPlus();
						jogoVelha [0][2] = j.getSimbolo();
						break;
					case 4:
						jogada.rodadaPlus();
						jogoVelha [01][0] = j.getSimbolo();
						break;
					case 5:
						jogada.rodadaPlus();
						jogoVelha [1][1] = j.getSimbolo();
						break;
					case 6:
						jogada.rodadaPlus();
						jogoVelha [1][2] = j.getSimbolo();
						break;
					case 1:
						jogada.rodadaPlus();
						jogoVelha [2][0] = j.getSimbolo();
						break;
					case 2:
						jogada.rodadaPlus();
						jogoVelha [2][1] = j.getSimbolo();
						break;
					case 3:
						jogada.rodadaPlus();
						jogoVelha [2][2] = j.getSimbolo();
						break;
					default:
						break;
				}
				
			}else{
				numero = Integer.parseInt(JOptionPane.showInputDialog(null,j2.getNome()+" digite onde quer colocar algo\n|"+jogoVelha[0][0]+"|     |"+jogoVelha[0][1]+"|     |"+jogoVelha[0][2]+"|\n--------"
						+ "---------\n|"+jogoVelha[1][0]+"|     |"+jogoVelha[1][1]+"|     |"+jogoVelha[1][2]+"|\n-----------------\n|"+jogoVelha[2][0]+"|     |"+jogoVelha[2][1]+"|     |"+jogoVelha[2][2]+"|"));
				switch(numero){
					case 7:
						jogada.rodadaPlus();
						jogoVelha [0][0] = j2.getSimbolo();
						break;
					case 8:
						jogada.rodadaPlus();
						jogoVelha [0][1] = j2.getSimbolo();
						break;
					case 9:
						jogada.rodadaPlus();
						jogoVelha [0][2] = j2.getSimbolo();
						break;
					case 4:
						jogada.rodadaPlus();
						jogoVelha [01][0] = j2.getSimbolo();
						break;
					case 5:
						jogada.rodadaPlus();
						jogoVelha [1][1] = j2.getSimbolo();
						break;
					case 6:
						jogada.rodadaPlus();
						jogoVelha [1][2] = j2.getSimbolo();
						break;
					case 1:
						jogada.rodadaPlus();
						jogoVelha [2][0] = j2.getSimbolo();
						break;
					case 2:
						jogada.rodadaPlus();
						jogoVelha [2][1] = j2.getSimbolo();
						break;
					case 3:
						jogada.rodadaPlus();
						jogoVelha [2][2] = j2.getSimbolo();
						break;
					default:
						break;
				}
			}
		}
	}*/
		
}
