//we have seen old switch which contain a break and some cases ..
// In the updated version(java 12 version) we come across three changes are..
// 1} Insted of break we use ->(arrow) key to replays..
// 2} We can use a switch as a expression also it return values..
// 3} Insted of -> key we can use a : (colan) with key word (yield)..
class Updated_Switch
{
  public static void main(String args[])
  {
    String day="Monday";
    String result=" ";
    result=switch(day)
    {
      case "Saturday","Sunday"-> "8 am";//result= "8 am";//System.out.println("wake up at 8 am..");
      case "Monday"-> "6 am";// result="6 am";//System.out.println("wake up at 6 am..");
      default-> "7:30 am";// result= "7:30 am";//System.out.println("wake up at 7:30 am...");
      
    };
    System.out.println(result);
  }

}// we have 3 types 1} is directly uses a by  using s,o,p..
// 2} by storing a data in one variable like result and print..
// 3} by returning a value in switch and print ..





