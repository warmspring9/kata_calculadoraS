package cr.ac.cenfotec.cata;

public class CalculadoraHileras {

	public int add(String string) throws Exception {
		
		if(string.isEmpty()){
			return 0;
		}
		
		String[] numeros = string.split(",");
		
		if(numeros.length > 3) {
			throw new Exception("Too much parameters");
		}
		if(numeros.length == 2) {
			return Integer.parseInt(numeros[0])+Integer.parseInt(numeros[1]);
		} else {
			return Integer.parseInt(numeros[0])+Integer.parseInt(numeros[1])+Integer.parseInt(numeros[2]);
		}
		
	}

}
