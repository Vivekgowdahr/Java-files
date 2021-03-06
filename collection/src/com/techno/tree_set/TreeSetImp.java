package com.techno.tree_set;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.TreeSet;

public class TreeSetImp {
	public static void main(String[] args) {
		TreeSet<Object> treeSet = new TreeSet<>();
		treeSet.add(10);
		// treeSet.add("vivek");//if we add tz, then we will get error so we will not
		// add string bcs it is homogenious
		treeSet.add(5);
		treeSet.add(20);
		treeSet.add(50);
		treeSet.add(-10);
		for (Object obj : treeSet) {
			System.out.println(obj);
			
		}
		System.out.println("****************************************");
			ArrayList<Object> arrayList = new ArrayList<>(treeSet);
		ListIterator<Object> listIterator = arrayList.listIterator(arrayList.size());
		while (listIterator.hasPrevious()) {
			Object object = (Object) listIterator.previous();
			System.out.println(object);
		}

	}

	}

