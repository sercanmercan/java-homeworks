package lab_6;
import java.util.*;
import java.util.Random;
public class random_letter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int r1;
		
		char [][] s1=new char[10][10];
		int number2;
		
		char answerKey[]= {'A','B','E','A','C','B','A','C','D','D'};
		
		//Random rand = new Random();

		
		
		
		for(int i=0;i<10;i++) {
			
			//System.out.print(c);
			for(int j=0;j<10;j++) {
				int number=(int)(Math.random()*4)+65;
				char c=(char) number;
			
				s1[i][j] =c;
				System.out.print(s1[i][j]);
			}
			
			System.out.print("\n");
			
		}
		
		for(int i=0;i<10;i++) {
			number2=0;
			//System.out.print(c);
			for(int j=0;j<10;j++) {
				
				if(s1[i][j]==answerKey[j]) {
					
					number2++;
				}
				
			}
			
			System.out.println((i+1) +". ogrenci dogru sayisi = "+number2);
			
		}
		
	}

}
