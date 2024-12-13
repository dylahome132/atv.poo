Public class Lampada{
    String formato;
    String tecnologia;
    int potencia;
    int vidautil;
    int fluxoluminoso;
}

float emconta(int potencia, int vidautil){
    return (float)potencia/vidautil;
}

void obterfluxoluminoso( int fluxoluminoso){
    this.fluxoluminoso = fluxoluminoso;
}

toString(){
    return formato + tecnologia;
}

public Lampada(String formato, String tecnologia, int potencia, int vidautil, int fluxoluminoso) {
    this.formato = formato;
    this.tecnologia = tecnologia;
    this.potencia = potencia;
    this.vidautil = vidautil;
    this.fluxoluminoso = fluxoluminoso;
}