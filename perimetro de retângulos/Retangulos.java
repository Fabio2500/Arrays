import java.util.Scanner;
class Retangulos{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		Retangulo_calculo r = new Retangulo_calculo();
		int quantidade[];
		int somaA=0,somaP=0;
		int maior=0;
		int indice_do_maior=0;
		System.out.println("digite a quantidade de retângulos desejada:");
		quantidade = new int[sc.nextInt()];

		for(int i = 0;i < quantidade.length; i++){
			System.out.println("\n");
			System.out.println("digite a base do item "+(i+1)+":");
			r.base = sc.nextFloat();
			System.out.println("agora digite a altura do item "+(i+1)+":");
			r.altura = sc.nextFloat();
			System.out.println("area e perimetro do item "+(i+1) +":");
			r.mostrar_resultados();
			somaA+=r.area();
			somaP+=r.perimetro();
			maior = quantidade[0];
			quantidade[i]=(int)r.area();
		}
		for(int i = 0; i < quantidade.length; i++){
			if(quantidade[i] >= maior){
				maior = quantidade[i];
				indice_do_maior = i+1;
			}
		}
		System.out.println("a maior area mede:" + maior +" e ela pertence ao item:" + indice_do_maior );
		System.out.println("a soma das áreas deu: "+somaA +" e a soma dos perimetros é "+ somaP);
		
	}
}
