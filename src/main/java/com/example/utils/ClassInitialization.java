package com.example.utils;

import java.math.BigDecimal;
import java.util.Random;

import org.springframework.util.Assert;

class Initable {
	static final int staticFinal = 47;
	static final int staticFinal2 = ClassInitialization.rand.nextInt(100);
	static {
		System.out.println("Initializing Initable");
	}
}

public class ClassInitialization {
	
	public static Random rand = new Random(49);

	/*public static void main(String[] args) {
		//Class initable = Initable.class;
//		System.out.println("After createing Initable");
//		System.out.println(Initable.staticFinal);
//		System.out.println(Initable.staticFinal2);
		BigDecimal a1 = new BigDecimal(12);
		BigDecimal a2 = new BigDecimal(0.01);
		System.out.println(a1.subtract(a2).compareTo(BigDecimal.ZERO));
		System.out.println(a1.compareTo(a2));
		System.out.println(a2.compareTo(BigDecimal.valueOf(0.00d)));
		
//		Assert.notNull(null, "1111");
		StringBuffer s = new StringBuffer("good");
		StringBuffer s2 = new StringBuffer("bad");
		test(s,s2);
		System.out.println(s + "--main===s=" + s.hashCode());
		System.out.println(s2 + "--main===s2=" +s2.hashCode());
	}*/
	
	static void test(StringBuffer s,StringBuffer s2){
		System.out.println(s + "--test====s=" + s.hashCode());
		System.out.println(s2 + "--test====s2=" + s2.hashCode());
		s2 = s;
		s = new StringBuffer("new");
		System.out.println(s + " " + s.hashCode());
		System.out.println(s2 + " " + s2.hashCode());
		s.append("hah");
		s2.append("hah");
		System.out.println(s + "--test ==hsh=s=" + s.hashCode());
		System.out.println(s2 + "--test ==hsh=s2=" + s2.hashCode());
	}

	
	
}


