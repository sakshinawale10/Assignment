import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(55);
		a1.add(33);
		a1.add(78);
		
		List<Integer> a2 = new ArrayList();
		
		//a1.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		
	

    System.out.println(a1.stream().filter(n->n%2==0).collect(Collectors.toList()));
    
    List<String> names = Arrays.asList("Sakshi", "Om","Rutu","Advek","Sai","KSS");
    List<String> result =names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
    
System.out.println(result);  



     
	}

}
