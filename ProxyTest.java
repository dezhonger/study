package p1107.p1226.dynamic.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by dezhonger on 2016/12/26.
 */
public class ProxyTest {
	public static void main(String[] args) {
		CustomInvocationHandler handler = new CustomInvocationHandler(new HelloWorldImpl());
		HelloWorld proxy = (HelloWorld) Proxy.newProxyInstance(ProxyTest.class.getClassLoader(), new Class[]{HelloWorld.class}, handler);
		proxy.sayHello("dezhonger");

	}
}
