package week12;

public class Won2Dollar extends Converter{

	public Won2Dollar(double ratio) {
		this.ratio = ratio;
	}
	
	@Override
	protected double convert(double src) {
		return src/ratio;
	}

	@Override
	protected String srcString() { return "원"; }

	@Override
	protected String destString() { return "달러"; }
	
	public static void main(String args[]) {
		Won2Dollar toDollar = new Won2Dollar(1200); // 1달러는 1200원
		toDollar.run();
	}
}