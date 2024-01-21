package herencias;

public class Hora {

	int hora;
	int minuto;

	Hora(int hora, int minuto) {
		this.hora = hora;
		this.minuto = minuto;

	}

	void inc() {
		// TODO Auto-generated method stub

		if (minuto == 59) {
			this.hora++;
			if (hora > 23) {
				this.hora = 0;
			}

			this.minuto = 0;
		} else {
			this.minuto++;
		}

	}

	void setMinutos(int valor) {
		this.minuto = valor;
	}

	void setHora(int valor) {
		this.hora = valor;
	}

	@Override
	public String toString() {
		String horaCadena;
		horaCadena = (this.hora + " : " + this.minuto);

		return horaCadena;
	}

}
