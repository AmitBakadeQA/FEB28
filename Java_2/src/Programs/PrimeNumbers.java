package Programs;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		for(int i=2;i<=100;i++){
		    if(checkPrime(i)){
		        System.out.print(i+" " );
		    }
		}
	}
	public static boolean checkPrime(int num){
	    
	    if(num<2)
	    {
	        return false;
	    }
	    else
	    {    
	        int x= num/2;
	        for(int i=2;i<x;i++)
	        {
	            if(num%i==0)
	            {
	                return false;
	            }
	        }
	    }
	    return true;
	}
}


