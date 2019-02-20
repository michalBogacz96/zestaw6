package wydajnoscKolekcji;

import java.util.TreeSet;

public class Drzewo {

    int iIterations;
    long start, end, result;
    boolean flag;


    TreeSet<Integer> treeSet;

    public Drzewo(int iIterations) {
        this.iIterations = iIterations;
        treeSet = new TreeSet<>();
    }

    public long addingTimeResult(){
        start = System.currentTimeMillis();
        for(int i = 0; i < iIterations; i++){
            treeSet.add(i);
        }
        end = System.currentTimeMillis();
        result = end - start;
        return result;
    }


    public long containingTimeResult(){
        start = System.currentTimeMillis();
        for(int i = 0; i < iIterations; i++){
            flag = treeSet.contains(1);
        }
        end = System.currentTimeMillis();
        result = end - start;
        return result;
    }

    public long removingTimeResult(){
        start = System.currentTimeMillis();
        for(int i = iIterations - 1; i >= 0; i--){
            treeSet.remove(i);
        }
        end = System.currentTimeMillis();
        result = end - start;
        return result;
    }

}
