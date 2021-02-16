import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner entrada = new Scanner(System.in);
   
   
   int Operaciones = 0;
		System.out.println("1-Circulo");
		System.out.println("2-Cuadrado");
		System.out.println("3-Rectangulo");
		System.out.println("4-Triangulo");
		System.out.println("Por favor, elige una figura ");
		Operaciones = entrada.nextInt();
		
	switch(Operaciones){
	case 1:System.out.println("Circulo");
		int r=entrada.nextInt();
		Circulo circulo = new Circulo(r);
		circulo.CalcularArea();
		System.out.println(circulo.area);
		break;
	case 2: System.out.println("Cuadrado");
		int l=entrada.nextInt();			Cuadrado cuadrado = new Cuadrado(l);
		cuadrado.CalcularArea();
		System.out.println(cuadrado.area);
		break;
	case 3: System.out.println("Rectangulo");
     	int b=entrada.nextInt();
     	int h=entrada.nextInt();
     	Rectangulo rectangulo = new Rectangulo(b,h);
     	rectangulo.CalcularArea();
     	System.out.println(rectangulo.area);
		break;
	case 4: System.out.println("Triangulo");
     	int bt=entrada.nextInt();
     	int ht=entrada.nextInt();
     	Triangulo triangulo = new Triangulo(bt,ht);
     	triangulo.CalcularArea();
     	System.out.println(triangulo.area);
		break;
		}
	}
}