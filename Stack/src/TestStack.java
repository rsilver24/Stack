// Roan Silver      Created: October 25th 2023        Last Edits: October 25th, 2023
// Collaborators:
public class TestStack {
    public static void main(String[] args) {

        // Tests Default Constructor

        Stack pancakes = new Stack();

        // - - - - - - - - - - - - - - - - - - - - - - - - - -

        System.out.println("Check for peek and push methods (should print 'flour, baking powder, sugar'): ");

        pancakes.push("flour");
        System.out.print(pancakes.peek());
        System.out.print(", ");

        pancakes.push("baking powder");
        System.out.print(pancakes.peek());
        System.out.print(", ");

        pancakes.push("sugar");
        System.out.println(pancakes.peek());

        System.out.println(" ");

        // - - - - - - - - - - - - - - - - - - - - - - - - - -

        System.out.println("Check for pop and size method (should print 'sugar 2', then 'baking powder 1', then 'flour 0'): ");

        System.out.print(pancakes.pop());
        System.out.print(" ");
        System.out.println(pancakes.size());

        System.out.print(pancakes.pop());
        System.out.print(" ");
        System.out.println(pancakes.size());

        System.out.print(pancakes.pop());
        System.out.print(" ");
        System.out.println(pancakes.size());

        System.out.println(" ");

        // - - - - - - - - - - - - - - - - - - - - - - - - - -

        System.out.print("Check for size method pt. 2 (should print '0'): ");
        System.out.println(pancakes.size());

        System.out.println(" ");

        // - - - - - - - - - - - - - - - - - - - - - - - - - -

        System.out.print("Check for isEmpty method (should print 'true'): ");
        System.out.println(pancakes.isEmpty());
    }
}
