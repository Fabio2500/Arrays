import java.util.Scanner;
class InserindoArray{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int vet[];
		int cont=-1;

		System.out.println("digite o tamanho do vetor:");
		vet = new int[sc.nextInt()];

		for(int i = 0;i < vet.length; i++){ 
		System.out.println("digite o elemento:" + (i+1));
		vet[i] = sc.nextInt();
		

		}
		for(int i = 0; i < vet.length;i++){
			System.out.println("elemento "+(i+1)+": "+ vet[i]+" indice: "+(cont+=1));
		}
		
		}
}