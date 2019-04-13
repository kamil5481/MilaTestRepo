import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class MyTaskTest {

    @Test
    public void testSimple() {
        //given
        int[] testData = new int[]{1, 2, 4, 5};
        int expectedOutput = 3 ;
        //when
        MyTask newTask = new MyTask();
        int actual = newTask.solution(testData);
        //then
        assertEquals(expectedOutput, actual);
    }

    @Test
    public void secondTest (){
        //given
        int[] testData = new int[]{10,8,5,2,1,7,3,6,9,0};
        int expectedOutput = 4;
        //when
        MyTask newTask = new MyTask();
        int actual = newTask.solution(testData);
        //then
        assertEquals(expectedOutput,actual);
    }



}