Public class Pessoa{
    String nome;
    String sobrenome;
    int altura; //em cm
    int idade;
    int cpf;

}

void obtercpf(int cpf){
    this.cpf = cpf;
}

String nomeCompleto(String nome, String sobrenome){
    return this.nome+" "+this.sobrenome;
}

toString(){
    return nomeCompleto()+", nasceu em "+ (2024 - idade) +" e tem"+ altura+"cm de altura";
}

public Pessoa(String nome, String sobrenome, int altura, int idade) {
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.altura = altura;
    this.idade = idade;
}