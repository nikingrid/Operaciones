import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner add = new Scanner(System.in);
		
		String opcion="";
		String a="a";
		String b="b";
		String c="c";
		String d="d";
		int resultado=0;
		int num1=0;
		int num2=0;
		
		System.out.print("A. Sumar" + "\n");
		System.out.print("B. Restar" + "\n");
		System.out.print("C. Dividir" + "\n");
		System.out.print("D. Multiplicar" + "\n");
		System.out.print("\n" + "Elige la operación que desees realizar: ");
		opcion = add.next();	
		
		System.out.println("Introduce el primer número:"); 
		num1=add.nextInt();
		
		System.out.println("Introduce el segundo número:"); 
		num2=add.nextInt();
		

	}
}
