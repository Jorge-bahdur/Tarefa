public class App {
    public static void main(String[] args) throws Exception {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();

        Tarefa tarefa1 = new Tarefa("Estudar para a prova", "alta");
        Tarefa tarefa2 = new Tarefa("Fazer compras", "média");

        gerenciador.adicionarTarefa(tarefa1);
        gerenciador.adicionarTarefa(tarefa2);

        gerenciador.marcarConcluida(0);
         
        gerenciador.listarTarefas();

        gerenciador.listarTarefasPrioridade("média");
    }
}
