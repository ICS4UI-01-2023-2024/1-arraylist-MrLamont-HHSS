import org.junit.*;
import static org.junit.Assert.*;

public class TestStack {
    
    private Stack testStack;

    // this method runs BEFORE every test
    @Before
    public void setUp(){
        this.testStack = new Stack();
    }

    @Test
    public void testSize(){
        // test when stack is empty
        int size = this.testStack.size();
        // test to make sure it is 0
        // assertEquals(expected value, test value)
        assertEquals(0, size);
        
        // add a few items
        this.testStack.push(4);
        this.testStack.push(1);
        this.testStack.push(5);
        size = this.testStack.size();
        assertEquals(3, size);
    }

    @Test
    public void testPush(){
        int[] testValues = {1, 4, -2};
        int[] expectedValues = {-2, 4, 1};
        for(int i = 0; i < 3; i++){
            this.testStack.push(testValues[i]);
        }
        
        for(int i = 0; i < 3; i++){
            assertEquals(expectedValues[i], this.testStack.pop());
        }

        
    }

    /** 
     * Do something like this to test array list
     * 
     * 
    @Test
    public void testRemove(){
        int[] testValues = {1, 4, -2};
        int[] expectedValues = {-2, 4,1};
        for(int i = 0; i < 3; i++){
            this.testStack.add(testValues[i]);
        }

        assertEquals(4, this.testStack.remove(1));

        for(int i = 0; i < 2; i++){
            assertEquals(expectedValues[i], this.testStack.get(i));
        }
    }

    */


}
