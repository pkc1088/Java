import java.util.*;

class MyVector implements List {
    Object[] data = null;	// 객체를 담기 위한 객체배열을 선언한다.
    int capacity = 0;		// 용량
    int size = 0;			// 크기

    public MyVector(int capacity) {
        if (capacity < 0)
            throw new IllegalArgumentException("유효하지 않은 값입니다. :"+ capacity);

        this.capacity = capacity;
        data = new Object[capacity];
    }

    public MyVector() {
        this(10);		// 크기를 지정하지 않으면 크기를 10으로 한다.
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity - data.length > 0)
            setCapacity(minCapacity);
    }

    public boolean add(Object obj) {
        // 새로운 객체를 저장하기 전에 저장할 공간을 확보한다.
        ensureCapacity(size+1);
        data[size++] = obj;
        return true;
    }

    public Object get(int index) {
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");

        return data[index];
    }

    public Object remove(int index) {
        Object oldObj = null;

        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");

        oldObj = data[index];

        // 삭제하고자 하는 객체가 마지막 객체가 아니라면, 배열복사를 통해 빈자리를 채워줘야 한다.
        if(index != size-1) {
            System.arraycopy(data, index+1, data, index, size-index-1);
        }

        // 마지막 데이터를 null로 한다. 배열은 0 부터 시작하므로 마지막 요소는 index가 size-1이다.
        data[size-1] = null;
        size--;
        return oldObj;
    }

    public boolean remove(Object obj) {
        for(int i=0; i< size; i++) {
            if(obj.equals(data[i])) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    public void trimToSize() {
        setCapacity(size);
    }

    private void setCapacity(int capacity) {
        if(this.capacity==capacity) return; // 크기가 같으면 변경하지 않는다.

        Object[] tmp = new Object[capacity];
        System.arraycopy(data,0, tmp, 0, size);
        data = tmp;
        this.capacity = capacity;
    }

    public void clear(){
        for (int i = 0; i < size; i++)
            data[i] = null;
        size = 0;
    }

    public Object[] toArray(){
        Object[] result = new Object[size];
        System.arraycopy(data, 0, result, 0, size);

        return result;
    }

    public boolean isEmpty() { return size==0;}
    public int capacity() { return capacity; }
    public int size() { return size; }
    public boolean contains(Object o){ return false;}
    public Iterator iterator(){ return null; }
    public Object[] toArray(Object a[]){ return null;}
    public boolean containsAll(Collection c){ return false; }
    public boolean addAll(Collection c){ return false; }
    public boolean addAll(int index, Collection c){ return false; }
    public boolean removeAll(Collection c){ return false; }
    public boolean retainAll(Collection c){ return false; }
    public boolean equals(Object o){ return false; }
    public Object set(int index, Object element){ return null;}
    public void add(int index, Object element){}
    public int indexOf(Object o){ return -1;}
    public int lastIndexOf(Object o){ return -1;}
    public ListIterator listIterator(){ return null; }
    public ListIterator listIterator(int index){ return null; }
    public List subList(int fromIndex, int toIndex){ return null; }
}

class MyVector2 extends MyVector implements Iterator {
    int cursor  = 0;
    int lastRet = -1;

    public MyVector2(int capacity) {
        super(capacity);
    }

    public MyVector2() {
        this(10);
    }

    public String toString() {
        String tmp = "";
        Iterator it = iterator();

        for(int i=0; it.hasNext();i++) {
            if(i!=0) tmp+=", ";
            tmp += it.next(); 	// tmp += next().toString();
        }

        return "["+ tmp +"]";
    }

    public Iterator iterator() {
        cursor=0;		// cursor와 lastRet를 초기화 한다.
        lastRet = -1;
        return this;
    }

    public boolean hasNext() {
        return cursor != size();
    }

    public Object next(){
        Object next = get(cursor);
        lastRet = cursor++;
        return next;
    }

    public void remove() {
        // 더이상 삭제할 것이 없으면 IllegalStateException를 발생시킨다.
        if(lastRet==-1) {
            throw new IllegalStateException();
        } else {
            remove(lastRet);
            cursor--;           // 삭제 후에 cursor의 위치를 감소시킨다.
            lastRet = -1;		// lastRet의 값을 초기화 한다.
        }
    }
}

class SUB {
    public static void main(String args[]) {
        MyVector2 v = new MyVector2();
        v.add("0");
        v.add("1");
        v.add("2");
        v.add("3");
        v.add("4");

        System.out.println("삭제 전 : " + v);
        Iterator it = v.iterator();
        it.next();
        it.remove();
        it.next();
        it.remove();

        System.out.println("삭제 후 : " + v);
    }
}
