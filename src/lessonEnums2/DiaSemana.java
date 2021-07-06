package lessonEnums2;

public enum DiaSemana {
	
	//aqui embaixo s�o enumerados com construtores!
	SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);
	
	private int valor; //declara um atributo
	
	//construtor
	DiaSemana(int valor){
		this.valor= valor;
	}
	
	//M�todo
	public int getValor() {
		return this.valor;
	}
}
