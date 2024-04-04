/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz4;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Procedimiento {
    int notaMayor = 0;
    int notaMenor = 101;
    int total = 0;
    
    public void AgregaDatos(Estudiantes[] arreglo){    
        JOptionPane.showMessageDialog(null, "Ingrese los datos solicitados..."); //Solicita los datos de los estudiantes y los guarda
        
        for(int x=0; x<arreglo.length; x++){
            String nombre = JOptionPane.showInputDialog("Escriba el nombre del estudiante "+(x+1)+":");
            String curso = JOptionPane.showInputDialog("Escriba el curso del estudiante "+(x+1)+":");
            String profesor = JOptionPane.showInputDialog("Escriba el profesor del estudiante "+(x+1)+":");
            int calificacion = Integer.parseInt(JOptionPane.showInputDialog("Escriba la calificacion del estudiante "+(x+1)+":"));
            
            if (calificacion > notaMayor) { //Calcula nota mayor
                notaMayor = calificacion;
            }
            
            if (calificacion < notaMenor) { //Calcula nota menor
                notaMenor = calificacion;
            }
            
            total += calificacion; //Hace una suma total de las notas para el promedio
            
            arreglo[x] = new Estudiantes(nombre,curso,profesor,calificacion);
        }
    }
    
    public void MostrarDatos(Estudiantes[] arreglo){
        JOptionPane.showMessageDialog(null, "Listado general de estudiantes..."); //Hace un listado de estudiantes ingresados
        
        for(int x=0;x<arreglo.length;x++){
            JOptionPane.showMessageDialog(null, 
                "Nombre: "+arreglo[x].getNombre()+
                "\n"+"Curso: "+arreglo[x].getCurso()+
                "\n"+"Profesor: "+arreglo[x].getProfesor()+
                "\n"+"Calificacion: "+arreglo[x].getCalificacion());
        }
        
        JOptionPane.showMessageDialog(null, "Nombre del estudiante con la nota mayor..."); //Compara nota mayor con nota mayor almacenada para sacar los datos del estudiante
        for(int x=0; x<arreglo.length; x++){
            if (arreglo[x].getCalificacion() == notaMayor) {
                JOptionPane.showMessageDialog(null, 
                    "Nombre: "+arreglo[x].getNombre()+
                    "\n"+"Calificacion: "+arreglo[x].getCalificacion());
            }
        }
        
        JOptionPane.showMessageDialog(null, "Nombre del estudiante con la nota menor..."); //Compara nota menor con nota menor almacenada para sacar los datos del estudiante
        for(int x=0; x<arreglo.length; x++){
            if (arreglo[x].getCalificacion() == notaMenor) {
                JOptionPane.showMessageDialog(null, 
                    "Nombre: "+arreglo[x].getNombre()+
                    "\n"+"Calificacion: "+arreglo[x].getCalificacion());
            }
        }
        
        JOptionPane.showMessageDialog(null, "Promedio de calificaciones..."); //Calcula promedio
        double promedio = total / 10;
        JOptionPane.showMessageDialog(null, promedio);
        
        JOptionPane.showMessageDialog(null, "Calificaciones por encima del promedio..."); //Compara notas con promedio e imprime las que estan por encima
        for(int x=0; x<arreglo.length; x++){
            if (arreglo[x].getCalificacion() > promedio) {
                JOptionPane.showMessageDialog(null, 
                    "Nombre: "+arreglo[x].getNombre()+
                    "\n"+"Calificacion: "+arreglo[x].getCalificacion());
            }
        }
        
        JOptionPane.showMessageDialog(null, "Calificaciones por debajo del promedio..."); //Compara notas con promedio e imprime las que estan por debajo
        for(int x=0; x<arreglo.length; x++){
            if (arreglo[x].getCalificacion() < promedio) {
                JOptionPane.showMessageDialog(null, 
                    "Nombre: "+arreglo[x].getNombre()+
                    "\n"+"Calificacion: "+arreglo[x].getCalificacion());
            }
        }
    }
}
