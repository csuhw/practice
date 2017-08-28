package wangyi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
	 Scanner sc=new Scanner(System.in);
     int n=Integer.valueOf(sc.next());
     int[] stu = new int [n+1];
     for (int i = 1; i <n+1 ; i++) {
    	 stu[i] = sc.nextInt();
    	 }
     int k =sc.nextInt();
     int d =sc.nextInt();
     long rs=mul(n,stu,k,d);
     System.out.println(rs);
	}
	public static long mul(int n,int[] stu,int k,int d )
	{
		long[][] max=new long[k+1][n+1];
		long[][] min=new long[k+1][n+1];
		long da = Long.MIN_VALUE;
		for(int num=1;num<k+1;num++){
		for(int i=1;i<n+1;i++)
		{
			if(num==1){
				max[num][i]=stu[i];
				min[num][i]=stu[i];
				continue;
			}
			
			if(num==i){
				max[num][i]=max[num-1][i-1]*stu[i];
				min[num][i]=min[num-1][i-1]*stu[i];
				continue;
			}
			else if(num>i){
				continue;
			}
			else{
			//num<i
			int j=1;
			long zuida=Math.max(max[num-1][i-1]*stu[i],min[num-1][i-1]*stu[i]);
			long zuixiao=Math.min(max[num-1][i-1]*stu[i],min[num-1][i-1]*stu[i]);
			while(j<=d&&i-j>=1){
			
			zuida=zuida>Math.max(max[num-1][i-j]*stu[i],min[num-1][i-j]*stu[i])?zuida:Math.max(max[num-1][i-j]*stu[i],min[num-1][i-j]*stu[i]);		
			zuixiao=zuixiao<Math.min(max[num-1][i-j]*stu[i],min[num-1][i-j]*stu[i])?zuixiao:Math.min(max[num-1][i-j]*stu[i],min[num-1][i-j]*stu[i]);		
			j++;
			
			}
			max[num][i]=zuida;
			min[num][i]=zuixiao;
			}
		}
		}
		long rs=max[k][1];
		for(int i=1;i<n+1;i++){
			if(max[k][i]>rs){
				rs=max[k][i];
			}
		}
		return rs;
	}
}
	
		
		

