package FilaDeEspera;

public class Main {

	public static void main(String[] args) {

		System.out.println("\n-==Fila 1==-\n");
		
		Fila f1 = new Fila(4);
		f1.add("Bruno");
		f1.add("Marcia");
		f1.add("Diogo");
		f1.add("Jorge");
		f1.remove();
		f1.getAl();
		f1.isFull();
		
		System.out.println("\n-==Fila 2==-\n");
		
		Fila f2 = new Fila(2);
		f2.add("TESTE");
		f2.getAl();
		f2.isFull();

	}

}
