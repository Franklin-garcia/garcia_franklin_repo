
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Franklin Garcia
 */
public class adminPadre {

    private ArrayList<Padre> listapersonas = new ArrayList<>();
    private File archivo = null;

    public adminPadre(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Padre> getListapersonas() {
        return listapersonas;
    }

    public void setListapersonas(ArrayList<Padre> listapersonas) {
        this.listapersonas = listapersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listapersonas=" + listapersonas;
    }

    //Mutador
    public void setPersona(Padre p) {
        this.listapersonas.add(p);
    }

    public void escribirPersonas() {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Padre t : listapersonas) {
                bw.write(t.getNombre() + ";");
                bw.write(t.getEdad() + ";");
                bw.write(t.getAltura() + ";");
                bw.write(t.getColor_pelo() + ";");
                bw.write(t.getSexo() + ";");
                bw.write(t.getDescripcion() + ";");
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {

            }
        }

    }

    public void cargarArchivo() {
        Scanner sc = null;
        listapersonas = new ArrayList();
        try {
            sc = new Scanner(archivo);
            sc.useDelimiter(";");
            while (sc.hasNext()) {
                String a,b,c,d,e,f,g;
                a = sc.next();
                b = sc.next();
                c = sc.next();
                d = sc.next();
                e = sc.next();
                f = sc.next();
                g = sc.next();
                Scanner s2 = new Scanner(sc.next());
                s2.useDelimiter(",");
                listapersonas.add(new Padre(a,b,c,d,e,f,g));
            }
        } catch (Exception ex) {
        } finally {
            sc.close();
        }

    }
}
