package iterator;

import java.util.Iterator;
import java.util.Stack;

/*
 * this class looks at the next index of the stack and makes sure that there
 * is a next then goes next if it does
 * @returns new position of items
 */
public class StackIterator implements Iterator<String> {

  private Stack<String> items;
  private int position;
/*
 * constructor of items
 */
  public StackIterator(Stack<String> items) {
    this.items = items;
  }
/*
 * goes to the next item
 * @returns new position in items 
 */
  public String next() {
    if (hasNext()) {
      return items.elementAt(position++);
    } else {
      return null;
    }
  }
/*
 * checks to make sure that there is a next position in items
 * @returns boolean
 */
  public boolean hasNext() {
    if (position >= items.size() || items.get(position) == null) {
      return false;
    } else {
      return true;
    }
  }
}
