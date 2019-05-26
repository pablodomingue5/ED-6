package practica6;
/**
 * 
 * @author PABLO
 * @version 1.2
 */
public class Coche {
	String matricula;
	String atrib;
	String modelo;
	String fabricante;
	
	public Coche() {
		matricula = "";
		atrib = "";
		modelo = "";
		fabricante = "";
	}
	
	public Coche(String m, String c, String mo, String f) {
		matricula = m;
		atrib = c;
		modelo = mo;
		fabricante = f;
	}
	/**
	 * 
	 * @return Devuelve El número de la matrícula del coche seleccionado y una pequeña descripción del mismo
	 */
	public String metodo1() { //Aplicada la refactorizacion
		String resultado = "El coche con matricula " + matricula + " ";
		switch(atrib) {
		case "Gasolina":
		resultado += metodoA(modelo, fabricante);
		break;
		case "Diesel":
		resultado += metodoB(modelo, fabricante);
		break;
		case "Híbrido":
			resultado += metodoC(modelo, fabricante);
		break;
		default:
		resultado += "no dispone de información";
		break;
		}
		return resultado;
	}
	
	/**
	 * 
	 * @param modelo3 Variable recogida de el modelo seleccionado 
	 * @param fabricante3 Variable recogida de el fabricante seleccionado
	 * @return
	 */
	public String metodoC(String modelo3, String fabricante3) {
		String resultado="es un "+fabricante3+" "+modelo3+" y no necesita combustible.";
		return resultado;
	}
	/**
	 * 
	 * @param modelo2 Variable recogida de el modelo seleccionado
	 * @param fabricante2 Variable recogida de el fabricante seleccionado
	 * @return
	 */
	public String metodoB(String modelo2, String fabricante2) {
		String resultado="es un "+fabricante2+" "+modelo2+" y gasta 1,052 euros por litro.";
		return resultado;
		
	}
	/**
	 * 
	 * @param modelo Variable recogida de el modelo seleccionado
	 * @param fabricante Variable recogida de el fabricante seleccionado
	 * @return
	 */

	public String metodoA(String modelo, String fabricante) {
		String resultado="es un "+fabricante+" "+modelo+" y gasta 1,337 euros por litro.";
		return resultado;
	}
}
