package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	
	public String toString() {
		return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() + " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos;
	}
	
	public int compareTo(Object f) {
		int diferencia = this.golesRecibidos - ((Portero)f).golesRecibidos;
		if (diferencia < 0) {
			return (diferencia*-1);
		}
		else {return diferencia;}
	}
	
	public boolean jugarConLasManos() {
		return true;
	}
}
