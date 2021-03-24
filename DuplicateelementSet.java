package Viyaan;

import java.util.HashSet;
import java.util.Set;

public class DuplicateelementSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {3,2,4,3,5,2,6};
Set<Integer> s=new HashSet<>();
for(int no:a)
{
	if(s.add(no)==false)
	{
		System.out.println(no+" ");
	}
}
	}

}
