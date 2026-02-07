//we have a question that last code we only done gratest of two numbers ,in this code we do gratest of three numbers by using a if else and else-if..
class Conditional
{
  public static void main(String args[])
  {
    // we taken a three variable are a,b,c..
    int a=121;
    int b=441;
    int c=882;

    if( a>b && a>c)
    {
      System.out.println( a + " is grater then " +b + " and " +  c);

    }
    else if(b>a && b>c)// by using else-if condition we can do this ....
    {
      System.out.println( b + " is grater then " +a+" and " + c);
    }
    else
    {
      System.out.println(c +" is grater then "+b+" and " +c);
    }
  }
}