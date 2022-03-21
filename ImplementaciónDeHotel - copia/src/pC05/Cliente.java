package pC05;

import java.io.Serializable;
import java.util.Scanner;

    public class Cliente implements Serializable {
        private String nombre;
        private String apellido;
        private int DNI;
        private int telefono;
        private int numTarjeta;
        private int fechaEntrada;
        private int fechaSalida;

        public Cliente(){
        }

        public Cliente(String nombre, String apellido, int DNI, int telefono, int numTarjeta, int fechaEntrada, int fechaSalida){
            this.nombre = nombre;
            this.apellido = apellido;
            this.DNI = DNI;
            this.telefono = telefono;
            this.numTarjeta = numTarjeta;
            this.fechaEntrada = fechaEntrada;
            this.fechaSalida = fechaSalida;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return this.nombre;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public String getApellido() {
            return this.apellido;
        }

        public void setDNI(int DNI) {
            this.DNI = DNI;
        }

        public int getDNI() {
            return DNI;
        }

        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }

        public int getTelefono() {
            return telefono;
        }

        public void setNumTarjeta(int numTarjeta) {
            this.numTarjeta = numTarjeta;
        }

        public int getNumTarjeta() {
            return numTarjeta;
        }


        public void setFechaEntrada(int fechaEntrada) {
            this.fechaEntrada = fechaEntrada;
        }

        public int getFechaEntrada() {
            return fechaEntrada;
        }

        public void setFechaSalida(int fechaSalida) {
            this.fechaSalida = fechaSalida;
        }

        public int getFechaSalida() {
            return fechaSalida;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || this.getClass() != o.getClass()) return false;
            Cliente cliente = (Cliente) o;
            return this.DNI == cliente.DNI;
        }


}
