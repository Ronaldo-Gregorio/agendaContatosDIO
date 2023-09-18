import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos(){
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){

        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos ag = new AgendaContatos();

        ag.adicionarContato("Contato 1", 121223221);
        ag.adicionarContato("Contato 2", 141243130);
        ag.adicionarContato("Contato 3", 525290414);
        ag.adicionarContato("Contato 4", 502589092);
        ag.adicionarContato("Contato 5", 542984219);
        ag.adicionarContato("Contato 6", 421412441);

        ag.exibirContatos();

        ag.removerContato("Contato 4");
        ag.exibirContatos();

        System.out.println("O número é: " + ag.pesquisarPorNome("Contato 1"));
    }
}
