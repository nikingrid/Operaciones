import java.util.Scanner;

public class Operaciones {

	Scanner add = new Scanner(System.in);
	
	int num1;
	int num2;
	int s;
	int r;
	int m;
	int d;
	
	public void sumar() {
		s=num1+num2;
		System.out.print("El resultado de la suma es: " +s);
	}
	
	public void restar() {
		r=num1-num2;
		System.out.print("El resultado de la resta es: " + r);
	}
	
	public void multiplicar() {
		m=num1*num2;
		System.out.print("El resultado de la multiplicación es: " + m);
	}

	public void dividir() {
		d=num1/num2;
		System.out.print("El resultado de la división es: " + d);
	}
	
	public void datos() {
		System.out.print("Introduce el primer nº: ");
		num1 = add.nextInt();	
		
		System.out.print("Introduce el segundo nº: ");
		num2 = add.nextInt();
	}
	
}
