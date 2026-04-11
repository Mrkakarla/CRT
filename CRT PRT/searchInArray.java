import java.util.*;
class searchInArray{
    public static void main(String args[]){
    boolean flag=false;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Size :");
    int size=sc.nextInt();
    int array[]=new int[size];
    System.out.println("Enter into array :");
    for(int i=0;i<size;i++){
        array[i]=sc.nextInt();
    }
    System.out.println("Enter Element to Search");
    int search=sc.nextInt();
    for(int i=0;i<size;i++){
        if(array[i]==search){
        System.out.print("Element Found at index :"+(i+1));
        flag=true;
        }
    }
    if(flag==false){
        System.out.print("Element not Found");
    }
    

}
}