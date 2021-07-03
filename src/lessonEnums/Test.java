package lessonEnums;

public class Test {
	//Classe para testes

	public static void main(String[] args) {
		
		usandoConstantes();
		
		System.out.println("----------------------------");
		
		usandoEnum();

	}
	
	//Criar outro m�todo para imprimir as constantes
	private static void usandoConstantes() {
		
		int segunda = DiaSemanaConstantes.SEGUNDA;
		int terca = DiaSemanaConstantes.TERCA;
		int quarta = DiaSemanaConstantes.QUARTA;
		int quinta = DiaSemanaConstantes.QUINTA;
		int sexta = DiaSemanaConstantes.SEXTA;
		int sabado = DiaSemanaConstantes.SABADO;
		int domingo = DiaSemanaConstantes.DOMINGO;
		
		System.out.println("Teste utilizando constantes no Java!\n");
		//chamar o m�todo relacionado abaixo!
		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		imprimeDiaSemana(quarta);
		imprimeDiaSemana(quinta);
		imprimeDiaSemana(sexta);
		imprimeDiaSemana(sabado);
		imprimeDiaSemana(domingo);
		
			
	}
	
	//Elaborar um m�todo para imprimmir os dias da semana
	private static void imprimeDiaSemana(int dia) {
		//private porque o m�todo vai ser somente dentro desta classe
		//void pois retorna nada
		switch(dia) {
		case 1:
			System.out.println("Segunda feira");
			break;
		case 2:
			System.out.println("Ter�a feira");
			break;
		case 3:
			System.out.println("Quarta feira");
			break;
		case 4:
			System.out.println("Quinta feira");
			break;
		case 5:
			System.out.println("Sexta feira");
			break;
		case 6:
			System.out.println("S�bado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		}
		
	}

	//Utilizaremos o conceito de enum
	private static void usandoEnum() {
		//declarando o enum
		DiaSemana segunda = DiaSemana.SEGUNDA;
		DiaSemana terca = DiaSemana.TERCA;
		DiaSemana quarta = DiaSemana.QUARTA;
		DiaSemana quinta = DiaSemana.QUINTA;
		DiaSemana sexta = DiaSemana.SEXTA;
		DiaSemana sabado = DiaSemana.SABADO;
		DiaSemana domingo = DiaSemana.DOMINGO;
		
		System.out.println("Teste utilizando enum em Java");
		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		imprimeDiaSemana(quarta);
		imprimeDiaSemana(quinta);
		imprimeDiaSemana(sexta);
		imprimeDiaSemana(sabado);
		imprimeDiaSemana(domingo);
	}
	
	private static void imprimeDiaSemana(DiaSemana dia) {
		
		switch(dia) {
		case SEGUNDA:
			System.out.println("Segunda feira");
			break;
		case TERCA:
			System.out.println("Ter�a feira");
			break;
		case QUARTA:
			System.out.println("Quarta feira");
			break;
		case QUINTA:
			System.out.println("Quinta feira");
			break;
		case SEXTA:
			System.out.println("Sexta feira");
			break;
		case SABADO:
			System.out.println("S�bado");
			break;
		case DOMINGO:
			System.out.println("Domingo");
			break;
		}
	}
}

	

