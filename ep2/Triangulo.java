public class Triangulo extends FigurasGeometricas {
	private double base,altura,l1,l2,l3;
	public Triangulo (double base, double altura, double l1, double l2, double l3) {
		this.base = base;
		this.altura = altura;
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
	}
	public double calcularPerimetro() {
		double p;
		p = this.l1+this.l2+this.l3;
		return p;
	}
	public double calcularArea() {
		double a;
		a = (base * altura)/ 2;
		return a;
	}
}
