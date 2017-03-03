public class Principal {
	public static void main(String arg[]) {
		Lista teste = new Lista();
		teste.Inserir(10);
		if (teste.Pesquisar(10)) {
			System.out.println("este numero esta na lista");
		} else {
			System.out.println("este numero nao esta na lista");
		}
		if (teste.Pesquisar(2)) {
                        System.out.println("este numero esta na lista");
                } else {
                        System.out.println("este numero nao esta na lista");
                }
		teste.Inserir(2);
		teste.Inserir(5);
		if (teste.Pesquisar(2)) {
                        System.out.println("este numero esta na lista");
                } else {
                        System.out.println("este numero nao esta na lista");
               	}
		if (teste.Pesquisar(12)) {
                        System.out.println("este numero esta na lista");
                } else {
                        System.out.println("este numero nao esta na lista");
                }

	}
}
