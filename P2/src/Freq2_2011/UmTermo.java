package Freq2_2011;

public class UmTermo implements Termo{
	
	double coef;
	int grau;
	
	public UmTermo(double x){
		coef = x;
		grau = 0;
	}
	
	public UmTermo(double c, int g){
		coef = c;
		grau = g;
	}
	
	public String toString(){
		return coef + "x^" + grau;
	}
	
	public double coef(){
		return coef;
	}
	
	public int grau(){
		return grau;
	}

	@Override
	public double value(double v) {
		return coef*Math.pow(v, grau);
	}

	@Override
	public UmTermo add(Termo x) {
		if(x.grau()==grau){
			return new UmTermo(coef+x.coef(),grau);
		}
		else{
			throw new IlegalTermException("Termos de grau diferente");
		}
	}

	@Override
	public Termo mult(Termo y) {
		
		return new UmTermo(coef*y.coef(), grau+y.grau());
		
	}

	@Override
	public Termo derivada() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
	
}
