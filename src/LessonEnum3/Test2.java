package LessonEnum3;

import lessonEnums.DiaSemana;

public class Test2 {

	public static void main(String[] args) {
		
		DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");
		
		System.out.println(dia);

	}

}
