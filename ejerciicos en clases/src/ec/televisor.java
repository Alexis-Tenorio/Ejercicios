package ec;

public class televisor {

	public class tv 	{
	
		private int volumen_actual;
		private int canal_actual;
		private boolean on;
		 	
		public tv(){
			
		}
		public tv (int volumenparam,int canalparam){
			this.volumen_actual=volumenparam;
			this.canal_actual=canalparam;
					}
		public void establecervolumen (int volumen){
			volumen_actual=volumen;
		}
		public void establecercanal (int canal){
			canal_actual=canal;
					}
		
		public int obtenervolumen(){
			return volumen_actual;
		}
		
		public int obtenercanal(){
			return canal_actual;
		}
		public void on(){
			on=true;
		}
		public void apagar(){
			on=false;
		}
		public void subirvolumen(){
			if (on && volumen_actual<=100);
			volumen_actual++;
		}
		public void bajarvolumen(){
			if(on && volumen_actual>=0);
			volumen_actual--;
		}
		public void cambiarcanalarriba(){
			if(on && volumen_actual<=50);
			volumen_actual++;
					}
		
		public void cambiarcanalabajo(){
			if(on && volumen_actual>=50);
			volumen_actual--;
					}
		public String toString(){
			return "canal_actual: "+canal_actual+ "volumen_actual:"+volumen_actual;
		}
}
}