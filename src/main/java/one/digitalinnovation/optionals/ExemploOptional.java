package one.digitalinnovation.optionals;

import java.util.Optional;

public class ExemploOptional {

    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("Valor opcional");

        System.out.println(optionalString.isPresent());

        optionalString.ifPresent(System.out::println);

        optionalString.ifPresentOrElse(System.out::println,
                () -> System.out.println("Valor não está presente"));

        if (optionalString.isPresent()) {
            String valor = optionalString.get();

            System.out.println(valor);
        }

        optionalString.map((valor) -> valor.concat("****")).ifPresent(System.out::println);

        optionalString.orElseThrow(IllegalStateException::new);



    }

}
