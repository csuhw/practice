package wangyi;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		Set<String> cl=new HashSet<String>();
		while(sc.hasNext()){
		
		String str=sc.next();
		cl.add(str);
		}
		System.out.println(cl.size());
	}

}
