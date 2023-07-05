package fundamentos;

public class aula33 {
public static void main(String[] args) {
	String str = "hello";
	String rts = "hello world";
	String trs = " hello ";
	String tsr = "hello";
	String resultado = str.replace("l", "w");
	System.out.println(resultado);
	String resul = rts.substring(6);
	System.out.println(resul);
	String re = rts.substring(3,8);
	System.out.println(re);
	String res = trs.trim();
	System.out.println(res);
	char result = trs.charAt(1);
	System.out.println(result);
	String s1 = "Hello";
	String s2 = "HELLO";
	boolean b1 = s1.equals("Hello");
	boolean b2 = s1.equals(s2);
	boolean b3 = s1.equalsIgnoreCase(s2);
	boolean b4 = s1.equalsIgnoreCase("azul");
	System.out.println(b1);
	System.out.println(b2);
	System.out.println(b3);
	System.out.println(b4);
}
}
