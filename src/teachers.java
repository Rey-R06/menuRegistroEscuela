import javax.swing.*;

public class teachers extends Persona {
    public int idteacher;
    public double salario;
    public String departamento;

    public teachers() {

    }
    public teachers(int edad, String name, String sexo, String departamento, int idteacher, double salario) {
        super(edad, name, sexo);
        this.departamento = departamento;
        this.idteacher = idteacher;
        this.salario = salario;
    }

    public void enterDataTeachers(int edad, String name, String sexo, String departamento, int idteacher, double salario){
        name = JOptionPane.showInputDialog(null,"Nombre del estudiante: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog(null,"-Ingrese la edad: "));
        sexo = JOptionPane.showInputDialog(null,"Ingrese el sexo: ");
        departamento = JOptionPane.showInputDialog(null,"Ingrese el departamento: ");
        idteacher = Integer.parseInt(JOptionPane.showInputDialog(null,"-Ingrese la identificacion: "));
        salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el salario: "));
        showDataTeachers(edad,name,sexo,departamento,idteacher,salario);
    }

    public void showDataTeachers(int edad, String name, String sexo, String departamento, int idteacher, double salario){
        System.out.println("Nombre del estudiante: "+ name+
                "\nEdad: "+edad+
                "\nSexo: "+sexo+
                "\ndepartamento: "+departamento+
                "\nidentificacion: "+idteacher+
                "\nsalario: "+salario);

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
                enterDataTeachers(edad, name, sexo, departamento, idteacher, salario);
                ban = 0;
            } else if (confirmación == 2) {
                ban += 1;
            }
        }
    }
}
