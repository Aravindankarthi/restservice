package task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Marks {
	
	String subject;
	int mark;
	
	public Marks(String subject,int mark) {
		this.subject=subject;
		this.mark=mark;
	}

	@Override
	public String toString() {
		return "Marks [subject=" + subject + ", mark=" + mark + "]";
	}
	
}

public class Student implements Comparator<Marks> {
	
	@Override
	public int compare(Marks o1, Marks o2) {
		// TODO Auto-generated method stub
		int result=o1.subject.compareTo(o2.subject);
		if(result==0)
			return 0;
			else if(result<0)
				return -1;
			else
				return 1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Marks> li= new ArrayList <>();
		li.add(new Marks("Tamil",92));
		li.add(new Marks("Maths",95));
		li.add(new Marks("English",90));
		li.add(new Marks("Science",91));
		
		Collections.sort(li,new Student());
		for(Marks det:li) {
			System.out.println(det);
		}
		
	}

}
