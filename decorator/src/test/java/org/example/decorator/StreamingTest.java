package org.example.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StreamingTest {

    @Test
    void deveRetornarValorTotalAssinatura() {
        Streaming streaming = new PrimeVideo(19.90f);

        assertEquals(19.90f, streaming.getValorTotalAssinatura());
    }

    @Test
    void deveRetornarListaAssinaturas() {
        Streaming streaming = new PrimeVideo(19.90f);

        assertEquals("Prime Video", streaming.getListaStreaming());
    }

    @Test
    void deveRetornarValorTotalAssinaturaComParamount() {
        Streaming streaming = new Paramount (new PrimeVideo(19.90f));

        assertEquals(34.80f, streaming.getValorTotalAssinatura());
    }

    @Test
    void deveRetornarListaAssinaturasComParamount() {
        Streaming streaming = new Paramount (new PrimeVideo(19.90f));

        assertEquals("Prime Video, Paramount+", streaming.getListaStreaming());
    }

    @Test
    void deveRetornarValorTotalAssinaturaComTeleCine() {
        Streaming streaming = new TeleCine (new PrimeVideo(19.90f));

        assertEquals(49.80f, streaming.getValorTotalAssinatura());
    }

    @Test
    void deveRetornarListaAssinaturasComTeleCine() {
        Streaming streaming = new TeleCine (new PrimeVideo(19.90f));

        assertEquals("Prime Video, Telecine", streaming.getListaStreaming());
    }

    @Test
    void deveRetornarValorTotalAssinaturaComPremiere() {
        Streaming streaming = new Premiere (new PrimeVideo(19.90f));

        assertEquals(79.80f, streaming.getValorTotalAssinatura());
    }

    @Test
    void deveRetornarListaAssinaturasComPremiere() {
        Streaming streaming = new Premiere (new PrimeVideo(19.90f));

        assertEquals("Prime Video, PREMIERE", streaming.getListaStreaming());
    }

    @Test
    void deveRetornarValorTotalAssinaturaComParamountMaisTeleCine() {
        Streaming streaming = new TeleCine (new Paramount (new PrimeVideo(19.90f)));

        assertEquals(64.70f, streaming.getValorTotalAssinatura());
    }

    @Test
    void deveRetornarListaAssinaturasComParamountMaisTeleCine() {
        Streaming streaming = new TeleCine (new Paramount (new PrimeVideo(19.90f)));

        assertEquals("Prime Video, Paramount+, Telecine", streaming.getListaStreaming());
    }

    @Test
    void deveRetornarValorTotalAssinaturaComParamountMaisTeleCineMaisPremiere() {
        Streaming streaming = new Premiere(new TeleCine (new Paramount (new PrimeVideo(19.90f))));

        assertEquals(124.60f, streaming.getValorTotalAssinatura());
    }

    @Test
    void deveRetornarListaAssinaturasComParamountMaisTeleCineMaisPremiere() {
        Streaming streaming = new Premiere(new TeleCine (new Paramount (new PrimeVideo(19.90f))));

        assertEquals("Prime Video, Paramount+, Telecine, PREMIERE", streaming.getListaStreaming());
    }
}