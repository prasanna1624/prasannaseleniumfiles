package Viyaan;

import java.util.HashMap;
import java.util.Map.Entry;




public class Hmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> hm=new HashMap<Integer,String>();
hm.put(1,"java");
hm.put(2,"c");
hm.put(3,"ruby");
hm.put(4, "c++");
System.out.println(hm.get(1));
System.out.println(hm.get(5));
for(Entry m:hm.entrySet())
{
	System.out.println(m.getKey()+" "+m.getValue());
}
hm.remove(3);
System.out.println(hm);
HashMap<Integer,Employee> emp=new HashMap<Integer,Employee>();
Employee e1=new Employee("tom",25,"qa");
Employee e2=new Employee("tony",26,"dev");
Employee e3=new Employee("tor",27,"admin");
emp.put(1, e1);
emp.put(2, e2);
emp.put(3, e3);
//traverse the Hashmap
for(Entry <Integer,Employee> m:emp.entrySet())
{
	int key=m.getKey();
	Employee e=m.getValue();
	System.out.println("Employee"+key+"info");
	System.out.println(e.name +" "+ e.age+" "+e.branch);
	
	
}


	}

}

