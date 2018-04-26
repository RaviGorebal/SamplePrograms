package ravi.SamplePrograms.gorebal;

public class Garbagr {

		// to store object name
		String obj_name;
		
		public Garbagr(String obj_name) 
		{
			this.obj_name = obj_name;
		}
		
		// Driver method
		public static void main(String args[])
		{
			Garbagr t1 = new Garbagr("t1");
			Garbagr t2 = new Garbagr("t1");
			
			/* t1 being used for some purpose in program */

			/* When there is no more use of t1, make the object
			referred by t1 eligible for garbage collection */	
			t1 = null;

			// calling garbage collector
			System.gc();
		}
		
		@Override
		/* Overriding finalize method to check which object
		is garbage collected */
		protected void finalize() throws Throwable 
		{
			// will print name of object
			System.out.println(this.obj_name + " successfully garbage collected");
		}
	}



