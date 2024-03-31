package org.example.decorator;

public abstract class StreamingDecorator implements Streaming {

    private Streaming streaming;

    public String nomeStreaming;

    public StreamingDecorator(Streaming streaming){
        this.streaming = streaming;
    }

    public Streaming getStreaming(){
        return streaming;
    }

    public abstract float getValorAssinatura();

    public float getValorTotalAssinatura(){
        return this.streaming.getValorTotalAssinatura() + this.getValorAssinatura();
    }

    public abstract String getNomeStreaming();

    public String getListaStreaming(){
        return this.streaming.getListaStreaming() + ", " + this.getNomeStreaming();
    }

    public void setNomeStreaming(){
        this.nomeStreaming = nomeStreaming;
    }

}
