package com.avatrixxyt.logic;

import java.util.Random;
import java.security.SecureRandom;

public class GenNum {
    Random rand = new Random();
    public int OP(int Dif){
        int op = rand.nextInt(2);
        return op;
    }
}
