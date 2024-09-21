package Fabrica;

import Sensores.SensorObservador;

public class FabricaTrabajadores implements SensorObservador{

    private String rol;

    public FabricaTrabajadores(String rol) {
        this.rol = rol;
    }

    @Override
    public void actualizar(String tipoSensor, double valor, String tipoEvento) {
        switch (rol) {
            case "seguridad":
                if (tipoEvento.equals("seguridad")) {
                    System.out.println("Alerta de seguridad: " + tipoSensor + " " + valor);
                }
                break;
            case "mantenimiento":
                if (tipoEvento.equals("mantenimiento")) {
                    System.out.println("Crear tarea de mantenimiento: " + tipoSensor + " " + valor);
                }
                break;
            case "gerencia":
                if (tipoEvento.equals("gerencia")) {
                    System.out.println("Enviar correo a gerencia: Falla en " + tipoSensor);
                }
                break;
            case "registro":
                System.out.println("Registrando evento: " + tipoSensor + " " + valor);
                break;
        }
    }
}
