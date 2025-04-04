public class ImageFile extends MediaFile {
  public ImageFile(String filename) {
    super(filename);
  }

  @Override
  public void play() {
    System.out.println("이미지 파일을 표시합니다.");
  }
}
