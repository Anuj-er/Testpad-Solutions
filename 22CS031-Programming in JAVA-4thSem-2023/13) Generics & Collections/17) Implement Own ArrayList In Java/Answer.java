import java.util.Scanner;
class OwnArrayList<E>
{
  private static final int INITIAL_CAPACITY = 10;
  private int actSize = 0;
  private Object elementData[];
  public OwnArrayList() {
      elementData = new Object[INITIAL_CAPACITY];
  }
  @SuppressWarnings("unchecked")
  public E get(int index) {
      if (index >= actSize || index < 0) {
          throw new IndexOutOfBoundsException("Index out of bounds");
      }
      return (E) elementData[index];
  }
  public void add(E e) {
      if (actSize == elementData.length) {
          increaseListSize();
      }
      elementData[actSize++] = e;
  }
  @SuppressWarnings("unchecked")
  public Object remove(int index) {
      if (index >= actSize || index < 0) {
          throw new IndexOutOfBoundsException("Index out of bounds");
      }
      Object removedElement = elementData[index];
      for (int i = index; i < actSize - 1; i++) {
          elementData[i] = elementData[i + 1];
      }
      elementData[--actSize] = null; 
      return removedElement;
  }
  public int size() {
      return actSize;
  }
  private void increaseListSize() {
      int newCapacity = elementData.length * 2;
      Object newArray[] = new Object[newCapacity];
      for (int i = 0; i < elementData.length; i++) {
          newArray[i] = elementData[i];
      }
      elementData = newArray;
  }
  public void display() {
      for (int i = 0; i < actSize; i++) {
          System.out.print(elementData[i] + " ");
      }
      System.out.println();
  }
}