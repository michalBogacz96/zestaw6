package wydajnoscKolekcji;

import java.util.ArrayList;

public class Lista {

    ArrayList<Integer> arrayList;

    int iIterations;
    long start, end, result;
    boolean flag;



    public Lista(int iIterations) {
        this.iIterations = iIterations;
        arrayList = new ArrayList<>();
    }

    public long addingTimeResult(){
        start = System.currentTimeMillis();
        for(int i = 0; i < iIterations; i++){
            arrayList.add(i);
        }
        end = System.currentTimeMillis();
        result = end - start;
        return result;
    }


    public long containingTimeResult(){
        start = System.currentTimeMillis();
        for(int i = 0; i < iIterations; i++){
            flag = arrayList.contains(1);
        }
        end = System.currentTimeMillis();
        result = end - start;
        return result;
    }

    public long removingTimeResult(){
        start = System.currentTimeMillis();
        for(int i = iIterations - 1; i >= 0; i--){
            arrayList.remove(i);
        }
        end = System.currentTimeMillis();
        result = end - start;
        return result;
    }
}
