
package model;

public class Trabajador {
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;
    private int idSexo;
    private String fechNac;
    private String estCivil;
    private int idCivil;
    private String direccion;
    private String distrito;
    private int idDistrito;
    private String departamento;
    private int idDepartamento;
    private String email;
    private String cargo;
    private int idCargo;
    private String fechIngreso;
    private String estado;
    private int idEstado;
    private String tipoContrato;
    private int idContrato;
    private String area;
    private int idArea;
    private double sueldo;
    private String gradoInst;
    private int idGrado;

    public Trabajador(String nombre, String apellido, int edad, String sexo, String fechNac, String estCivil, String direccion, String distrito, String departamento, String email, String cargo, String fechIngreso, String estado, String tipoContrato, String area, double sueldo, String gradoInst) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.fechNac = fechNac;
        this.estCivil = estCivil;
        this.direccion = direccion;
        this.distrito = distrito;
        this.departamento = departamento;
        this.email = email;
        this.cargo = cargo;
        this.fechIngreso = fechIngreso;
        this.estado = estado;
        this.tipoContrato = tipoContrato;
        this.area = area;
        this.sueldo = sueldo;
        this.gradoInst = gradoInst;
    }

    public Trabajador(int id, String nombre, String apellido, int edad, String sexo, String fechNac, String estCivil, String direccion, String distrito, String departamento, String email, String cargo, String fechIngreso, String estado, String tipoContrato, String area, double sueldo, String gradoInst) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.fechNac = fechNac;
        this.estCivil = estCivil;
        this.direccion = direccion;
        this.distrito = distrito;
        this.departamento = departamento;
        this.email = email;
        this.cargo = cargo;
        this.fechIngreso = fechIngreso;
        this.estado = estado;
        this.tipoContrato = tipoContrato;
        this.area = area;
        this.sueldo = sueldo;
        this.gradoInst = gradoInst;
    }

    public Trabajador(int id, String nombre, String apellido, int edad, int idSexo, String fechNac, int idCivil, String direccion, int idDistrito, int idDepartamento, String email, int idCargo, String fechIngreso, int idEstado, int idContrato, int idArea, double sueldo, int idGrado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.idSexo = idSexo;
        this.fechNac = fechNac;
        this.idCivil = idCivil;
        this.direccion = direccion;
        this.idDistrito = idDistrito;
        this.idDepartamento = idDepartamento;
        this.email = email;
        this.idCargo = idCargo;
        this.fechIngreso = fechIngreso;
        this.idEstado = idEstado;
        this.idContrato = idContrato;
        this.idArea = idArea;
        this.sueldo = sueldo;
        this.idGrado = idGrado;
    }

    public Trabajador(String nombre, String apellido, String cargo, String fechIngreso, String estado, String tipoContrato, String area, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.fechIngreso = fechIngreso;
        this.estado = estado;
        this.tipoContrato = tipoContrato;
        this.area = area;
        this.sueldo = sueldo;
    }

    public Trabajador(int id, String nombre, String apellido, int edad, String sexo, String fechNac, String estCivil, String direccion, String distrito, String departamento, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.fechNac = fechNac;
        this.estCivil = estCivil;
        this.direccion = direccion;
        this.distrito = distrito;
        this.departamento = departamento;
        this.email = email;
    }

    public Trabajador(String nombre, String apellido, String gradoInst) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.gradoInst = gradoInst;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechNac() {
        return fechNac;
    }

    public void setFechNac(String fechNac) {
        this.fechNac = fechNac;
    }

    public String getEstCivil() {
        return estCivil;
    }

    public void setEstCivil(String estCivil) {
        this.estCivil = estCivil;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFechIngreso() {
        return fechIngreso;
    }

    public void setFechIngreso(String fechIngreso) {
        this.fechIngreso = fechIngreso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getGradoInst() {
        return gradoInst;
    }

    public void setGradoInst(String gradoInst) {
        this.gradoInst = gradoInst;
    }

    public int getIdSexo() {
        return idSexo;
    }

    public void setIdSexo(int idSexo) {
        this.idSexo = idSexo;
    }

    public int getIdCivil() {
        return idCivil;
    }

    public void setIdCivil(int idCivil) {
        this.idCivil = idCivil;
    }

    public int getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(int idDistrito) {
        this.idDistrito = idDistrito;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public int getIdGrado() {
        return idGrado;
    }

    public void setIdGrado(int idGrado) {
        this.idGrado = idGrado;
    }
    
    public Trabajador() {
    // Constructor por defecto necesario para pruebas unitarias
}

}
