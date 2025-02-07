import java.util.*;

class MyVector implements List {
    Object[] data = null;	// ��ü�� ��� ���� ��ü�迭�� �����Ѵ�.
    int capacity = 0;		// �뷮
    int size = 0;			// ũ��

    public MyVector(int capacity) {
        if (capacity < 0)
            throw new IllegalArgumentException("��ȿ���� ���� ���Դϴ�. :"+ capacity);

        this.capacity = capacity;
        data = new Object[capacity];
    }

    public MyVector() {
        this(10);		// ũ�⸦ �������� ������ ũ�⸦ 10���� �Ѵ�.
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity - data.length > 0)
            setCapacity(minCapacity);
    }

    public boolean add(Object obj) {
        // ���ο� ��ü�� �����ϱ� ���� ������ ������ Ȯ���Ѵ�.
        ensureCapacity(size+1);
        data[size++] = obj;
        return true;
    }

    public Object get(int index) {
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException("������ ������ϴ�.");

        return data[index];
    }

    public Object remove(int index) {
        Object oldObj = null;

        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException("������ ������ϴ�.");

        oldObj = data[index];

        // �����ϰ��� �ϴ� ��ü�� ������ ��ü�� �ƴ϶��, �迭���縦 ���� ���ڸ��� ä����� �Ѵ�.
        if(index != size-1) {
            System.arraycopy(data, index+1, data, index, size-index-1);
        }

        // ������ �����͸� null�� �Ѵ�. �迭�� 0 ���� �����ϹǷ� ������ ��Ҵ� index�� size-1�̴�.
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
        if(this.capacity==capacity) return; // ũ�Ⱑ ������ �������� �ʴ´�.

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
        cursor=0;		// cursor�� lastRet�� �ʱ�ȭ �Ѵ�.
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
        // ���̻� ������ ���� ������ IllegalStateException�� �߻���Ų��.
        if(lastRet==-1) {
            throw new IllegalStateException();
        } else {
            remove(lastRet);
            cursor--;           // ���� �Ŀ� cursor�� ��ġ�� ���ҽ�Ų��.
            lastRet = -1;		// lastRet�� ���� �ʱ�ȭ �Ѵ�.
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

        System.out.println("���� �� : " + v);
        Iterator it = v.iterator();
        it.next();
        it.remove();
        it.next();
        it.remove();

        System.out.println("���� �� : " + v);
    }
}
