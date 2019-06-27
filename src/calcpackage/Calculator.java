/*
 * Calculator
 * @version 1.0
 * @author Arslanbek
 */

package calcpackage;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("�����������");
        System.out.println("������� ��� �����(����������� ������� �����) \n � �������������� ����(+, -, *, /) ����� ����: \n");
        Scanner scan = new Scanner(System.in);

        String scanStr = scan.nextLine();
        String mas[] = scanStr.split(" ");
        int firstVal;
        int secondVal;
        String trop = mas[1];
        RomanToArab dron = new RomanToArab();
        ArabToRoman strVal = new ArabToRoman();
        
        if((mas[0].matches("-?[0-9]*")) & (mas[2].matches("-?[0-9]*"))) {
        	firstVal = Integer.parseInt(mas[0]);
        	secondVal = Integer.parseInt(mas[2]);
        	if((firstVal | secondVal) > 99 ) {
				System.out.print("������������ �����");
				System.exit(0);
			}
        	
        	System.out.println("��� �����: " + Compute.Result(trop, firstVal, secondVal));
        } 
        else if((mas[0].matches("-?[A-Z]*")) & (mas[2].matches("-?[A-Z]*"))) {
        	firstVal = dron.romanToArab(mas[0]);
        	secondVal = dron.romanToArab(mas[2]);
        	System.out.println("��� �����: " + strVal.arabToRoman(Compute.Result(trop, firstVal, secondVal)));	
        } 
        else  {
        	System.out.print("�������� ����� ��������� � �������� ������� ����������"); 
        	System.exit(0);
        }
        
        scan.close();
    } 
} 