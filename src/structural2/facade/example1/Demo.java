package structural2.facade.example1;

import java.io.File;

import structural2.facade.example1.facade.VideoConversionFacade;

public class Demo {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}
