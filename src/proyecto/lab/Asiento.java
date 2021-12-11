package proyecto.lab;

public class Asiento {
    
int numeroAsiento;
    private char claseAsiento, ubicacionAsiento;
    private Pasajero pasajero;
    
    public Asiento(){
        
    }
    
    public Asiento(int numeroAsiento, char claseAsiento, char ubicacionAsiento){
        
    }
    public void asignarNumeroAsiento (int numeroAsiento){
        this.numeroAsiento = numeroAsiento;
    }
    public int obtenerNumeroAsiento (){
        return numeroAsiento;
    }
    public void asignarClaseAsiento(char claseAsiento){
        this.claseAsiento = claseAsiento;
        if (numeroAsiento>=1 && numeroAsiento<=4)
            claseAsiento = 1;
        else
            claseAsiento = 2;
    }
    public char obtenerClaseAsiento(char claseAsiento){
        return claseAsiento;
    }
    public void asignarUbicacionAsiento(char ubicacionAsiento){
        this.ubicacionAsiento = ubicacionAsiento;
        if (claseAsiento==1)
        {
            if (numeroAsiento==2||numeroAsiento==3)
            {
                ubicacionAsiento=3;
            }
            else
            {
                if(numeroAsiento==1||numeroAsiento==4)
                    ubicacionAsiento=1;
            }
        }
        else
        {
            if (numeroAsiento==5||numeroAsiento==10||numeroAsiento==11||numeroAsiento==16||numeroAsiento==17||numeroAsiento==22||numeroAsiento==23||numeroAsiento==28)
            {
                ubicacionAsiento=1;
            }
            else
            {
                if(numeroAsiento==6||numeroAsiento==9||numeroAsiento==12||numeroAsiento==15||numeroAsiento==18||numeroAsiento==21||numeroAsiento==24||numeroAsiento==27)
                {
                    ubicacionAsiento=2;
                }
            }
            if (numeroAsiento==7||numeroAsiento==8||numeroAsiento==13||numeroAsiento==14||numeroAsiento==19||numeroAsiento==20||numeroAsiento==25||numeroAsiento==26)
                ubicacionAsiento=3;
        }
        //ubicacionAsiento = claseAsiento;
    }
    public char obtenerUbicacionAsiento(){
        return ubicacionAsiento;
    }
    public void asignarPasajero(Pasajero pasajero){
        this.pasajero = pasajero;
    }
    public Pasajero obtenerPasajero(){
        return pasajero;
    }
    public void desocuparAsiento(){
        pasajero = null;
    }
    public boolean obtenerEstadoAsiento(){
    return false;
        
    }
}
