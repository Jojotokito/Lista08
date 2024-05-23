package ex1;

import java.math.BigDecimal;

public class FatorialController {

	public static BigDecimal calculaFatorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("O número deve ser não-negativo.");
        }
        return factorial(BigDecimal.valueOf(number));
    }

    private static BigDecimal factorial(BigDecimal number) {
        if (number.equals(BigDecimal.ZERO) || number.equals(BigDecimal.ONE)) {
            return BigDecimal.ONE;
        }
        return number.multiply(factorial(number.subtract(BigDecimal.ONE)));
    }
}
