package co.com.sofkau.entrenamiento.curso.values;

import co.com.sofka.domain.generic.ValueObject;

import javax.lang.model.type.NullType;
import java.util.Objects;

public class Directiz implements ValueObject<String> {
    private final String value;

    public Directiz(String value) {
        //TODO: validacions
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return value;
    }
}
