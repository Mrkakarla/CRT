import java.util.*;
class pow{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Size :");
    int size=sc.nextInt();
     System.out.println("Enter into array :");
        int array[]=new int[size];
        int pow[]=new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
            pow[i]=array[i]*array[i];
            System.out.print(pow[i]+" ");
        
}
}
}
