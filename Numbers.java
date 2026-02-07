import java.util.Scanner;
class Numbers{
	public static void main(String args[]){
		String s1="hello";
		String s2="Hello1";
		String s3="hi9";
		System.out.println(validate(s1));
		System.out.println(validate(s2));
		System.out.println(validate(s3));
	}
	static boolean validate(String s){
         if(s.length()<6){
         	return false;

         }
         if (!Character.isUpperCase(s.charAt(0))) {
            return false;
        }
        
        if (!Character.isDigit(s.charAt(s.length() - 1))) {
            return false;
        }
        return true;

	}
}
	
		
	
	
