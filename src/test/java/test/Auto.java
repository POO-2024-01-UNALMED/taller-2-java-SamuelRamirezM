package test;

public class Auto {
	String modelo;
	int precio;
	Asiento [] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
		
	int cantidadAsientos() {
		int cantAsientos = 0;
		for(int i = 0; i < asientos.length ; i++) {
			if(asientos[i] != null) {
				cantAsientos++;
			}
		}
		return cantAsientos;
	}
		
	String verificarIntegridad() {
		if(this.registro == this.motor.registro) {
			for(int i = 0 ; i < asientos.length ; i++) {
				if(asientos[i] != null && asientos[i].registro != registro) {
					return "Las piezas no son originales";
				}
			return "Auto original";
			}
		} else {
			return "Las piezas no son originales";
		}
	}
		
}
