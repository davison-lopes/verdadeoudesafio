package verdadeOUdesafio;

import java.util.ArrayList;
import java.util.Random;

public  abstract class  StartGame   {
	
	
	protected static  int random;
	private static Object carga;
	private static Object cargaVerdade;
	static ArrayList<String> jogadores = new ArrayList<String>();



	public static void addJogador(String nome) {
		jogadores.add( nome ); 
	}
	
	public static String sorteaJogador() {
		random = new Random().nextInt(jogadores.size());
		return jogadores.get(random);
	}
				
	
	public static void carregaHashs() {
    setCarga(new ArmazenamentoDesafio());
    setCargaVerdade(new ArmazenamentoVerdade());
	}


	public static Object getCarga() {
		return carga;
	}


	public static void setCarga(Object carga) {
		StartGame.carga = carga;
	}


	public static Object getCargaVerdade() {
		return cargaVerdade;
	}


	public static void setCargaVerdade(Object cargaVerdade) {
		StartGame.cargaVerdade = cargaVerdade;
	}
	
	
	

}
