package org.example.decorator;

public class Paramount extends StreamingDecorator{
    public Paramount(Streaming streaming) {
        super(streaming);
    }

    @Override
    public float getValorAssinatura() {
        return 14.90f;
    }

    @Override
    public String getNomeStreaming() {
        return "Paramount+";
    }
}
