package adobe_prepare;
//Java program to Reverse a String using swapping
//of variables
import java.lang.*;
import java.io.*;
import java.util.*;

//Class of ReverseString
class ReverseString
{
 public static void main(String[] args)
 {
     String input = "Geeks For Geeks";
     char[] temparray = input.toCharArray();
     int left, right=0;
     right = temparray.length-1;

     for (left=0; left < right ; left++ ,right--)
     {
         // Swap values of left and right
         char temp = temparray[left];
         temparray[left] = temparray[right];
         temparray[right]=temp;
     }

     System.out.println(new String(temparray));
 }
}