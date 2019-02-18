/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import Banco.ConexaoSQLite;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author vinicius
 */
public class CriarBancoSQLite {
    
    private ConexaoSQLite conexaoSQLite = new ConexaoSQLite();
    
    /*public CriarBancoSQLite(ConexaoSQLite pconexaoSQLite){
        this.conexaoSQLite = pconexaoSQLite;
    }*/
    
    public void criarTabelaPessoa(){
        String sql = "CREATE TABLE IF NOT EXISTS tbl_pessoa"
                + "("
                + "id integer PRIMARY KEY,"
                + "nome text NOT NULL,"
                + "idade integer"
                + ");";
        
        boolean conectou = false;
        
        try{
            conectou = this.conexaoSQLite.conectar();
            Statement stmt = this.conexaoSQLite.criarStatement();
            stmt.execute(sql);
            System.out.println("Tabela pessoa criada!");
            
        }catch(SQLException e){
            
        }finally{
            if(conectou==true){
                this.conexaoSQLite.desconectar();
            }
        }
        
        
    }
    
    public void criarTabelaVeiculo(){
        String sql = "CREATE TABLE IF NOT EXISTS tbl_veiculo"
                + "("
                + "placa text PRIMARY KEY,"
                + "cor text NOT NULL,"
                + "marca text NOT NULL,"
                + "modelo text NOT NULL,"
                + "kilometragem float NOT NULL,"
                + "disponibilidade text NOT NULL"
                + ");";
        
        boolean conectou = false;
        
        try{
            conectou = this.conexaoSQLite.conectar();
            Statement stmt = this.conexaoSQLite.criarStatement();
            stmt.execute(sql);
            System.out.println("Tabela veiculo criada!");
            
        }catch(SQLException e){
            
        }finally{
            if(conectou==true){
                this.conexaoSQLite.desconectar();
            }
        }
        
        
    }
    
    public void criarTabelaCliente(){
        String sql = "CREATE TABLE IF NOT EXISTS tbl_cliente"
                + "("
                + "cpf text PRIMARY KEY,"
                + "nome_usuario text NOT NULL,"
                + "senha text NOT NULL,"
                + "nome text NOT NULL,"
                + "data_nasc text NOT NULL,"
                + "endereco text NOT NULL"
                + ");";
        
        boolean conectou = false;
        
        try{
            conectou = this.conexaoSQLite.conectar();
            Statement stmt = this.conexaoSQLite.criarStatement();
            stmt.execute(sql);
            System.out.println("Tabela Cliente criada!");
            
        }catch(SQLException e){
            
        }finally{
            if(conectou==true){
                this.conexaoSQLite.desconectar();
            }
        }
        
        
    }
    
    public void criarTabelaAdministrador(){
        String sql = "CREATE TABLE IF NOT EXISTS tbl_administrador"
                + "("
                + "nome_usuario text PRIMARY KEY,"
                + "senha text NOT NULL"
                + ");";
        
        boolean conectou = false;
        
        try{
            conectou = this.conexaoSQLite.conectar();
            Statement stmt = this.conexaoSQLite.criarStatement();
            stmt.execute(sql);
            System.out.println("Tabela Administradores criada!");
            
        }catch(SQLException e){
            
        }finally{
            if(conectou==true){
                this.conexaoSQLite.desconectar();
            }
        }
        
        
    }
    
    public void criarTabelaLocacao(){
        String sql = "CREATE TABLE IF NOT EXISTS tbl_locacao"
                + "("
                + "codigo text PRIMARY KEY,"
                + "placa_veiculo text NOT NULL,"
                + "cpf_cliente text NOT NULL,"
                + "data_locacao text NOT NULL,"
                + "data_devolucao text"
                + ");";
        
      
        
        boolean conectou = false;
        
        try{
            conectou = this.conexaoSQLite.conectar();
            Statement stmt = this.conexaoSQLite.criarStatement();
            stmt.execute(sql);
            System.out.println("Tabela Locacoes criada!");
            
        }catch(SQLException e){
            
        }finally{
            if(conectou==true){
                this.conexaoSQLite.desconectar();
            }
        }
        
        
    }
    
}
