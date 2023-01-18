import java.util.Scanner;
import java.io.BufferedInputStream;
public class uva_100 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(new BufferedInputStream(System.in));
		
		int max, min, x, countermax, counter = 0;
		
		while(sc.hasNext()){
			
			int i=sc.nextInt();
			int j=sc.nextInt();
			
			if(i>j){
				max=i;
				min=j;
				
			}
			else{
				max=j;
				min=i;
			}
			
            countermax = 0;
			for(x=min;min<=max;min++)
			{
				x=min;
				
				for(counter=1;x!=1;counter++)
				{
					if(x%2==1){
						x=3*x+1;
						
					}
					else
						x=x/2;
				}
				if(counter > countermax)
					countermax = counter;
			
			}
			System.out.println(i+" "+j+" "+countermax);
			
		}
		

	}

}