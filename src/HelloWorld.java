public class HelloWorld {
	
	
	public static void main(String[] args){
		helloWorld();
		helloJava("hello world");
		sumNum(2,5, false);
		sumNum(8,8, true);
		sumNum1(1,5);
		iteration();
		arrayTest();
		loopArray();
		
		//sumNum2(1,1,true);
	}
	static void helloWorld() {
		System.out.println("Hello World!");
		
		
	}	
	static void helloJava(String java)
	{
		System.out.println(java);
	}
	
   static void sumNum(int n1, int n2, boolean b) {
	   int n3=n1+n2;
	   int n4=n1*n2;
	   if (b == true) {
		   System.out.println(n3);
		   }
		   else if (b == false) {
			   System.out.println(n4);
			   }
		   }
   
   static void sumNum1(int n1, int n2) {
	   if (n1 == 0) {
		   System.out.println(n2);
	   }
	   else 
		   System.out.println(n1);
		   
	   }
   static void iteration () {
	   for (int i =0; i <10; i++){
		   sumNum1(i,6); 
	   }
	   }
   static void arrayTest () {
	   int[] myIntArray = {30,23,85,78,65,30,70,44,6,10};
	   
	   for(int i : myIntArray ){
		   System.out.println("Array: "+i*10);
		  // sumNum1(myIntArray[i], myIntArray[i]);
		   
	   }
	   
   }

   static void loopArray () {
	   int[] loopArray = new int [10];
	   for(int i = 0; i < 10; i ++){
		   loopArray [i] = i + 2;
		   System.out.println("Array: "+i);
		   System.out.println("Array: "+i*10);
		   
		   
}
   }
   
}
	   
	   
   
	   
	   
	   
   	   
   

