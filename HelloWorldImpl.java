package p1107.p1226.dynamic.proxy;

/**
 * Created by dezhonger on 2016/12/26.
 */
public class HelloWorldImpl implements HelloWorld {
	@Override
	public void sayHello(String name) {
		System.out.println("hello " + name);
	}
}
