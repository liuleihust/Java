package cn.itcast_04;

import java.util.Arrays;

/*
 * ���ַ����е��ַ���������
 *��������dacgebf��
 *�������abcdefg��
 */
public class ArrayDemo {
	public static void main(String[] args) {
		// �����ַ���
		String s = "dacgebf";

		// ���ַ���ת���ַ�����
		char[] chs = s.toCharArray();

		// ���ַ������������
		Arrays.sort(chs);

		// ���������ַ�����ת���ַ���
//		String result = String.valueOf(chs);
		String result =new String(chs);
System.out.println(result);
		int[] arry = {0,3,2,1,5};
//  	String s1 = Arrays.toString(arry);
//		String s1=String.valueOf(arry);
//		System.out.println(arry+"");
	}

//	public static void bubbleSort(char[] chs) {
//		for (int x = 0; x < chs.length - 1; x++) {
//			for (int y = 0; y < chs.length - 1 - x; y++) {
//				if (chs[y] > chs[y + 1]) {
//					char temp = chs[y];
//					chs[y] = chs[y + 1];
//					chs[y + 1] = temp;
//				}
//			}
//		}
//	}
}
