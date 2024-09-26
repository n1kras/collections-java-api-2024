package Map.Ordenacao;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate,Evento> agendaEventoMap;

    public AgendaEventos() {
        this.agendaEventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        agendaEventoMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventoMap);
        System.out.println(eventosTreeMap);
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();


    }
}
