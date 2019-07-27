package structural.adapter.impl;

import structural.adapter.AdvancedMediaPlayer;

/**
 * @Author MCC
 * @Create 2019/7/27 18:00
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
