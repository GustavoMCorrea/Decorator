package org.example.decorator;

public class PrimeVideo implements Streaming{

    public float valorAssinatura;

    public PrimeVideo(){

    }

    public PrimeVideo(float valorAssinatura){
        this.valorAssinatura = valorAssinatura;
    }
    @Override
    public float getValorTotalAssinatura() {
        return valorAssinatura ;
    }

    @Override
    public String getListaStreaming() {
        return "Prime Video";
    }
}
