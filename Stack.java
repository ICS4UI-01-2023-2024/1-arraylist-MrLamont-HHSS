public class Stack {
    private int[] items;
    private int numItems;

    // constructor for stack
    public Stack(){
        // start off with 5 spots
        this.items = new int[5];
        // no items to start
        this.numItems = 0;
    }

    public int size(){
        return this.numItems;
    }

    public boolean isEmpty(){
        return this.numItems == 0;
    }

    // take a look at the item on top
    public int peek(){
        // if it is empty, throw an error
        if(this.isEmpty()){
            throw new IndexOutOfBoundsException("The stack is empty");
        }else{
            return this.items[this.numItems - 1];
        }
    }

    public void push(int number){
        // check if it is full
        if(this.numItems == this.items.length){
            // make the array bigger
            makeArrayBigger();
        }
        // add the number to the stack
        this.items[this.numItems] = number;
        // increase our item count
        this.numItems++;
    }


    public int pop(){
        // get the item from the top
        int item = this.peek();
        // decrease the number of items
        this.numItems--;
        // optional: make it ("erase it")
        this.items[this.numItems] = 0;
        // return the former top item
        return item;
    }


    private void makeArrayBigger() {
        // make a new array twice as big
        int[] biggerArray = new int[this.items.length * 2];
        // use a loop to copy all the data
        for(int i = 0; i < this.items.length; i++){
            biggerArray[i] = this.items[i];
        }
        // set our array to the bigger one
        this.items = biggerArray;
    }


}
