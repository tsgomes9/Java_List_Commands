package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Luffy");
		names.add("Zoro");
		names.add("Sanji");
		names.add("Nami");
		names.add("Chopper");
		
		System.out.println(names.size());
		
		//System.out.println(names);
		
		for(String n : names) {
			System.out.println(n);
		}
		
		System.out.println("-----------------------");
		
		names.remove(2);
		names.remove("Pedro");
		names.removeIf( n -> n.charAt(0) == 'C');
		
		System.out.println(names.size());
		
		System.out.println(names);
		
		System.out.println("-----------------------");
		
		List<String> filterNames = names.stream().filter(n -> n.charAt(0) == 'L').collect(Collectors.toList());
		
		System.out.println(filterNames);
		
		System.out.println("-----------------------");
		
		String filterName = names.stream().filter(n -> n.charAt(0) == 'Z').findFirst().orElse(null);
		
		System.out.println(filterName);

	}

}
