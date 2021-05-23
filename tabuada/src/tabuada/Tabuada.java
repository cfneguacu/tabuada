package tabuada;

public class Tabuada {

	public static void main(String[] args) {
		
		int k = 1;
		
		calcularTabuada(k);
		
	}
	
	
	public static void calcularTabuada(int k) {
		
	for(int i = 1; i<=10; i++) {
		
		for (int j=k;j<=k+4;j++) {
			
			System.out.print(j+"*"+i+"="+j*i+"\t \t");
		
		}
		
	System.out.println();	
	
	}
	
		k=k+5;
		
		if(k==6) {
		
			System.out.println();	
		
			calcularTabuada(k);
			
		}
		
	}

}

