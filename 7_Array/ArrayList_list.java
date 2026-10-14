// similar to list in python
// dynamic array
import java.util.Collections;
import java.util.ArrayList;
class ArrayList_list
{
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(43);
        list.add(25);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.set(0,99);
        System.out.println(list);
        System.out.println(list.get(1));
        Collections.sort(list);
        System.out.println(list);
    }
}