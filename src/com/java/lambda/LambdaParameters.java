package com.java.lambda;

interface Addable{
    int addition(int a, int b);
}

class AddableImpl implements Addable{

    @Override
    public int addition(int a, int b) {
        return (a+b);
    }
}
public class LambdaParameters {
    public static void main(String[] args) {
        Addable addition=(a,  b) -> (a+b);
        int result=addition.addition(10,30);
        System.out.println(result);

        //multiple statements in lambda body
        Addable abc=(int a, int b) -> {
            int c =(a+b);
            return c;
        };
    }
}