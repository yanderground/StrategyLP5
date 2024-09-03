package org.example;

public class Transportadora {

    private float custoFrete;

    public float getCustoFrete() {
        return custoFrete;
    }

    public void calcularFreteRodoviario(float peso, float distancia) {
        CalculadoraFrete calculadora = new CalculadoraFrete(peso, distancia);
        this.custoFrete = calculadora.calcular(new FreteRodoviario());
    }

    public void calcularFreteAereo(float peso, float distancia) {
        CalculadoraFrete calculadora = new CalculadoraFrete(peso, distancia);
        this.custoFrete = calculadora.calcular(new FreteAereo());
    }

    public void calcularFreteMaritimo(float peso, float distancia) {
        CalculadoraFrete calculadora = new CalculadoraFrete(peso, distancia);
        this.custoFrete = calculadora.calcular(new FreteMaritimo());
    }
}
