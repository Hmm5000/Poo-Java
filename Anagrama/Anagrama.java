package tarefa9;

import java.util.ArrayList;
import java.util.List;

public class Anagrama {

	public static boolean eAnagrama(String palavra, String palavra2) {
		palavra2=palavra2.toLowerCase();
		palavra1=palavra.toLowerCase();
		int conta=0;
		
		
		List<Caracter>listaA=new ArrayList<Caracter>();
		List<Caracter>listaB=new ArrayList<Caracter>();
		for(char c:palavra.replace(" ", "").toCharArray())
		{
			listaA.add(c);
		}
		for(char c:palavra2.replace(" ", "").toCharArray())
		{
			listaB.add(c);
		}
		return listaA.containsAll(listaB) && listaA.size()==listaB.size();
		
		
		
	}
	

}