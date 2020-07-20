package com.xworkz.spring.component;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sun.java_cup.internal.runtime.Scanner;

public class DroneTester {
	public static void main(String[] args) {
	
		String string="resource/spring.xml";
		ApplicationContext context= new ClassPathXmlApplicationContext(string);
		Drone ref=context.getBean(Drone.class);
		ref.CapturePic();
		
		String refofString =context.getBean(String.class);
		System.out.println("dairymilk"+refofString);
		
		Thread refofThread=context.getBean(Thread.class);
		System.out.println("come soon seem"+refofThread);
		
		ArrayList refofArrayList=context.getBean(ArrayList.class);
		System.out.println("hi asha"+refofArrayList);
		
		LinkedList refofLinkedList=context.getBean(LinkedList.class);
		System.out.println("friends forever"+refofLinkedList);
		
		Collections refofCollections=context.getBean(Collections.class);
		System.out.println("wifi"+refofCollections);
		
		Exception refofException=context.getBean(Exception.class);
		System.out.println("Exception"+refofException);
		
		Object refofObject=context.getBean("object",Object.class);
		System.out.println("nice"+refofObject);
		
		Vector refofVector=context.getBean(Vector.class);
		System.out.println("hello ashu"+refofVector);
		
		HashMap refofHashMap=context.getBean(HashMap.class);
		System.out.println("how are you Kavya"+refofHashMap);
		
		TreeSet refofTreeSet=context.getBean(TreeSet.class);
		System.out.println("where are you missRadha"+refofTreeSet);
		
		
	}

}