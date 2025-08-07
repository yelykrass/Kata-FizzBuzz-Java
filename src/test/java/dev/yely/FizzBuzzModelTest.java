package dev.yely;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzModelTest {

    private FizzBuzzModel fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzzModel();
    }

    @Test
    void testCheckNumber_NumberDivisibleBy3_ShouldReturnFizz() {
        // Given
        int numb = 3;
        String expected = "Fizz";
        // When
        String result = fizzBuzz.checkNumber(numb);
        // Then
        assertThat(result, is(equalTo(expected)));
    }

}
