// Roan Silver      Created: September 21st 2023        Last Edits: September 26th, 2023
// Collaborators: Luke O'Drobinak & Ethan Ayers       Peer Comments: September 4th, 2023
public class StackNode<T> {

    // Instance Data !!!

    private StackNode parentNode;
    private StackNode childNode;
    private T value;

    // CONSTRUCTORS :D

    // Default "Empty" Constructor
    public StackNode(){
        parentNode = null;
        childNode = null;
        value = null;
    }

    // 1 Input Constructor
    public StackNode(T valueInput){
        this.value = valueInput;
        parentNode = null;
        childNode = null;
    }

    // 3 Input Constructor
    public StackNode(T valueInput, StackNode parentNodeInput, StackNode childNodeInput){
        this.value = valueInput;
        this.parentNode = parentNodeInput;
        this.childNode = childNodeInput;
    }

    // ACCESSORS :)

    public StackNode getParentNode(){
        return parentNode;
    }

    public StackNode getChildNode(){
        return childNode;
    }

    public T getValue(){
        return value;
    }

    // MUTATORS :/

    public void setParentNode(StackNode newParentNode){
        parentNode = newParentNode;
    }

    public void setChildNode(StackNode newChildNode){
        childNode = newChildNode;
    }

    public void setValue(T newValue){
        value = newValue;
    }

    // Method Overrides >:(

    public String toString(){
        return "Node: " + value;
    }

    public boolean equals(StackNode passingNode){
        if (this.getValue().equals(passingNode.getValue())){
            return true;
        } return false;
    }
}
