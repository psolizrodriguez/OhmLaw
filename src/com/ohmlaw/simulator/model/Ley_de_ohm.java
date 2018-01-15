package com.ohmlaw.simulator.model;

public class Ley_de_ohm {
	private double intensidad, voltaje, resistencia;
	private int tipo_de_led;
	double[] led;

	public Ley_de_ohm() {
		intensidad = voltaje = resistencia = 0;
		tipo_de_led = 0;
		led = new double[4];
		led[0] = 1;
		led[1] = 2;
		led[2] = 3.4;
		led[3] = 4.6;
	}

	public void CalcularIntensidad() {
		intensidad = (voltaje - led[tipo_de_led]) / resistencia;
		if (intensidad < 0) {
			intensidad = 0;
		}
	}

	public int Luz() {
		CalcularIntensidad();
		int nivel = 1;
		double valor = 0.004;
		double valorant = 0;
		if (tipo_de_led == 0) {
			valor = 0.002;
			valorant = 0;
		}
		double incremento = valor;
		for (int i = 1; i < 11; i++) {
			if (intensidad >= valorant && intensidad <= valor) {
				nivel = i;
			}
			valorant = valor;
			valor = valor + incremento;
		}
		if (intensidad > valorant) {
			nivel = 11;
		}
		if (voltaje == 0) {
			nivel = 1;
		}
		return nivel;
	}

	public int Voltaje() {
		int ideal = 0;
		double intend = 0;
		double resultado = 0;
		if (tipo_de_led == 0) {
			intend = 0.02;
		} else {
			intend = 0.04;
		}
		resultado = led[tipo_de_led] + (resistencia * intend);
		ideal = (int) resultado;
		return ideal;
	}

	public int Resis() {
		int ideal = 0;
		double intend = 0;
		double resultado = 0;
		if (tipo_de_led == 0) {
			intend = 0.02;
		} else {
			intend = 0.04;
		}
		resultado = (voltaje - led[tipo_de_led]);
		if (resultado < 0) {
			resultado = 0;
		}
		resultado = resultado / intend;
		ideal = (int) resultado;
		double la = (voltaje - led[tipo_de_led]) / ideal;
		if (la > intend) {
			ideal = ideal + 1;
		}
		if (ideal < 0) {
			ideal = 0;
		}
		return ideal;
	}

	public void setIntensidad(double intensidad) {
		this.intensidad = intensidad;
	}

	public double getIntensidad() {
		return intensidad;
	}

	public void setVoltaje(double voltaje) {
		this.voltaje = voltaje;
	}

	public double getVoltaje() {
		return voltaje;
	}

	public void setResistencia(double resistencia) {
		this.resistencia = resistencia;
	}

	public double getResistencia() {
		return resistencia;
	}

	public void setTipo_de_led(int tipo_de_led) {
		this.tipo_de_led = tipo_de_led;
	}

	public int getTipo_de_led() {
		return tipo_de_led;
	}
}