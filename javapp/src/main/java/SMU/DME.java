import java.util.Scanner;

//test
public class DME {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = new int[12];
		for(int i=0;i<12;i++) {
			a[i] = 2;
		}//init
		int count = 0;
		int count2 = 0;
		int state = 0;
		
		String b, temp;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("Input: ");
			b = scan.nextLine();
			if(b.equals("exit")) {
				break;
			}
			for(int i=0;i<b.length();i++) {
				temp = b;
				temp = temp.substring(i, i+1);
				a[i] = Integer.parseInt(temp);
				count++;
			}
			count2 = count;
			while(count>0) {
				if((state==0)&&(a[count2-count]==0)) {
					System.out.print("‾⌉_");
				}
				else if((state==0)&&(a[count2-count]==1)) {
					state = 1;
					System.out.print("_⌈‾");
				}
				else if((state==1)&&(a[count2-count]==0)) {
					System.out.print("_⌈‾");
				}
				else if((state==1)&&(a[count2-count]==1)) {
					state = 0;
					System.out.print("‾⌉_");
				}
				count--;
			}
			System.out.println();
			for(int i = 0; i < count2; i++) {
				System.out.print(" "+a[i]+" ");
			}
			System.out.println();
		}
		//⌈ ⌉
	}

}
