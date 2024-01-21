package herencias;

public class HoraExacta extends Hora {
	int segundo;

	HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);
		this.segundo = segundo;

	}

	void inc() {
		if (segundo >= 59) {
			this.minuto++;
			this.segundo = 0;
		} else {
			this.segundo++;
		}

		if (minuto >= 59) {
			this.hora++;
			this.minuto = 0;
		} else {
			this.minuto++;
		}

		if (hora > 23) {
			this.hora = 0;
		}

	}

	boolean comparar(int hora, int minuto, int segundo) {
		if (hora == this.hora && minuto == this.minuto && segundo == this.segundo) {
			return true;

		} else {
			return false;
		}
	}

	public String toString() {
		String horaCadena;
		horaCadena = (this.hora + " : " + this.minuto + " : " + this.segundo);

		return horaCadena;
	}
}
