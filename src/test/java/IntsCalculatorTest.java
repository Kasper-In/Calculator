import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class IntsCalculatorTest {

    Ints calcInts;

    @BeforeEach
    public void setUp(){
      calcInts = new IntsCalculator();
    }

    @DisplayName("Проверка подсчета суммы")
    @ParameterizedTest
    @MethodSource("getSumArguments")
    void sum(int a, int b, int result) {
        Assertions.assertEquals(result, calcInts.sum(a,b));
    }

    @DisplayName("Проверка подсчета произведения")
    @ParameterizedTest
    @MethodSource("getMultArguments")
    void mult(int a, int b, int result) {
        Assertions.assertEquals(result, calcInts.mult(a,b));
    }

    @DisplayName("Проверка подсчета возведения в степень")
    @ParameterizedTest
    @MethodSource("getPowArguments")
    void pow(int a, int b, int result) {
        Assertions.assertEquals(result, calcInts.pow(a,b));
    }

    private static Stream<Arguments> getSumArguments(){
        return Stream.of(
                Arguments.of(12, 55, 67),
                Arguments.of(-81, 63, -18),
                Arguments.of(23, -23, 0)
        );
    }

    private static Stream<Arguments> getMultArguments(){
        return Stream.of(
                Arguments.of(10, 42, 420),
                Arguments.of(0, 13, 0),
                Arguments.of(5, -8, -40)
        );
    }

    private static Stream<Arguments> getPowArguments(){
        return Stream.of(
                Arguments.of(2, 5, 32),
                Arguments.of(-3, 3, -27),
                Arguments.of(25, 0, 1)
        );
    }
}