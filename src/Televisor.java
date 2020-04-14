class Televisor {
    boolean switchOn;

    public Televisor() {
        switchOn = false;
        System.out.println("Powstał telewizor!");
    }

    void turnOn(){
        switchOn = true;
        showStatus();
    }

    void turnOff(){
        switchOn = false;
        showStatus();
    }

    void showStatus(){
        if(switchOn)
            System.out.println("Telewizor jest włączony");
        else
            System.out.println("Telewizor jest wyłączony");
    }
}
