package herencias;

public class Hora12 extends Hora {

	String meriadiano;

	Hora12(int hora, int minuto, String meridiano) {
		super(hora, minuto);
		this.meriadiano = meridiano;

	}

	void inc() {

		if (minuto == 59) {
			this.hora++;
			if (hora > 12) {
				this.hora = 1;
				if (this.meriadiano.equals("p.m.")) {
					this.meriadiano = "a.m.";
				} else {
					this.meriadiano = "p.m.";
				}
			}

			this.minuto = 0;
		} else {
			this.minuto++;
		}
	}

	public String toString() {

		String horaCadena;
		horaCadena = (this.hora + " : " + this.minuto + " " + this.meriadiano);

		return horaCadena;

	}

}
