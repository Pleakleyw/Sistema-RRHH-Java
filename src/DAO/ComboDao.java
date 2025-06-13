package DAO;

import BD.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Combo;

public class ComboDao {
    private Conexion con; //Conexion de Base de datos
    private PreparedStatement pstm; //Consultas en la base de datos
    private ResultSet res; //Resultado de las consultas
    
    public ComboDao() {
        con = Conexion.newInstance();
        pstm = null;
        res = null;
    }
    
    public List<Combo> lisSexo() {
        List<Combo> register = new ArrayList<>();
        try{
        String consulta = "select * from sexo";
        pstm = con.getConnection().prepareStatement(consulta);
        
        res = pstm.executeQuery();
        
        while(res.next()){
            Integer id = res.getInt(1);
            String tip = res.getString(2);
            Combo aux = new Combo(id,tip);
            register.add(aux);
        }
        }catch(Exception e){
            System.out.println("Error al listar tabla :"+ e.getMessage());
        }finally{
        close();
    }
        return register;
    }
    
    public List<Combo> lisArea() {
        List<Combo> register = new ArrayList<>();
        try{
        String consulta = "select * from area";
        pstm = con.getConnection().prepareStatement(consulta);
        
        res = pstm.executeQuery();
        
        while(res.next()){
            Integer id = res.getInt(1);
            String tip = res.getString(2);
            Combo aux = new Combo(id,tip);
            register.add(aux);
        }
        }catch(Exception e){
            System.out.println("Error al listar tabla :"+ e.getMessage());
        }finally{
        close();
    }
        return register;
    }
    
    public List<Combo> lisCargo() {
        List<Combo> register = new ArrayList<>();
        try{
        String consulta = "select * from cargo";
        pstm = con.getConnection().prepareStatement(consulta);
        
        res = pstm.executeQuery();
        
        while(res.next()){
            Integer id = res.getInt(1);
            String tip = res.getString(2);
            Combo aux = new Combo(id,tip);
            register.add(aux);
        }
        }catch(Exception e){
            System.out.println("Error al listar tabla :"+ e.getMessage());
        }finally{
        close();
    }
        return register;
    }
    
    public List<Combo> lisCivil() {
        List<Combo> register = new ArrayList<>();
        try{
        String consulta = "select * from civil";
        pstm = con.getConnection().prepareStatement(consulta);
        
        res = pstm.executeQuery();
        
        while(res.next()){
            Integer id = res.getInt(1);
            String tip = res.getString(2);
            Combo aux = new Combo(id,tip);
            register.add(aux);
        }
        }catch(Exception e){
            System.out.println("Error al listar tabla :"+ e.getMessage());
        }finally{
        close();
    }
        return register;
    }
    
    public List<Combo> lisContrato() {
        List<Combo> register = new ArrayList<>();
        try{
        String consulta = "select * from contrato";
        pstm = con.getConnection().prepareStatement(consulta);
        
        res = pstm.executeQuery();
        
        while(res.next()){
            Integer id = res.getInt(1);
            String tip = res.getString(2);
            Combo aux = new Combo(id,tip);
            register.add(aux);
        }
        }catch(Exception e){
            System.out.println("Error al listar tabla :"+ e.getMessage());
        }finally{
        close();
    }
        return register;
    }
    
    public List<Combo> lisDep() {
        List<Combo> register = new ArrayList<>();
        try{
        String consulta = "select * from departamento";
        pstm = con.getConnection().prepareStatement(consulta);
        
        res = pstm.executeQuery();
        
        while(res.next()){
            Integer id = res.getInt(1);
            String tip = res.getString(2);
            Combo aux = new Combo(id,tip);
            register.add(aux);
        }
        }catch(Exception e){
            System.out.println("Error al listar tabla :"+ e.getMessage());
        }finally{
        close();
    }
        return register;
    }
    
    public List<Combo> lisDistrito() {
        List<Combo> register = new ArrayList<>();
        try{
        String consulta = "select * from distrito";
        pstm = con.getConnection().prepareStatement(consulta);
        
        res = pstm.executeQuery();
        
        while(res.next()){
            Integer id = res.getInt(1);
            String tip = res.getString(2);
            Combo aux = new Combo(id,tip);
            register.add(aux);
        }
        }catch(Exception e){
            System.out.println("Error al listar tabla :"+ e.getMessage());
        }finally{
        close();
    }
        return register;
    }
    
    public List<Combo> lisEstado() {
        List<Combo> register = new ArrayList<>();
        try{
        String consulta = "select * from estado";
        pstm = con.getConnection().prepareStatement(consulta);
        
        res = pstm.executeQuery();
        
        while(res.next()){
            Integer id = res.getInt(1);
            String tip = res.getString(2);
            Combo aux = new Combo(id,tip);
            register.add(aux);
        }
        }catch(Exception e){
            System.out.println("Error al listar tabla :"+ e.getMessage());
        }finally{
        close();
    }
        return register;
    }
    
    public List<Combo> lisInst() {
        List<Combo> register = new ArrayList<>();
        try{
        String consulta = "select * from instruccion";
        pstm = con.getConnection().prepareStatement(consulta);
        
        res = pstm.executeQuery();
        
        while(res.next()){
            Integer id = res.getInt(1);
            String tip = res.getString(2);
            Combo aux = new Combo(id,tip);
            register.add(aux);
        }
        }catch(Exception e){
            System.out.println("Error al listar tabla :"+ e.getMessage());
        }finally{
        close();
    }
        return register;
    }
    
    private void close() {
        try {
           if(res!=null)res.close();
           if(pstm!=null)pstm.close();
           if(con!=null)con.close();
        } catch (Exception e) {
            System.out.println("Error al cerrar :"+e.getMessage());
            e.printStackTrace();
        }

    }
}
