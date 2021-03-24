package Viyaan;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateelementsHashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,2,5,4,3,2,6,3};
Map<Integer,Integer> hm=new HashMap<>();
for(int no:a)
{
	Integer count=hm.get(no);
	if(count==null) {
		hm.put(no,1);
	}
	else
	{
		count=count+1;
		hm.put(no,count);
	}
}
Set<Map.Entry<Integer,Integer>>es=hm.entrySet();
for(Map.Entry<Integer,Integer> me:es)
{
	if(me.getValue()>1)
	{
		System.out.println(me.getKey()+" ");
	}
}

	}

}
