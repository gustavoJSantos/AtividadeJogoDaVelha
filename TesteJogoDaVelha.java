package atividadeFinal_JogoDaVelha;

import javax.swing.JOptionPane;

public class TesteJogoDaVelha {
	public static void main (String args[]){
		
		JOptionPane.showMessageDialog(null, "Jogo da Velha usando o que foi aprendido em classe\nAtividade final prática de OPP, profº Júlio\nAlunos: Caio Silva nº04 & Gustavo Jesus nº10");
		JOptionPane.showMessageDialog(null,"Caro usuario, aconselhamos que não escolha nenhum numero como seu simbolo\npara não dificultar a visualização do seu prazeroso jogo\nCaso vc ainda sim queria fazer isso o problema é todo seu!!!");//EM um jogo não podemos colocar foda-se =(
		Operacoes cont = new Operacoes();
		
		String n = JOptionPane.showInputDialog("Jogador 1 digite seu nome");
		String s = JOptionPane.showInputDialog("Jogador 1 digite seu simbolo");
		
		String nn = JOptionPane.showInputDialog("Jogador 2 digite seu nome");
		String ss = JOptionPane.showInputDialog("Jogador 2 digite seu simbolo");
		JOptionPane.showInputDialog(n);
		JOptionPane.showInputDialog(nn);
		if(n == nn){
			JOptionPane.showMessageDialog(null, "Seu cegueta o cara ja escolheu esse nome\n ESCOLHA OUTRO!...pruu");
			nn = JOptionPane.showInputDialog("Jogador 2 digite seu nome");

		}
		while(s == ss){
			JOptionPane.showMessageDialog(null, "Seu cegueta o cara ja escolheu esse simbolo\n ESCOLHA OUTRO!...pruu");
			ss = JOptionPane.showInputDialog("Jogador 2 digite seu simbolo");

		}
		
		Simbolo j = new Simbolo(n,s,0);
		Simbolo j2 = new Simbolo(nn,ss,0);
		
		do{
			JogoDaVelha jdv = new JogoDaVelha();
			JogarAte jogadas = new JogarAte();
			String continua;
			
			do {
				int zona;
				if(jogadas.getRodada() % 2 == 1){
					zona = Integer.parseInt(JOptionPane.showInputDialog(null,j.getNome()+" digite onde quer colocar algo\n"+jdv.mostraJogo()));
					if(jdv.validarJogada(zona, j, j2) && (zona == 1 || zona == 2 || zona == 3 || zona == 4 || zona == 5 || zona == 6 || zona == 7 || zona == 8 || zona == 9)){
						jogadas.rodadaPlus();
						jdv.jogar(zona, j);
					} else{
						JOptionPane.showMessageDialog(null, "Valor inválido ou área já preenchida\n Tente novamente");
					}
				} else{
					zona = Integer.parseInt(JOptionPane.showInputDialog(null,j2.getNome()+" digite onde quer colocar algo\n"+jdv.mostraJogo()));
					if(jdv.validarJogada(zona, j, j2) && (zona == 1 || zona == 2 || zona == 3 || zona == 4 || zona == 5 || zona == 6 || zona == 7 || zona == 8 || zona == 9)){
						jogadas.rodadaPlus();
						jdv.jogar(zona, j2);
					} else{
						JOptionPane.showMessageDialog(null, "Valor inválido ou área já preenchida\n Tente novamente");
					}
				}
			} while((!j.vencer(jdv) && !j2.vencer(jdv)) && jogadas.getRodada() != 9);
			if(j.vencer(jdv)){
				JOptionPane.showMessageDialog(null, j.getNome()+" Venceu!");
				j.setVitorias(1);
			}
			if(j2.vencer(jdv)){
				JOptionPane.showMessageDialog(null, j2.getNome()+" Venceu!");
				j2.setVitorias(1);
			}
			if(jogadas.getRodada() == 9 && !(j.vencer(jdv)||j2.vencer(jdv))){
				JOptionPane.showMessageDialog(null, "Empatou\nDeu Velha!");
			}
			
			do
			{
				continua=JOptionPane.showInputDialog(j.getNome() + " " + j.getVitorias() + " X " + j2.getVitorias() + " " + j2.getNome() + "\n\n" +"Continua com o jogo?(S/N)");

				if(continua.equalsIgnoreCase("s"))
				{
					cont.setContinua(true);
				}
				else
				{
					if(continua.equalsIgnoreCase("n"))
					{
						cont.setContinua(false);
					}
				}

			}while((!continua.equalsIgnoreCase("s"))&&(!continua.equalsIgnoreCase("n")));
			
		} while(cont.getContinua());
		JOptionPane.showMessageDialog(null,j.getNome() + " venceu " + j.getVitorias() + " vezes.\n" + j2.getNome() + " venceu " + j2.getVitorias() + " vezes.");
		System.exit(0);
	}
}