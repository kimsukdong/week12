package week12;
public class Km2Mile extends Converter {
	public Km2Mile(double ratio) {
		this.ratio = ratio;
	}
	
	@Override
	protected double convert(double src) {
		return src/ratio;
	}

	@Override
	protected String srcString() { return "Km"; }

	@Override
	protected String destString() { return "mile"; }
	
	public static void main(String args[]) {
		Km2Mile toMile = new Km2Mile(1.6); // 1마일은 1.6Km
		toMile.run();
	}
}