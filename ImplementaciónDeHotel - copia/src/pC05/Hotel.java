package pC05;

import java.io.Serializable;

public class Hotel implements Serializable{

    private Cliente[][] habitaciones;

    public Hotel(){

        habitaciones=new Cliente[8][6];
    }

    public String toString(){

        String s="";

        for(int i=0;i<8;i++){
            for(int j=0;j<6;j++){
                if(habitaciones[i][j]==null){
                    s=s+" [L] ";
                }
                else{
                    s=s+" [R] ";
                }
            }
            s=s+"\n";
        }
        return s;
    }

    public boolean anularReserva(Cliente cliente,String tipo,int numHab){
        int aux = 0;

        switch (tipo.toUpperCase()) {
            case "ESTANDAR":
                for (int i = 3; i <= 7; i++) {
                    for (int j = 5; j >= 0; j--) {
                        if (habitaciones[i][j] instanceof Cliente) {
                            if(habitaciones[i][j].equals(cliente)) {
                                if (numHab>0){
                                    habitaciones[i][j] = null;
                                    numHab--;
                                }
                            }
                        }
                    }
                }
                if (aux == numHab) {
                    return true;
                } else return false;

            case "BALCON":
                for (int x = 0; x < numHab; x++) {
                    for (int i = 2; i >= 1; i--) {
                        for (int j = 0; j < 6; j++) {
                            if (habitaciones[i][j] instanceof Cliente) {
                                if(habitaciones[i][j].equals(cliente)) {
                                    if (numHab>0){
                                        habitaciones[i][j] = null;
                                        numHab--;
                                    }
                                }
                            }
                        }
                    }
                }
                if (aux == numHab) {
                    return true;
                } else return false;

            case "SUITE":
                for (int x = 0; x < numHab; x++){
                    for (int i = 0; i < 1; i++) {
                        for (int j = 0; j < 6; j++) {
                            if (habitaciones[i][j] instanceof Cliente) {
                                if(habitaciones[i][j].equals(cliente)) {
                                    if (numHab>0){
                                        habitaciones[i][j] = null;
                                        numHab--;
                                    }
                                }
                            }
                        }
                    }
                }
                if (aux == numHab) {
                    return true;
                } else return false;

            default: return false;
        }
    }


    public boolean reservar(Cliente cliente,String tipo,int numHab) {

        int aux = 0;

        switch (tipo.toUpperCase()) {
            case "ESTANDAR":
                for (int i = 7; i >= 3; i--) {
                    for (int j = 0; j < 6; j++) {
                        if(habitaciones[i][j] == null) {
                            if (numHab>0){
                                habitaciones[i][j] = cliente;
                                numHab--;
                            }
                        }
                    }
                }
                if (aux == numHab) {
                    return true;
                } else return false;

            case "BALCON":
                for (int x = 0; x < numHab; x++) {
                    for (int i = 2; i >= 1; i--) {
                        for (int j = 0; j < 6; j++) {
                            if(habitaciones[i][j] == null) {
                                if (numHab>0){
                                    habitaciones[i][j] = cliente;
                                    numHab--;
                                }
                            }
                        }
                    }
                }
                if (aux == numHab) {
                    return true;
                } else return false;

            case "SUITE":
                for (int x = 0; x < numHab; x++){
                    for (int i = 0; i < 1; i++) {
                        for (int j = 0; j < 6; j++) {
                            if(habitaciones[i][j] == null) {
                                if (numHab>0){
                                    habitaciones[i][j] = cliente;
                                    numHab--;
                                }
                            }
                        }
                    }
                }
                if (aux == numHab) {
                    return true;
                } else return false;

            default: return false;
        }
    }

    public void adicional(Cliente cliente, int planta, Referencia p){
        int c = 0;
            for (int j = 0; j < 6; j++) {
                if(habitaciones[8-planta][j]==null){
                    habitaciones[8-planta][j]= cliente;
                    c++;
                }
            }
            p.setX(c);
    }


}


