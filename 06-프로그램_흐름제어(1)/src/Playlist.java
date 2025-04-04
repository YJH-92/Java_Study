class AudioFile extends MediaFile {

    public AudioFile(String filename) {
        super(filename);
    }

    @Override
    public void play() {
        System.out.println("오디오 파일을 재생합니다.");
    }
}
///=====================================================================
 class VideoFile extends MediaFile {

    public VideoFile(String filename) {
        super(filename);
    }

    @Override
    public void play() {
        System.out.println("비디오 파일을 재생합니다.");
    }
}
///=====================================================================
class ImageFile extends MediaFile {

    public ImageFile(String filename) {
        super(filename);
    }

    @Override
    public void play() {
        System.out.println("이미지 파일을 표시합니다.");
    }
}
///=====================================================================
public class Playlist {
    public static void main(String[] args) {
        
        MediaFile[] media = new MediaFile[3];

        media[0] = new AudioFile("music.mp3");
        media[1] = new VideoFile("movie.mp4");
        media[2] = new ImageFile("picture.jpg");

        for (int i=0; i<media.length; i++) {
            media[i].getInfo();
            media[i].media();
        }

        

    }
}
