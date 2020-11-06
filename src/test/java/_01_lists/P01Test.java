package _01_lists;


import org.junit.Test;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.*;

import static org.junit.Assert.assertThat;
public class P01Test {
    @Test
    public void shouldFindLastElementFromAListOfAlphabets() throws Exception{
    assertThat(P01.last(asList("a","b","c","d")),is(equalTo('d')));
    }
}
