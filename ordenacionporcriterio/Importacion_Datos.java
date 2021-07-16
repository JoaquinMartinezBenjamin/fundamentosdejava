import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Importacion_Datos{

    public ArrayList importarDatos(){
        ArrayList lista = new ArrayList();
        try {

            CsvReader importador = new CsvReader("Trabajadores.csv");
            importador.readHeaders(); //leer encabezados
            Random r = new Random();
            while (importador.readRecord()) //leer registros
            {
                int codigo = Integer.parseInt(importador.get("Id"));
                String nombre =  importador.get("Nombre");
                String apellido_pat = importador.get("Ape_pat");
                String apellido_mat = importador.get("Ape_mat");
                String genero =  importador.get("Sexo");
                int edad=Integer.parseInt(importador.get("Edad"));
                String tipo=     importador.get("TipoTrabajador");

                if(tipo.equals("TrabajadorXHoras")){
                    double sueldoXhora= Double.parseDouble(importador.get("SueldoXHora"));
                    int horasTrabajadas=  Integer.parseInt(importador.get("HorasTrabajadas"));
                    lista.add( new TrabajadorXhora(codigo,nombre,apellido_pat, apellido_mat,genero,edad,sueldoXhora,horasTrabajadas));
                }

                if(tipo.equals("TrabajadorXContrato")){
                    double sueldoQuincenal=Double.parseDouble(importador.get("SueldoQuincenal"));
                    int faltas=Integer.parseInt(importador.get("Faltas"));
                    double descuentos= Double.parseDouble(importador.get("Descuentos"));
                    double bonos= (double)(r.nextInt(100));
                    lista.add( new TrabajadorXcontrato(codigo,nombre,apellido_pat, apellido_mat,genero,edad,sueldoQuincenal,faltas,descuentos,bonos));
                }

                if(tipo.equals("TrabajadorXDias")){
                    int diasTrabajados=Integer.parseInt(importador.get("DiasTrabajados"));
                    double sueldoXdia=Double.parseDouble(importador.get("SueldoXDia"));
                    double descuentos=Double.parseDouble(importador.get("Descuentos"));
                    lista.add(new TrabajadorXdias(codigo,nombre,apellido_pat,apellido_mat,genero,edad,diasTrabajados,sueldoXdia,descuentos));
                }

            }
            importador.close();// cerrar

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }

}