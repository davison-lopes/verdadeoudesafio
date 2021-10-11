package verdadeOUdesafio;
import java.util.ArrayList;

import java.util.Random;



public class ArmazenamentoDesafio {
	
	
	 static ArrayList<String> desafio = new ArrayList<String>();
	private static int random;


	public ArmazenamentoDesafio() {
		
		
	   desafio.add("Mande uma mensagem ousada para algum contato do seu celular (acidentalmente)");
	   desafio.add("Deixe uma pessoa da roda retocar a sua maquiagem (ser estiver sem, permita que alguém o(a) maquie).");
	   desafio.add("Virar um shot de alguma bebida.");
	   desafio.add("Dance uma música de forró com alguém da roda");
	        desafio.add("Postar uma enquete no Stories do Instagram pedindo dicas de como parar uma diarreia");
	        desafio.add("Tomar um danoninho usando apenas a língua;");
	        desafio.add("Massagear alguém da roda");
	        desafio.add("Tirar o sutiã sem tirar a camiseta");
	        desafio.add("Desabotoe o sutiã de alguém usando só uma Mão");
	        desafio.add("Tirar a camiseta de alguém usando a boca");
	        desafio.add("Beijar a orelha de alguém da roda");
	        desafio.add("Passar a próxima rodada no colo de quem esta ao lado Direito");
	        desafio.add("Nome da linguagem criada pela Sun Microsystems");
	        desafio.add("Com o consentimento, beije a Pessoa do lado esquerdo (pode ser um selinho)");
	        desafio.add("Coloque um cubo de gelo na boca e dê um beijo no pescoço da pessoa do seu lado esquerdo");
	        desafio.add("Feche os olhos, alguém da roda te dá um beijo, você precisa adivinhar quem é");
	        desafio.add("tire uma peça de Roupa");
	        desafio.add("Morder (de leve) o pescoço de alguém da roda;");
	        desafio.add("Fazer uma lap dance (dança no colo) para alguém da roda;");
	        desafio.add("Faça uma selfie sensual.");
	        
	       
	        
	} 
	public static String sortea() {
		random = new Random().nextInt(desafio.size());
		return desafio.get(random);
	}
	
	public ArrayList<String> getDesafios() {
		return desafio;
	}


	public void setDesafios(ArrayList<String> desafios) {
		ArmazenamentoDesafio.desafio = desafios;
	}
	
	
	}

	    

