/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz4;

/**
 *
 * @author Aulas Heredia
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiantes arrEstudiantes[] = new Estudiantes[10];
        
        Procedimiento procedimiento = new Procedimiento();
        procedimiento.AgregaDatos(arrEstudiantes);
        procedimiento.MostrarDatos(arrEstudiantes);
    }
    
}
