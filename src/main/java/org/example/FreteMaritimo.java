package org.example;

public class FreteMaritimo implements Frete {

    @Override
    public float calcular(float peso, float distancia) {
        return peso * distancia * 0.02f;
    }
}
