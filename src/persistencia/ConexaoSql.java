package persistencia;

import classes.Pessoas;
import interfaces.Cadastro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;



public class ConexaoSql {
    Cadastro cadastro = new Cadastro();
    private Connection conexao ;
 
    /**
     *conecta ao banco de dados
     * 
     * @return
     */
    public boolean conectar(){
     try {
        
         String url = "jdbc:sqlite:database/dados.db";
         this.conexao=DriverManager.getConnection(url);
         System.out.println("conectou");
         return true;
     }
     catch(SQLException e){
         
         System.err.println(e.getMessage());
         return (false);
     }
     
 }

    /**
     * cdesconecta
     * @return
     */
    public boolean desconectar() {
        try {
            if (this.conexao.isClosed() == false){
            this.conexao.close();
                System.out.println("desconectou");
    
            return true;
          }
        } catch (SQLException e){
            
        
        System.err.println(e.getMessage());
        return (false);
         }
        System.out.println("desconectou");
     return true;
    }
    public Statement criarStatement(){
        try{
            return this.conexao.createStatement();
        } catch(SQLException e){
            
        }
        
        
        
        return null;
}
    public Connection getConexao(){
        return this.conexao;
        
    }
    public void executarSql(){
   
        
        boolean conectou;
        conectou = this.conectar();
    }
    
    public PreparedStatement criarPreparedStatement(String sql) {
        try{
            return this.conexao.prepareStatement(sql);
        }
        catch(SQLException e)
        {System.out.println(e.getMessage());
            return null;
        }
           
    }
    public void criarTabelaCliente() {

        String sql =("CREATE TABLE IF NOT EXISTS dados_cadastrais2 (cod INTEGER PRIMARY KEY AUTOINCREMENT,"
                + " nome VARCHAR (100), estado_civil VARCHAR, data_de_nascimento"
                + " VARCHAR, telefone VARCHAR"
                + ", celular VARCHAR, data_de_cadastro STRING, rg VARCHAR, cpf "
                + "VARCHAR, endereco VARCHAR, numero VARCHAR, complemento VARCHAR,"
                + " email STRING, comentarios STRING, status BOOLEAN,cep STRING ,numero_de_processo"
                + " String,nome2 String,nome3 String,assunto String,justica String, instancia String, orgao String, pessoa String);"
);

        //executando o sql de criar tabelas
        boolean conectou = false;

        try {
            conectou = this.conectar();
            
            Statement stmt = this.criarStatement();
            
            stmt.execute(sql);
            
            System.out.println("Tabela pessoa criada!");

        } catch (SQLException e) {
            System.out.println("falha ao criar tabela");
            //mensagem de erro na criação da tabela
        } finally {
            if(conectou){
                this.desconectar();
            }
        }

    }
    public Pessoas listar(){
        Pessoas pessoas= new Pessoas();
        
       ConexaoSql conexao = new ConexaoSql();
        ResultSet resultSet = null;
        Statement statement = null;
        conexao.conectar();
        String query = "SELECT * FROM dados_cadastrais2";
        statement = conexao.criarStatement();
        try{
           resultSet=statement.executeQuery(query);
        
           while(resultSet.next()){
               
               
                pessoas.setNome(resultSet.getString("nome"));
                pessoas.setEstado_civil(resultSet.getInt("estado_civil"));
                pessoas.setData_de_nascimento(resultSet.getString("data_de_nascimento"));
                pessoas.setTelefone(resultSet.getString("telefone"));
                pessoas.setCelular(resultSet.getString("celular"));
                pessoas.setData_de_cadastro(resultSet.getString("data_de_cadastro"));
                pessoas.setRg(resultSet.getString("rg"));
                pessoas.setCpf(resultSet.getString("cpf"));
                pessoas.setEndereco(resultSet.getString("endereco"));
                pessoas.setNumero(resultSet.getString("numero"));
                pessoas.setComplemento(resultSet.getString("complemento"));
                pessoas.setEmail(resultSet.getString("email"));
                pessoas.setComentarios(resultSet.getString("comentarios"));
                if((resultSet.getString("status"))=="1"){
                pessoas.setStatus(true);}
                else{
                     pessoas.setStatus(false);                     
                }
                
                
                
               
           }
        }
        catch(SQLException e){
            
            
            System.out.println(e.getMessage());
          
            
            
        }
        
        finally{
            try {
     
                resultSet.close();
            
                statement.close();
                conexao.desconectar();
            }
        catch(SQLException e){
                System.out.println(e.getMessage());
               
        }}return pessoas;
}
    
    }
     
    


    

    
    



