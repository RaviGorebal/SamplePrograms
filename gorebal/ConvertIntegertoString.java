package ravi.SamplePrograms.gorebal;

public class ConvertIntegertoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 890898;
		
		
		
		Integer i1 = new Integer(i);
		
		Byte b = i1.byteValue();
		
		Double qb = i1.doubleValue();
		
		System.out.println(qb);
		
		String s = String.valueOf(i1);
		
		System.out.println(s);

	}

}
