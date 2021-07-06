package lessonEnums2;

public class Formulario {
	
	enum Genero{
		FEMENINO('F'), MASCULINO('M');
		
		private char valor;
		
		//construtor
		Genero(char valor){
			this.valor = valor;
		}
	}
	
	private String nome;
	private Genero genero;

}
