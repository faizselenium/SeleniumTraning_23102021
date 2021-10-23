package collectionConcepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class collectionConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("********//List/**********");
		// ArrayList
		List<String> L1 = new ArrayList<String>();
		L1.add("name");
		L1.add("name1");
		L1.add("name2");

		Iterator iT = L1.iterator();

		while (iT.hasNext())
			System.out.println(iT.next());
		

		
		//***************************************************************
		System.out.println("********//LiskedList/**********");
		//LiskedList
		
		List<String> LL = new LinkedList();
		LL.add(null);
		LL.add("LL2");
		LL.add(null);
		LL.add("LL4");
		
		Iterator itr = LL.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		
		//**************************************************************
		//Hashset
		System.out.println("********//Hashset/**********");
		
		Set<String> Hs = new HashSet<String>();
		Hs.add("A");
		Hs.add("B");
		Hs.add("C");
		Hs.add("A");
		Hs.add("1");
		Hs.add("2");
		Hs.add("3");
		Hs.add(null);
		Hs.add(null);
		System.out.println( Hs.size());
		
		Iterator itr1 = Hs.iterator();
		
		while(itr1.hasNext())
		{
			System.out.println( itr1.next());
		}
	}

}
