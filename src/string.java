
public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//literal
		String s="Welcome";
		String s1="Welcome";
		String s3="aparna";
		
		//New
		
		String  s4 =new String("Aparna Shinagre");
		String s5=new String("Ravi");
		
		//
		String ss="Aparna Mohan Shinagare";
		String[] sstring=ss.split(" ");
		
		System.out.println(sstring[0]);
		System.out.println(sstring[1]);
		System.out.println(sstring[2]);
		
		//print the single characters of string
		
		for(int i=0; i<s5.length(); i++)
		{
			System.out.println(s5.charAt(i));
			
		}

	///Revrse string 
		
		for (int i=s5.length()-1; i>=0; i--)
			
		{
			System.out.println(s5.charAt(i));
	
		}
	
	}
	
	
	

}
