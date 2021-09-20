package geekster2;
import java.util.Scanner;

public class Length {
	public static void main(String args[]) {
		String name;
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter Name");
		name=scr.nextLine();
		if(name.length()<8)
		{
			System.out.println("Length Of Name Is Short");
		}
		else {
			System.out.println("Length of name is long");
		}
	}
	
	

}
