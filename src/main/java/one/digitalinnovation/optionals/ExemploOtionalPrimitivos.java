package one.digitalinnovation.optionals;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExemploOtionalPrimitivos {

    public static void main(String[] args) {

        System.out.println("***Valor inteiro opcional***");
        OptionalInt.of(12).ifPresent(System.out::println);

        System.out.println("***Valor decimal opcional***");
        OptionalDouble.of(55.0).ifPresent(System.out::println);

        System.out.println("***Valor longo opcional***");
        OptionalLong.of(23L).ifPresent(System.out::println);

    }

}
