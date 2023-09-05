package streams;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class criandoStreams {

	public static void main(String[] args) {
		
		//Consumer é uma interface que recebe um parâmetro e não retorna nada, por isso foi utilizado abaixo 
		Consumer<String> print = System.out::print; //a ideia é diminuir o código
		// lembrando que a função 'System.out::print' é utilizada em um foreach
		
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
/* Stream.of é um método estático de Stream
   permite criar um Stream a partir de:
    	- elementos individuais;
    	- um conjunto de elementos(composição) passados como argumentos. 
   Em outras palavras, você pode usar Stream.of() para criar um fluxo de elementos sem precisar de uma coleção pré-existente.
*/
		langs.forEach(print);
		
		String[] maisLangs = {"Python ","Lisp ","Perl ","Go\n ",};	
//'.of'(método estático) criou um Stream a partir da variável 'maisLangs'
// '.forEach é um método da INSTANCIA, então só pode ser chamado após um objeto já criado e serve para ITERAÇÃO
		Stream.of(maisLangs).forEach(print);
// lembre::::::::::>>> a classe Arrays também possui método estático stream() que transforma um array em objeto tipo Stream
		Arrays.stream(maisLangs).forEach(print);
		// a Classe Arrays possui mais parâmetros, após a vírgula vc pode especificar o indice, no caso abaixo foi do 1 até 3
		// python está no índice 0, então só vai entrar Lisp e Perl, porque o Go está no índice 3, mas o índice 3 não entra
		Arrays.stream(maisLangs, 1, 3).forEach(print);
	}		
}
