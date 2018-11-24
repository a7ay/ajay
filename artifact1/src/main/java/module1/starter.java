package module1;

public class starter {

    public static void main(String[] args) {
        System.out.println("Hello World!"); // Display the string.

        localHashMap<String, String> abc = new localHashMap<>();

        for (Integer i=0; i<10; i++) {
            abc.set(i.toString(), i.toString());

            if (!abc.get(i.toString()).equals(i.toString())) {
                System.out.print("Set or get failed");
            }
        }

        System.out.println(abc.size());

        if (abc.containsKey("0")) {
            abc.remove("0");
        }

        abc.remove("5");
        abc.remove("4");
        abc.remove("3");
        abc.remove("1");

        System.out.println(abc.size());

        abc.clear();

        System.out.println(abc.size());


        localHashMap<Integer, Integer> abc2 = new localHashMap<>();
        for (Integer i=0; i<10; i++) {
            abc2.set(i,i);

            if (!abc2.get(i).equals(i)) {
                System.out.print("Set or get failed");
            }
        }

        System.out.println(abc2.size());
    }
}