/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mode.bean.Administrador;
import mode.bean.Cliente;
import mode.bean.Locacao;
import mode.bean.Veiculo;

/**
 *
 * @author vinicius
 */


public class FuncoesBanco {
    
    ConexaoSQLite conexaoSQLite = new ConexaoSQLite();
       
    
    public void inserirCliente(Cliente cliente){
        this.conexaoSQLite.conectar();
        String sqlInsert = "INSERT INTO tbl_cliente("
                + "cpf,"
                + "nome_usuario,"
                + "senha,"
                + "nome,"
                + "data_nasc,"
                + "endereco"
                + ") VALUES(?,?,?,?,?,?)"
                + ";";
        
        PreparedStatement preparedStatement = conexaoSQLite.criarPreparedStatement(sqlInsert);
        
        try{
            preparedStatement.setString(1, cliente.getCpf());
            preparedStatement.setString(2, cliente.getNomeUsuario());
            preparedStatement.setString(3, cliente.getSenha());
            preparedStatement.setString(4, cliente.getNome());
            preparedStatement.setString(5, cliente.getDataNascimento());
            preparedStatement.setString(6, cliente.getEndereco());
            
            int resultado = preparedStatement.executeUpdate();
            if(resultado==1){
            System.out.println("Cliente inserido");
            }else{
            System.out.println("Cliente nao inserido");
            }
            
        }catch(SQLException e){
            System.out.println("Cliente nao inserido");
        }finally{
            if(preparedStatement!=null){
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(FuncoesBanco.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            this.conexaoSQLite.desconectar();
        }
        
    }
    
    public void inserirCliente(String nome_usuario, String senha, String cpf, String nome, String data_nasc, String endereco){
        Cliente cliente = new Cliente(nome_usuario, senha);
        cliente.setCpf(cpf);
        cliente.setNome(nome);
        cliente.setDataNascimento(data_nasc);
        cliente.setEndereco(endereco);
        this.conexaoSQLite.conectar();
        String sqlInsert = "INSERT INTO tbl_cliente("
                + "cpf,"
                + "nome_usuario,"
                + "senha,"
                + "nome,"
                + "data_nasc,"
                + "endereco"
                + ") VALUES(?,?,?,?,?,?)"
                + ";";
        
        PreparedStatement preparedStatement = conexaoSQLite.criarPreparedStatement(sqlInsert);
        
        try{
            preparedStatement.setString(1, cliente.getCpf());
            preparedStatement.setString(2, cliente.getNomeUsuario());
            preparedStatement.setString(3, cliente.getSenha());
            preparedStatement.setString(4, cliente.getNome());
            preparedStatement.setString(5, cliente.getDataNascimento());
            preparedStatement.setString(6, cliente.getEndereco());
            
            int resultado = preparedStatement.executeUpdate();
            if(resultado==1){
            System.out.println("Cliente inserido");
            }else{
            System.out.println("Cliente nao inserido");
            }
            
        }catch(SQLException e){
            System.out.println("Cliente nao inserido");
        }finally{
            if(preparedStatement!=null){
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(FuncoesBanco.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            this.conexaoSQLite.desconectar();
        }
        
        
    }
    
    public void inserirAdministrador(Administrador administrador){
        this.conexaoSQLite.conectar();
        String sqlInsert = "INSERT INTO tbl_administrador("

                + "nome_usuario,"
                + "senha"


                + ") VALUES(?,?)"
                + ";";
        
        PreparedStatement preparedStatement = conexaoSQLite.criarPreparedStatement(sqlInsert);
        
        try{
            preparedStatement.setString(1, administrador.getNomeUsuario());
            preparedStatement.setString(2, administrador.getSenha());

            
            int resultado = preparedStatement.executeUpdate();
            if(resultado==1){
            System.out.println("Administrador inserido");
            }else{
            System.out.println("Administrador nao inserido");
            }
            
        }catch(SQLException e){
            System.out.println("Administrador nao inserido");
        }finally{
            if(preparedStatement!=null){
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(FuncoesBanco.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            this.conexaoSQLite.desconectar();
        }
        
    }
    
    public void inserirAdministrador(String nome_usuario, String senha){
        this.conexaoSQLite.conectar();
        Administrador administrador = new Administrador(nome_usuario,senha);
        String sqlInsert = "INSERT INTO tbl_administrador("

                + "nome_usuario,"
                + "senha"


                + ") VALUES(?,?)"
                + ";";
        
        PreparedStatement preparedStatement = conexaoSQLite.criarPreparedStatement(sqlInsert);
        
        try{
            preparedStatement.setString(1, administrador.getNomeUsuario());
            preparedStatement.setString(2, administrador.getSenha());

            
            int resultado = preparedStatement.executeUpdate();
            if(resultado==1){
            System.out.println("Administrador inserido");
            }else{
            System.out.println("Administrador nao inserido");
            }
            
        }catch(SQLException e){
            System.out.println("Administrador nao inserido");
        }finally{
            if(preparedStatement!=null){
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(FuncoesBanco.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            this.conexaoSQLite.desconectar();
        }
        
    }
    
    
    
    
    public void inserirVeiculo(String placa, String cor, String marca, String modelo, float kilometragem, String disponibilidade){
        this.conexaoSQLite.conectar();
        String sqlInsert = "INSERT INTO tbl_veiculo("
                
                + "placa,"
                + "cor,"
                + "marca,"
                + "modelo,"
                + "kilometragem,"
                + "disponibilidade"


                + ") VALUES(?,?,?,?,?,?)"
                + ";";
        
        PreparedStatement preparedStatement = conexaoSQLite.criarPreparedStatement(sqlInsert);
        
        try{
            preparedStatement.setString(1, placa);
            preparedStatement.setString(2, cor);
            preparedStatement.setString(3, marca);
            preparedStatement.setString(4, modelo);
            preparedStatement.setFloat(5, (float)kilometragem);
            preparedStatement.setString(6, disponibilidade);
            int resultado = preparedStatement.executeUpdate();
            
            if(resultado==1){
            System.out.println("Veiculo inserido");
            }else{
            System.out.println("Veiculo não inserido");
            }
            
        }catch(SQLException e){
            System.out.println("Veiculo não inserido");
        }finally{
            if(preparedStatement!=null){
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(FuncoesBanco.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            this.conexaoSQLite.desconectar();
        }
        
    }
    
    
      
    
    public void deletarCliente(String cpf){
        this.conexaoSQLite.conectar();
        
        PreparedStatement preparedStatement = null;
        
        String sql = "DELETE FROM tbl_cliente "
                + " WHERE cpf = ?;";
        
        try{
            
            preparedStatement = conexaoSQLite.criarPreparedStatement(sql);
            preparedStatement.setString(1, cpf);
            
            int linhasDeletadas = preparedStatement.executeUpdate();
            
            System.out.println("FORAM DELETADOS " + linhasDeletadas + " REGISTROS");
                
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                preparedStatement.close();
                this.conexaoSQLite.desconectar();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }
    
    public void deletarVeiculo(String placa){
        this.conexaoSQLite.conectar();
        
        PreparedStatement preparedStatement = null;
        
        String sql = "DELETE FROM tbl_veiculo "
                + " WHERE placa = ?;";
        
        try{
            
            preparedStatement = conexaoSQLite.criarPreparedStatement(sql);
            preparedStatement.setString(1,placa);
            
            int linhasDeletadas = preparedStatement.executeUpdate();
            
            System.out.println("FORAM DELETADOS " + linhasDeletadas + " REGISTROS");
                
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                preparedStatement.close();
                this.conexaoSQLite.desconectar();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        
    }
   
    public void deletarAdmministrador(String nome_usuario){
        this.conexaoSQLite.conectar();
        
        PreparedStatement preparedStatement = null;
        
        String sql = "DELETE FROM tbl_administrador "
                + " WHERE nome_usuario = ?;";
        
        try{
            
            preparedStatement = conexaoSQLite.criarPreparedStatement(sql);
            preparedStatement.setString(1, nome_usuario);
            
            int linhasDeletadas = preparedStatement.executeUpdate();
            
            System.out.println("FORAM DELETADOS " + linhasDeletadas + " REGISTROS");
                
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                preparedStatement.close();
                this.conexaoSQLite.desconectar();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        
    }

    
    public void alterarDiponibilidadeVeiculo(String placa_veiculo, String disponibilidade){
        //Diponibilidade pode ser "disponivel", "indisponivel", "manutencao", etc.
        this.conexaoSQLite.conectar();
        
        PreparedStatement preparedStatement = null;
        
        String sql = "UPDATE tbl_veiculo "
                + " SET "
                + " disponibilidade = ?"
                + " WHERE placa = ?;";
        
        try{
            
            preparedStatement = conexaoSQLite.criarPreparedStatement(sql);
            preparedStatement.setString(1, disponibilidade);
            preparedStatement.setString(2, placa_veiculo);
            
            preparedStatement.executeUpdate();
            
            System.out.println("Diaponibilidade ATUALIZADA");
                
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                preparedStatement.close();
                this.conexaoSQLite.desconectar();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        
    }
      
    public void registrarDevolucaoVeiculo(int codigo_locacao, String data_devolucao){
        this.conexaoSQLite.conectar();
        
        PreparedStatement preparedStatement = null;
        
        String sql = "UPDATE tbl_locacao "
                + " SET "
                + " data_devolucao = ?"
                + " WHERE codigo = ?;";
        
        try{
            
            preparedStatement = conexaoSQLite.criarPreparedStatement(sql);
            preparedStatement.setString(1, data_devolucao);
            preparedStatement.setInt(2, codigo_locacao);
            
            preparedStatement.executeUpdate();
            
            System.out.println("Data de devolucao ATUALIZADA");
            Locacao l = buscarLocacao(codigo_locacao);
            
            
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                preparedStatement.close();
                this.conexaoSQLite.desconectar();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        
    }
    

    
    
    public Administrador buscarAdiministrador(String nome_usuario){
    
        this.conexaoSQLite.conectar(); 
        Administrador a = null ;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        
        String sql = "SELECT * "
                + " FROM tbl_administrador"
                + " WHERE nome_usuario=?;";
        
        try{
            
            preparedStatement = conexaoSQLite.criarPreparedStatement(sql);
            preparedStatement.setString(1, nome_usuario);
            
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()==false){
                return a;
            }else{
            
            
                System.out.println("DADOS DA PESSOA:");
                System.out.println("login = "+resultSet.getString("nome_usuario"));
                System.out.println("senha = "+resultSet.getString("senha"));
                a = new Administrador(resultSet.getString("nome_usuario"),resultSet.getString("senha"));
                
            
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                resultSet.close();
                preparedStatement.close();
                this.conexaoSQLite.desconectar();
                
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        return a;
    }

    
    
    public Cliente buscarCliente(String nome_usuario){
    
        this.conexaoSQLite.conectar(); 
        Cliente c = null ;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        
        String sql = "SELECT * "
                + " FROM tbl_cliente"
                + " WHERE nome_usuario=?;";
        
        try{
            
            preparedStatement = conexaoSQLite.criarPreparedStatement(sql);
            preparedStatement.setString(1, nome_usuario);
            
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()==false){
                return c;
            }else{
            
            
                System.out.println("DADOS DA PESSOA:");
                System.out.println("login = "+resultSet.getString("nome_usuario"));
                System.out.println("senha = "+resultSet.getString("senha"));
                c = new Cliente(resultSet.getString("nome_usuario"),resultSet.getString("senha"));
                
            
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                resultSet.close();
                preparedStatement.close();
                this.conexaoSQLite.desconectar();
                
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        return c;
    }
    
    
    
    
    public Cliente buscarClienteCPF(String cpf){
    
        this.conexaoSQLite.conectar(); 
        Cliente c = null ;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        
        String sql = "SELECT * "
                + " FROM tbl_cliente"
                + " WHERE cpf=?;";
        
        try{
            
            preparedStatement = conexaoSQLite.criarPreparedStatement(sql);
            preparedStatement.setString(1, cpf);
            
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()==false){
                return c;
            }else{
            
            
                System.out.println("DADOS DA PESSOA:");
                System.out.println("login = "+resultSet.getString("nome_usuario"));
                System.out.println("senha = "+resultSet.getString("senha"));
                c = new Cliente(resultSet.getString("nome_usuario"),resultSet.getString("senha"));
                
            
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                resultSet.close();
                preparedStatement.close();
                this.conexaoSQLite.desconectar();
                
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        return c;
    }
    
   
   
    public ArrayList<Veiculo> buscarVeiculos(String atributo, String valor){
    
        this.conexaoSQLite.conectar();
        Veiculo v= new Veiculo();
        ArrayList<Veiculo> l = new ArrayList<Veiculo>();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        
        String sql = "SELECT * "
                + " FROM tbl_veiculo"
                + " WHERE "+atributo
                +"=?;";
        
        try{
            
            preparedStatement = conexaoSQLite.criarPreparedStatement(sql);
            preparedStatement.setString(1, valor);
            
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()){
                System.out.println("Placa = "+resultSet.getString("placa"));
                System.out.println("Cor = "+resultSet.getString("cor"));
                System.out.println("Marca = "+resultSet.getString("marca"));
                System.out.println("Modelo = "+resultSet.getString("modelo"));
                System.out.println("Disponibilidade = "+resultSet.getString("disponibilidade"));
                System.out.println("--------------------------------");
                boolean add = l.add(new Veiculo(resultSet.getString("placa"),resultSet.getString("cor"), resultSet.getString("marca"), resultSet.getString("modelo"), resultSet.getFloat("kilometragem"), resultSet.getString("disponibilidade") ));
                
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                resultSet.close();
                preparedStatement.close();
                this.conexaoSQLite.desconectar();
                
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        return l;
    }

     
    
    public ArrayList buscarVeiculosObject(String atributo, String valor){
    
        this.conexaoSQLite.conectar();
        Veiculo v= new Veiculo();
        ArrayList l = new ArrayList();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        
        String sql = "SELECT * "
                + " FROM tbl_veiculo"
                + " WHERE "+atributo
                +"=?;";
        
        try{
            
            preparedStatement = conexaoSQLite.criarPreparedStatement(sql);
            preparedStatement.setString(1, valor);
            
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()){
                System.out.println("Placa = "+resultSet.getString("placa"));
                System.out.println("Cor = "+resultSet.getString("cor"));
                System.out.println("Marca = "+resultSet.getString("marca"));
                System.out.println("Modelo = "+resultSet.getString("modelo"));
                System.out.println("Disponibilidade = "+resultSet.getString("disponibilidade"));
                System.out.println("--------------------------------");
                boolean add = l.add(new Object[]{resultSet.getString("placa"),resultSet.getString("cor"), resultSet.getString("marca"), resultSet.getString("modelo"), resultSet.getFloat("kilometragem"), resultSet.getString("disponibilidade") });
                
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                resultSet.close();
                preparedStatement.close();
                this.conexaoSQLite.desconectar();
                
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        return l;
    }

    public void editarAdministrador(String nome_usuario, String senha){
        //Diponibilidade pode ser "disponivel", "indisponivel", "manutencao", etc.
        this.conexaoSQLite.conectar();
        
        PreparedStatement preparedStatement = null;
        
        String sql = "UPDATE tbl_administrador "
                + " SET "
                + " senha = ?"
                + " WHERE nome_usuario = ?;";
        
        try{
            
            preparedStatement = conexaoSQLite.criarPreparedStatement(sql);
            preparedStatement.setString(1, senha);
            preparedStatement.setString(2, nome_usuario);
            
            preparedStatement.executeUpdate();
            
            System.out.println("Administrador ATUALIZADO");
                
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                preparedStatement.close();
                this.conexaoSQLite.desconectar();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        
    }
    
    
    public void editarCliente(String cpf,String nome_usuario, String senha, String endereco){
        
        this.conexaoSQLite.conectar();
        
        PreparedStatement preparedStatement = null;
        
        String sql = "UPDATE tbl_cliente "
                + " SET "
                + " nome_usuario = ?,"
                + " senha = ?,"
                + " endereco = ?"
                + " WHERE cpf = ?;";
        
        try{
            
            preparedStatement = conexaoSQLite.criarPreparedStatement(sql);
            preparedStatement.setString(1, nome_usuario);
            preparedStatement.setString(2, senha);
            preparedStatement.setString(3, endereco);
            preparedStatement.setString(4, cpf);
            
            preparedStatement.executeUpdate();
            
            System.out.println("Cliente ATUALIZADO");
                
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                preparedStatement.close();
                this.conexaoSQLite.desconectar();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        
    }
    
    
    
    public boolean verificarDisponibilidadeVeiculo(String placa){
        
        if(this.verificarExistenciaVeiculo(placa)){
        
        
        this.conexaoSQLite.conectar();
        
        String disp = null;
        
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        
        String sql = "SELECT * "
                + " FROM tbl_veiculo"
                + " WHERE placa=?;";
        
        try{
            
            preparedStatement = conexaoSQLite.criarPreparedStatement(sql);
            preparedStatement.setString(1, placa);
            
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()){
                System.out.println("Placa = "+resultSet.getString("placa"));
                System.out.println("Cor = "+resultSet.getString("cor"));
                System.out.println("Marca = "+resultSet.getString("marca"));
                System.out.println("Modelo = "+resultSet.getString("modelo"));
                System.out.println("Disponibilidade = "+resultSet.getString("disponibilidade"));
                System.out.println("--------------------------------");
                disp = resultSet.getString("disponibilidade");
            }
            if(disp.equals("DISPONIVEL")||disp.equals("DISPONÍVEL")||disp.equals("Disponivel")||disp.equals("Disponível")||disp.equals("disponivel")||disp.equals("disponível")){
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Veículo não Disponível");
                return false;
            }
            
            
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                resultSet.close();
                preparedStatement.close();
                this.conexaoSQLite.desconectar();
                
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        JOptionPane.showMessageDialog(null, "Veículo não Disponível");
        
        }
        return false;
    }
    
    public boolean verificarExistenciaCliente(String cpf){
        
        
        String disp = null;
        
        Cliente c = null;
        
        c = this.buscarClienteCPF(cpf);
        
        if(c==null){
            JOptionPane.showMessageDialog(null, "CPF do Cliente incorreto");
            return false;
        }else{
            return true;
        }
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
        //Falta Fazer
    
    
    public boolean inserirLocacao( String placa_veiculo, String cpf_cliente, String data_locacao){
        if(verificarDisponibilidadeVeiculo(placa_veiculo)){
        if(verificarExistenciaCliente(cpf_cliente)){
            
            
        this.conexaoSQLite.conectar();
        String sqlInsert = "INSERT INTO tbl_locacao("
                + "placa_veiculo,"
                + "cpf_cliente,"
                + "data_locacao"
                + ") VALUES(?,?,?)"
                + ";";

        
        PreparedStatement preparedStatement = conexaoSQLite.criarPreparedStatement(sqlInsert);
        
        try{
            preparedStatement.setString(1, placa_veiculo);
            preparedStatement.setString(2, cpf_cliente);
            preparedStatement.setString(3, data_locacao);
            
            
            int resultado = preparedStatement.executeUpdate();
            if(resultado==1){
            System.out.println("Locacao inserida");
            alterarDiponibilidadeVeiculo(placa_veiculo, "Indisponível");
            }else{
            System.out.println("Locacao nao inserida");
            }
            
        }catch(SQLException e){
            System.out.println("Locacao nao inserida");
        }finally{
            
            if(preparedStatement!=null){
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(FuncoesBanco.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            this.conexaoSQLite.desconectar();
        }
            JOptionPane.showMessageDialog(null,"Veículo Alugado");
            return true;
        }else{
        
             return false;
        }
        }else{
            
            return false;
        }
    }
        
    
    public Locacao buscarLocacao(int codigo){
    
        this.conexaoSQLite.conectar(); 
        Locacao l = new Locacao();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        
        String sql = "SELECT * "
                + " FROM tbl_locacao"
                + " WHERE codigo=?;";
        
        try{
            
            preparedStatement = conexaoSQLite.criarPreparedStatement(sql);
            preparedStatement.setInt(1, codigo);
            
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()==false){
                return l;
            }else{
            
            
                System.out.println("DADOS DA PESSOA:");
                System.out.println("Codigo = "+ resultSet.getInt("codigo"));
                System.out.println("Placa Veiculo = "+resultSet.getString("placa_veiculo"));
                l.setCodigo(resultSet.getInt("codigo"));
                l.setPlaca_veiculo(resultSet.getString("placa_veiculo"));
                l.setData_locacao(resultSet.getString("data_locacao"));
                l.setCpf_cliente(resultSet.getString("cpf_cliente"));
                l.setData_devolucao(resultSet.getString("data_devolucao"));
                
            
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                resultSet.close();
                preparedStatement.close();
                this.conexaoSQLite.desconectar();
                
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        return l;
    }


    public boolean verificarExistenciaVeiculo(String placa){
        
        
        String disp = null;
        
        
        
        ArrayList<Veiculo> b = this.buscarVeiculos("placa", placa);
        
        if(b.isEmpty()){
            JOptionPane.showMessageDialog(null, "Veiculo não existe");
            return false;
        }else{
            return true;
        }
        
        
    }


}      


