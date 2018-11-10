public class segitigasiku {

	public static Scanner input = new Scanner (System.in);
	public static int x;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("SEGITIGA SIKU");
		
		do {
		System.out.print("Masukkan jumlah bilangan: ");
		x = input.nextInt();
		
		if(x>10) {
			System.out.println("\nMaaf nilai maksimal adalah 10!!!!\n");
		}
		
		} while(x > 10);
		for (int i = 1 ; i <= x; i++){
	      for(int l= 1; l<=i; l++){
	        	System.out.print(l+", ");
	        }
	        	System.out.println("");   
	    }
		
	}

}
