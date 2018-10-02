/**
 * @author zhaojl
 * @date 2018/10/1
 */
public class Array {

    private int[] data;
    private int size;


    /**
     * 构造函数，传入数组的容量capacity构造Array
     * @param capacity
     */
    public Array(int capacity){
        data = new int[capacity];
        size = 0;
    }


    /**
     * 无参数的构造函数，默认数组的容量capacity=10
     */
    public Array(){
        this(10);
    }


    /**
     * 获取数组中的元素个数
     * @return
     */
    public int getSize(){
        return size;
    }


    /**
     * 获取数组的容量
     * @return
     */
    public int getCapacity(){
        return data.length;
    }


    /**
     * 返回数组是否为空
     * @return
     */
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * 向所有元素后添加一个元素
     * @param e
     */
    public void addLast(int e){
        add(size, e);
    }


    /**
     * 在所有元素前添加一个新元素
     * @param e
     */
    public void addFirst(int e){
        add(0, e);
    }


    /**
     * 在第index个位置插入一个新元素e
     * @param index
     * @param e
     */
    public void add(int index, int e){
        if (size == data.length){
            throw new IllegalArgumentException("Add failed. Array is full");
        }

        if (index < 0 || index > size){
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size");
        }

        for (int i = size-1; i >= index; i--) {
            data[i + 1] = data[i];
        }

        data[index] = e;
        size++;
    }


    /**
     * 获取 index 索引位置的元素
     * @param index
     * @return
     */
    public int get(int index){
        if (index < 0 || index >= size){
            throw new IllegalArgumentException("Get failed. Index is illegal");
        }

        return data[index];
    }


    /**
     * 修改 index 索引位置的元素为e
     * @param index
     * @param e
     */
    public void set(int index, int e){
        if (index < 0 || index >= size){
            throw new IllegalArgumentException("Get failed. Index is illegal");
        }

        data[index] = e;
    }


    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array:size = %d, capacity = %d\n", size, data.length));
        res.append("[");
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size - 1){
                res.append(", ");
            }
        }
        res.append("]");

        return res.toString();
    }
    
}
