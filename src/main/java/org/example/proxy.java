package org.example;

public class proxy {
    public class Destination{
        public void tudo(){
            System.out.println("control...");
        }
    }
    public class Device{
        private String name;
        private Destination destination;
        private DeviceController deviceController;

        public void control(DeviceController deviceController){
            destination.tudo();
        }
    }
    public class DeviceController {
        private Device device;
        private Destination destination;

        private void control(Destination destination){
            destination.tudo();
        }
    }
}
