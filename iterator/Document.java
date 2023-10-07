package iterator;

import java.util.Iterator;
import java.util.Stack;

public class Document {
    private String title;
    private Stack<String> undoStack;
    private Stack<String> redoStack;

    public Document(String title){
        this.title = title;
        this.redoStack = new Stack<>();
        this.undoStack = new Stack<>();
    }
    public String makeChange (String change){
        if (change !=null & !change.isEmpty()){
            undoStack.push(change);
            redoStack.clear();
            return "Change Applied: " + change;
        }else{
            return "invalid";
        }
    }
    public String undoChange(){
        if(canUndo()){
            undoStack.pop();
            return "unded change";
        }
        return "invalid undo change";
    }
    public boolean canUndo(){
        if(undoStack.size() >=0 ){
            return true;
        }else{
            return false;
        }
    }
    public String redoChange(){
        if()
    }
    public boolean canRedo(){

    }
    public StackIterator getUndoIterator(){

    }
    public StackIterator getRedoIterator(){
        
    }

}
