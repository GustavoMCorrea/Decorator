package org.example.decorator;

public class Premiere extends StreamingDecorator{
    public Premiere(Streaming streaming) {
        super(streaming);
    }

    @Override
    public float getValorAssinatura() {
        return 59.90f;
    }

    @Override
    public String getNomeStreaming() {
        return "PREMIERE";
    }
}
