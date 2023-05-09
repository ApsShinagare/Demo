
public class Data_Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int Num=100;
		double  desc=1.3;
		 char letter='r';
		 String my_word="My first java Program";
		 
		 System.out.println(Num);
		 System.out.println(desc+"This is descimal value");
		 System.out.println(my_word);
		 
		//Defing array 1st method 
		 int[] arr=new int[5];
		 arr[0]=34;
		 arr[1]=4;
		 arr[2]=5;
		 arr[3]=6;
		 arr[4]=46;
		 
		 System.out.println(arr[1]);
		 System.out.println(arr[2]);
		 
		 //**2ed Method**
		 
		 int[]arr1= {12,34,45,67,89,90};
		 System.out.println(arr1[2]);
		 System.out.println(arr1[1]);
		 
		 //for loop
		 
		/* for (int i=0; i<arr.length; i++)
		 {
			 System.out.println(arr[i]);
		 }*/
			 
		
		 
		 for(int i=0; i<arr1.length; i++)
		 {
			 if(arr1[i]%2 ==0)
			 {
				 System.out.println(arr1[i] +"This no  is  divisible by 2");		 
			 }
			 else
				 
			 {
				 System.out.println(arr1[i] );	
			 }
		 }
		 
		 
		 //string array
		 
		/* String[] name= {"Aparna","Ravi","Sonu"};
		 
		 for(int s=0; s<name.length; s++)
		 {
			 System.out.println(name[s]);
		 } */

	
	
	
	}
	
	
	

}
