public class Circunferencia extends FigurasGeometricas {
        private double r,pi;
        public Circunferencia() {
        	    r = 0;
				pi = 3.14;
        }
        public void setR(double r) {
                this.r = r;
        }
        public double calcularPerimetro() {
                double p;
                p = 2 * pi * r;
                return p;
        }
        public double calcularArea() {
                double a;
                a = pi * Math.pow(this.r,2);
                return a;
        }
}


