package wangyi;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String num=sc.next();
		int cnt=sc.nextInt();
		char[] arr=num.toCharArray();
		for(int i=0;i<cnt;i++){
			arr=cut(arr);
		}
		String rs="";
		for(int i=0;i<arr.length;i++)
		 if(arr[i]!=' ')
			 rs+=arr[i];
		System.out.println(rs);
		}
	
	public static char[] cut(char[] arr){
		int cut=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<=arr[cut]){
				cut=i;
			}
		}
		arr[cut]=' ';
		return arr;
		
	}

}
