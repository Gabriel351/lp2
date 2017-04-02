public class Quadrado extends FigurasGeometricas {
	private double lado;
	public Quadrado() {
		lado = 0;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double calcularPerimetro() {
		double p;
		p = this.lado * 4;
		return p;
	}
	public double calcularArea() {
		double a;
		a = lado * lado;
		return a;
	}
}
