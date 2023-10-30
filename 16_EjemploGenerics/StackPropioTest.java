import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StackPropioTest {
    @Test
    public void PushStringTest(){
        StackPropio<String> miStack = new StackPropio<String>();
        assertEquals(0, miStack.getCount());
        miStack.push("Moises");
        assertEquals(1, miStack.getCount());
        assertEquals("Moises", miStack.peek());
    }

    @Test
    public void PushIntTest(){
        StackPropio<Integer> miStack = new StackPropio<Integer>();
        assertEquals(0, miStack.getCount());
        miStack.push(4);
        miStack.push(7);
        assertEquals(2, miStack.getCount());
        assertEquals("7", miStack.pop().toString());
        assertEquals(1, miStack.getCount());
        assertEquals("4", miStack.pop().toString());
        assertEquals(0, miStack.getCount());
    }

    @Test
    public void PushObjetTest(){
        StackPropio<User> miStack = new StackPropio<User>();

        User newUser1 = new User();
        newUser1.id = 100;
        newUser1.firstname = "Moises";
        newUser1.lastname = "Alonso";

        User newUser2 = new User();
        newUser2.id = 200;
        newUser2.firstname = "Antonio";
        newUser2.lastname = "Gonzalez";

        assertEquals(0, miStack.getCount());
        miStack.push(newUser1);
        miStack.push(newUser2);
        assertEquals(2, miStack.getCount());
        User temp = miStack.pop();
        assertEquals("Antonio", temp.firstname);
        assertEquals("Gonzalez", temp.lastname);
        assertEquals(200, temp.id);
        assertEquals(1, miStack.getCount());
        
    }
}
