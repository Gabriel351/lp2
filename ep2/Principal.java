public class Principal {
	public static void main (String arg[]) {
		Trapezio t = new Trapezio(16,10,5,4,4);
		Circunferencia c = new Circunferencia();
		c.setR(10);
		Quadrado q = new Quadrado();
		q.setLado(3);
		Retangulo r = new Retangulo();
		r.setBase(15);
		r.setAltura(8);
		Triangulo tr = new Triangulo(10,15,10,8,8);
		System.out.println("Trapezio area e perimetro:" + t.calcularArea() + " " + t.calcularPerimetro());
		System.out.println("Circunferencia area e perimetro:" + c.calcularArea() + " " + c.calcularPerimetro());
		System.out.println("Quadrado area e perimetro:" + q.calcularArea() + " " + q.calcularPerimetro());
  		System.out.println("Retangulo area e perimetro:" + r.calcularArea() + " " + r.calcularPerimetro());
	  	System.out.println("Triangulo area e perimetro:" + tr.calcularArea() + " " + tr.calcularPerimetro());
	}
}
