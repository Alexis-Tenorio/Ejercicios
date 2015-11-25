package ec;

public class descuento {
	public class Descuento {
		private double descuento;
		private double total_compra;


		public double getDescuento() {
			return descuento;
		}
		public void setDescuento(double descuento) {
			this.descuento = descuento;
		}
		public double getTotal_compra() {
			return total_compra;
		}
		public void setTotal_compra(double total_compra) {
			this.total_compra = total_compra;
		}
		public Descuento(double descuentoParam,double total_compraParam){
			this.descuento=descuentoParam;
			this.total_compra=total_compraParam;
			
		}
		public double getTotal(){
			double total=total_compra-total_compra*descuento;
			return total;
}
}
}