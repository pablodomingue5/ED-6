package practica6;

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
}
