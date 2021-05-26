public class TV {

    public static void main(String[] args) {
        TV tv = new TV();
        tv.turnOn();
        tv.setChannel(77);
        tv.channelUp();
        tv.channelUp();
        tv.setVolume(25);
        tv.volumeDown();

    }


    int channel;
    int volume;
    boolean isOn;


    public TV(){

    }

    public TV(int channel, int volume) {
        this.channel = channel;
        this.volume = volume;
    }

    public void turnOn(){
        isOn = true;
        System.out.println("Turning on the TV");
    }

    public void turnOff(){
        isOn = false;
        System.out.println("Turning off the TV");
    }

    public void setChannel(int channel) {
        if (isOn == true && (channel >= 1 && channel <=120))
        this.channel = channel;
        System.out.println("The volume is " + this.volume);
    }

    public void setVolume(int volume) {
        if (isOn == true && (volume >= 1 && volume <= 50))
        this.volume = volume;
        System.out.println("The volume is " + this.volume);
    }

    public void channelUp() {
        if (isOn == true && channel <= 120);
        channel++;
        System.out.println("The channel is " + this.channel);
    }

    public void channelDown() {
        if (isOn == true && channel >= 1);
        channel--;
        System.out.println("The channel is " + this.channel);
    }

    public void volumeUp() {
        if (isOn == true && volume <= 50);
        volume++;
        System.out.println("The volume is " + this.volume);
    }

    public void volumeDown() {
        if (isOn == true && volume >= 1);
        volume--;
        System.out.println("The volume is " + this.volume);
    }

}
