package futbol;


public abstract class Futbolista implements Comparable{
	private String nombre;
	private int edad;
	final private String posicion;
	
	public Futbolista(String nombre, int edad, String posicion) {
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
		
	}
	
	public Futbolista() {
		this("Maradona", 30, "delantero");
	}
	
	public String toString() {
		return "El futbolista " + nombre + " tiene " + edad + ", y juega de " + posicion;
		
	}
	
	public boolean equals(Futbolista f) {
		if (this.nombre == f.nombre && this.edad == f.edad && this.posicion == f.posicion) {
			return true;
			
		}
		else {return false;}
	}
	public int getEdad() {
		return edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getPosicion() {
		return posicion;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract boolean jugarConLasManos();
	
	

}
