package Sensores;

import java.util.Random;

public class SensorCombustible extends SensorDecorator {
    public SensorCombustible(Sensor sensor) {
        super(sensor);
}

    @Override
    public void medir() {
        super.medir();
        Random random = new Random();
        double combustible = random.nextDouble() * 100; 
        System.out.println("Nivel de líquido: " + combustible + "%");
        if (combustible < 15 || combustible > 85) {
            nofificarObservadores("compustible", combustible, "mantenimiento");
        }
    }
}   
