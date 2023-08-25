public class App {
    public static void main(String[] args) throws Exception {
        Eventos evento1, evento2;
        Palestrante palestrante1;
        Aluno aluno1;

        evento1 = new Eventos(null, null, null, 0);
        evento1.nome = "Green Day";
        evento1.data = "21 de Maio";
        evento1.local = "Barra da Tijuca";
        evento1.numeroMaxParticipantes = 12_000;

        System.out.println(evento1.nome);
        System.out.println(evento1.data);
        System.out.println(evento1.local);
        System.out.println(evento1.numeroMaxParticipantes);


        System.out.println("------------------------------");

        evento2 = new Eventos(null, null, null, 0);
        evento2.nome = "Beatles";
        evento2.data = "22 de Maio";
        evento2.local = "Barra da Tijuca";
        evento2.numeroMaxParticipantes = 8_000;

        System.out.println(evento2.nome);
        System.out.println(evento2.data);
        System.out.println(evento2.local);
        System.out.println(evento2.numeroMaxParticipantes);


        System.out.println("------------------------------");


        palestrante1 = new Palestrante("Tobias", "21981322654", "tobias@gmail.com");
        System.out.println(palestrante1.nome);
        System.out.println(palestrante1.telefone);
        System.out.println(palestrante1.email);

        System.out.println("----------------------------");

        aluno1 = new Aluno("Norica", "norica@gmail", "Rua dos bobos", "masculino", "Green Day", 22);
        System.out.println(aluno1.nome);
        System.out.println(aluno1.email);
        System.out.println(aluno1.endereco);
        System.out.println(aluno1.sexo);
        System.out.println(aluno1.ingresso);
    }
}