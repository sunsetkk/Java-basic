package cafe;

public class Building {
	public static void main(String[] args) {
		Banapresso yeoksam = new Banapresso();
		
		yeoksam.openCafe(new Cafe() {
			
			@Override
			public void sell() {
				System.out.println("�մԿ��� ���±� �����");
			}
			
			@Override
			public void drip() {
				System.out.println("�׷��� �ּ��� ���� Ŀ�ǳ�����");
			}
		});
	}
}
