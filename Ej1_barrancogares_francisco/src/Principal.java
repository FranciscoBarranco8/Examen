import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner entrada = new Scanner(System.in);
				double peso, altura, imc;
				
				System.out.println("Inserte el peso:");
				peso = entrada.nextDouble();
				System.out.println("Inserte la altura:");
				altura = entrada.nextDouble();
		
		imc = peso / (altura * altura);
		
		if (imc < 18.5)
		{
		System.out.printf("El paciente de "+ peso + " kg y %.2f m de altura tiene un imc de %.2f y tiene un diagnóstico de bajo peso", altura, imc);
		
		}
		else if (imc >= 18.5 && imc < 24.9)
		{
		System.out.printf("El paciente de "+ peso + " kg y %.2f m de altura tiene un imc de %.2f y tiene un diagnóstico de peso normal (saludable)", altura, imc);	
		}
		else if (imc >= 25 && imc < 29.9)
		{
			System.out.printf("El paciente de "+ peso + " kg y %.2f m de altura tiene un imc de %.2f y tiene un diagnóstico de sobrepeso", altura, imc);	
		}
		else if (imc >= 30 && imc < 40)
		{
		System.out.printf("El paciente de "+ peso + " kg y %.2f m de altura tiene un imc de %.2f y tiene un diagnóstico de obesidad premórbida", altura, imc);	
		}
		else 
		{
			System.out.printf("El paciente de "+ peso + " kg y %.2f m de altura tiene un imc de %.2f y tiene un diagnóstico de obesidad mórbida", altura, imc);	
		}
		// 
		entrada.close();
		
	}

}
