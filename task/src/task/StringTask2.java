package task;

import java.util.HashMap;
import java.util.Map;

public class StringTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] val= {"java","uniq","java","java","dev"};
//		Map<String,Integer> hm=new HashMap<String, Integer>();
//		int strCount=0;
//		for(int i=0;i<val.length;i++) {
//			strCount=0;
//			for(int j=0;j<val.length;j++) {
//				if(val[i].equals(val[j])) {
//					strCount++;
////					System.out.println(val[j]+" "+strCount);
//				}
//			}
//			hm.put(val[i], strCount);
//		}
//		System.out.println(hm);
		
//		String val="aabcdeeffghkkk";
//		char[] val1=val.toCharArray();
//		Map<Character,Integer> hm=new HashMap<Character, Integer>();
//		int strCount=0;
//		for(int i=0;i<val1.length;i++) {
//			strCount=0;
//			for(int j=0;j<val1.length;j++) {
//				if(val1[j]==val1[i]) {
//					strCount++;
////					System.out.println(val[j]+" "+strCount);
//				}
//			}
//			hm.put(val1[i], strCount);
//		}
//		System.out.println(hm);
		
		String val="aa2b1c1d1ee2ff2g1h1kkk3";
		char[] val1=val.toCharArray();
		boolean ch=false;
		Map<Character,Integer> hm=new HashMap<Character, Integer>();
		int strCount=0;
		for(int i=0;i<val1.length;i++) {
			strCount=0;
			for(int j=0;j<val1.length;j++) {
				if(val1[j]==val1[i] && ch == Character.isDigit(val1[j])) {
					strCount++;
//					System.out.println(val[j]+" "+strCount);
				}
			}
			hm.put(val1[i], strCount);
		}
		for(Map.Entry<Character, Integer> re:hm.entrySet()) {
			if(ch==Character.isDigit(re.getKey())) {
			System.out.println(re.getKey()+" "+re.getValue()+" "+re.getValue());
			}
		}
		
	}

}
