package by.molchanova.lesson6.inner;

public class Runner {
    public static void main(String[] args) {

        Outer1 o1 = new Outer1();
        Outer1.Inner i1 = o1.new Inner();
        i1.method();
//
//		Outer2 o2 = new Outer2();
//		o2.callMethodInInner();

//		Outer3 o3 = new Outer3();
//		System.out.println(Outer3.Inner.pubfsi_pole);

        //	    Outer4 o4 = new Outer4();
//	    o4.callMethodInInner();
//		
		Outer5 o5 = new Outer5();
		o5.method();

//		Outer6 o6 = new Outer6();
//		InnerClass i6 = new Outer6().new InnerClass();
//		i6.display();
    }
}
