public class Retangulo extends FigurasGeometricas {
        private double base,altura;
        public Retangulo() {
                base = 0;
				altura = 0;
        }
        public void setBase(double base) {
                this.base = base;
        }
	public void setAltura(double altura) {
		this.altura = altura;
	}
        public double calcularPerimetro() {
                double p;
                p = (this.altura * 2)+(this.base *2);
                return p;
        }
        public double calcularArea() {
                double a;
                a = base * altura;
                return a;
        }
}


