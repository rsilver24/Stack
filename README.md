Stack class is meant to take a series of data and organize it in a "stack" structure, not all too different from a Java ArrayList.
What makes a Stack class unique is the way of which data is stored — only the topmost data can be accessed and broken.
The Stack class has 3 'key' methods, being push, pop, and peek. Push adds a new item to the 'stack', pop removes the top-most, and peek reveals the top-most.
The Stack class uses StackNodes to store data. These nodes contain a value, and a childNode pointing to the item beneath it in the stack.
The TestStack class within this repository is meant to check if the Stack class works, which in context also checks the StackNode class.
