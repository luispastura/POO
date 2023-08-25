public class Eventos {
    String data, nome, local;
    int numeroMaxParticipantes;


    Eventos(String data, String nome, String local, int numeroMaxParticipantes) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.numeroMaxParticipantes = numeroMaxParticipantes;
    }

    void caracteristicaEvento(String nomeEvento, String dataEvento, String localEvento, int numeroParticipantesEvento){
        // Dirá as caracteristicas sobre evento
    }
}
