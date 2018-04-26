package ravi.SamplePrograms.gorebal;


	
	import java.util.HashMap;
	import java.util.Map;
	import java.util.Set;
	public class MapM {
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub

	        Map<String, String> m1 = new HashMap<String, String>();
	        m1.put("a","1");
	        m1.put("b","2");
	        m1.put("c","3");
	        m1.put("d","4");
	        
	        System.out.println("map1="+m1);
	        
	        Map<String, String> m2 = new HashMap<String, String>();
	        m2.put("a", "5");
	        m2.put("b", "7");
	        m2.put("c", "8");
	        m2.put("d", "9");
	        
	        System.out.println("map2="+m2);
	        
	        Map<String, String> m4 = new HashMap<String, String>();
	        m4.put("a", "5");
	        m4.put("b", "7");
	        m4.put("c", "8");
	        m4.put("d", "9");
	        
	        System.out.println("map4="+m4);
	        
	        Map<String, String> m3 = new HashMap<String, String>();
	        
	        
	        
	        Set s = m2.keySet();
	        for (Object object : s) {

	             m3.put((String)object,m1.get(object)+","+m2.get(object)+","+m4.get(object));
	        }
	        System.out.println("Map3="+m3);
	        
	    }

	}



