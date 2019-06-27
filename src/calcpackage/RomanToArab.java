package calcpackage;

public class RomanToArab {
	public int romanToArab(String romanNumeral){
		int decimal = 0;
		int ter = 1;
		
	    for(int x = 0; x < romanNumeral.length(); x++) {
	    	
	    	if((romanNumeral.charAt(0) == '-') & (x == 0)) {
	        	ter = -1;
	        	x++;
	        }
	    	
	        char convertToDecimal = romanNumeral.charAt(x);
	        switch (convertToDecimal){
		        case 'X':
		            decimal += 10;
		            break;
	
		        case 'V':
		            decimal += 5;
		            break;
	
		        case 'I':
		            decimal += 1;
		            break;
		        default:  
		        	System.out.println("Недопустимое значение!");
		        	System.exit(0);
	        }
	    }
	    
	    if(decimal >= 40) {
	    	System.out.println("Недопустимое значение!");
	    	System.exit(0);
	    }
	    if (romanNumeral.contains("IV")) {
	        decimal-=2;
	    }
	    if (romanNumeral.contains("IX")){
	        decimal-=2;
	    }
	    
	    return decimal * ter;
	}	
}
