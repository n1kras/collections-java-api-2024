package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Nicolas", 123456);
        agendaContatos.adicionarContato("Nicolas", 23165);
        agendaContatos.adicionarContato("Nicolas Rocha", 111111);
        agendaContatos.adicionarContato("Nicolas BR", 678910);
        agendaContatos.adicionarContato("Giovana", 111111);

        agendaContatos.exibirContatos(); // exibindo em ordem aleatoria por causa do hashset

        System.out.println(agendaContatos.pesquisarPorNome("Nicolas"));

        System.out.println("Contato Atualizado: " + agendaContatos.atualizarNumeroContato("Giovana", 6541651));

        agendaContatos.exibirContatos();
    }
}
