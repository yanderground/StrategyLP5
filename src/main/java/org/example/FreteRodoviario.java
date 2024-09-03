package org.example;

public class FreteRodoviario implements Frete {

    @Override
    public float calcular(float peso, float distancia) {
        return peso * distancia * 0.05f;
    }
}
