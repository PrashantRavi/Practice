package arrays;

import java.util.ArrayList;
import java.util.List;

public class MergeInterval {

	public static void main(String[] args) {
		Interval i1=new Interval(1,3);
		Interval i2=new Interval(2,6);
		Interval i3=new Interval(8,10);
		Interval i4=new Interval(15,18);
		List<Interval>intervals=new ArrayList<Interval>();
		intervals.add(i1);
		intervals.add(i2);
		intervals.add(i3);
		intervals.add(i4);
		for(int i=0;i<intervals.size();i++){
			System.out.println(intervals.get(i).start+"  "+intervals.get(i).end);
		}

	}

}

class Interval{
	int start;
	int end;
	
	public Interval(int start,int end){
		this.start=start;
		this.end=end;
	}
}
