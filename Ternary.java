// we have another operater called ternary operater which helps or shorten the code for some extent..
//when we use the if-else condition we are writing a code aurond 5 to 6 lines in this we can minimize the code ...
//let start..
class ternary
{
  public static void main(String args[])
  {
    //we are 1st we do in if-else after we do in ternary operator question is find the number is odd or even if that number is even add 10 else it odd add 20..
    //let do..
    int n=10;
    int result=0;
    int result_1=0;
    if(n%2==0)
    {
      result=10;
    } 
    else
    {
     result=20;
    }
    System.out.println(result);// see when we write a code using a if-else we use a around 10 lines ..
    //lets use a ternary operator and limit the line...
    result=n%2==0 ? 10:20;
    result_1=n%2==1 ? 40:45;
    System.out.println(result_1);// this also working ..
  }
}// this called as ternary operator