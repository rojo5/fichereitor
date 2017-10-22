/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Usuario
 */
public class Registro {

    //Declararcion de variables
    protected char nombre[];
    protected float parcial1, parcial2, talleres, proyecto;

    //Constructores
    public Registro() {
    }

    public Registro(char[] nombre, float nota1, float nota2, float nota3, float nota4) {
        this.nombre = new char[25];
        this.nombre = nombre;

        parcial1 = nota1;
        parcial2 = nota2;
        talleres = nota3;
        proyecto = nota4;
    }

    public static void grabarRegistro(RandomAccessFile aa, Registro estudiante) throws IOException {
        //Ir al final del archivo
        int longitud = (int) aa.length();
        aa.seek(longitud);

        //Escribir datos del registro en el archivo
        for (int i = 0; i < (estudiante.nombre).length; i++) {
            aa.writeChar(estudiante.nombre[i]);
        }
        aa.writeFloat(estudiante.parcial1);
        aa.writeFloat(estudiante.parcial2);
        aa.writeFloat(estudiante.talleres);
        aa.writeFloat(estudiante.proyecto);

        //longitud = (int) aa.length();
        // System.out.println("length file: " + longitud);
    }

    public static String[] leerDatos(RandomAccessFile aa, File fal) throws IOException {
        int longitud = (int) fal.length();
        int lreg = 66; //lo que ocupa un registro
        int regs = longitud / lreg; // numero de registros en el fichero

        String contenido[] = new String[regs];
        System.out.println("Número total de registros en el fichero: " + regs);
        System.out.println("Cada registro ocupa: " + lreg);

        if (regs > 0) {
            Registro vector[] = leerRegistro(aa, regs, lreg);
            for (int i = 0; i < regs; i++) {
                String nom = new String(vector[i].nombre);
                //Almacenamos todos los registros en un array para pasarselo a la clase interfazAleatorio
                contenido[i] = (nom + " " + vector[i].parcial1 + " " + vector[i].parcial2 + " " + vector[i].talleres + " " + vector[i].proyecto);
            }
        } else {
            System.out.println("Archivo vacio !!!");

        }
        return contenido; //Devuelve todos los registros

    }

    public static Registro[] leerRegistro(RandomAccessFile aa, int regs, int lreg) throws IOException {

        Registro vector[] = new Registro[regs];
        aa.seek(0);

        //Leemos todos los datos
        for (int i = 0; i < regs; i++) {
            char nombre[] = new char[25];
            for (int k = 0; k < nombre.length; k++) {
                nombre[k] = aa.readChar();
            }
            String aux = new String(nombre);
            float nota1 = aa.readFloat();
            float nota2 = aa.readFloat();
            float nota3 = aa.readFloat();
            float nota4 = aa.readFloat();

            Registro datos = new Registro(nombre, nota1, nota2, nota3, nota4);

            vector[i] = datos;
        }
        return vector; //devuelve un registros

    }
}
