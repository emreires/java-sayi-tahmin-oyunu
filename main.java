import java.util.Scanner; 

public class Main
{
	public static void main(String[] args) {
		
		int randomNum = (int) (Math.random()*100);
		
		Scanner scaner = new Scanner(System.in); 
		
		int guessLimit = 5;
		int tried = 0;
		for (int i = 0; i < guessLimit; i++) { 
    		int userNumber = scaner.nextInt(); 
    		
    		
    		if(randomNum < userNumber)
    	    {
    	        System.out.println("Random number is less than:" + userNumber);
    	    }
    	    else if (randomNum > userNumber)
    	    {
    	        System.out.println("Random number is greater than:" + userNumber);
    	    }
    	    
    	    else if (randomNum == userNumber)
    	    {
    	        System.out.println("Your guess is correct! Number:" + userNumber);
    	    }
    	    
    	    tried++;
		}
		
		
		if(tried >= guessLimit)
	    {
	        System.out.println("You reached limit! Game over!");
	    }
	}
}
