package lab_eleven;

public class Labeleven {

public static void main(String[] args) {
		// TODO Auto-generated method stub


import java.util.Scanner;

public class LabProgram {
   
   public static int fibonacci(int n) {
if(n<0){
   return -1;}
   else if(n==0){
      return 0;}
      else if (n==1){
         return 1;}
         else{
            int firstNum=0;
            int secondNum =1;
            int atNum=-1;
            for (int i=2;i<=n;i++){
               atNum=firstNum+secondNum;
               
               firstNum=secondNum;
               secondNum=atNum;}
               return atNum;}
}
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int startNum;
      
      startNum = scnr.nextInt();
      System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
   }
}