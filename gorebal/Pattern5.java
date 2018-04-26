package ravi.SamplePrograms.gorebal;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		for(int i=0; i<5; i++) {
		
			for(int j=0; j<=i; j++) {
				System.out.print(num +" ");
				num= num+1;
			}
			System.out.println();
		}

	}

}
