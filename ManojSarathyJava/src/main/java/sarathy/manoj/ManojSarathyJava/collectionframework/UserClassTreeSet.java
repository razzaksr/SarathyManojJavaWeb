package sarathy.manoj.ManojSarathyJava.collectionframework;

import java.util.TreeSet;

public class UserClassTreeSet 
{
	public static void main(String[] args) 
	{
		TreeSet<Mobile> poorvika=new TreeSet<Mobile>();
		poorvika.add(new Mobile("Realme 5s",4,128,14500.3));
		poorvika.add(new Mobile("IQOO Z3",8,64,21300.5));
		poorvika.add(new Mobile("Nokia 6.1 plus",4,64,11500.9));
		Mobile mob=new Mobile("Redmi 10T",8,12,25500.9);
		poorvika.add(mob);
		
		System.out.println(poorvika);
	}
}


class Mobile implements Comparable<Mobile>
{
	String model;
	Integer ram, internal;
	Double price;
	
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Mobile(String model, Integer ram, Integer internal, Double price) {
		super();
		this.model = model;
		this.ram = ram;
		this.internal = internal;
		this.price = price;
	}



	@Override
	public String toString() {
		return "Mobile [model=" + model + ", ram=" + ram + ", internal=" + internal + ", price=" + price + "]\n";
	}



	@Override
	public int compareTo(Mobile o) {
		// TODO Auto-generated method stub
		//return this.price.compareTo(o.price);
		//return o.ram.compareTo(this.ram);
		return o.model.compareTo(this.model);
	}
}