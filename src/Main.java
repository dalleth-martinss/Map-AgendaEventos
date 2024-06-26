import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 7, 10), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 10, 18), "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 4, 14), "Evento 4", "Atração 4");
        agendaEventos.adicionarEvento(LocalDate.of(2021, 3, 13), "Evento 5", "Atração 5");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 11, 18), "Evento 6", "Atração 6");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 5, 14), "Evento 7", "Atração 7");
        agendaEventos.adicionarEvento(LocalDate.of(2021, 2, 13), "Evento 8", "Atração 8");

        agendaEventos.exibirAgenda();

         agendaEventos.obterProximoEvento();


     }
}