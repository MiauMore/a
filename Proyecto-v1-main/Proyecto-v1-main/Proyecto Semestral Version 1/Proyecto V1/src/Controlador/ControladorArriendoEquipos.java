package Controlador;

import Modelo.Arriendo;
import Modelo.Cliente;
import Modelo.Equipo;
import Vista.UIArriendoEquipos;
import java.text.DecimalFormat; //importa para implementar puntos en los miles
import java.util.ArrayList;

public class ControladorArriendoEquipos {

    private static ControladorArriendoEquipos instancia=null;
    private final ArrayList<Cliente> clientes;
    private final ArrayList<Equipo> equipos;
    private final ArrayList<Arriendo> arriendos;
    private ControladorArriendoEquipos(){
        clientes= new ArrayList<>();
        equipos= new ArrayList<>();
        arriendos= new ArrayList<>();
    }
    public static ControladorArriendoEquipos getInstancia(){
        if(instancia==null){
            instancia=new ControladorArriendoEquipos();
        }
        return instancia;
    }
    ArrayList<Cliente> ListaClientes = new ArrayList<>();
    ArrayList<Equipo> ListaEquipos = new ArrayList<>();

    public void creaCliente(String rut, String nom, String dir, String tel){
        clientes.add(new Cliente(rut, nom, dir, tel));
    }

    public void creaEquipo(long cod, String desc, long precio){
        equipos.add(new Equipo(cod, desc, precio));
    }

    public String [][] listaClientes(){
        String [][] clienteArr = new String [clientes.size()][5];
        int i=0;
        for(Cliente cliente: clientes){
            clienteArr[i][0] = cliente.getRut();
            clienteArr[i][1] = cliente.getNombre();
            clienteArr[i][2] = cliente.getDireccion();
            clienteArr[i][3] = cliente.getTelefono();
            if(cliente.isActivo()==true){
                clienteArr[i][4] = "Activo";
            }
            else {
                clienteArr[i][4] = "Inactivo";
            }
            i++;
        }
        return clienteArr;
    }
    public String[][] listaEquipos(){

        DecimalFormat miles =new DecimalFormat("###,###.##");

        String[][] equipoArr = new String [equipos.size()][4];
        int i = 0;
        for(Equipo equipo: equipos){
            equipoArr[i][0] = String.valueOf(equipo.getCodigo());
            equipoArr[i][1] = equipo.getDescripcion();
            equipoArr[i][2] = miles.format(equipo.getPrecioArriendoDia()); //al numero ingresado le agrega los puntos en los miles
            equipoArr[i][3] = String.valueOf(equipo.getEstado());
            i++;
        }
        return equipoArr;
    }

    public long creaArriendo(String rutCliente){
        String rut = rutCliente;
        if(ListaClientes.contains())
        arriendos.add(new Arriendo());
    }


}
