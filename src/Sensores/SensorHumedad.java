package Sensores;

import java.util.Random;

public class SensorHumedad extends SensorDecorator{
     public SensorHumedad(Sensor sensor) {
        super(sensor);
    }

    @Override
    public void medir() {
        super.medir();
        Random random = new Random();
        double humedad = 40 + random.nextDouble() * 40; 
        System.out.println("Humedad medida: " + humedad + "%");
        if (humedad > 70) {
            nofificarObservadores("humedad", humedad, "mantenimiento");
        }
    }
}
