package chapter7;

public class OrderCalc {
	public double getOrderTotal (int bp, int nb){
		
		if ((bp+nb)==1 || (bp == 2 && nb ==0) || (nb == 2 && bp ==0)){
			return (bp*18.95+nb*21.95);
		}else if (bp==1 && nb ==1){
			return 37.95;
		}else if ((nb+bp) >= 12){
			return (nb+bp)*14.00;
		}else{
			return (bp+nb)*15.95;
		}
	}
}
