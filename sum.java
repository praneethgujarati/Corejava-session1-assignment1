class sum
{
   public static void main(String args[])
   {
      int x,y,z;
      System.out.print("Enter first number:" );
      x=Integer.parseInt(System.console().readLine());
      System.out.print("Enter second number:");
      y=Integer.parseInt(System.console().readLine());
      z=x-(-y);
      System.out.println("The first number is:" +x);
      System.out.println("The second number is:" +y);
  
      System.out.println("The sum is:" +z );


    
   } 


}