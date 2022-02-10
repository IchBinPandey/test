package com.sarthak.wishmedia;

import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
  public static void evenodd(int x)
  {
	  if(x%2==0)
	  System.out.println("even");
	  else
		  System.out.println("odd/zero");
  }
public static void main()
{
	Scanner m= new Scanner(System.in);
	System.out.println("Enter no.:-");
	int x=m.nextInt();
	evenodd(x);
	m.close();
}
}
