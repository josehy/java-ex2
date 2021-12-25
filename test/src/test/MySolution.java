package test;

import java.util.Arrays;
import java.util.Random;

public class MySolution {

	public static void main(String[] args) {
		
		long startTime = System.nanoTime(); 
		
		int[] datas = new int[20];
		int[] primenums = new int[20];		
		int cnt=0;
		while(cnt!=3) {  
			cnt=0;
			
			for (int i=0;i<20;i++)  { 
				datas[i]=(int)(Math.random()*60 + 5 - 0.5);
			}
			
			System.out.print(Arrays.toString(datas));  
			
			for(int i=0;i<datas.length;i++) {  
			
				boolean result=true;		
				for (int k=2;k<=datas[i]/2;k++) {
					if(datas[i] % k ==0) {
						result=false; break;	
					}	
				}	
				
				if(result) {  cnt++; primenums[i]=1; }  
				else primenums[i]=0;
			} 
			
			System.out.println( ":::" + cnt);			
		}
		for (int i=0;i<datas.length;i++)
			System.out.println(datas[i] + "\t" + primenums[i]);
			
		long endTime = System.nanoTime();
		System.out.println("실행시간 : " + (endTime-startTime)/1000  +" us 소요되었습니다.");
	}  

}