package org.example.decorator;

public class TeleCine extends StreamingDecorator{

    public TeleCine(Streaming streaming) {
        super(streaming);
    }

    @Override
    public float getValorAssinatura() {
        return 29.90f;
    }

    @Override
    public String getNomeStreaming() {
        return "Telecine";
    }
}
