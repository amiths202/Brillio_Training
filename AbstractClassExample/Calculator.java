package AbstractClassExample;

import java.util.Scanner;

public abstract class Calculator {

	public int a,b,c;
	
	public void setData(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public abstract void calculateResults();
	
	void displayResults() {
		System.out.println("Result is:" + c);
	}
	
	public static void main(String[] args) {
		Calculator calc[] = new Calculator[4];
		calc[0] = new Add();
		calc[1] = new Sub();
		calc[2] = new Mul();
		calc[3] = new Div();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		System.out.println("First number");
		int num1 = sc.nextInt();
		System.out.println("Second number");
		int num2 = sc.nextInt();
		Calculator obj = calc[choice];
		obj.setData(num1, num2);
		obj.calculateResults();
		obj.displayResults();
	}
	
}
