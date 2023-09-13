package functionalInterfaces;
import java.util.function.Function;
public class FunctionInterface {

		public static void main(String args[]){
			Function<String,Integer> function = (str)->str.length();
			System.out.println(function.apply("Good Morning"));

			Function<String,String> function1 = (str)->str.toLowerCase();
			System.out.println(function1.apply("GOOD MORNING"));
		}
	}
