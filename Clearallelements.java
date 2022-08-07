package linkedlist2;

import java.util.LinkedList;

public class Clearallelements {

	public static void main(String[] args) 
	{
		LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");
        System.out.println("list"+l_list);
        l_list.clear();
        System.out.println("After clear list"+l_list);

	}

}
