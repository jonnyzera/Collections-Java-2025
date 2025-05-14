package list.OperacoesBasicas;

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
        ListaTarefas list = new ListaTarefas();
        list.adicionarTarefa("Adicionando a primeiro tarefa");
        list.adicionarTarefa("Adicionando a primeiro tarefa");
        list.adicionarTarefa("Adicionando a segunda tarefa");
        System.out.println("A quantidade total de elementos: " + list.obterNumeroTotalTarefa());

        list.removerTarefa("Adicionando a primeiro tarefa");
        System.out.println("A quantidade total de agora: " + list.obterNumeroTotalTarefa());

        list.obterDescricoesTarefa();
    }
}