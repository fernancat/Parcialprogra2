package Sensores;

import java.util.Random;

public class TemperaturaSensorDecorator extends SensorDecorator {
   public TemperaturaSensorDecorator(Sensor sensor) {
        super(sensor);
    }

@Override
    public void medir() {
        super.medir();
        Random random = new Random();
        double temperature = 20 + random.nextDouble() * 30; 
        System.out.println("Temperatura medida: " + temperature + "°C");
        if (temperature > 40) {
            nofificarObservadores("temperatura", temperature, "seguridad");
        }
    }
}
