
public class Operaciones {

	//Atributos
	protected float num1;
	protected float num2;
	protected float resultado;
	
	//Constructor
	public Operaciones() {
		this.num1=0.0f;
		this.num2=0.0f;
		this.resultado=0.0f;
	}
	
	//Setters and Getters
	public float getNum1() {
		return num1;
	}
	public void setNum1(float num1) {
		this.num1 = num1;
	}
	public float getNum2() {
		return num2;
	}
	public void setNum2(float num2) {
		this.num2 = num2;
	}
	public float getResultado() {
		return resultado;
	}
	public void setResultado(float resultado) {
		this.resultado = resultado;
	}
	
	//Métodos
	
	public void suma() {
		this.resultado=this.num1+this.num2;
		System.out.print("El resultado de la suma es: " + this.resultado);
	}

	public void resta() {
		if (this.num1>this.num2) {
			this.resultado=this.num1-this.num2;
			System.out.print("El resultado de la resta es: " + this.resultado);
		} 
		if (this.num1<this.num2) {
			System.out.print("Error, el primer número debe ser mayor que el segundo");
		}
		else {
			return;
		}
	
	}
	
	public void multiplicar() {
		this.resultado=this.num1*this.num2;
		System.out.print("El resultado de la multiplicación es: " + this.resultado);
	}
	
	public void dividir() {
		if (this.num1>this.num2) {
			this.resultado=this.num1/this.num2;
		System.out.print("El resultado de la división es: " + this.resultado);
		}
		if (this.num1<this.num2) {
			System.out.print("Error, el primer número debe ser mayor que el segundo");
		}
		
		
	}
	
	
}
