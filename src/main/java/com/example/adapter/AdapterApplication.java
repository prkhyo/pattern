package com.example.adapter;

public class AdapterApplication {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer(); // 클라이언트 객체

        // 어떤 형식의 오디오타입이든 동일한 인터페이스 play() 호출
        audioPlayer.play("mp3", "song.mp3");
        audioPlayer.play("mp4", "movie.mp4");
        audioPlayer.play("vlc", "video.vlc");
    }
}
