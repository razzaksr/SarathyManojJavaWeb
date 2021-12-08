package sarathy.manoj.ManojSarathyJava.collectionframework;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;
import java.util.TreeMap;

/*
 * Maps: <KeyClass,ValueClass>
 * random order
 * Hashtable: 11bits, synchronized 
 * HashMap: 10bits, asynchronized
 * Ascending by Key
 * TreeMap
 * put(k,v)
 * putAll
 * 
 * get(k)
 * 
 * remove(k)
 * 
 * containsKey(k)
 * containsValue(v)
 * 
 * keySet()
 * 
 * values()
 * 
 */

public class DemoMaps 
{
	public static void main(String[] args) 
	{
		Hashtable<String, Mobile> owners=new Hashtable<String,Mobile>();
		Mobile mob1=new Mobile("Realme 5s",4,128,14500.3);
		Mobile mob2=new Mobile("IQOO Z3",8,64,21300.5);
		Mobile mob3=new Mobile("Nokia 6.1 plus",4,64,11500.9);
		Mobile mob4=new Mobile("Redmi 10T",8,12,25500.9);
		
		owners.put("Manoj", mob1);
		owners.put("Sarathy", mob2);
		owners.put("Mohamed", mob4);
		owners.put("Annamalai", mob1);
		owners.put("Razak", mob3);
		owners.put("Sabari", mob4);
		owners.put("Arasan", mob2);
		
		System.out.println(owners);
		
		TreeMap<Mobile, String> own=new TreeMap<Mobile, String>();
		own.put(mob1, "Razak Mohamed");
		own.put(mob2, "Razak Mohamed");
		own.put(mob3, "Razak Mohamed");
		own.put(mob4, "Razak Mohamed");
		
		System.out.println(own);
		
		own.remove(mob3);
		
		System.out.println(own.containsValue("Razak Mohamed"));
		System.out.println(own.containsKey(mob3));
		
		System.out.println(owners.get("Annamalai"));
		
		Set<String> users = owners.keySet();
		
		System.out.println(users);
		
		Collection<Mobile> phones = owners.values();
		
		System.out.println(phones);
		
	}
}
