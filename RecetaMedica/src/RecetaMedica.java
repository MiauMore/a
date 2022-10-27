import java.time.LocalDate;
import java.util.ArrayList;

public class RecetaMedica {
    private int nroReceta;
    private String nombrePaciente;
    private LocalDate fecha;
    private ArrayList<String> nombreMedicamentos;

    public RecetaMedica(int numero,String nombre, LocalDate fecha) {
        nroReceta = numero;
        nombrePaciente = nombre;
        this.fecha = fecha;
        nombreMedicamentos = new ArrayList<>();
    }

    public int getNroReceta() {
        return nroReceta;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    public int getNroMedicamento(){
        return nombreMedicamentos.size();
    }
    public boolean estaNombreMedicamento(String nomMedicamento){
        boolean esta = false;
            if (nombreMedicamentos.contains(nomMedicamento)){
                esta=true;
            }
        return esta;
    }
    public boolean addNombreMedicamento(String nomMedicamento){
        boolean logro=false;
        if (!nombreMedicamentos.contains(nomMedicamento)){
            nombreMedicamentos.add(nomMedicamento);
            logro=true;
        }
        return logro;
    }
    public String[] getNombreMedicamentos(){
        String[] nombreMed= new String[nombreMedicamentos.size()];
        for(int i=0;i<nombreMedicamentos.size();i++){
            nombreMed[i]=nombreMedicamentos.get(i);
        }
        return nombreMed;
    }
}
