import java.util.*;
class TestDemo
{

public static void main(String args[])
{

ArrayList<Integer> o = new ArrayList<Integer>();
o.add (1);
o.add(2);
o.add(3);
o.add(4);
o.add(5);

for(int i=0;i<o.size();i++)
{

System.out.println("value would be" +o.get(i));
}
System.out.println(o);

System.out.println("elements are" +o);
}
}
