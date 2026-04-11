import java.util.*;
class sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        System.out.println("Enter into array");
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }   
       
        for(int i=0;i<size;i++)
              sum+=array[i];
            
            
        System.out.print(sum);
        

        
        
    }
}