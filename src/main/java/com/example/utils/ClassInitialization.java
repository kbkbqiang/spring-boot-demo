package com.example.utils;

import java.util.Random;

class Initable {
	static final int staticFinal = 47;
	static final int staticFinal2 = ClassInitialization.rand.nextInt(100);
	static {
		System.out.println("Initializing Initable");
	}
}

public class ClassInitialization {
	
	public static Random rand = new Random(49);

//	public static void main(String[] args) {
//		//Class initable = Initable.class;
//		System.out.println("After createing Initable");
//		System.out.println(Initable.staticFinal);
//		System.out.println(Initable.staticFinal2);
//	}

}
