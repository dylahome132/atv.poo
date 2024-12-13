Public class Aluno{
    String name;
    String surname;
    String curso;
    int periodo;
    int matricula;
}

String obtercurso(String curso, int periodo){
    return this.curso+" P"+this.periodo;
}

void obtermatricula(int matricula){
    this.matricula = matricula;
}

String names(String name, String surname){
    return this.name+" "+this.surname;
}

public Aluno(String name, String surname, String curso, int periodo) {
    this.name = name;
    this.surname = surname;
    this.curso = curso;
    this.periodo = periodo;
}
