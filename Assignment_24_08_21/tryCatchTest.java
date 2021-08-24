package Assignment_24_08_21;

public class tryCatchTest {
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println(i);
				if(i%5==0) {
					continue;
				}
				try {
					System.out.println(i);
					if(i%3==0) {
						continue;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}finally {
					System.out.println("Inner");
				}
			}catch (Exception e) {
				// TODO: handle exception
			} finally {
				// TODO: handle finally clause
				System.out.println("Outer");
			}
		}
	}

}
