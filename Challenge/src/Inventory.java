import java.util.*;

class Product {
	int id;
	String n;
	double p;
}

public class Inventory {
	static ArrayList<Product> prods = new ArrayList<Product>();

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int c;
		do {
			System.out.println("\n1:Add 2:List 3:Exit");
			c = sc.nextInt();
			if (c == 1) {
				Product t = new Product();
				System.out.print("ID:");
				t.id = sc.nextInt();
				System.out.print("Name:");
				t.n = sc.next();
				System.out.print("Price:");
				t.p = sc.nextDouble();
				prods.add(t);
			}
			if (c == 2) {
				for (Product p : prods) {
					System.out.println(p.id + " " + p.n + " $" + p.p);
				}
			}
		} while (c != 3);
	}
}