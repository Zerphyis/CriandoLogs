package Principal.VerificarLogin.Usuarios;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;

@Table(name= "Principal/VerificarLogin/Usuarios")
@Entity(name = "Principal/VerificarLogin/Usuarios")
@EqualsAndHashCode(of="id")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean ativo;


    private String nome;
    private String Email;

    private String Senha;


    public Users(DataUsers dados) {
        this.nome = dados.nome();
        this.Email = dados.email();
        this.Senha = dados.senha();
        this.ativo= true;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }
    public void excluir(){
        this.ativo=false;
    }

}
