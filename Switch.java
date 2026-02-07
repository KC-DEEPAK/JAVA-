// we have a switch operator in java which helps to identify by the case by case it is easy when compare to if-else...
//EXAMPLE is when user gives a 1 it should print a monday.. same for all the weeks ..
class Switch
{
  public static void main(String args[])
  {
    int num=5;

    switch(num)
    {
      case 1:
        System.out.println("its Monday..");
        break;
      case 2:
        System.out.println("its Tuesday..");
        break;
      case 3:
        System.out.println("its Wednesday..");
        break;
      case 4:
        System.out.println("its Thursday..");
        break;
      case 5:
        System.out.println("its Friday..");
        break;
      case 6:
        System.out.println("its Saturday..");
        break;
      case 7:
        System.out.println("its Sunday..");
        break;
      default:
        System.out.println("PLS ENTER A VALID NUMBER..");
    }
  }
}