package model;

import java.util.ArrayList;
import java.util.List;

public class Pergunta {

    private Database database = new Database();

    private String pergunta;
    private List<Integer> notas;

    public Pergunta() {
        notas = new ArrayList<>();
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNotas(Integer nota) {
        notas.add(nota);
    }

    public void clearNotas() {
        notas.clear();
    }

    public void inserirPergunta(String pergunta, Integer nota, Integer idPesquisa) {
        database.getConnection().update(
                "INSERT INTO pergunta (pergunta, resposta, fkPesquisa) values (?, ?, ?)", pergunta, nota, idPesquisa
        );
    }

}
