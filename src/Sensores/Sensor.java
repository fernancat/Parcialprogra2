package Sensores;

public interface Sensor {
    void medir();
    void agregarObservador(String tipoEvento, SensorObservador observer);
}
