import java.util.Arrays;
public class Palindrome{
public static boolean palindromefunction(int [] array){
  int i = 0;
 int j = array.length - 1;
while(i < j){
 if (array[i] != array[j]){
return false;
}
   i++;
   j--;
}
return true;
}

public static void main(String...args){
int [] number= {1,1,1,1,1};
System.out.println(palindromefunction(number));
}
}