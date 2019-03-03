package repaso;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno  esc[] = new Alumno[1];
		float []calif = {1,2,3};
		esc[0] = new Alumno("alejandro",1, new Fecha(1,2,199),calif);
		
			System.out.print(esc[0]);
	}

}
