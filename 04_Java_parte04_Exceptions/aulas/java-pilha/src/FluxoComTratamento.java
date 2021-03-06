
public class FluxoComTratamento {
	
	public static void main(String[] args) throws MinhaExcecao {
		
		System.out.println("Inicio do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException ex) {
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do main");
		
	}
	
	private static void metodo1() throws MinhaExcecao {
		
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("Fim do metodo2");
		
	}
	
	private static void metodo2() throws MinhaExcecao {
		
		System.out.println("Inicio do metodo2");
		for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            Conta c = null;
            c.deposita();
		} 
		System.out.println("Fim do metodo2");
	}

}
