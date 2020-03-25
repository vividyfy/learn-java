public class MyArrayList {
    private int usedSize;
    private int[] elem;
    private static final int DEFAULT_SIZE = 10;
    public MyArrayList() {
        this.usedSize = 0;
        this.elem = new int[DEFAULT_SIZE];
    }
    public boolean isEmpty() {
        if (this.usedSize == 0) {
            return true;
        }
        return false;
    }
     //打印顺序表    
     public void display() {
         for (int i = 0; i < this.elem.length; i++) {
             System.out.println(this.elem[i]+" ");
         }
    }
     //在 pos 位置新增元素  
     public void checkPos(int pos) {
        if (pos<0 || pos >this.usedSize) {
            throw new ArrayIndexOutOfBoundsException("pos位置不合法");
        }
     }
     public boolean isFull() {
        if (this.usedSize == this.elem.length) {
            return true;
        }
        return false;
     }
     public void add(int pos, int data) {
        checkPos(pos);
        if (isFull()) {
            throw new RuntimeException("顺序表是满的！");
        }
         for (int i = pos; i < this.usedSize-1; i--) {
             this.elem[i+1] = this.elem[i];
         }
         this.elem[pos] = data;
         this.usedSize++;
     }
     //判定是否包含某个元素    
     public boolean contains(int toFind) {
        if (isEmpty()) {
            throw new RuntimeException("顺序表为空！");
        }
         for (int i = 0; i < this.usedSize; i++) {
             if (this.elem[i] == toFind) {
                 return true;
             }
         }
        return false;
    }
     //查找某个元素对应的位置    
     public int search(int toFind) {
         for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return i;
            }
         }
        return -1;
    }
     //获取 pos 位置的元素    
     public int getPos(int pos) {
        if (isEmpty()) {
            throw new RuntimeException("顺序表为空！");
        }
        return this.elem[pos];
    }
     //给 pos 位置的元素设为 value    
     public void setPos(int pos, int value) {
        checkPos(pos);
        this.elem[pos] = value;
     }
     //删除第一次出现的关键字key    
     public void remove(int key) {
        int index = search(key);
        if (index==-1) {
            return;
        }
         for (int i = index; i < this.usedSize-1; i++) {
            this.elem[i] = this.elem[i+1];
         }
         this.usedSize--;
     }
     //获取顺序表长度    
     public int size() {
        return this.usedSize;
    }
     //清空顺序表    
     public void clear() {
        this.usedSize = 0;
     }
}
