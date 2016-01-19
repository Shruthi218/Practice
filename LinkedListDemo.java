import java.util.*;

class LinkedListDemo
{

public static void main(String args[])
{
LinkedList<Integer> l = new LinkedList<Integer>();
l.add(1);
l.add(2);
l.add(3);
l.add(4);
l.addFirst(0);
l.addLast(10);
System.out.println("contents looks like this" +l);
l.remove(1);
System.out.println("contents after deletion" +l);
}
}
