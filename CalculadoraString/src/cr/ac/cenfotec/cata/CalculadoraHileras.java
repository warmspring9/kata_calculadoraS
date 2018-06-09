package cr.ac.cenfotec.cata;

public class CalculadoraHileras {

	public int add(String string) throws Exception {
		
		if(string.isEmpty()){
			return 0;
		}
		
		String[] numeros = string.split(",");
		
		int total = 0;
		for(int i = 0;i<numeros.length;i++) {
			total += Integer.parseInt(numeros[i]);
		}
		return total;
	}

}
