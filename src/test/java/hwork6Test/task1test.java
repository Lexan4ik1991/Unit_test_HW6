package hwork6Test;
import hwork6.task1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class task1test {
    task1 listsCompare;

    private final List<Integer> listOne = Arrays.asList(3,7,51,6,9);
    private final List<Integer> listTwo = Arrays.asList(2,3,8,46,34);
    private final List<Integer> listNull = new ArrayList<>();

    @BeforeEach
    void testinit() {
        listsCompare = new task1();
    }

    // Unit test
    @Test
    void UTestAverageWithValues(){
        assertEquals(listsCompare.average(listOne), 15.2);
    }

    // Unit test null
    @Test
    void UTestAverageZero(){
        assertEquals(listsCompare.average(listNull), 0.0);
    }

    // Integration Test
    @Test
    void ITestCompareAverageTwo(){
        assertEquals(listsCompare.compareAverage(listOne, listTwo), "Второй список имеет большее среднее значение");
    }

    // Integration Test
    @Test
    void ITestCompareAverageOne(){
        assertEquals(listsCompare.compareAverage(listTwo, listOne), "Первый список имеет большее среднее значение");
    }

    // Integration Test
    @Test
    void ITestCompareAverageNone(){
        assertEquals(listsCompare.compareAverage(listOne, listOne), "Средние значения равны");
    }
}
