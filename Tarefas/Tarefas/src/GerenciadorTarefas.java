public class GerenciadorTarefas {
    private Tarefa[] tarefas;
    private int tamanho;

    public GerenciadorTarefas(){
        this.tarefas = new Tarefa[50];
        this.tamanho = 0;
    }

    public void adicionarTarefa(Tarefa tarefa){
        if(tamanho < 50){
            tarefas[tamanho] = tarefa;
            tamanho++;
        }else{
            System.out.println("Limite de tarefas atingido.");
        }
    }

    public void removerTarefa(int posicao){
        if(posicao >= 0 && posicao < tamanho){
            for(int i = posicao;i < tamanho - 1;i++){
                tarefas[i] = tarefas[i + 1];
            }
            tarefas[tamanho - 1] = null;
            tamanho--;
        }else{
            System.out.println("Posição inválida.");
        }
    }

    public void marcarConcluida(int posicao){
        if(posicao >= 0 && posicao < tamanho){
            tarefas[posicao].setStatus("concluída");
        } else{
            System.out.println("Posição inválida");
        }
    }

    public void listarTarefas(){
        System.out.println("Tarefas pendentes:");
        for(int i=0;i<tamanho;i++){
            if(tarefas[i].getStatus().equals("pendente")){
                System.out.println(tarefas[i].getDescricao() + " - " + tarefas[i].getPrioridade());
            }
        }
        System.out.println("/nTarefas concluídas:");
        for(int i=0;i<tamanho;i++){
            if(tarefas[i].getStatus().equals("concluída")){
                System.out.println(tarefas[i].getDescricao() + " - " + tarefas[i].getPrioridade());
            }
        }
    }

    public void listarTarefasPrioridade(String prioridade){
        System.out.println("Tarefas com prioridade" + prioridade + ":");
        for(int i=0;i<tamanho;i++){
            if(tarefas[i].getPrioridade().equals(prioridade)){
                System.out.println(tarefas[i].getDescricao());
            }
        }
    }
 }
