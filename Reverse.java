package geekster2;
import java.util.*;
public class Reverse {
	public static void main(String args[])
	{
		int a=54321,b,rev=0;
		while (a!=0)
		{
			b=a%10;
			b=rev*10+b;
			a=a%10;
		
		}
		System.out.println("Reverse No Is:-");
	}

}
