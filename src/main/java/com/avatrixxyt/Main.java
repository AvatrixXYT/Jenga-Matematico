package com.avatrixxyt;

import com.avatrixxyt.logic.SelOP;

public class Main {
	static SelOP sel = new SelOP();
	
    public static void main(String[] args) {
    	test(3);
    }
    private static void test(int dif) {
		sel.Seleccion(3);
		System.out.println(sel.Seleccion(dif));
	}
}