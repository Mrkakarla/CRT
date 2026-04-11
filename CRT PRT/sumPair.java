import java.util.*;
class sumPair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        System.out.println("Enter into array");
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }   
        for(int i=0;i<size;i++){
            for(int j=1;j<size;j++){
                if(j>i){
                    System.out.print("  "+(array[i]+array[j] ));
                }
                System.out.print(" ");
            }
               System.out.println("   ");
        }
        
        
    }
}