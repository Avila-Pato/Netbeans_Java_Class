

package logica.herencia;


public class Herencia {

    public static void main(String[] args) {
       
        Empleado emple1 = new  Empleado();
        
        emple1.getNum_legajo();
        emple1.getNombre();
        
        
        // herenmcia consutor
        Consultor consult  =  new Consultor();
        consult.getNombre_consultor();
        consult.getId();
        
    }
}
