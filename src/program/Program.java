package program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import entities.Studants;

;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		ArrayList<Studants> list = new ArrayList<>();
		final int MAX = 35;
		final int MIN = 20;
		
		System.out.println("Enter file full path:");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			//Turmas
			Set<Studants> a = new HashSet<>();
			Set<Studants> b = new HashSet<>();
			Set<Studants> c = new HashSet<>();
			
			//Passa os nomes dos arquivo para uma lista de arrays
			String line = br.readLine();
			while(line != null) {
				list.add(new Studants(line));
				line = br.readLine();
			}
			
			int limitClassABC = rd.nextInt(MAX - MIN + 1) + MIN;
			for(int x = 0; x < limitClassABC; x ++) {
				a.add(list.get(rd.nextInt(list.size())));
			}
			
			limitClassABC = rd.nextInt(MAX - MIN + 1) + MIN;
			for(int x = 0; x < limitClassABC; x ++) {
				b.add(list.get(rd.nextInt(list.size())));
			}
			
			limitClassABC = rd.nextInt(MAX - MIN + 1) + MIN;
			for(int x = 0; x < limitClassABC; x ++) {
				c.add(list.get(rd.nextInt(list.size())));
			}
			
			Set<Studants> total = new HashSet<>(a);
			total.addAll(b);
			total.addAll(c);
			
			System.out.println("The instructor Alex has " + total.size() 
			+  " students in his three classes, of which are:");
			
			for(Studants totally: total) {
				System.out.println();
			}
 		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}

}
