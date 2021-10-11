package verdadeOUdesafio;

import java.util.ArrayList;

import java.util.Random;



public class ArmazenamentoVerdade {
	
	
	 static ArrayList<String> verdade = new ArrayList<String>();
	private static int random;


	public ArmazenamentoVerdade() {
		
		
		verdade.add("Já foi algemado?");
		verdade.add("Seu primeiro beijo teve gosto de quê?");
		verdade.add("Já ficou com alguém da roda?.");
	   verdade.add("Qual a diferença entre amor e sexo?");
	   verdade.add("Quem você beijaria dessa roda?");
	        verdade.add("Que tipo de pornografia te excita?");
	        verdade.add("Algemas ou vendas?");
	        verdade.add("Descreva o ambiente perfeito para uma noite de sexo.");
	        verdade.add("O que te faz broxar?");
	        verdade.add("Você se lembra de quando começou a se tocar?");
	        verdade.add("Já transou com alguém do mesmo sexo?");
	        verdade.add("Já fez sexo em um local público?");
	        verdade.add("Qual a pior experiência sexual que você já teve?");
	        verdade.add("O que você gosta ou gostaria de comprar um sex-shop?");
	        verdade.add("Já transou com alguém do Tinder ou app de paquera?");
	        verdade.add("Já ficou com alguém comprometido?Se Sim diga o nome.");
	        verdade.add("Conte uma fantasia sexual sua.");
	        verdade.add("Já broxou?");
	        verdade.add("Se você pudesse repetir uma transa na sua vida, qual seria?");
	        verdade.add("O que é fundamental nas preliminares?");
	        
	       
	        
	} 
	public static String sortea() {
		random = new Random().nextInt(verdade.size());
		return verdade.get(random);
	}
	
	public ArrayList<String> getDesafios() {
		return verdade;
	}


	public void setDesafios(ArrayList<String> desafios) {
		ArmazenamentoVerdade.verdade = desafios;
	}
	
	
	}

	    

