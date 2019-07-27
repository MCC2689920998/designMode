package structural.adapter.impl;

import structural.adapter.AdvancedMediaPlayer;

/**
 * @Author MCC
 * @Create 2019/7/27 17:59
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }
}
