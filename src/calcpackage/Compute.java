package calcpackage;

public class Compute {
	public static int Result(String oper, int a, int b) {
		switch (oper) {
        case "*":  return a * b; 
        case "/": return a / b; 
        case "+":  return a + b;
        case "-": return a - b;
        default: 
        	System.out.println("������������ ��������!");
        	System.exit(0);
        	return 0;
        }
	}
}
