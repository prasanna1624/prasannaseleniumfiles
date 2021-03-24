package Viyaan;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {3,2,5,4,3,2,4};
for(int i=0;i<a.length-1;i++) {
	for(int j=i+1;j<a.length;j++)
	{
		if((a[i]==a[j])&(i!=j))
		{
			System.out.println(a[i]+" ");
		}
	}
}
	}

}
