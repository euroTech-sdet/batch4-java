package com.days.day58;

public class FinalMethod {

    int num1;

    public static void main(String[] args) {

    }


    final public void test() {

    }
}


class ChildFinal extends FinalMethod {

    int num2;

//    @Override
//    public void test() {  'test()' cannot override 'test()' in 'com.days.day58.FinalMethod'; overridden method is final
//        super.test();
//    }
}

class TestFinal {

    public static void main(String[] args) {


        ChildFinal obj = new ChildFinal();

        obj.test();
    }

}
