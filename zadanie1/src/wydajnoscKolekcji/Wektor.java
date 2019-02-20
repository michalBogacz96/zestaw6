package wydajnoscKolekcji;

import java.util.Vector;

public class Wektor {

    int iIterations;
    long start, end, result;
    boolean flag;

    Vector<Integer> vector;

    public Wektor(int iIterations) {
        this.iIterations = iIterations;
        vector = new Vector<>();
    }

    public long addingTimeResult(){
        start = System.currentTimeMillis();
        for(int i = 0; i < iIterations; i++){
            vector.add(i);
        }
        end = System.currentTimeMillis();
        result = end - start;
        return result;
    }


    public long containingTimeResult(){
        start = System.currentTimeMillis();
        for(int i = 0; i < iIterations; i++){
            flag = vector.contains(1);
        }
        end = System.currentTimeMillis();
        result = end - start;
        return result;
    }

    public long removingTimeResult(){
        start = System.currentTimeMillis();
        for(int i = iIterations - 1; i >= 0; i--){
            vector.remove(i);
        }
        end = System.currentTimeMillis();
        result = end - start;
        return result;
    }

}
