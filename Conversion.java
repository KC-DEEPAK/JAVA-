class Conversion
{
  public static void main(String args[])
  {
    int a=127;
    byte n=34;
    int z=n;//this is called as conversion which is automatically convert into byte
    byte k=(byte)a;// this conversion is called casting not conversion
    System.out.println(k);//when  we convert 
    System.out.println(n);
    float t=56.677f;
    int i=(int)t;
    System.out.println(i);// when we use the float and convert to int it loss the data after the decimal point..
    //then next we now that byte range up to 127 then we give a large value to the byte to convert lets try..
    // Example..
    int l=265;
    byte p=(byte)l; 
    System.out.println(p);
    // we have a another topic called TYPE PROMOTION which when we are multiple a two byte values  we get out of byte range
    //that why we use a type promotion to store  that result in integer 
    // EXAMPLE...
    byte j=23;
    byte f=12;
    int result = j * f;
    System.out.println(result);
  } 
}