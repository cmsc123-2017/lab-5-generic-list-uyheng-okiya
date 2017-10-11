class ListLinked<E> implements IList<E> {
  
  class Node {
    Object data;
    Node next;
    
    Node(Object data, Node next) {
      this.data = data;
      this.next = next;
    }
  }

  Node head = null;
  int size = 0;
  
  ListLinked() {}
  
  //item -> boolean
  //adds an item at the top of the list

  public boolean add(E item) {
   
    Node newNode = new Node(item, head);
    this.head = newNode;
    this.size++;
    return true;
  }

   public boolean remove(E item) {
    
    if (this.size == 0) {
      return false;
    }
    

    //traverse to find item
    //reference of previous node
    Node previous = this.head;
    Node current = this.head.next;
    
    if(item.equals(previous.data)){
      this.head = current;
      previous = null;
      
      this.size--;
      return true;
    }
    
    while(current != null){

      if (item.equals(current.data)){
        previous.next = current.next;
        current.next = null;
    
        this.size--;
        return true;
      }
      
      previous = previous.next;
      current = current.next;
      
    }

    return false;
  }
  
  public boolean contains(E item) {
    Node current = this.head;
    
    while(current != null){

      if (item.equals(current.data)){
        return true;
      }
      
      current = current.next;
      
    }
      
    return false;
  }
  
  public void display() {
     Node current = this.head;
     
     while(current != null){
       
       System.out.println(current.data);

       current = current.next;
      
    }
  }
}