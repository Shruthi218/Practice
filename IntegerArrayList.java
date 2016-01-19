import java.util.*;

class IntegerArrayList
{

public static void main(String args[])
{
int sum=0;
ArrayList<Integer> e = new ArrayList<Integer>();
e.add(1);
e.add(2);
e.add(3);
e.add(4);
e.add(5);
e.add(6);
e.add(7);

for(int i=0;i<e.size();i++)
{

 sum = sum + e.get(i);
}

System.out.println(sum);
}
}
