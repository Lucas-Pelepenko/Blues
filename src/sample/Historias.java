package sample;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

public class Historias  implements Comparable<Historias>{

    public SimpleLongProperty idhistoria = new SimpleLongProperty();
    public SimpleLongProperty idsprint = new SimpleLongProperty();
    public SimpleStringProperty idstatus = new SimpleStringProperty();
    public SimpleStringProperty nomehist = new SimpleStringProperty();
    public SimpleStringProperty descricao = new SimpleStringProperty();
    public SimpleIntegerProperty valuebusiness = new SimpleIntegerProperty();
    public SimpleIntegerProperty pontos = new SimpleIntegerProperty();
    public SimpleObjectProperty dtcriacao = new SimpleObjectProperty<>();
    public SimpleObjectProperty dtalteracao = new SimpleObjectProperty<>();
    public SimpleIntegerProperty valordenegocio = new SimpleIntegerProperty();
    public SimpleStringProperty tipo = new SimpleStringProperty();


    public void setvalordenegocio(Integer valor) {
            this.valordenegocio.set(valor);
    }

    public long getvalordenegocio() {
        return valordenegocio.get();
    }

    public SimpleIntegerProperty valordenegocio() { return valordenegocio; }

    public int getPontos() { return pontos.get(); }

    public SimpleIntegerProperty pontosProperty() { return pontos; }

    public void setPontos(int pontos) { this.pontos.set(pontos); }

    public String getDescriscao() { return descricao.get(); }

    public SimpleStringProperty descriscaoProperty() { return descricao; }

    public void setDescricao(String descricao) { this.descricao.set(descricao); }

    public String getTipo() { return tipo.get(); }

    public SimpleStringProperty tipoProperty() { return tipo; }

    public void setTipo(String tipo) { this.tipo.set(tipo); }

    public long getIdhistoria() {
        return idhistoria.get();
    }

    public SimpleLongProperty idhistoriaProperty() {
        return idhistoria;
    }

    public void setIdhistoria(Long idhistoria) {
        this.idhistoria.set(idhistoria);
    }

    public long getIdsprint() {
        return idsprint.get();
    }

    public SimpleLongProperty idsprintProperty() {
        return idsprint;
    }

    public void setIdsprint(Long idsprint) {
        this.idsprint.set(idsprint);
    }

    public String getIdstatus() {
        return idstatus.get();
    }

    public SimpleStringProperty idstatusProperty() {
        return idstatus;
    }

    public void setIdstatus(String idstatus) {
        this.idstatus.set(idstatus);
    }

    public String getNomehist() {
        return nomehist.get();
    }

    public SimpleStringProperty nomehistProperty() {
        return nomehist;
    }

    public void setNomehist(String nomehist) {
        this.nomehist.set(nomehist);
    }

    public int getValuebusiness() {
        return valuebusiness.get();
    }

    public SimpleIntegerProperty valuebusinessProperty() {
        return valuebusiness;
    }

    public void setValuebusiness(int valuebusiness) {
        this.valuebusiness.set(valuebusiness);
    }

    public Object getDtcriacao() {
        return dtcriacao.get();
    }

    public SimpleObjectProperty dtcriacaoProperty() {
        return dtcriacao;
    }

    public void setDtcriacao(Object dtcriacao) {
        this.dtcriacao.set(dtcriacao);
    }

    public Object getDtalteracao() {
        return dtalteracao.get();
    }

    public SimpleObjectProperty dtalteracaoProperty() {
        return dtalteracao;
    }

    public void setDtalteracao(Object dtalteracao) {
        this.dtalteracao.set(dtalteracao);
    }

    @Override
    public int compareTo(Historias outraHist) {
        if ( this.getvalordenegocio() > outraHist.getvalordenegocio()) {
            return -1;
        }
        if (this.getvalordenegocio() < outraHist.getvalordenegocio()) {
            return 1;
        }
        return 0;
    }

}
