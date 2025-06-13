
package DAO;

import BD.Conexion;
import interfaces.ITrabajador;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Trabajador;

public class TrabajadorDao implements ITrabajador {

    private Conexion con; //Conexion de Base de datos
    private PreparedStatement pstm; //Consultas en la base de datos
    private ResultSet res; //Resultado de las consultas

    public TrabajadorDao() {
        con = Conexion.newInstance();
        pstm = null;
        res = null;
    }

    @Override
    public boolean insert(Trabajador t) {
        boolean resultFlag = false;

        final String SQL_INSERT = "INSERT INTO `trabajador`(`Nombre`, `Apellido`, `Edad`, `Sexo`, `Fech_Nac`, `Est_Civ`, `Direccion`, `Distrito`, `Departamento`, `Email`, `Cargo`, `Fech_Ing`, `Estado`, `Tip_Contrato`, `Area_Trab`, `Sueldo`, `Niv_Inst`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            pstm = con.getConnection().prepareStatement(SQL_INSERT);
            pstm.setString(1, t.getNombre());
            pstm.setString(2, t.getApellido());
            pstm.setInt(3, t.getEdad());
            pstm.setInt(4, t.getIdSexo());
            pstm.setString(5, t.getFechNac());
            pstm.setInt(6, t.getIdCivil());
            pstm.setString(7, t.getDireccion());
            pstm.setInt(8, t.getIdDistrito());
            pstm.setInt(9, t.getIdDepartamento());
            pstm.setString(10, t.getEmail());
            pstm.setInt(11, t.getIdCargo());
            pstm.setString(12, t.getFechIngreso());
            pstm.setInt(13, t.getIdEstado());
            pstm.setInt(14, t.getIdContrato());
            pstm.setInt(15, t.getIdArea());
            pstm.setDouble(16, t.getSueldo());
            pstm.setInt(17, t.getIdGrado());
            int auxiliar = pstm.executeUpdate();

            if (auxiliar > 0) {
                resultFlag = true;
            }

        } catch (Exception e) {
            System.out.println("Error al insertar trabajador :" + e.getMessage());
            e.printStackTrace();
        } finally {
            close();
        }
        return resultFlag;
    }

    @Override
    public boolean update(Trabajador t) {
        boolean resultFlag = false;
        try{
            String update = "UPDATE `trabajador` SET `Nombre` = ?, `Apellido` = ?, `Edad` = ?, `Sexo` = ?, `Fech_Nac` = ?,`Est_Civ` = ?, `Direccion` = ?, `Distrito` = ?, `Departamento` = ?, `Email` = ?, `Cargo` = ?, `Fech_Ing` = ?, `Estado` = ?, `Tip_Contrato` = ?, `Area_Trab` = ?, `Sueldo` = ?, `Niv_Inst` = ? WHERE `trabajador`.`ID_trabajador` = ?";
            pstm = con.getConnection().prepareStatement(update);
            pstm.setString(1, t.getNombre());
            pstm.setString(2, t.getApellido());
            pstm.setInt(3, t.getEdad());
            pstm.setInt(4, t.getIdSexo());
            pstm.setString(5, t.getFechNac());
            pstm.setInt(6, t.getIdCivil());
            pstm.setString(7, t.getDireccion());
            pstm.setInt(8, t.getIdDistrito());
            pstm.setInt(9, t.getIdDepartamento());
            pstm.setString(10, t.getEmail());
            pstm.setInt(11, t.getIdCargo());
            pstm.setString(12, t.getFechIngreso());
            pstm.setInt(13, t.getIdEstado());
            pstm.setInt(14, t.getIdContrato());
            pstm.setInt(15, t.getIdArea());
            pstm.setDouble(16, t.getSueldo());
            pstm.setInt(17, t.getIdGrado());
            pstm.setInt(18, t.getId());
        
        if(pstm.executeUpdate()>0){
            resultFlag = true;
        }
        }catch(Exception e){
            System.out.println("Error al actualizar tabla: " + e.getMessage());
        }
        return resultFlag;
    }

    @Override
    public List<Trabajador> selectAll() {
        List<Trabajador> register = new ArrayList<>();
        try {
            String consulta = "select t.ID_trabajador,t.nombre,t.apellido,t.edad,s.tipo,t.Fech_Nac,c.tipo,t.Direccion,dis.tipo,dep.tipo,t.Email,car.tipo,t.Fech_Ing,e.tipo,con.tipo,a.tipo,t.Sueldo,i.tipo FROM trabajador t INNER JOIN sexo s on t.Sexo = s.ID_SEXO INNER JOIN civil c on t.Est_Civ=c.ID_CIVIL INNER JOIN distrito dis on t.Distrito = dis.ID_DISTRITO INNER JOIN departamento dep on t.Departamento = dep.ID_DEPARTAMENTO INNER JOIN cargo car on t.Cargo = car.ID_CARGO INNER JOIN estado e on t.Estado = e.ID_ESTADO INNER JOIN contrato con on t.Tip_Contrato = con.ID_CONTRATO INNER JOIN area a on t.Area_Trab=a.ID_AREA INNER JOIN instruccion i on t.Niv_Inst=i.ID_INSTRUCCION;";
            pstm = con.getConnection().prepareStatement(consulta);
            res = pstm.executeQuery();

            while (res.next()) {
                Trabajador trabajador = new Trabajador(
                        res.getInt(1),
                        res.getString(2),
                        res.getString(3),
                        res.getInt(4),
                        res.getString(5),
                        res.getString(6),
                        res.getString(7),
                        res.getString(8),
                        res.getString(9),
                        res.getString(10),
                        res.getString(11),
                        res.getString(12),
                        res.getString(13),
                        res.getString(14),
                        res.getString(15),
                        res.getString(16),
                        res.getDouble(17),
                        res.getString(18)
                );
                register.add(trabajador);
            }
        } catch (Exception e) {
            System.out.println("Error al listar tabla: " + e.getMessage());
            e.printStackTrace();
        } finally {
            close();
        }
        return register;
    }

    @Override
    public Trabajador selectById(Object id) {
        Trabajador trabajador = null;
        try{
            String consulta = "select * from trabajador where ID_trabajador = ?";
            
            pstm = con.getConnection().prepareStatement(consulta);
            pstm.setObject(1, id);
            res = pstm.executeQuery();
            
            if(res.next()){
                trabajador = new Trabajador(
                        res.getInt(1),
                        res.getString(2),
                        res.getString(3),
                        res.getInt(4),
                        res.getString(5),
                        res.getString(6),
                        res.getString(7),
                        res.getString(8),
                        res.getString(9),
                        res.getString(10),
                        res.getString(11),
                        res.getString(12),
                        res.getString(13),
                        res.getString(14),
                        res.getString(15),
                        res.getString(16),
                        res.getDouble(17),
                        res.getString(18)
                );
                
            }
        }catch(Exception e){
            System.out.println("Error al selecionar trabajador: "+ e.getMessage());
        }finally{
        close();
        }
        return trabajador;
    }

    @Override
    public boolean delete(Object id) {
        boolean resultFlag = false;
        try{
            String delete = "delete from trabajador where ID_trabajador = ?";
            pstm = con.getConnection().prepareStatement(delete);
            pstm.setObject(1, id);
            if(pstm.executeUpdate()>0){
            resultFlag = true;
            }
        }catch(Exception e){
            System.out.println("Error al eliminar :"+ e.getMessage());
        }
        return resultFlag;
    }
    
        @Override
    public List<Trabajador> lisPorDat() {
        List<Trabajador> register = new ArrayList<>();
        try {
            String consulta = "select t.nombre,t.apellido,car.tipo,t.Fech_Ing,e.tipo,con.tipo,a.tipo,t.Sueldo FROM trabajador t INNER JOIN cargo car on t.Cargo = car.ID_CARGO INNER JOIN estado e on t.Estado = e.ID_ESTADO INNER JOIN contrato con on t.Tip_Contrato = con.ID_CONTRATO INNER JOIN area a on t.Area_Trab=a.ID_AREA";
            pstm = con.getConnection().prepareStatement(consulta);
            res = pstm.executeQuery();

            while (res.next()) {
                Trabajador trabajador = new Trabajador(
                        res.getString(1),
                        res.getString(2),
                        res.getString(3),
                        res.getString(4),
                        res.getString(5),
                        res.getString(6),
                        res.getString(7),
                        res.getDouble(8)
                );
                register.add(trabajador);
            }
        } catch (Exception e) {
            System.out.println("Error al listar tabla: " + e.getMessage());
            e.printStackTrace();
        } finally {
            close();
        }
        return register;
    }

    @Override
    public List<Trabajador> lisInfPer() {
        List<Trabajador> register = new ArrayList<>();
        try {
            String consulta = "select t.ID_trabajador,t.nombre,t.apellido,t.edad,s.tipo,t.Fech_Nac,c.tipo,t.Direccion,dis.tipo,dep.tipo,t.Email FROM trabajador t INNER JOIN sexo s on t.Sexo = s.ID_SEXO INNER JOIN civil c on t.Est_Civ=c.ID_CIVIL INNER JOIN distrito dis on t.Distrito = dis.ID_DISTRITO INNER JOIN departamento dep on t.Departamento = dep.ID_DEPARTAMENTO;";
            pstm = con.getConnection().prepareStatement(consulta);
            res = pstm.executeQuery();

            while (res.next()) {
                Trabajador trabajador = new Trabajador(
                        res.getInt(1),
                        res.getString(2),
                        res.getString(3),
                        res.getInt(4),
                        res.getString(5),
                        res.getString(6),
                        res.getString(7),
                        res.getString(8),
                        res.getString(9),
                        res.getString(10),
                        res.getString(11)
                );
                register.add(trabajador);
            }
        } catch (Exception e) {
            System.out.println("Error al listar tabla: " + e.getMessage());
            e.printStackTrace();
        } finally {
            close();
        }
        return register;
    }

    @Override
    public List<Trabajador> lisEstTra() {
        List<Trabajador> register = new ArrayList<>();
        try {
            String consulta = "select t.nombre,t.apellido,i.tipo FROM trabajador t INNER JOIN instruccion i on t.Niv_Inst=i.ID_INSTRUCCION;";
            pstm = con.getConnection().prepareStatement(consulta);
            res = pstm.executeQuery();

            while (res.next()) {
                Trabajador trabajador = new Trabajador(
                        res.getString(1),
                        res.getString(2),
                        res.getString(3)
                );
                register.add(trabajador);
            }
        } catch (Exception e) {
            System.out.println("Error al listar tabla: " + e.getMessage());
            e.printStackTrace();
        } finally {
            close();
        }
        return register;
    }

    private void close() {

        try {
            if (res != null) {
                res.close();
            }
            if (pstm != null) {
                pstm.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (Exception e) {
            System.out.println("Error al cerrar :" + e.getMessage());
            e.printStackTrace();
        }

    }
}
