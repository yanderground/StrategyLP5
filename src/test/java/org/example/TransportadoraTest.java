package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransportadoraTest {

    @Test
    void deveCalcularFreteRodoviario() {
        Transportadora transportadora = new Transportadora();
        transportadora.calcularFreteRodoviario(100.0f, 500.0f);
        assertEquals(2500.0f, transportadora.getCustoFrete());
    }

    @Test
    void deveCalcularFreteAereo() {
        Transportadora transportadora = new Transportadora();
        transportadora.calcularFreteAereo(100.0f, 500.0f);
        assertEquals(5000.0f, transportadora.getCustoFrete());
    }

    @Test
    void deveCalcularFreteMaritimo() {
        Transportadora transportadora = new Transportadora();
        transportadora.calcularFreteMaritimo(100.0f, 500.0f);
        assertEquals(1000.0f, transportadora.getCustoFrete());
    }
}
