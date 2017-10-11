class ListArray<E> implements IList<E> {
  
  int max = 10;
  int size = 0;
  
  private Object items[] = new Object[max];
  
  ListArray() {}
  
  //item -> boolean
  //adds an item at the end of the list
  public boolean add (E item) {
    
    Object otherItems[];
    
    if (size == max) {
      max+=10;
      otherItems = new Object[max];
      
      for(int i = 0; i < this.size; i++) {
        otherItems[i] = items[i];
      }
      
      items = otherItems;
    }  
    
    this.items[this.size] = item;
    this.size++;
    
    return true;
  }
  
  // -> int
  // returns the element in the specific index
  int indexOf(E item) {
    for (int i = 0; i < this.size; i++) {
      if (item.equals(items[i])) {
        return i;
      }
    }
    
    return -1;
  }
  public boolean remove(E item) {
    if (size == 0) {
      return false; 
    }
    
    for (int i = 0; i < this.size; i++) {
      if (item.equals(items[i])) {
        if(i == this.size - 1){
          this.size--;
        return true;
        }else{
          for(int j = indexOf(item); j < this.size - 1; j++){
            items[j] = items[j + 1];
          }
          this.size--;
        return true;
        }
          
      }
    
    
    }
    return false;
  }
  
  public boolean contains(E item) {
    for (int i = 0; i < this.size; i++) {
      if (item.equals(items[i])) {
        return true;
      }
    }
    return false;
  }
  
  public void display() {
    for (int i = 0; i < this.size; i++) {
      System.out.println(items[i].toString());
    }
  }
}
