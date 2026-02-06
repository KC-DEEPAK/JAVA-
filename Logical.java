class Logical
{
  public static void main(String args[])
  {
    int x=3;
    int y=5;
    int a=2;
    int b=6;
    //boolean result= x<y && a<b;//THIS IS AND CONDITON
    boolean result= x>y || a<b;//THIS IS OR CONDITION.
    System.out.println(!result);//when we are using a ! it reverse a decision of the variable..
    boolean output=a>b || x>y && a<b;
    System.out.println(output);
    // In this we can understand that && this have a higher priority than || 
    // 1st && it  solve after || 
    boolean result_1=x>y && a<b || a>b;
    System.out.println(result_1);
  }
}