package ec;

public class tele {

	public static void main(String[] args) {

		
televisor tv1;
tv1=new televisor();
			tv1.establecervolumen(50);
			tv1.establecercanal(10);
			
			televisor tv2;
			tv2=new televisor(25, 2);
			
			System.out.println(tv1);
			System.out.println(tv2);
	
	}

}
