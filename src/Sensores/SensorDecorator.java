package Sensores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class SensorDecorator implements Sensor {
    protected Sensor sensor;
    private Map<String, List<SensorObservador>> observers = new HashMap<>();

    public SensorDecorator(Sensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public void medir() {
        sensor.medir();
    }

    @Override
    public void agregarObservador(String eventType, SensorObservador observer) {
        observers.computeIfAbsent(eventType, k -> new ArrayList<>()).add(observer);
    }

    protected void nofificarObservadores(String tipoSensor, double valor, String tipoEvento) {
        List<SensorObservador> eventObservers = observers.getOrDefault(tipoEvento, Collections.emptyList());
        for (SensorObservador observer : eventObservers) {
            observer.actualizar(tipoEvento, valor, tipoEvento);
        }
    }
}
