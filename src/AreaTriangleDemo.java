
import java.util.Scanner;

class AreaTriangleDemo {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dáme la base:");
		
		double base = scanner.nextDouble();
		
		System.out.println("Dáme la altura:");
		
		double altura = scanner.nextDouble();
		
		double area = (base* altura)/2;
		
		System.out.println("Área del triangulo es: " + area);
	}
}
