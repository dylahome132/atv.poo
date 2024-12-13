package atv.poo;

Public static main{
    Public static main(String [] args){
        //Pessoa
        Pessoa pessoa1 = new Pessoa("João", "Silva", 175, 25);
        pessoa1.obterCpf(123456789); 
        System.out.println(pessoa1); 

        Pessoa pessoa2 = new Pessoa("Maria", "Oliveira", 160, 30);
        pessoa2.obterCpf(987654321); 
        System.out.println(pessoa2); 

        Pessoa pessoa3 = new Pessoa("Carlos", "Costa", 180, 22);
        pessoa3.obterCpf(192837465); 
        System.out.println(pessoa3); 
        //Carro
        Carro carro1 = new Carro("Fusca", "Volkswagen", 4, 40, 10);
        System.out.println(carro1); 
        System.out.println("Gasto de combustível: " + carro1.gastoCombustivel() + " litros por km");

        Carro carro2 = new Carro("Civic", "Honda", 5, 50, 12);
        System.out.println(carro2); 
        System.out.println("Gasto de combustível: " + carro2.gastoCombustivel() + " litros por km");

        Carro carro3 = new Carro("Camaro", "Chevrolet", 2, 70, 8);
        System.out.println(carro3); 
        System.out.println("Gasto de combustível: " + carro3.gastoCombustivel() + " litros por km");

        //Lampada
        Lampada lampada1 = new Lampada("A60", "LED", 10, 25000, 800);
        System.out.println(lampada1);
        System.out.println("Consumo de energia por hora: " + lampada1.emConta() + " watts/hora");

        Lampada lampada2 = new Lampada("E27", "Incandescente", 60, 1000, 900);
        System.out.println(lampada2); 
        System.out.println("Consumo de energia por hora: " + lampada2.emConta() + " watts/hora");

        Lampada lampada3 = new Lampada("PAR20", "Halógena", 50, 2000, 700);
        System.out.println(lampada3);
        System.out.println("Consumo de energia por hora: " + lampada3.emConta() + " watts/hora");
        
        //Aluno
        Aluno aluno1 = new Aluno("João", "Silva", "Engenharia", 3);
        aluno1.obterMatricula(123456);
        System.out.println("Aluno: " + aluno1.names());
        System.out.println("Curso: " + aluno1.obterCurso());
        System.out.println("Matrícula: " + aluno1.matricula);

        Aluno aluno2 = new Aluno("Maria", "Oliveira", "Medicina", 5);
        aluno2.obterMatricula(987654);
        System.out.println("\nAluno: " + aluno2.names());
        System.out.println("Curso: " + aluno2.obterCurso()); 
        System.out.println("Matrícula: " + aluno2.matricula); 

        Aluno aluno3 = new Aluno("Carlos", "Costa", "Direito", 2);
        aluno3.obterMatricula(192837);
        System.out.println("\nAluno: " + aluno3.names()); 
        System.out.println("Curso: " + aluno3.obterCurso());
        System.out.println("Matrícula: " + aluno3.matricula); 
    }
}
