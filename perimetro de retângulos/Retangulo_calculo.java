class Retangulo_calculo{
	float base,altura;

	public void mostrar_resultados(){
		System.out.println("area:"+ area());
		System.out.println("perimetro:"+ perimetro()+"\n");
	}

	public float area(){
		return base*altura;
	}
	public float perimetro(){
		return 2*(base+altura);
	}

}