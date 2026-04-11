import java.util.*;
class maxVal{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Size :");
    int size=sc.nextInt();
    int array[]=new int[size];
    System.out.println("Enter into array :");
    for(int i=0;i<size;i++){
        array[i]=sc.nextInt();
    }
    Arrays.sort(array);
    System.out.println(array[size-1]);
}
}