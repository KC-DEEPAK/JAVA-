class Arithematic
{
  public static void main(String args[])
  {
    int num1=5;
    int num2=4;
    int result1= num1 + num2;
    int result2= num1 - num2;
    int result3= num1 * num2;
    int result4= num1 / num2;
    int result5= num1 % num2;
    System.out.println(result4);
    int num3=2;
    //num3=num3+2; we can do this type also
    //num3+=2;//another method to do the increment
   // System.out.println(num3);
    // we have a increment operators are pre increment ,post increment same for decrement..
    num3++;//post increment operation
    num3--;//post decrement operation
    ++num3;//pre increment operation..
    --num3;//pre decrement operation..
    int num4=5;
    int result=++num4;//this it do 1st increment after featch the data...This is pre increment..
    int result_1=num4++;//this is 1st featch the data after it increment .. This is post increment 
    int result_2=--num4;// this is a pre decrement operation..
    System.out.println(result_2);
  }
}