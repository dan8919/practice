package _01_lists;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


import static _01_lists.CollectionUtils.linkedList;
import static org.hamcrest.CoreMatchers.is;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class P03Test {
    @Test
    public void shouldFindKthElementsFromAList() throws Exception{
        List<Integer> numbers = asList(1,2,3,4,5);
        assertThat(P03.kth(numbers,2),is (equalTo(3)));
    }
    @Test
    public void shouldFindKthElemnetFromAlistRecursive() throws Exception{
        LinkedList<Integer> numbers = linkedList(1,2,3,4,5);
        assertThat(P03.kthRecursive(numbers,2),is(equalTo(3)));
    }

    @Test
    public void shouldFindKthElemnetFromAList_LinkedListAndStream() throws Exception{
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        assertThat(P03.kthStream(numbers,2),is(equalTo(3)));
    }
}
