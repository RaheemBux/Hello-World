class HelloWorld{
	public static void main(String abc[]){
		int num = 47;
		int factor = 0;
		for(int i=1; i<=num; i++){
			if(num%i==0){
				factor=factor+1;
			}
		}
		if(factor==2){
			System.out.println(num+" is a prime number");
		}
		else{
			System.out.println(num+" is not a prime number");
		}
		
	}
}