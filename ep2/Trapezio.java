public class Trapezio extends FigurasGeometricas {
        private double bmaior,bmenor,altura,l1,l2;
        public Trapezio(double bmaior,double bmenor, double altura,double l1,double l2) {
                this.bmaior = bmaior;
		this.bmenor = bmenor;
		this.altura = altura;
                this.l1 = l1;
                this.l2 = l2;
        }
        public double perimetro() {
                double p;
                p = this.bmenor + this.bmaior + this.l1 + this.l2;
                return p;
        }
        public double area() {
                double a;
                a = ((this.bmaior + this.bmenor) * 2) / altura;
                return a;
        }
}


