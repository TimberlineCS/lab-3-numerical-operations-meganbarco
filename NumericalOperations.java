/*
Megan Barco
P.2
9/3/2020
*/
public class NumericalOperations{
  public static void main(String args[]){
      //challenge 1 - math
      double d1 = 37.9;
      double d2 = 1004.128;
      int i1 = 12;
      int i2 = 18;
      
      System.out.println(57.2 * (i1/i2) + 1);
      System.out.println(57.2 * ((double)i1/i2)+1);
      System.out.println(15 - i1* (d1*3)+4);
      System.out.println(15 - i1* ((int)d1*3)+4);

      //challenge 2 - backward numbers
      double n1= 3455;
      double lastNumber1=((int)n1%10);
      n1=((int)(n1/10));
      double thirdNumber1=((int)n1%10);
      n1=((int)(n1/10));
      double secondNumber1=((int)n1%10);
      n1=((int)(n1/10));
      double firstNumber1=((int)n1%10);
      System.out.println(((int)(lastNumber1)) + "" + ((int)(thirdNumber1)) + "" + ((int)secondNumber1) + "" + ((int)(firstNumber1)));

      double n2= 6789;
      double lastNumber2=((int)n2%10);
      n2=((int)(n2/10));
      double thirdNumber2=((int)n2%10);
      n2=((int)(n2/10));
      double secondNumber2=((int)n2%10);
      n2=((int)(n2/10));
      double firstNumber2=((int)n2%10);
      System.out.println(((int)(lastNumber2)) + "" + ((int)(thirdNumber2)) + "" + ((int)secondNumber2) + "" + ((int)(firstNumber2)));

      double n3= 1080;
      double lastNumber3=((int)n3%10);
      n3=((int)(n3/10));
      double thirdNumber3=((int)n3%10);
      n3=((int)(n3/10));
      double secondNumber3=((int)n3%10);
      n3=((int)(n3/10));
      double firstNumber3=((int)n3%10);
      System.out.println(((int)(lastNumber3)) + "" + ((int)(thirdNumber3)) + "" + ((int)secondNumber3) + "" + ((int)(firstNumber3)));
  }
}