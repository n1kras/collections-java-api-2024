package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContato() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.adicionarContato("Nicolas", 123456);
        agendaContato.adicionarContato("Nicolas", 4645);
        agendaContato.adicionarContato("Nicolas Rocha", 111111);
        agendaContato.adicionarContato("Nicolas BR",456483);
        agendaContato.adicionarContato("Giovana", 111111);
        agendaContato.adicionarContato("Nicolas", 88888);

        agendaContato.exibirContato();

       agendaContato.removerContato("Nicolas BR");
        agendaContato.exibirContato();

        System.out.println("O numero é: " + agendaContato.pesquisarPorNome("Giovana"));
   }
}