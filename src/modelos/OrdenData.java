package modelos;

import entidades.*;
import grupo3pf.*;
import java.sql.*;
import java.time.LocalDate;
import java.util.*;

public class OrdenData {
    
    static public Orden altaOrden(Orden orden) {
        try {
            String sql = "INSERT INTO ordenes (idAfiliado, idHorario, fechaAtencion, fechaCreacion, efectivo, activa) VALUES ('"
                    + orden.getAfiliado().getId() + "', '" 
                    + orden.getHorario().getId() + "', '"
                    + java.sql.Date.valueOf(orden.getFechaAtencion()) + "', '"
                    + java.sql.Date.valueOf(orden.getFechaCreacion()) + "', "
                    + (orden.isEfectivo() ? "1" : "0") + ", "
                    + (orden.isActiva() ? "1" : "0") + ");";
            Statement s = Conexion.get().createStatement();
            s.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = s.getGeneratedKeys();

            if (rs.first()) {
                orden.setId(rs.getInt(1));
            }
            s.close();
        } catch (SQLException e) {
            System.out.println("Error al insertar orden: " + e.getMessage());
        }
        return orden;
    }
    
    public Orden obtenerOrden(int id) {
        Orden orden = null;
        AfiliadoData ad = new AfiliadoData();
        HorarioData hd = new HorarioData();
        
        try {
            String sql = "SELECT * FROM ordenes WHERE id = " + id + ";";
            Statement s = Conexion.get().createStatement();
            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                Afiliado a = ad.obtenerAfiliado(rs.getInt("idAfiliado"));
                Horario h = hd.obtenerHorario(rs.getInt("idHorario"));
                LocalDate fAtencion = rs.getDate("fechaAtencion").toLocalDate();
                LocalDate fCreacion = rs.getDate("fechaCreacion").toLocalDate();
                
                orden = new Orden(rs.getInt("id"), a, h, fAtencion, fCreacion, rs.getBoolean("efectivo"), rs.getBoolean("activa"));
            }
            s.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener orden: " + e.getMessage());
        }
        return orden;
    }
    public static boolean habilitarOrden(int idAfiliado, LocalDate fecha, int idPrestador){
        try{
        String sql;
        sql = "SELECT *\n" 
                +"FROM\n" 
                +"  	(SELECT *\n" 
                +"       FROM (SELECT idHorario  FROM ORDENES WHERE fechaAtencion = ('"+fecha.getYear()+"-"+fecha.getMonthValue()+"-"+fecha.getDayOfMonth()+"') AND idAfiliado = "+idAfiliado+" and activa = 1) AS ORDE\n" 
                +"       INNER JOIN horarios\n"                
                +"       ON ORDE.idHorario = horarios.id) as tabla\n" 
                +"INNER JOIN prestadores \n"
                +"on tabla.idPrestador = prestadores.id\n" 
                +"WHERE prestadores.id = "+idPrestador+"";
    
        Statement s = Conexion.get().createStatement();
        ResultSet rs = s.executeQuery(sql);
        while (rs.next()){
            return false;
        }
        }
        catch(SQLException e){
         System.out.println("error: "+ e.getMessage());
        }
        return true;
    }
    static public ArrayList<Orden> obtenerOrdenes(boolean mostrarDeshabilitados) {
        ArrayList<Orden> resultados = new ArrayList<>();
        AfiliadoData ad = new AfiliadoData();
        HorarioData hd = new HorarioData();

        try {
            String sql = "SELECT * FROM ordenes " + (mostrarDeshabilitados ? ";" : " WHERE activa = 1;");
            Statement s = Conexion.get().createStatement();
            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                
                Afiliado a = ad.obtenerAfiliado(rs.getInt("idAfiliado"));
                Horario h = hd.obtenerHorario(rs.getInt("idHorario"));
                LocalDate fAtencion = rs.getDate("fechaAtencion").toLocalDate();
                LocalDate fCreacion = rs.getDate("fechaCreacion").toLocalDate();
                
                resultados.add(new Orden(rs.getInt("id"), a, h, fAtencion, fCreacion, rs.getBoolean("efectivo"), rs.getBoolean("activa")));
            }
            s.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener ordenes:" + e.getMessage());
        }

        return resultados;
    }
    
    public ArrayList<Orden> obtenerOrdenesAfiliadoPrestadorFecha(Afiliado afiliado, Prestador prestador, LocalDate fecha, boolean mostrarDeshabilitados){
        ArrayList<Orden> resultados = new ArrayList<>();
        AfiliadoData ad = new AfiliadoData();
        HorarioData hd = new HorarioData();

        try {
            String sql = "SELECT o.* FROM ordenes o JOIN horarios h ON o.idHorario = h.id WHERE o.idAfiliado = " + afiliado.getId() + " "
                    + "AND h.idPrestador = " + prestador.getId() + " AND o.fechaAtencion = '" + fecha + (mostrarDeshabilitados ? "';" : "' AND o.activa = 1;");
            Statement s = Conexion.get().createStatement();
            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                
                Afiliado a = ad.obtenerAfiliado(rs.getInt("idAfiliado"));
                Horario h = hd.obtenerHorario(rs.getInt("idHorario"));
                LocalDate fAtencion = rs.getDate("fechaAtencion").toLocalDate();
                LocalDate fCreacion = rs.getDate("fechaCreacion").toLocalDate();
                
                resultados.add(new Orden(rs.getInt("id"), a, h, fAtencion, fCreacion, rs.getBoolean("efectivo"), rs.getBoolean("activa")));
            }
            s.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener ordenes:" + e.getMessage());
        }

        return resultados;
    }
    
    public ArrayList<Orden> obtenerOrdenesPrestador(Prestador prestador, boolean mostrarDeshabilitados){
        ArrayList<Orden> resultados = new ArrayList<>();
        AfiliadoData ad = new AfiliadoData();
        HorarioData hd = new HorarioData();

        try {
            String sql = "SELECT o.* FROM ordenes o JOIN horarios h ON o.idHorario = h.id WHERE h.idPrestador = " + prestador.getId() + (mostrarDeshabilitados ? ";" : " AND o.activa = 1;");
            Statement s = Conexion.get().createStatement();
            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                
                Afiliado a = ad.obtenerAfiliado(rs.getInt("idAfiliado"));
                Horario h = hd.obtenerHorario(rs.getInt("idHorario"));
                LocalDate fAtencion = rs.getDate("fechaAtencion").toLocalDate();
                LocalDate fCreacion = rs.getDate("fechaCreacion").toLocalDate();
                
                resultados.add(new Orden(rs.getInt("id"), a, h, fAtencion, fCreacion, rs.getBoolean("efectivo"), rs.getBoolean("activa")));
            }
            s.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener ordenes:" + e.getMessage());
        }

        return resultados;
    }
    
    public ArrayList<Orden> obtenerOrdenesPrestadorFecha(Prestador prestador, LocalDate fecha, boolean mostrarDeshabilitados){
        ArrayList<Orden> resultados = new ArrayList<>();
        AfiliadoData ad = new AfiliadoData();
        HorarioData hd = new HorarioData();

        try {
            String sql = "SELECT o.* FROM ordenes o JOIN horarios h ON o.idHorario = h.id WHERE h.idPrestador = " + prestador.getId() + " AND o.fechaAtencion = '" + fecha + (mostrarDeshabilitados ? "';" : "' AND o.activa = 1;");
            Statement s = Conexion.get().createStatement();
            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                
                Afiliado a = ad.obtenerAfiliado(rs.getInt("idAfiliado"));
                Horario h = hd.obtenerHorario(rs.getInt("idHorario"));
                LocalDate fAtencion = rs.getDate("fechaAtencion").toLocalDate();
                LocalDate fCreacion = rs.getDate("fechaCreacion").toLocalDate();
                
                resultados.add(new Orden(rs.getInt("id"), a, h, fAtencion, fCreacion, rs.getBoolean("efectivo"), rs.getBoolean("activa")));
            }
            s.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener ordenes:" + e.getMessage());
        }

        return resultados;
    }
    
    public ArrayList<Orden> obtenerOrdenesAfiliadoPrestador(Afiliado afiliado, Prestador prestador, boolean mostrarDeshabilitados){
        ArrayList<Orden> resultados = new ArrayList<>();
        AfiliadoData ad = new AfiliadoData();
        HorarioData hd = new HorarioData();

        try {
            String sql = "SELECT o.* FROM ordenes o JOIN horarios h ON o.idHorario = h.id WHERE h.idPrestador = " + prestador.getId() + " AND o.idAfiliado = " + afiliado.getId() + (mostrarDeshabilitados ? ";" : " AND o.activa = 1;");
            Statement s = Conexion.get().createStatement();
            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                
                Afiliado a = ad.obtenerAfiliado(rs.getInt("idAfiliado"));
                Horario h = hd.obtenerHorario(rs.getInt("idHorario"));
                LocalDate fAtencion = rs.getDate("fechaAtencion").toLocalDate();
                LocalDate fCreacion = rs.getDate("fechaCreacion").toLocalDate();
                
                resultados.add(new Orden(rs.getInt("id"), a, h, fAtencion, fCreacion, rs.getBoolean("efectivo"), rs.getBoolean("activa")));
            }
            s.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener ordenes:" + e.getMessage());
        }

        return resultados;
    }
    
    public ArrayList<Orden> obtenerOrdenesAfiliado(Afiliado afiliado, boolean mostrarDeshabilitados){
        ArrayList<Orden> resultados = new ArrayList<>();
        AfiliadoData ad = new AfiliadoData();
        HorarioData hd = new HorarioData();

        try {
            String sql = "SELECT * FROM ordenes WHERE idAfiliado = " + afiliado.getId() + (mostrarDeshabilitados ? ";" : " AND activa = 1;");
            Statement s = Conexion.get().createStatement();
            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                
                Afiliado a = ad.obtenerAfiliado(rs.getInt("idAfiliado"));
                Horario h = hd.obtenerHorario(rs.getInt("idHorario"));
                LocalDate fAtencion = rs.getDate("fechaAtencion").toLocalDate();
                LocalDate fCreacion = rs.getDate("fechaCreacion").toLocalDate();
                
                resultados.add(new Orden(rs.getInt("id"), a, h, fAtencion, fCreacion, rs.getBoolean("efectivo"), rs.getBoolean("activa")));
            }
            s.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener ordenes:" + e.getMessage());
        }

        return resultados;
    }
    
    public ArrayList<Orden> obtenerOrdenesAfiliadoFecha(Afiliado afiliado, LocalDate fecha, boolean mostrarDeshabilitados){
        ArrayList<Orden> resultados = new ArrayList<>();
        AfiliadoData ad = new AfiliadoData();
        HorarioData hd = new HorarioData();

        try {
            String sql = "SELECT * FROM ordenes WHERE idAfiliado = " + afiliado.getId() + " AND fechaAtencion = '" + fecha + "'" + (mostrarDeshabilitados ? ";" : " AND activa = 1;");
            Statement s = Conexion.get().createStatement();
            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                
                Afiliado a = ad.obtenerAfiliado(rs.getInt("idAfiliado"));
                Horario h = hd.obtenerHorario(rs.getInt("idHorario"));
                LocalDate fAtencion = rs.getDate("fechaAtencion").toLocalDate();
                LocalDate fCreacion = rs.getDate("fechaCreacion").toLocalDate();
                
                resultados.add(new Orden(rs.getInt("id"), a, h, fAtencion, fCreacion, rs.getBoolean("efectivo"), rs.getBoolean("activa")));
            }
            s.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener ordenes:" + e.getMessage());
        }

        return resultados;
    }
    
    public ArrayList<Orden> obtenerOrdenesFecha(LocalDate fecha, boolean mostrarDeshabilitados){
        ArrayList<Orden> resultados = new ArrayList<>();
        AfiliadoData ad = new AfiliadoData();
        HorarioData hd = new HorarioData();

        try {
            String sql = "SELECT * FROM ordenes WHERE fechaAtencion = '" + fecha + "'" + (mostrarDeshabilitados ? ";" : " AND activa = 1;");
            Statement s = Conexion.get().createStatement();
            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                
                Afiliado a = ad.obtenerAfiliado(rs.getInt("idAfiliado"));
                Horario h = hd.obtenerHorario(rs.getInt("idHorario"));
                LocalDate fAtencion = rs.getDate("fechaAtencion").toLocalDate();
                LocalDate fCreacion = rs.getDate("fechaCreacion").toLocalDate();
                
                resultados.add(new Orden(rs.getInt("id"), a, h, fAtencion, fCreacion, rs.getBoolean("efectivo"), rs.getBoolean("activa")));
            }
            s.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener ordenes:" + e.getMessage());
        }

        return resultados;
    }
    
    public void bajaOrden(int id) {
        try {
            String sql = "DELETE FROM ordenes WHERE id = " + id + ";";
            Statement s = Conexion.get().createStatement();
            s.executeQuery(sql);

            s.close();
        } catch (SQLException ex) {
            System.out.println("Error al eliminar orden: " + ex.getMessage());
        }
    }
    
    static public void actualizarOrden(Orden orden) {
        try {
            String sql = "UPDATE ordenes SET idAfiliado = '" + orden.getAfiliado().getId() + 
                    "', idHorario = '" + orden.getHorario().getId() + 
                    "', fechaAtencion = '" + java.sql.Date.valueOf(orden.getFechaAtencion()) +
                    "', fechaCreacion = '" + java.sql.Date.valueOf(orden.getFechaCreacion()) + 
                    "', efectivo = " + (orden.isEfectivo() ? "1" : "0") +
                    ", activa = " + (orden.isActiva() ? "1" : "0") +
                    " WHERE id = " + orden.getId() + ";";
            Statement s = Conexion.get().createStatement();
            s.executeUpdate(sql);

            s.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar orden: " + e.getMessage());
        }
    }
}
