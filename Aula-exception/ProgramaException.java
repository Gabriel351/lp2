public class ProgramaException {

	public static void main (String argv[]) {
		//testeException1();
		//testeException2();
		testeException3();
	}

	public static void testeException1() {
		int[] vetor1 = new int[5];
		System.out.println("Teste Exception 1");
		try {
			vetor1[6] = 10;
			System.out.println("Teste Exception 1 - Após o erro");
		}
		catch (Exception e) {
			System.out.println("Um erro ocorreu. Este foi o erro: ");
			e.printStackTrace();
		}
	}

	public static void testeException2() {
		int[] vetor1 = new int[5];
		System.out.println("Teste Exception 2");
		try {
			vetor1[6] = 10;
			System.out.println("Teste Exception 2 - Após o erro");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Ocorreu um erro de ArrayIndexOutOfBounds");
		}		
	}

	public static void testeException3() {
		int[] vetor1 = new int[5];
		System.out.println("Teste Exception 3");
		try {
			vetor1[6] = 10;
			System.out.println("Teste Exception 3 - Após o erro");
		}
		catch (NullPointerException e) {
			System.out.println("Ocorreu um erro de NullPointer");
		}	
		finally {
			System.out.println("Teste Exception 3 - Após o catch");
		}	
	}
}
