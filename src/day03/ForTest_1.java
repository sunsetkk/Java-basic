package day03;

public class ForTest_1 {
	public static void main(String[] args) {
		int num = 0;
		
		while(num != 10) {
			System.out.print(++num+" ");
		}
		System.out.println();
		
		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
		}
		
		//20�� �ݺ�
		for (int i = 0; i < 40; i+=2) {
			
		}
		
		//100���� -3�� �ϸ� 13��
		//�ݺ�Ƚ�� = (����-�ʱⰪ)/������
		for(int i = 100; i > 61; i-=3) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//2���� 26���� 2�� ����
		for (int i = 2; i < 28; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		//for���� �ᱹ ���ǽ��� ���ϵ��� �ݺ��̴�.
		//�ʱ��, ���ǽ�, �������� �� ������ ����
		//���ǽ��� ������ �� ���ѹݺ�
//		for(;true;) {
//			
//		}
		
//		"for" �ۼ� �� �ڵ��ϼ�
		for (int i = 0; i < args.length; i++) {
			
		}
		
		
	}
}