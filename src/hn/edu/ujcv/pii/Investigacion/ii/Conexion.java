package hn.edu.ujcv.pii.Investigacion.ii;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import java.net.URL;

public class Conexion {
    static Logger log = Logger.getLogger(Conexion.class);
    URL url = Conexion.class.getResource("Log4j.properties");

    public void conectar(int num){
        PropertyConfigurator.configure(url);
        if (num == 0) {
            log.info("La conexion fue exitosa" + "\n");
        }else if( num<0){
            log.error("Ocurrio un error fatal" + "\n");
        }
    }

}
