package testes;


public class Testador {
	public static void main(String[] args) {
		Teste t1 = Teste.a;
		Teste t2 = Teste.b;
		t1.texto = "alo";
		System.out.println(t1.texto);
		System.out.println(t2.texto);
		
	}
}
