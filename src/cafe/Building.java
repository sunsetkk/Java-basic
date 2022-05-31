package cafe;

public class Building {
	public static void main(String[] args) {
		Banapresso yeoksam = new Banapresso();
		
		yeoksam.openCafe(new Cafe() {
			
			@Override
			public void sell() {
				System.out.println("손님에게 덤태기 씌우기");
			}
			
			@Override
			public void drip() {
				System.out.println("그래도 최서늘 다해 커피내리기");
			}
		});
	}
}
