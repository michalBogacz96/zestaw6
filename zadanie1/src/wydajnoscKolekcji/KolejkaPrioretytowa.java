package wydajnoscKolekcji;


import java.util.PriorityQueue;

public class KolejkaPrioretytowa {

    int iIterations;
    long start, end, result;
    boolean flag;

    PriorityQueue<Integer> priorityQueue;


    public KolejkaPrioretytowa(int iIterations) {
        this.iIterations = iIterations;
        priorityQueue = new PriorityQueue<>();
    }

    public long addingTimeResult(){
        start = System.currentTimeMillis();
        for(int i = 0; i < iIterations; i++){
            priorityQueue.add(i);
        }
        end = System.currentTimeMillis();
        result = end - start;
        return result;
    }


    public long containingTimeResult(){
        start = System.currentTimeMillis();
        for(int i = 0; i < iIterations; i++){
            flag = priorityQueue.contains(1);
        }
        end = System.currentTimeMillis();
        result = end - start;
        return result;
    }

    public long removingTimeResult(){
        start = System.currentTimeMillis();
        for(int i = iIterations - 1; i >= 0; i--){
            priorityQueue.remove(i);
        }
        end = System.currentTimeMillis();
        result = end - start;
        return result;
    }
}
