Public class Carro{
    String modelo;
    String marca;
    int capacidadePassageiros;
    int cpcdCombustivel;
    int consumoCombustivel;
}

float gastoCombustivel(int consumoCombustivel, int cpcdCombustivel){
    return this.cpcdCombustivel/this.consumoCombustivel;
}

void obteracentos(int capacidadePassageiros){
    this.capacidadePassageiros = capacidadePassageiros;
}

toString(){
    return marca + modelo;
}

public Carro(String modelo, String marca, int capacidadePassageiros, int cpcdCombustivel, int consumoCombustivel) {
    this.modelo = modelo;
    this.marca = marca;
    this.capacidadePassageiros = capacidadePassageiros;
    this.cpcdCombustivel = cpcdCombustivel;
    this.consumoCombustivel = consumoCombustivel;
}