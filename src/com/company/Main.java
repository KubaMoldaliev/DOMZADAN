package com.company;

import java.util.Arrays;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        Class cl=new Class( 23,"slovo",new int[]{1,2,3,4,});


        System.out.println(cl.getBytynSAn()+" "+ Arrays.toString(cl.getSanSaktayt())+" "+cl.getSoz());
    }
}
