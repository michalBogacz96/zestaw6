package wydajnoscKolekcji;

import java.util.LinkedList;

public class ListaLaczona {


    int iIterations;
    long start, end, result;
    boolean flag;

    LinkedList<Integer> linkedList;

    public ListaLaczona(int iIterations) {
        this.iIterations = iIterations;
        linkedList = new LinkedList<>();
    }

    public long addingTimeResult(){
        start = System.currentTimeMillis();
        for(int i = 0; i < iIterations; i++){
            linkedList.add(i);
        }
        end = System.currentTimeMillis();
        result = end - start;
        return result;
    }


    public long containingTimeResult(){
        start = System.currentTimeMillis();
        for(int i = 0; i < iIterations; i++){
            flag = linkedList.contains(1);
        }
        end = System.currentTimeMillis();
        result = end - start;
        return result;
    }

    public long removingTimeResult(){
        start = System.currentTimeMillis();
        for(int i = iIterations - 1; i >= 0; i--){
            linkedList.remove(i);
        }
        end = System.currentTimeMillis();
        result = end - start;
        return result;
    }
}
