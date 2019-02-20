package wydajnoscKolekcji;

import java.io.*;

public class Main {


    public static void main(String[] args) {

        final int ITERATIONS = 10000;

        Lista lista = new Lista(ITERATIONS);
        ZbiorHaszowany zbiorHaszowany = new ZbiorHaszowany(ITERATIONS);
        ListaLaczona listaLaczona = new ListaLaczona(ITERATIONS);
        Drzewo drzewo = new Drzewo(ITERATIONS);
        KolejkaPrioretytowa kolejkaPrioretytowa = new KolejkaPrioretytowa(ITERATIONS);
        Stos stos = new Stos(ITERATIONS);
        Wektor wektor = new Wektor(ITERATIONS);

        PrintWriter out = null;
        String sFileName = "tabelka.txt";

        try{
            out = new PrintWriter(new BufferedWriter(new FileWriter(sFileName)));
            //tworze tabelke w pliku txt
            out.write("klasa\t\t\tadd()\tcontains()\tremove()\n" +
                    "ArrayList\t\t" +lista.addingTimeResult() +"\t\t\t" +lista.containingTimeResult() +"\t\t\t" +lista.removingTimeResult() +"\n"
                    +"HashSet\t\t\t" +zbiorHaszowany.addingTimeResult() +"\t\t\t" +zbiorHaszowany.containingTimeResult() +"\t\t\t" +zbiorHaszowany.removingTimeResult() +"\n"
                    +"LinkedList\t\t" +listaLaczona.addingTimeResult() +"\t\t\t" +listaLaczona.containingTimeResult() +"\t\t\t" +listaLaczona.removingTimeResult() +"\n"
                    +"Stack\t\t\t" +stos.addingTimeResult() +"\t\t\t" +stos.containingTimeResult() +"\t\t\t" +stos.removingTimeResult() +"\n"
                    +"Vector\t\t\t" +wektor.addingTimeResult() +"\t\t\t" +wektor.containingTimeResult() +"\t\t\t" +wektor.removingTimeResult() +"\n"
                    +"PriorityQueue\t" +kolejkaPrioretytowa.addingTimeResult() +"\t\t\t" +kolejkaPrioretytowa.containingTimeResult() +"\t\t\t" +kolejkaPrioretytowa.removingTimeResult() +"\n"
                    +"TreeSet\t\t\t" +drzewo.addingTimeResult() +"\t\t\t" +drzewo.containingTimeResult() +"\t\t\t" +drzewo.removingTimeResult() +"\n");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(out != null){
                out.close();
            }
        }









    }
}
