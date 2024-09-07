import javax.swing.*;

public class menu extends Persona{
    public int eleccion;

    public void menu(){}

    public void menu(int eleccion){
        this.eleccion = eleccion;
    }
    estudiante students = new estudiante();
    teachers teachers = new teachers();
    public void showMenu(int eleccion){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        do {
            eleccion = Integer.parseInt(JOptionPane.showInputDialog(null," \n1. Estudiante \n2." +
                                                                    "Profesor\n0.Salir"));
            switch (eleccion){
                case 1:
                   students.enterDataStudents(edad,name,sexo, students.licenciatura, students.matricula, students.promedio);
                    break;
                case 2:
                    teachers.enterDataTeachers(edad, name, sexo, teachers.departamento, teachers.idteacher, teachers.salario);

                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (eleccion != 0);
    }

}
