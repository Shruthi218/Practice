import java.util.*;

class HashtableExample
{

public static void main(String args[])
{

Hashtable<Integer,String> h = new Hashtable<Integer,String>();
h.put(1,"Shruthi");
h.put(2,"Hello");
h.put(3,"what");

System.out.println("Hashtable contents are" +h);
Enumeration l = h.keys();
System.out.println(l);
}
}
