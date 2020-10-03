
package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class dbBean {
    
    String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=erp_universidad;integratedSecurity=false";
    String dbDriver="com.microsoft.sqlserver.jdbc.SQLServerDriver" ;
    private Connection dbCon;
    private String Login="sa";
    private String password="sasasa";

  public dbBean(){
       
      connect();
       }
 
  
  public Connection getConnection()
    {
      Connection cn= null;
        try {
            Class.forName(dbDriver);
            cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=erp_universidad;user=sa;password=sasasa;");
           } catch (Exception e) {
            System.out.println(e);
           }
        return cn;
    }
  
  
  public boolean connect() {
      
        try {
            Class.forName(this.dbDriver);
        } catch(java.lang.ClassNotFoundException e) {
            System.out.println("Error en class");
            return false;
        }
        try {
            dbCon = DriverManager.getConnection(this.dbURL,this.Login,this.password);

        } catch(SQLException ex) {
            System.out.println("No se puede conectar al servidor");
            return false;
        }
        return true;
     }


  public void close() throws SQLException{
        dbCon.close();
       }

  public ResultSet execSQL(String sql) throws SQLException{
                    Statement s = dbCon.createStatement();
                    ResultSet r = s.executeQuery(sql);
                    return (r == null) ? null : r;
  }

  public int updateSQL(String sql) throws SQLException{
                   Statement s = dbCon.createStatement();
                   int r = s.executeUpdate(sql);
                   return (r == 0) ? 0 : r;
                }

 public boolean procedureSQL(String sql) throws SQLException{
                   Statement s = dbCon.createStatement();
                   boolean r = s.execute(sql);
                   return r;
                }

public void commit() throws SQLException{
        dbCon.commit();
             }

public void rollback() throws SQLException{
        dbCon.rollback();
             }
public void AutoCommit(boolean estado) throws SQLException{
        dbCon.setAutoCommit(estado);
             }
    

   

}
