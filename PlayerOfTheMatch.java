package com.main;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PlayerOfTheMatch {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	Set<String> st = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
	int size = sc.nextInt();
	for(int i=0;i<size+1;i++)
	{
		String str = sc.nextLine();
	    st.add(str);
	}
	 Iterator<String> i = st.iterator();
     while (i.hasNext())
         System.out.println(i.next());
 }
}

