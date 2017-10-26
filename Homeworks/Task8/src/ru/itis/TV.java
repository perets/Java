package ru.itis;

/**
 * 25.10.2017
 * TV
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class TV {
    Channel channels[];
    int count = 0;

    public TV() {
        this.channels = new Channel[5];
    }

    void add(Channel channel) {
        this.channels[count] = channel;
        count++;
    }

    void switchChannel(int channelNumber) {
        if (channels[channelNumber] == null) {
            System.err.println("пшпшпшпшпшпшпшпшп");
        } else {
            channels[channelNumber].showCurrentProgram();
        }
    }
}
