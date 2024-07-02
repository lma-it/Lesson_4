package OOP_Task2_MediaPlayer;
import static print_module.print_library.println;

public class MediaPlayerMain {
    public static void main(String[] args) {
        Repository<AudioContent> audioStorage = new Repository<>("sudioStorage");
        audioStorage.add(new AudioContent("track_001.mp3"));
        audioStorage.add(new AudioContent("03 Дорожка 03.wma"));

        for (int index = 0; index < audioStorage.getSize(); index++){
            println(audioStorage.getDs(index));
        }

        Repository<VideoContent> videoStorage = new Repository<>("videoStorage");
        videoStorage.add(new VideoContent("Новый фильм 1.wmv"));
        videoStorage.add(new VideoContent("Новый фильм 5.3gp"));

        for (int index = 0; index < videoStorage.getSize(); index++){
            println(videoStorage.getDs(index));
        }




    }

    
}
