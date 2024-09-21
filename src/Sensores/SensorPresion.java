package Sensores;

import java.util.Random;

public class SensorPresion extends SensorDecorator {
    public SensorPresion(Sensor sensor) {
        super(sensor);
    }

    public void medir() {
        super.medir();
        Random random = new Random();
        double presion = 1013 + random.nextDouble() * 100 - 50; 
        System.out.println("Presión medida: " + presion + " hPa");
        if (presion < 980) {
            nofificarObservadores("presión", presion, "mantenimiento");
        }
    }
}
