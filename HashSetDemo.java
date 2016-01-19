import java.util.*;

class HashSetDemo
{

public static void main(String args[])
{

LinkedHashSet<String> h = new LinkedHashSet<String>();
h.add("India");
h.add("USA");
h.add("Srilanka");
h.add("Mexico");
h.add(null);
h.add(null);
h.add("Costa Rica");
h.add("malaysia");
h.add("countries");
int s = h.size();
System.out.println(s);
System.out.println("contents of the hashset are" +h);
}
}
