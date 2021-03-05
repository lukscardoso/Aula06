import java.util.Scanner;

public class Vetores {
	public static final double QUANTIDADE = 10;
	
	public static void main(String[] args) {
		
		double alunos[] = new double [10];
		double total= 0;
		
		System.out.println("O tamanho do vetor é: " + alunos.length);
	
		Scanner leitor = new Scanner(System.in);
		
		for(int i=0;i<alunos.length;i++) {
			System.out.println("Por favor, digite o consumo do " + (i+1) + " aluno");
			alunos[i]=leitor.nextDouble();
			total = total + alunos[i];
		}
		
		for(int i=0; i<alunos.length; i++) {
			System.out.println("O aluno " + (i+1) + " consumiu R$" + alunos [i]);
		}
		
		System.out.println("O consumo total foi " + total);
		
		
		
		leitor.close();
		

	}

}
