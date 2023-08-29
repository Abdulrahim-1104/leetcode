package leetCode;

public class removeElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {0,1,2,2,3,0,4,2};
		int val = 2;
		int count=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]==val) {
				continue;
			}
			num[count++]=num[i];
		}
		System.out.println(count);
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}

	}

}
