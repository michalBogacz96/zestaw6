package zadanie2;

public class PriorityQueue<T> {


    Pair[] table;
      private int iTableSize;

    public PriorityQueue(int iConstTableSize) {
        table = new Pair[iConstTableSize];
        this.iTableSize = 0;
    }

    public void add(T value, int priority){
        Pair<T, Integer> pair = new Pair<>();
        pair.value = value;
        pair.iPriority = priority;
        table[++iTableSize] = pair;
        heapUp(iTableSize);
    }

    private void heapUp(int iterator){
        while((iterator > 1) && (table[iterator/2].iPriority > table[iterator].iPriority)){
            swap(iterator/2, iterator);
            iterator = iterator/2;
        }
    }

    private void swap(int iFirstIterator, int iSecondIterator){
        Pair<T, Integer> temp = table[iSecondIterator];
        table[iSecondIterator] = table[iFirstIterator];
        table[iFirstIterator] = temp;
    }


    public T get(){
        if(iTableSize == 0){
            return null;
        }else {
            Object object = table[1].value;
            swap(1, iTableSize--);
            table[iTableSize + 1] = null;
            heapDown(1);
            return (T)object;
        }
    }

    private void heapDown(int iterator){
        while(2 * iterator < iTableSize){
            int j = 2 * iterator;
            if((j < iTableSize) && (table[j].iPriority > table[j+1].iPriority)){
                j = j + 1;
            }
            if(table[j].iPriority > table[iterator].iPriority){
                break;
            }
            swap(iterator, j);
            iterator = j;
        }
    }

}
