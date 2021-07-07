package LessonEnum3;

import lessonEnums.DiaSemana;

public class Test {

	public static void main(String[] args) {
		//enum é uma lista de constantes
		
		DiaSemana[] dias = DiaSemana.values();
		//values retorna todos os valores que estão no enumerador em forma de umm array
		
		//para impirimir os dias usamos o for
		
		for (int i = 0; i < dias.length; i++) {
			System.out.println(dias[i]);
		}
		
		System.out.println("-----------------------");
		
		//ou por for aprimorado
		
		for(DiaSemana dia : DiaSemana.values()) {
			System.out.println(dia);
		}
		

	}

}
