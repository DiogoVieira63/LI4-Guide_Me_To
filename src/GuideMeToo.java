import java.util.*;

public class GuideMeToo {
    
    private GestaoUtilizador utilizadores = new GestaoUtilizador();
    private GestaoCentroHistorico centros = new GestaoCentroHistorico();

    public boolean newUser(String nome, String password, String email){
        return utilizadores.newUser(nome, password, email);
    }

    public boolean newUser(String nome, String password, String email, String num_telefone){
        return utilizadores.newUser(nome, password, email, num_telefone);
    }

    public boolean loginIn(String email, String password){
        return utilizadores.logIn(email,password);
    }

    public boolean logOut(String email, String password){
        return utilizadores.logOut(email, password);
    }

    public String getSite(String nome){ 
        return centros.getSite(nome); 
    }

    public List<Notificacao> getNotificacoes(String nome){
        return utilizadores.getNotificoes(nome);
    }
    
    public List<Notificacao> getNotificacoes(){
        return utilizadores.getAllNotificacoes();
    }

    public L
}