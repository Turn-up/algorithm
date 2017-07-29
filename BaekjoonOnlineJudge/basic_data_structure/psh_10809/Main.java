package psh_10809;
/**
 *문제
 *알파벳 소문자로만 이루어진 단어 S가 주어진다. 
 *각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
 *
 *입력
 *첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
 **/
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String inputValue = in.nextLine();
      char[] castInputValue = inputValue.toCharArray();
      char[] alpha = new char[26];
      int[] result = new int[26];

      for (int i = 0; i < 26; i++) {
         alpha[i] = (char)('a' + i);
         result[i] = -1;
      }

      int count = inputValue.length();
      for (int i = 0; i < 26; i++) {
         for (int j = 0; j < count; j++) {
            if (castInputValue[j] == alpha[i] && result[i] == -1) 
               result[i] = j;
         }
      }
      
      for (int temp : result) {
         System.out.print(temp + " ");
      }
   }
}