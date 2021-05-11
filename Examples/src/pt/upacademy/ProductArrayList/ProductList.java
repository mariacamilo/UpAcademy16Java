package pt.upacademy.ProductArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import pt.upacademy.ModelProduct.Product;

public class ProductList {
	List<Product> pl = new ArrayList<Product>();

	public static void main(String[] args) {
		ProductList app = new ProductList();
		
		Product p = new Product();
		p.setPvp(10);
		app.pl.add(p);
		
		Product p2 = new Product();
		p2.setPvp(50);
		app.pl.add(p2);
		
		System.out.println(app.pl);
		
		Iterator<Product> it = app.pl.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(app.pl.size());
		
		app.pl.remove(p);
		System.out.println(app.pl.size());
		
	}
}
