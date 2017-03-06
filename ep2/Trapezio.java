public class Trapezio extends FigurasGeometricas {
        private double bmaior,bmenor,altura;
        public Trapezio(double bmaior,double bmenor, double altura) {
                this.bmaior = bmaior;
				this.bmenor = bmenor;
				this.altura = altura;
        }
        public double perimetro() {
                double p,cateto,diagonal,alt;
                cateto = Math.pow(((this.bmaior - this.bmenor) / 2),2);
				alt = Math.pow(this.altura,2);
				diagonal = Math.sqrt(cateto + alt);
				p = diagonal*2 + this.bmaior + this.bmenor;
                return p;
        }
        public double area() {
                double a;
                a = ((this.bmaior + this.bmenor) * 2) / altura;
                return a;
        }
}


