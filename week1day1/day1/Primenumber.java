package week1.day1;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int a=13;
	 boolean flag=false;
	 for(int i = 2; i <= a - 1; i++)
         if (a % i!= 0) {
             flag = true;
             break;
         }
          
         // Check and display alert message
     if (flag == true) {
         System.out.println(a+"is a prime number");
     }
     else {
    	 
       System.out.println(a+"is not a prime number");
 }
        
	}

}
