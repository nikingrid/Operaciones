import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner add = new Scanner(System.in);
		
		int opcion=0;
		
		Operaciones op=new Operaciones();
	
		System.out.print("1. Sumar" + "\n");
		System.out.print("2. Restar" + "\n");
		System.out.print("3. Multiplicar" + "\n");
		System.out.print("4. Dividir" + "\n");
		System.out.print("\n" + "Elige la operación que desees realizar: ");
		opcion = add.nextInt();	
		
		System.out.print("\n");
		
		switch (opcion) {
		case 1:
			op.datos();
			op.sumar();
			break;
			
		case 2:
			op.datos();
			op.restar();
			break;
			
		case 3:
			op.datos();
			op.multiplicar();
			break;
			
		case 4:
			op.datos();
			op.dividir();
			break;
		}
	
}
	}
