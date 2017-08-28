package wangyi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ali {

	  static int pick(int[] peaches) {
		  int max=1;
		  int[] cho=new int[peaches.length];
		  for(int i=0;i<peaches.length;i++){
			  cho[i]=1;
		  }
		  for(int i=0;i<peaches.length;i++){
			  int num=1;
			  for(int j=i;j>=0;j--){
				  int ci=0;
				  if(peaches[i]>=peaches[j]&&j!=i)
				  {
					  ci=cho[j]+1;
				  }
				  if(ci>num){
					  num=ci;
				  }
			  }
			  cho[i]=num;
		  }
		  for(int i=0;i<peaches.length;i++){
			  max=max>cho[i]?max:cho[i];
		  }
		  return max;
	  }
	    public static void main(String[] args){
	        Scanner in = new Scanner(System.in);
	        int trees = Integer.parseInt(in.nextLine().trim());
	        int[] peaches = new int[trees];
	        for (int i = 0; i < peaches.length; i++) {
	            peaches[i] = Integer.parseInt(in.nextLine().trim());
	        }
	        System.out.println(pick(peaches));
	    }

}
