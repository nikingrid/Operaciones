import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner add = new Scanner(System.in);
		
		String opcion="";
		int resultado=0;
		int num1=0;
		int num2=0;
		
		System.out.print("1. Sumar" + "\n");
		System.out.print("2. Restar" + "\n");
		System.out.print("3. Dividir" + "\n");
		System.out.print("4. Multiplicar" + "\n");
		System.out.print("\n" + "Elige la operación que desees realizar: ");
		opcion = add.next();	
		
		System.out.print("\n");
		
		System.out.print("Introduce el primer número:"); 
		num1=add.nextInt();
		
		System.out.print("Introduce el segundo número:"); 
		num2=add.nextInt();
		

	}
}
