class LinkStack
{
  private LinkList first; // ref to first item on list
  public LinkStack() // constructor
  {
  }
  public boolean isEmpty()
  {
      if(first == null) return true;
      else return false;
  }
  public void push(int dd)
  {
      LinkList newNode = new LinkList(dd);
      if(first == null) {
          first = newNode;
          return;
      }
      newNode.next = first;
      first = newNode;
      return;
  }
  public int pop()
  {
      int res;
      if(first == null) res = -1;
      else {
          res = first.data;
          first = first.next;
      }  
      return res;
  }
}