class StringB{ 
  public static void main(String args[]){ 
    StringBuilder sb=new StringBuilder(); 
    System.out.println(sb.capacity());
    sb.append("Hello"); 
    System.out.println(sb.capacity()); 
    sb.append("java is my favourite language"); 
    System.out.println(sb.capacity()); 
    sb.ensureCapacity(10);
    System.out.println(sb.capacity()); 
    sb.ensureCapacity(50); 
    System.out.println(sb.capacity());
    
    System.out.println(sb);
    System.out.println(sb.insert(9,"TAta tata"));
    System.out.println(sb.reverse());
    System.out.println(sb);
    System.out.print(sb.delete(2,20));
    
    
  } }
