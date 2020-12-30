package _01_lists;


import org.junit.Test;

import java.nio.file.Path;
import java.util.LinkedList;

import static _01_lists.CollectionUtils.linkedList;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.*;

import static org.junit.Assert.assertThat;
public class P01Test {
    @Test
    public void shouldFindLastElementFromAListOfAlphabets() throws Exception{
    assertThat(P01.last(asList("a","b","c","d")),is(equalTo("d")));
    }

    @Test
    public void shouldFindLastElemnetFromALinkedListsOfAlphabets() throws Exception{
        LinkedList<String> alphabets = linkedList("a","b","c","d");
        assertThat(P01.last(alphabets),is(equalTo("d")));
    }

    @Test
    public void shouldFindLastElementsFromAListOfAlphabetsUsingRecursion() throws Exception{
        assertThat(P01.lastRecursive(asList("a","b","c","d")),is(equalTo("d")));
    }
}
