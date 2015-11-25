package ec;

public class e1 {

	public class Circulo {
		private double radio;

		public Circulo(){
		this.radio=1;
		}

		public void setRadio(double radioParam){
		this.radio=radioParam;
		}
		public double getRadio(){
			return this.radio;
		}

		public Circulo(double radioParam){
			this.radio=radioParam;
		}
		public double getArea(){
			return Math.PI*radio*radio;
		}
		}

	
	
}
