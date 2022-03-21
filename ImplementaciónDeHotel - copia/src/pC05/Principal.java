package pC05;

import java.io.*;

public class Principal {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Cliente c1=new Cliente("Pepe","Gonzalez",53264545,667900396,78857,6,16);
        Cliente c2 = new Cliente("Mario", "Picazo", 54123456,54635765,234654,12,45);
        Referencia p = new Referencia();


        Hotel h = new Hotel();
        System.out.println(h);

        h.reservar(c1,"estandar",6);
        h.reservar(c1,"suite",3);
        h.reservar(c1,"balcon",2);
        System.out.println(h);

        h.reservar(c2,"estandar",2);
        System.out.println(h);

        h.anularReserva(c2,"estandar",2);
        h.anularReserva(c1,"estandar",2);
        System.out.println("Despues de anular la reserva");
        System.out.println(h);

        h.adicional(c1,1, p);
        System.out.println("Has reservado " +p);




        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        fos = new FileOutputStream("SerializarHotel.dat");
        salida = new ObjectOutputStream(fos);
        salida.writeObject(h);
        fos.close();
        salida.close();
        FileInputStream fis = null;
        ObjectInputStream entrada = null;
        fis = new FileInputStream("SerializarHotel.dat");
        entrada = new ObjectInputStream(fis);
        System.out.println("--------------------------------");
        h= (Hotel) entrada.readObject();
        fis.close();
        entrada.close();
        System.out.println(h);
    }
}
