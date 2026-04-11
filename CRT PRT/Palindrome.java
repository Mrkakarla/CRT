import java.util.*;
public class Palindrome
{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String m=sc.nextLine();
        m=m.toUpperCase();
	    int left=0;
	    int right=m.length()-1;
	    boolean isPailndrome=true;
	    
	    while(left<=right){
	        if(m.charAt(left)!=m.charAt(right)){
	            
	            isPailndrome=false;
	            
	        }
	        else{
	            left++;
	            right--;
	        }
	    }
	    
	    if(isPailndrome==true){
		System.out.println("True");
	    }else{
		System.out.println("False");

}
}
}