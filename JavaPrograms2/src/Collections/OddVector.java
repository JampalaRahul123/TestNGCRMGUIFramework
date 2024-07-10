package Collections;

import java.util.Vector;
import java.util.Iterator;
public class OddVector {

	public static void main(String[] args) {
Vector<Integer> V1=new Vector<>();
V1.add(10);
V1.add(20);
V1.add(15);
V1.add(25);
Iterator<Integer> i = V1.iterator();
while (i.hasNext()) {
    if (i.next() % 2 == 0) {
        i.remove();
	}
}
System.out.println(V1);
	}
}
