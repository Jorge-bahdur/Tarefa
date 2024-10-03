public class Tarefa {
    private String descricao;
    private String prioridade;
    private String status;

    public Tarefa(String descricao, String prioridade){
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.status = "pendente";
    }

    public String getDescricao(){
        return descricao;
    }
    public String getPrioridade(){
        return prioridade;
    }
    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }
}
