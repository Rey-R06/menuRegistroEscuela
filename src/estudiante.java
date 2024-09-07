import javax.swing.*;

public class estudiante extends Persona{
    public int matricula;
    public double promedio;
    public String licenciatura;

    public estudiante(){}

    public estudiante(int edad, String name, String sexo, String licenciatura, int matricula, double promedio) {
        super(edad, name, sexo);
        this.licenciatura = licenciatura;
        this.matricula = matricula;
        this.promedio = promedio;
    }

    public void enterDataStudents(int edad, String name, String sexo, String licenciatura, int matricula, double promedio){
        name = JOptionPane.showInputDialog(null,"Nombre del estudiante: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog(null,"-Ingrese la edad: "));
        sexo = JOptionPane.showInputDialog(null,"Ingrese el sexo: ");
        licenciatura = JOptionPane.showInputDialog(null,"Ingrese la licenciatura: ");
        matricula = Integer.parseInt(JOptionPane.showInputDialog(null,"-Ingrese el numero de matricula: "));
        promedio = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el promedio: "));
        showDataStudents(edad,name,sexo,licenciatura,matricula,promedio);
    }

    public void showDataStudents(int edad, String name, String sexo, String licenciatura, int matricula, double promedio){
        System.out.println("Nombre del estudiante: "+ name+
                "\nEdad: "+edad+
                "\nSexo: "+sexo+
                "\nLicenciatura: "+licenciatura+
                "\nMatricula: "+matricula+
                "\nPromedio: "+promedio);

        confirmacion();

    }
    public void confirmacion() {
        int ban = 0;
        while (ban == 0) {
            Object[] opciones = {"SI", "CAMBIAR DATOS", "CANCELAR"};
            int confirmación = JOptionPane.showOptionDialog(null, "¿Enviar datos?",
                    "Confirmación", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, opciones, opciones[0]);
            if (confirmación == 0) {
                System.out.println("se enviaron los datos");
                ban += 1;
            } else if (confirmación == 1) {
                enterDataStudents(edad, name, sexo, licenciatura, matricula, promedio);
                ban = 0;
            } else if (confirmación == 2) {
                ban += 1;
            }
        }
    }
}
