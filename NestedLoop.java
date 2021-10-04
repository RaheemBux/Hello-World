class NestedLoop{
	public static void main(String abc[]){
		// loop 
		
		for(int i=1; i<=3; i++){
			int a = 34;
			if(a>4){
				
			}
			// code
			//System.out.println(i);
			for(int j=1; j<=3; j++){ 
				for(int k=1; k<=3; k++){ 
					System.out.println(k); 		// 1 2 3 1 2 3 1 2 3 1 2 3 1 2 3 1 2 3 1 2 3 1 2 3 1 2 3
				} 		
			}
			
		}
	}
}