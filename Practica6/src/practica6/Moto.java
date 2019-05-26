package practica6;
/**
 * 
 * @author PABLO
 * @version 1.0
 */
public class Moto {
	String matricula;
	int cilindrada;

	public Moto() {
		matricula = "";
		cilindrada = 0;
	}

	/**
	 * 
	 * @param m matricula de la moto
	 * @param c cilindrada de la moto
	 */
	public Moto(String m, int c) {
		matricula = m;
		cilindrada = c;
	}
	
	/**
	 * 
	 * @return Devuelve la matricula de la moto
	 */

	public String getMatricula() {
		return matricula;
	}

	/**
	 * 
	 * @return Devuelve la cilindrada de la moto
	 */
	public int getCilindrada() {
		return cilindrada;
	}
	/**
	 * 
	 * @param m atributo matricula
	 */
	public void setMatricula(String m) {
		matricula = m;
	}

	/**
	 * 
	 * @param c atributo cilindrada
	 */
	public void setCilindrada(int c) {
		cilindrada = c;
	}
}
