package verdadeOUdesafio;


import java.io.IOException;

import java.util.Scanner;
public class Main {

	
	 
	
	

	

	private static Scanner ler;
	private static String jogadorSorteado;
	private static int continua;

	public static void main(String[] args) throws IOException  {
		
	StartGame.carregaHashs();//carregar Listas de Perguntas e desafios
	
		
		
		ler = new Scanner(System.in);//scanner responsavel pelas leituras
		
			Menssagem.numeroDejogadore();//Numero de jogadores
				int control = Integer.parseInt(ler.next());
					int recontrol = control + control-1;//Numero de jogadores
					
						while(recontrol >= control) {//cadastra nomes dos jogadore
							Menssagem.msJogador();
							String name = ler.next(); 
							StartGame.addJogador(name);
							recontrol--;
						}//cadastra nomes dos jogadore
						do{
						jogadorSorteado = StartGame.sorteaJogador();
						Menssagem.jSorteado();
						
						System.out.println(jogadorSorteado);
			
		
						//Verdade ou desafio
			Menssagem.VouD();
			int vd = ler.nextInt();
			ArmazenamentoDesafio.sortea();	
			
			if(vd==1) { 
				 System.out.println(ArmazenamentoDesafio.sortea());
			}else{ 
				 System.out.println(ArmazenamentoVerdade.sortea());
			}
			
			Menssagem.Continuar(); 
			continua = ler.nextInt();
			
			

			}while(continua==0);
						
						ler.close();
						Menssagem.fimDejogo();
				
	}}			
						

