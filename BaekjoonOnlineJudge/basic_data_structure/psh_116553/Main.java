package psh_116553;

import java.util.Scanner;

/**
 * ����
 * ROT13�� ī�̻縣 ��ȣ�� �������� ���� ���ĺ��� 13���ھ� �о �����.
 * ���� ���, "Baekjoon Online Judge"�� ROT13���� ��ȣȭ�ϸ� "Onrxwbba Bayvar Whqtr"�� �ȴ�. 
 * ROT13���� ��ȣȭ�� ������ ���� �������� �ٲٷ��� ��ȣȭ�� ���ڿ��� �ٽ� ROT13�ϸ� �ȴ�. 
 * �տ��� ��ȣȭ�� ���ڿ� "Onrxwbba Bayvar Whqtr"�� �ٽ� ROT13�� �����ϸ� "Baekjoon Online Judge"�� �ȴ�.
 * ROT13�� ���ĺ� �빮�ڿ� �ҹ��ڿ��� ������ �� �ִ�. 
 * ���ĺ��� �ƴ� ���ڴ� ���� ���� �״�� ���� �־�� �Ѵ�. 
 * ���� ���, "One is 1"�� ROT13���� ��ȣȭ�ϸ� "Bar vf 1"�� �ȴ�.
 * ���ڿ��� �־����� ��, "ROT13"���� ��ȣȭ�� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է�
 * ù° �ٿ� ���ĺ� �빮��, �ҹ���, ����, ���ڷθ� �̷���� ���ڿ� S�� �־�����. S�� ���̴� 100�� ���� �ʴ´�.
 * 
 * */
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inputValue = in.nextLine();
		char[] castCharValue = inputValue.toCharArray();
		
		int count = inputValue.length();
		for (int i = 0; i < count; i++) {
			if ((castCharValue[i] >= 'A' && castCharValue[i] <= 'Z')) {
				System.out.print((castCharValue[i] = (char)(castCharValue[i] >= 'M' ? (castCharValue[i] - 13) : (castCharValue[i] + 13))));
			} else if ((castCharValue[i] >= 'a' && castCharValue[i] <= 'z' )){
				System.out.print((castCharValue[i] = (char)(castCharValue[i] >= 'm' ? (castCharValue[i] - 13) : (castCharValue[i] + 13))));
			}else{ 
				System.out.print(castCharValue[i]);
			}
		}
	}
}
