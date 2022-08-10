import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner add = new Scanner(System.in);
		
		Operaciones op=new Operaciones();
		
		int opcion=0;
		
		System.out.print("1. Sumar" + "\n");
		System.out.print("2. Restar" + "\n");
		System.out.print("3. Dividir" + "\n");
		System.out.print("4. Multiplicar" + "\n");
		System.out.print("\n" + "Elige la operación que desees realizar: ");
		opcion = add.nextInt();	
		
		System.out.print("\n");
		
		System.out.print("Introduce el primer número:");      
		op.num1= add.nextInt();
		
		System.out.print("Introduce el segundo número:");      
		op.num2= add.nextInt();
		
		switch (opcion) {
		case 1:
			op.suma();
			break;
		case 2:
			op.resta();
			 break;
		case 3:
			op.dividir();
			break;
		case 4:
			op.multiplicar(); 
			break;
		}
				
		
		
	}
}
