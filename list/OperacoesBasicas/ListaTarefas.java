import java.util.List;
import java.util.ArrayList;
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
       for(Tarefa t : tarefaList){
        if(t.getDescricao().equalsIgnoreCase(descricao)){
            tarefasParaRemover.add(t);
        }
       }
       tarefaList.removeAll(tarefasParaRemover);
    }

    // Obter total tarefas
    public int obterNumeroTotalTarefa(){
       return tarefaList.size();
    }

    // Obter descrições tarefas
    public void obterDescricoesTarefa(){
       System.out.println(tarefaList);
    }
    public static void main(String [] args){

    }
}