package javapgm;

public class Array {
	public static void main(String[] args) {
		double	[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		double count=0;
		/*num[0]=1;
		num[1]=2;
		num[2]=3;
		num[3]=4;
		num[4]=5;
		num[5]=6;
		num[6]=7;
		num[7]=8;
		num[8]=9;
		num[9]=10;*/
		//int count = 0;
					 
		//for(int num: a) {
			//count= count+=num;
		//}
		//System.out.println(count);	
				//System.out.println(num.length);
		
		 for (int i = 0; i < a.length; i++) {
			count = count+a[i];
			
		
			double avg = count/a.length;
			//System.out.println(avg);
			 //av=count/avg;	
			System.out.println(avg);
			
		}
	}
	}
		
		



