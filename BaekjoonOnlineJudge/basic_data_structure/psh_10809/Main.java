package psh_10809;
/**
 *����
 *���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. 
 *������ ���ĺ��� ���ؼ�, �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��, ���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 *�Է�
 *ù° �ٿ� �ܾ� S�� �־�����. �ܾ��� ���̴� 100�� ���� ������, ���ĺ� �ҹ��ڷθ� �̷���� �ִ�.
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