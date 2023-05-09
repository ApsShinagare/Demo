import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class array_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find value which is multiple by 2
		
		//String[] name= {"Aparna","Sonu","Ravi"};
		
		int[] arr1= {1,3,4,54,89,56,90,12,15};
		
		
		for(int i=0; i<arr1.length;i++)
		{
			if (arr1[i] % 2==0)
			{
				System.out.println(arr1[i] +"This value is multiple of 2");
				break;
			}
			else
			{
				System.out.println(arr1[i] +"This value is not multiple of 2");
			}
				
		}
		
		
		//*******ArrayList
		
		ArrayList<String> a= new ArrayList<String>();
		a.add("Aparna");
		a.add("Ravi");
		a.add("Karamare");
		a.add("Shinagare");

		//System.out.println(a.get(0));
		
		for(int i=0; i<a.size(); i++)
		{
			System.out.println(a.get(i));
		}
		
		System.out.println(a.contains("Aparna"));
		
		System.out.println("********Converting Array into ArrayList");
		
		
		String[] name= {"Aparna","Sonu","Ravi"};
		
		List<String>nameArrayList=Arrays.asList(name);
		System.out.println(nameArrayList.contains("Aparna"));
		
		///System.out.println(nameArrayList.add("Karamare"));
		
		//System.out.println(nameArrayList.get(3));
		
		
		
		
		
	}

}
