//Hansel is preparing himself for a trip and wants to make sure he has packed at least one of everything.
//        . Create the BasicBackpackApplication class and write the following instructions in its main method:
//        . Create an empty backpack set and display it.
//        . Create three Strings that represent three different items.
//        . Add them to the backpack set and display it.
//        . Ask if one of them is contained in the set and display the answer.
//        . Remove one of them by providing its name as an argument and display the set.
//        . Ask if the element you just removed is not contained in the set and display the answer.
//        . Add one of the existing items twice and display the set.
//        . Display its size.
import java.util.HashSet;
import java.util.Set;
public class BasicBackpackApplication {
    public static void main(String[] args) {
        Set<String> backpack = new HashSet<>();
        System.out.println(backpack);
        String shoes = "Hiking shoes";
        String navi = "GPS";
        String tent = "Tent";
        backpack.add(shoes);
        backpack.add(navi);
        backpack.add(tent);
        System.out.println(backpack);
        System.out.println("We have navi in our set: " + backpack.contains(navi));
        backpack.remove("Tent");
        System.out.println(backpack);
        System.out.println("We don't have navi in our set anymore:" + !backpack.contains(tent));
        backpack.add(navi);
        System.out.println(backpack);
        System.out.println("Size our set is: " + backpack.size());
    }
}
