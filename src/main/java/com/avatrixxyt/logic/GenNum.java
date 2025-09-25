package com.avatrixxyt.logic;

import java.util.Random;

public class GenNum {
    Random rand = new Random();
    
    public int OP(int Dif){
        int op = rand.nextInt(Dif);
        return op;
    }
    public int Num(int Dif){
		int num = rand.nextInt(Dif);
		return num;
	}
    public int Num2(int Dif){
    	int num = rand.nextInt(2,Dif);
    	return num;
    }
    public int Pontencia(){
		int num = rand.nextInt(5);
		return num;
	}
    public int NumBase() {
    	int num = rand.nextInt(50);
		return num;
    }
}
