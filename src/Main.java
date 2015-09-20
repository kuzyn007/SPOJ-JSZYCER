/**
 * Autor kodu: Sewery Adamczyk
 * Pochodzenie: http://pl.spoj.com/problems/JSZYCER/
 */

import java.util.*;

public class Main {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		while(in.hasNextLine())
		{
			String s = in.nextLine();
			
			char znak;
			for(int i=0; i<s.length(); i++)
			{
				znak = s.charAt(i);
				if(znak>='A' && 'X'>znak)
				{
					znak += 3;
				}
				else if(znak == 'X')
				{
					znak = 'A';
				}
				else if(znak == 'Y')
				{
					znak = 'B';
				}
				else if(znak == 'Z')
				{
					znak = 'C';
				}
				System.out.print(znak);
			}
			System.out.println();
		}
		in.close();
	}

}
