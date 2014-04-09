
package Teste_10_04_2012;

public class SMS {
	private int tlm, destino;
	private String texto;
	
	public SMS(){
		tlm=0;
		destino=0;
		texto="";
	}
	
	//1
	//a)
	public SMS(int n, int d, String t){
		this.tlm=n;
		this.destino=d;
		if(t.length()>160)
			this.texto=t.substring(0, 160);
		else
			this.texto=t;
	}
	
	//b)
	//i)
	public int getDestino(){
		return destino;
	}
	
	public String getTexto(){
		return texto;
	}
	
	//ii
	public void setTexto(String t){
		if(t.length()>160)
			this.texto=t.substring(0, 160);
		else
			this.texto=t;
	}
	
	//iii
	public String toString(){
		return "DE: "+tlm+"\n"+"PARA: "+destino+"\n"+texto;
	}
	
	//iv
	public int size(SMS s){
		return s.getTexto().length();
	}
	
	//v
	public boolean equals(Object x){
		if(this==x) return true;
	    if((x==null)||(x.getClass()!=this.getClass())) return false;
	    SMS s=(SMS) x;
	    return s.getDestino()==destino && s.getTexto().equals(texto);
	}
	
	//vi
	public SMS clone(){
		return new SMS(tlm,destino,texto);
	}
	
	public static void main (String[] args){
		SMS s = new SMS(963861650,962222222,"Ola");
		System.out.println(s);
	}
}
    