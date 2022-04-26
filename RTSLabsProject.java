import java.util.Map;

public class RTSLabsProject {
	
	public static Map<String,Integer> aboveBelow(Integer[] list, int compare){
		//for this exercise I assumed we should not sort the list
		//initialize counts
		int abovecount = 0;
		int belowcount = 0;
		//linear search through the list, increment the counters
		for(int i = 0; i<list.length; i++) {
			if(list[i] > compare) {
				abovecount += 1;
			} else if (list[i] < compare) {
				belowcount += 1;
			}
		}
		
		return Map.of("above",abovecount,"below",belowcount);		
	}
	
	public static String stringRotation(String base, int shift) {
		//base case
		if(base.isEmpty()) return "";
		//if shift > the length of the word, reduce using mod to find how much the word wraps around
		if(shift > base.length()) shift = shift % base.length();
		
		return base.substring(base.length()-shift)+base.substring(0, base.length()-shift);
		
	}
	public static void main(String[] args) {
		//Print statements to check that functions are outputing the correct values
		Integer[] list = {1, 5, 2, 1, 10};
		System.out.println(aboveBelow(list,2));
		System.out.println(aboveBelow(list,10));
		System.out.println(aboveBelow(list,8));
		
		System.out.println(stringRotation("MyString",2));
		System.out.println(stringRotation("MyString",10));
		System.out.println(stringRotation("MyString",8));
		System.out.println(stringRotation("MyString",0));
	}

}
