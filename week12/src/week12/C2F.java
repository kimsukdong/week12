package week12;

public class C2F extends Converter {
	@Override
	protected double convert(double src) {
		return ((9.0/5)*src + 32);
	}

	@Override
	protected String srcString() { return "섭씨온도"; }

	@Override
	protected String destString() { return "화씨온도"; }
	
	public static void main(String args[]) {
		C2F toF = new C2F(); 
		toF.run();
	}
}
