package lab7;
import java.util.*;
public class lab7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r=new Random();
		int [] rastgele= new int[10000];
		
		
		//radixSort(rastgele);
		for (int i = 0; i <10000; i++){

            rastgele[i] = r.nextInt(Integer.MAX_VALUE);

        
		}
		long start=System.currentTimeMillis();
		rastgele=radixSort(rastgele);
		System.out.print(radixSort(rastgele));
		long end=System.currentTimeMillis();
		
		for(Integer i:rastgele) {
			System.out.println(i);
		}
		System.out.print("Time :");
		System.out.println(end-start);
		
	}
	public static int[] radixSort(int [] array) {
		for(int x=1;x<=10000;x*=10) {
			array=counting(array,x);
		}
		
		return array;
	}	
	public	static int[] counting(int [] array,int x) {
		
		int[] out = new int[array.length];



        int[] count = new int[10000];



        for(int i=0; i < array.length; i++){

            int digit = getDigit(array[i], x);

            count[digit] += 1;

        }



        for(int i=1; i < count.length; i++){

            count[i] += count[i-1];

        }



        for(int i = array.length-1; i >= 0; i--){

            int digit = getDigit(array[i], x);



            out[count[digit]-1] = array[i];

            count[digit]--;

        }
        

      
        return out;


	}
	public static int getDigit(int value, int digitPlace){

        return ((value/digitPlace ) % 10);

    }
}
