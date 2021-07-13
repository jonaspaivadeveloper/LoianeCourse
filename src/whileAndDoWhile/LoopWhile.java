package whileAndDoWhile;

public class LoopWhile {
	
	public static void main (String[] args) {
		//Inicie as variaveis que você queira iniciar e termina
		
		int i = 1;
		int max = 10;
		
		//Agora coloque o loop
		while (i <= max) {
			System.out.println("Valor de i: " + i );
			i++;
		}
		
		System.out.println();
		
		//imprimir um valor resultante de i
		System.out.println("Valor do i depois do loop: " + i);//valor de i é 11
		
		System.out.println();
		
		System.out.println("Utilizando o conceito de DoWhile!");
		
		System.out.println();
		
		
		do {
			i++;
			System.out.println("Valor de i: " + i);
		}while(i < 15);
		
		System.out.println();
		
		System.out.println("Valor do i depois do DoWhile: " + i);
	}

}
 