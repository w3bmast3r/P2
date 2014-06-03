package Freq2_2011;

public interface Termo {

	double coef();
	int grau();
	double value(double v);
	Termo add(Termo x);
	Termo mult(Termo y);
	Termo derivada();
}
