package Viyaan;

import java.util.HashSet;

public class Removeduplicateshash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,2,4,3,5,6,4};
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {

			hs.add(a[i]);
	}
		for(int no:hs)
		{
			System.out.println(no+" ");
		}
	}

}
