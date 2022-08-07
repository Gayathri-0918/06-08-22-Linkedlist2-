package linkedlist2;

import java.util.Collections;
import java.util.LinkedList;

public class Shuffleelements {

	public static void main(String[] args) 
	{
		 LinkedList <String> l_list = new LinkedList <String> ();
		  l_list.add("Red");
		  l_list.add("Green");
		  l_list.add("Black");
		  l_list.add("Pink");
		  l_list.add("orange");
		  
		  System.out.println("The Original linked list: " + l_list);
		  
		    Collections.shuffle(l_list);
		    System.out.println("The New linked list after shuffle: " + l_list);


	}

}
