public class Principal {
	public static void main (String argv[]) {
		Singleton v1 = Singleton.getInstance();
		Singleton v2 = Singleton.getInstance();
		Singleton v3 = Singleton.getInstance();
		Singleton v4 = Singleton.getInstance();
	}
}
