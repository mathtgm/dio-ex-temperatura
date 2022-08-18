package br.com.temperatura_media;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> temperaturas = new ArrayList<Integer>();
		int total = 0;
		
		for(int i = 0; i <= 5; i++) {
			Random genRand = new Random();
			int temperatura = genRand.nextInt(45);
			
			temperaturas.add(temperatura);
			total += temperatura;
		
		}
		
		int media = total / temperaturas.size();
		
		for(int i = 0; i < temperaturas.size(); i++) {
			if(temperaturas.get(i) > media) {
				System.out.println("A temperatura do mês de " + mesAno(i) + " foi de " + temperaturas.get(i) + "ºC, acima da média de " + media + "ºC");
			}
		}
		
	}
	
	// Retorna o mês de acordo com numero informado
	public static String mesAno(int numero) {
		switch (numero) {
		case 0: return "Janeiro";
		case 1: return "Fevereiro";			
		case 2: return "Março";
		case 3: return "Abril";
		case 4: return "Maio";
		case 5: return "Junho";
		default: return "Mês não idenficado";
		}
	}

}
