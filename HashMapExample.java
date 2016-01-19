import java.util.*;

class HashMapExample
{

public static void main(String args[])
{

HashMap<Integer,String> hm = new HashMap<Integer,String>();
hm.put(1,"S");
hm.put(2,"H");
hm.put(3,"R");
hm.put(4,"U");
hm.put(5,"T");
hm.put(6,"I");

System.out.println("values" +hm);
String v = hm.get(2);
System.out.println(v);
}
}
