package leetCode;

public class find {
public static int binarySearch(int nums[],int target,int start,int end) {
	int mid=(nums.length-1)/2;
	int result=0;
	if(target>nums[mid]) {
		start=mid;
		end=nums.length-1;
	}
	else if(target<nums[mid]) {
		start=0;
		end=mid;
	}
	else {
		return mid;
	}
	for(int i=start;i<=end;i++) {
		if(nums[i]==target) {
      return i;
		}
		else if(nums[i]>target) {  
			result=i;
			break;
		}
	}
	if(target>nums[end]) {
	  result=end+1;
	}
	return result;
}
public static int binarysearch(int nums[],int target,int start,int end) {
int mid=(end+start)/2;
if(target>nums[mid]){
	return binarysearch(nums,target,mid,end);
}
else if(target<nums[mid]) {
	return binarysearch(nums,target,start,mid);
}
return mid;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,3,5,6};
		int target=7;
 System.out.println(binarySearch(nums,target,0,nums.length-1));
	}

}
