package herencias;

public class PruebaHora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HoraExacta hora = new HoraExacta(23, 59, 59);
		System.out.println(hora.toString());

		hora.inc();
		System.out.println(hora.toString());
	}

}
