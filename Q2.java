package wangyi;

import java.util.*;

public class Q2 {
		public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{	int n=in.nextInt();
    		int m=in.nextInt();
			char[][] points =new char[n][m];
			int[][] tar =new int[n][m];
			for(int i=0;i<n;i++){
				String str=in.next();
				points[i]=str.toCharArray();
			}
			int startx=in.nextInt();
			int starty=in.nextInt();
			int k=in.nextInt();
			int[] stepx =new int[k];
			int[] stepy= new int[k];
			for(int i=0;i<k;i++){
				stepx[i]=in.nextInt();
				stepy[i]=in.nextInt();
			}
		
			Queue<Integer> xqueue=new LinkedList<Integer>();
			Queue<Integer> yqueue=new LinkedList<Integer>();
			xqueue.add(startx);
			yqueue.add(starty);
			tar[startx][starty]=1;
			while(!xqueue.isEmpty()){
				startx=xqueue.remove();
				starty=yqueue.remove();
				for(int i=0;i<k;i++){
					if(startx+stepx[i]<n&&startx+stepx[i]>=0&&starty+stepy[i]<m&&starty+stepy[i]>=0)
						if(tar[startx+stepx[i]][starty+stepy[i]]==0){ 
						if(points[startx+stepx[i]][starty+stepy[i]]=='.'){
							 tar[startx+stepx[i]][starty+stepy[i]]=tar[startx][starty]+1;
							 xqueue.add(startx+stepx[i]);
							 yqueue.add(starty+stepy[i]);
						 }
						 else{
							 tar[startx+stepx[i]][starty+stepy[i]]=-1;
						 }
						}
						else{
							if(points[startx+stepx[i]][starty+stepy[i]]=='.'){
								int step=tar[startx+stepx[i]][starty+stepy[i]]>tar[startx][starty]+1?tar[startx+stepx[i]][starty+stepy[i]]:tar[startx][starty]+1;
								
							}
							else{
								 tar[startx+stepx[i]][starty+stepy[i]]=-1;
							 }
				}
			}
			}
					int max=0;
					int getRoad=1;  
					for(int i=0;i<n;i++)
						for(int j=0;j<m;j++){
							if(points[i][j]=='.'&&tar[i][j]==0){
								getRoad=0;
							}
							max=Math.max(max, tar[i][j]);
						}
					if(getRoad==0)
					System.out.println(-1);
	                  else
	                System.out.println(max-1);
			}
			}
		}

				
	

		