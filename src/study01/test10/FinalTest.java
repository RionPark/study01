package study01.test10;

class FinalFather{
	
}
public class FinalTest extends FinalFather{
	final int num = 1;
	
	public static void main(String[] args) {
		FinalTest ft = new FinalTest();
		System.out.println(ft instanceof FinalTest);
		System.out.println(ft instanceof FinalFather);
		System.out.println(ft instanceof Object);
		FinalFather ff = new FinalTest();
		
		System.out.println(ff instanceof FinalTest);
		
		ff = new FinalFather();
		if(ff instanceof FinalTest) {
			ft = (FinalTest) ff;
		}
		System.out.println(ff instanceof FinalTest);
	}
}
