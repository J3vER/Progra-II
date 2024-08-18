
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;


public class ReadFile {

    public String lecturaArchivo(String ruta) {
        StringBuilder informacion = new StringBuilder();
        FileReader fr = null;
        FileWriter escribir = null;
        try {
            File archivo = new File(ruta);
            if (archivo.exists()) {
                fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);

                String linea;
                while ((linea = br.readLine()) != null) {
                    informacion.append(linea + " \n");
                }
            } else {
                escribir = new FileWriter(ruta);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
                if (null != escribir) {
                    escribir.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return informacion.toString();
    }

    public boolean guardarArchivo(String ruta, String info) {
        boolean guardado = false;
        FileWriter fw = null;
        try {
            fw = new FileWriter(ruta);
            PrintWriter archivo = new PrintWriter(fw);
            archivo.print(info);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (null != fw) {
                    fw.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return guardado;
    }
}
