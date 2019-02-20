package zadanie2;

public class Main {

    public static void main(String[] args) {

        PriorityQueue<String> kolejka = new PriorityQueue<>(30);
        kolejka.add("deszcz", 5);
        kolejka.add("małej", 2);
        kolejka.add("Z", 1);
        kolejka.add("chmury", 3);
        kolejka.add("mały", 4);


        for(int i = 0; i < 5; i++){
            System.out.println(kolejka.get() + " ");
        }
    }
}
