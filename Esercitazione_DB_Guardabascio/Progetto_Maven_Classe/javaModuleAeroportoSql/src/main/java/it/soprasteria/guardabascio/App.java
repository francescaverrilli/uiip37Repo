package it.soprasteria.guardabascio;

import java.sql.Connection;
import java.sql.SQLException;

import it.soprasteria.guardabascio.dao.impl.DefaultAereoDao;
import it.soprasteria.guardabascio.model.Aereo;

public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
       System.out.println( "Hello World!" );
       Connection con = ConnectionManager.getConnection();
       
       Aereo a=new Aereo("787", 380, 300);
       DefaultAereoDao in= new DefaultAereoDao();
       in.insert(a);
       
       
       String tipo = "shut";
       Aereo a1= in.selectByTipo(tipo); 
       System.out.println(a1.toString());
       
       Aereo a2= new Aereo("787", 500, 100);
       in.update(a2.getTipoAereo(), a2);
    }
}
