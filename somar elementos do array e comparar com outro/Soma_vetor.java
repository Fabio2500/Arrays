import java.util.Scanner;
class Soma_vetor{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
        int[] a,b;
        int somaA=0,somaB=0;
        
        System.out.println("digite a quantidade de elementos do vetor A:");
        a = new int[sc.nextInt()];
        System.out.println("agora digite a quantidade de elementos do vetor B:");
        b = new int[sc.nextInt()];

        for(int i = 0; i < a.length; i++){
        	System.out.println("digite o elemento "+(i+1)+" de A:");
        	a[i] = sc.nextInt();
        }
        for(int j = 0; j < b.length; j++){
        	System.out.println("agora digite o elemento "+(j+1)+" de B:");
        	b[j]= sc.nextInt();
        }
        System.out.println(" \n");        
        System.out.println("elementos do vetor A:\n");
        for(int i = 0; i < a.length; i++){
        	System.out.println(a[i]);
        }
        System.out.println(" \n");   
        System.out.println("elementos de B:\n");
        for(int j = 0; j < b.length; j++){
        	System.out.println(b[j]);
        }
        for(int i =0; i < a.length; i++){
        	somaA += a[i];
        }
        for(int j =0; j < b.length; j++){
        	somaB += b[j];
        }
        System.out.println(" \n");   
        System.out.println("soma dos elementos de A:" + somaA);
        System.out.println("soma dos elementos de B:" + somaB);
        System.out.println(" \n");   

        System.out.println("agora fazendo uma comparação:\n");

        if(somaA > somaB){
        	System.out.println("a soma dos elementos de A é maior que a soma dos elementos de B");

        }
        if(somaA < somaB){
        	System.out.println("a soma dos elementos de B é maior que a soma dos elementos de A");
        }
        if(somaA == somaB){
        	System.out.println("a soma de ambos os vetores são iguais");
        }



	}
}