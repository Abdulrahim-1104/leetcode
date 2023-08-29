package leetCode;

import java.util.Arrays;

public class minesweeper {
public static int[][] solution(boolean matrix[][]){
	int result[][]=new int[matrix.length][matrix[0].length];
	for(int i=0;i<matrix.length;i++) {
		for(int j=0;j<matrix[0].length;j++) {
			int count=0;
			//north
			if(i-1>=0 && matrix[i-1][j]==true) count++;
			//south
			if(i+1<matrix.length && matrix[i+1][j]==true) count++;
			//west
			if(j-1>=0 && matrix[i][j-1]==true) count++;
			//east
			if(j+1<matrix[0].length && matrix[i][j+1]==true) count++;
			//northEast
			if(i-1>=0 && j+1<matrix[0].length && matrix[i-1][j+1]==true) count++;
			//northWest
			if(i-1>=0 && j-1>=0 && matrix[i-1][j-1]==true)count++;
			//southWest
			if(i+1<matrix.length &&  j-1>=0 && matrix[i+1][j-1]==true)count++;
			//southEast
			if(i+1<matrix.length && j+1<matrix[0].length &&matrix[i+1][j+1]==true)count++;
			result[i][j]=count;
		}
	}
	return result;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      boolean arr[][]= {{false, false, false},
                    {false,false, false},
                    {false, false, false}};
      System.out.println(Arrays.deepToString(solution(arr)));
	}

}
