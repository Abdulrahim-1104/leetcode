package leetCode;
import java.util.*;

public class pascalTriangle {
	static List<String> solution(String[] inputArray) {
		List<String> list = new ArrayList<>();
		int max=0;
		for(int i=0;i<inputArray.length;i++)
		{
		    if(inputArray[i].length()>max){
		        max=inputArray[i].length();
		        list.removeAll(list);
		    }
		    if(inputArray[i].length()==max) {
		        list.add(inputArray[i]);
		    }
		}
//		String[] namesArray = list.toArray(new String[0]);  
//		return namesArray;
		return list;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> list = new ArrayList<>();
//		list.add(1);
//		list.add(1);
//		list.add(1);
//		list.add(1);
//       System.out.println(list);
//       list.removeAll(list);
//       System.out.println(list);
String[] list= {"aba","aa","ad","vcd","aba"};
       System.out.println(solution(list));
       String str="baaaadf";
       str=str.substring(0, 2)+str.substring(3,7);
       System.out.println(str);
    		   str=str.replace("a", "");
      boolean bool= str.contains("s");
      System.out.println(str);
      System.out.println(bool);
	}

}
