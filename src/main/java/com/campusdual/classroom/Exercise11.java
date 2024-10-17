package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());

        //Encender la TV
        redRemote.turnOn();
        if (redRemote.on) {
            System.out.println("La TV está encendida");
        } else {
            System.out.println("La TV está apagada");
        }
        //Subir un canal
        redRemote.channelUp();
        System.out.println("El canal es: " + redRemote.getChannel());

        //Bajar un canal
        redRemote.channelDown();
        System.out.println("El canal es: " + redRemote.getChannel());

        // Establecer el canal en 0, intentar bajar un canal y comprobar que no se puede
        redRemote.channel = 0;
        System.out.println("El canal es 0");

        //Subir el volumen
        redRemote.volumeUp();
        System.out.println("Volumen = " + redRemote.getVolume());

        //Bajar el volumen
        redRemote.volumeDown();
        System.out.println("Volumen = " + redRemote.getVolume());

        //Establecer el volumen en 0, intentar bajar el volumen y comprobar que no se puede
        redRemote.volume = 0;
        System.out.println("Volumen = 0");

        //Apagar la TV
        redRemote.turnOff();
        if (redRemote.on) {
            System.out.println("La TV está encendida");
        }else{
            System.out.println("La TV está apagada");
        }
    }
}