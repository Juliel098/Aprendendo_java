package uniftc.projeto;


public class Pessoa {
    protected int id_pessoa;
    protected String nome;
    protected String email;
    
    public int getId_pessoa(){
        return this.id_pessoa;
        
    }
    
    public void setId_pessoa(int id){
        this.id_pessoa = id;
        
    }
    
    public String getNome(){
        return this.nome;
    }

    public void setNome(String name){
        this.nome = name;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setEmail(String em){
        this.email = em;
    }



}
