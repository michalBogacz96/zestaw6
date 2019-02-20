package wydajnoscKolekcji;

import java.util.HashSet;

public class ZbiorHaszowany {

    int iIterations;
    long start, end, result;
    boolean flag;

    HashSet<Integer> hashSet;

    public ZbiorHaszowany(int iIterations) {
        this.iIterations = iIterations;
        hashSet = new HashSet<>();
    }

    public long addingTimeResult(){
        start = System.currentTimeMillis();
        for(int i = 0; i < iIterations; i++){
            hashSet.add(i);
        }
        end = System.currentTimeMillis();
        result = end - start;
        return result;
    }

    public long containingTimeResult(){
        start = System.currentTimeMillis();
        for(int i = 0; i < iIterations; i++){
            flag = hashSet.contains(1);
        }
        end = System.currentTimeMillis();
        result = end - start;
        return result;
    }

    public long removingTimeResult(){
        start = System.currentTimeMillis();
        for(int i = iIterations - 1; i >= 0; i--){
            hashSet.remove(i);
        }
        end = System.currentTimeMillis();
        result = end - start;
        return result;
    }
}
