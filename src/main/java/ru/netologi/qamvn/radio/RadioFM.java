package ru.netologi.qamvn.radio;

public class RadioFM {
    private int channelRadio;
    private int volumeRadio;

    public void nextChannelRadio() {
        if (channelRadio != 9) {
            channelRadio++;
        } else {
            channelRadio = 0;
        }
    }

    public void prevChannelRadio() {
        if (channelRadio != 0) {
            channelRadio--;
        } else {
            channelRadio = 9;
        }
    }

    public void nextVolumeRadio() {
        if (volumeRadio != 100) {
            volumeRadio++;
        } else {
            volumeRadio = 100;
        }
    }

    public void prevVolumeRadio() {
        if (volumeRadio != 0) {
            volumeRadio--;
        } else {
            volumeRadio = 0;
        }
    }


    public int getChannelRadio() {
        return channelRadio;
    }

    public void setChannelRadio(int channelRadio) { //сеттер с логикой от неправильных значений
        if (channelRadio < 0) {
            return;
        }
        if (channelRadio > 9) {
            return;
        }
        this.channelRadio = channelRadio;
    }

    public int getVolumeRadio() {
        return volumeRadio;
    }

    public void setVolumeRadio(int volumeRadio) {//сеттер с логикой от неправильных значений
        if (volumeRadio < 0) {
            return;
        }
        if (volumeRadio > 100)
            return;
        this.volumeRadio = volumeRadio;
    }
}






/*
public class Radio {

    private int maxChannelRadio = 9;
    private int minChannelRadio = 0;
    private int channelRadio;
    private int volumeRadio;
    private int maxVolumeRadio = 100;
    private int minVolumeRadio = 0;

    public Radio() {

    }
    public Radio(int sizeChannel) {
        if(sizeChannel <= 0){
            return;    //выход в этом месте = возврат к пустому конструктору public Radio(){ }
        }
        else
        {maxChannelRadio = sizeChannel -1;}

    }

    public int getChannelRadio() {
        return channelRadio;
    }

    public void setChannelRadio(int newChannelRadio) {
        channelRadio = newChannelRadio;

    }

    public int getVolumeRadio() {
        return volumeRadio;
    }

    public void setVolumeRadio(int volumeRadio) {
        this.volumeRadio = volumeRadio;
        return this;
    }

    public void nextChannel() {
        if (channelRadio < maxChannelRadio & channelRadio >= minChannelRadio) {
            channelRadio++;
            return;
        }
        if (channelRadio == maxChannelRadio) {
            channelRadio = minChannelRadio;

        } else {
            channelRadio = maxChannelRadio;
        }

    }

    public void prevChannel() { //метод понижения каналла
        if (channelRadio <= maxChannelRadio & channelRadio > minChannelRadio) {
            channelRadio--;
            return;
        }
        if (channelRadio == minChannelRadio) {
            channelRadio = maxChannelRadio;
        } else {
            channelRadio = minChannelRadio;
        }
    }

    public void upVolumeRadio() {
        if (volumeRadio >= minVolumeRadio & volumeRadio < maxVolumeRadio) {
            volumeRadio++;
        } else {
            volumeRadio = maxVolumeRadio;
        }
    }

    public void bottomVolumeRadio() {
        if (volumeRadio > minVolumeRadio & volumeRadio <= maxVolumeRadio) {
            volumeRadio--;
        } else {
            volumeRadio = minVolumeRadio;
        }
    }
}
 */