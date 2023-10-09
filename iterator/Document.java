package iterator;

import java.util.Iterator;
import java.util.Stack;

/*
 * This class has all the methods to execute the commands of the user
 * This class checks if the the user can make change/redo/undo
 * @returns user changes/ undo/ redo
 */
public class Document {

  private String title;
  private Stack<String> undoStack = new Stack<String>();
  private Stack<String> redoStack = new Stack<String>();

  /*
   * @returns title of document
   */
  public Document(String title) {
    this.title = title;
  }
/*
 * makes change in document
 * @returns string + the change applied
 */
  public String makeChange(String change) {
    undoStack.add(change);
    return "Change Applied: " + change;
  }
/*
 * undos change in document
 * @returns the string that was undoed
 */
  public String undoChange() {
    String undo = undoStack.pop();
    redoStack.add(undo);
    return "unded change " + undo;
  }
/*
 * checks if it can undo the change / undoStack can not be null
 * @returns boolean
 */
  public boolean canUndo() {
    if (undoStack == null) {
      return false;
    } else {
      return true;
    }
  }
/*
 * redos change in document
 * @returns the string that was unded
 */
  public String redoChange() {
    if (canRedo()) {
      String redo = redoStack.pop();
      undoStack.add(redo);
      return "reded change " + redo;
    } else {
      return "invaild redo change ";
    }
  }
/*
 * checks if it can redo the change / redoStack can not be null
 * @returns boolean
 */
  public boolean canRedo() {
    if (redoStack == null) {
      return false;
    } else {
      return true;
    }
  }

  public StackIterator getUndoIterator() {
    return new StackIterator(undoStack);
  }

  public StackIterator getRedoIterator() {
    return new StackIterator(redoStack);
  }
}
