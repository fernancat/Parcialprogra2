package Sensores;


public interface SensorObservador {
    void actualizar(String tipoSensor, double valor, String evento);    
    
};
