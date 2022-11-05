package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

public class PesquisaSatisfacao {

    private Database database = new Database();

    private Integer idPesquisa;

    public void setIdPesquisa(Integer idPesquisa) {
        this.idPesquisa = idPesquisa;
    }

    public Integer getIdPesquisa() {
        return idPesquisa;
    }

    public void setIdPesquisaSatisfacao(Integer idUsuario) {
        database.getConnection().update(
                "INSERT INTO pesquisa (fkUsuario) values (?)", idUsuario
        );
    }

    public PesquisaSatisfacao getIdPesquisaSatisfacao(Integer idUsuario) {
        List<PesquisaSatisfacao> pesquisa = database.getConnection().query("SELECT TOP 1 idPesquisa FROM pesquisa WHERE fkUsuario = " + idUsuario
                + "AND CONVERT(VARCHAR,dataPesquisa,111) like '____/" + getDateTime() + "%' order by idPesquisa desc;",
                new BeanPropertyRowMapper(PesquisaSatisfacao.class));
        if (pesquisa.isEmpty()) {
            return null;
        } else {
            setIdPesquisa(pesquisa.get(0).getIdPesquisa());
            return pesquisa.get(0);
        }
    }

    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("MM");
        Date date = new Date();
        return dateFormat.format(date);
    }

    @Override
    public String toString() {
        return String.format("%d", getIdPesquisa());
    }

}
