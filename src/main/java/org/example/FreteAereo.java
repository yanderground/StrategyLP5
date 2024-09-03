package org.example;

public class FreteAereo implements Frete {

    @Override
    public float calcular(float peso, float distancia) {
        return peso * distancia * 0.1f;
    }
}
