package br.senac.rn.lojarapida.model;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "tb_cliente")  // Para poder usar bd e criar tabela
public class Cliente {
    @Id   // Define o campo que está abaixo com chave primaria
    @GeneratedValue(strategy = GenerationType.AUTO)   //Para que a chave primaria fique automatica
    private int id;
    private String nome;
    @Column(unique = true) // Para não repetir o campo cpf. (Em baixo)
    private String cpf;
    @ManyToOne
    private Sexo sexo;

        // Alt + Ins escolhe construtor.
        public Cliente() {
        }
    
    // Alt + Ins escolhe construtor e marca todos os campos.
        public Cliente(int id, String nome, String cpf, Sexo sexo) {
            this.id = id;
            this.nome = nome;
            this.cpf = cpf;
            this.sexo = sexo;
        }
    
    // Clica em Alt + Insert e escolhe Get Set  e Encapsular para tornar publica
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public Sexo getSexo() {
            return sexo;
        }

        public void setSexo(Sexo sexo) {
            this.sexo = sexo;
        }
        
    // Clica em Alt + Insert e equals/hashCode - Seleciona tudos dos dois lados.
        @Override
        public int hashCode() {
            int hash = 3;
            hash = 67 * hash + this.id;
            hash = 67 * hash + Objects.hashCode(this.nome);
            hash = 67 * hash + Objects.hashCode(this.cpf);
            hash = 67 * hash + Objects.hashCode(this.sexo);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Cliente other = (Cliente) obj;
            if (this.id != other.id) {
                return false;
            }
            if (!Objects.equals(this.nome, other.nome)) {
                return false;
            }
            if (!Objects.equals(this.cpf, other.cpf)) {
                return false;
            }
            return Objects.equals(this.sexo, other.sexo);
        }
        
        // Clica em Alt + Insert e toString()Seleciona todos menos a chave primaria.

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", cpf=" + cpf + ", sexo=" + sexo + '}';
    }
        
}
