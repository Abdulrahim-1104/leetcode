package leetCode;
import java.util.*;
import java.util.stream.Collectors;
public class strictlySequence {

static boolean solution(int[] sequence) {
	int dup[]=Arrays.copyOfRange(sequence, 0, sequence.length);
   Arrays.sort(dup);
   int max=dup[dup.length-1];
   int counting[]=new int[max+1];
   boolean bool=true;
   int count=0;
   counting[sequence[0]]++;
for(int i=1;i<sequence.length;i++) {
	counting[sequence[i]]++;
    if(sequence[i-1]>sequence[i] || counting[sequence[i]]>1){
        count++;
    }
}
if(count>1) {
	bool=false;
}
return bool;
}
static boolean sol(int[] sequence) {
	int count=0;
	int flag=0;
 for(int i=1;i<sequence.length;i++) {
	 int v1=sequence[flag];
	 int v2=sequence[i];
	 if(v1>=v2) {
		 count++;
	 }
	 else{
		 flag=i;
	 }
	 if(count>1) {
		 return false;
	 }
 }
 return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sequence[]= {10, 1, 2, 3, 4, 5};
		//List<Integer> list=Arrays.stream(sequence).boxed().collect(Collectors.toList());
		int a[]= {0,1,2,3};
		int b[]= {4,5,6};
		int c[]=new int[a.length+b.length];
		c=Arrays.copyOfRange(a, 0, a.length);
		c=Arrays.copyOfRange(b,0,4); 
		System.out.println(Arrays.toString(c));
		System.out.println(sol(sequence)); 

	}

}
