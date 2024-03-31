package com.mobdeve.radiowave;

import android.media.MediaPlayer;
import java.io.IOException;

public class PlayAudioTask implements Runnable {
    private MediaPlayer mediaPlayer;
    private String audioUrl;

    public PlayAudioTask(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    @Override
    public void run() {
        mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource(audioUrl);
            mediaPlayer.prepare();
            mediaPlayer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void releaseMediaPlayer() {
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}