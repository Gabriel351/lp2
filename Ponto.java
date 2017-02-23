public class Ponto{
	private	 double x,y;

	public Ponto() {
		System.out.println("Construtor 1 - " + this);
	}

	public Ponto(double x, double y) {
		System.out.println("Construtor 2");
		this.x = x;
		this.y = y;
	}

	public void setX(double x){
		this.x = x;
	}

	public double getX(){
		return this.x;
	}

	public void setY(double y){
		this.y = y;
	}

	public double getY(){
		return this.y;
	}


	public static void main(String args[]){
		Ponto p1 = new Ponto();
		p1.setX(10.0);
		p1.setY(20.0);
		Ponto p2 = new Ponto();
		p2.setX(15.0);
		p2.setY(30.0);
		Ponto p3 = new Ponto();
		p3.setX(50.0);
		p3.setY(70.0);
		Ponto p4 = new Ponto(4.00,10.00);
		p3 = p1;
		System.out.println(p3.getX() + " " + p3.getY());
		System.out.println(p2.getX() + " " + p2.getY());
		System.out.println(p1.getX() + " " + p1.getY());
		double distancia,px,py,soma;
		px = (p2.getX() - p1.getX());
		py = (p2.getY() - p1.getY());
		soma = (Math.pow(px,2) + Math.pow(py,2));
		distancia = Math.sqrt(soma);
		System.out.println(distancia);

		Reta r1 = new Reta();
		r1.setP1(p1);
		r1.setP2(p2);
		r1.getP1().getX();
		r1.getP2().getY();
		//p1.setX(30);
		//r1.getP2().setY(40);
		System.out.println("Pontos da reta r1: ");
		System.out.println("P1: " + r1.getP1().getX() + " " + r1.getP1().getY());
		System.out.println("P2: " + r1.getP2().getX() + " " + r1.getP2().getY());
		System.out.println(r1.Area(r1.getP1().getX(),r1.getP1().getY(),r1.getP2().getX(),r1.getP2().getY()));
	}
}
