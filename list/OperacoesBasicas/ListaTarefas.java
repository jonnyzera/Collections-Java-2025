import java.util.List;

public class ListaTarefas{
    //Atributos
    private List<Tarefa> tarefaList;

    // Construtor
    public ListaTarefas(){
        this.tarefaList = new ArrayList<>();
    }
    
    // Métodos: adicionarTarefa, removerTarefa, obterNumeroTotalTarefa, obterDescricoesTarefa
    // Adiconar uma tarefa
       public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    // Remover uma tarefa
    public void removerTarefa(String descricao){
       List<Tarefa> tarefasParaRemover = new ArrayList<>();
       for (String Tarefa : tarefaList){
        if(t.getDescricao().equalsIgnoreCase(descricao)){
            tarefasParaRemover.add(t);
        }
       }
       tarefaList.removeAll(tarefasParaRemover)
    }

    // Obter total tarefas
    public int obterNumeroTotalTarefa(){
       return tarefaList.size();
    }

    // Obter descrições tarefas
    public void obterDescricoesTarefa(){
       System.out.println(tarefaList);
    }
}