package com.priority;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
List list=new ArrayList();
list.add(10);
list.add(20);
list.add(30);
list.add("hi");

List<String> list1=new ArrayList<String>();
list1.add("hello");
list1.add("hi");

list.addAll(list1);

System.out.println(list);

	}

}
