public abstract class MediaFile {
    private String filename;

//===============================================================
    public MediaFile(String filename) {
        this.filename = filename;
    
        System.out.printf("파일명: [%s]\n", filename );
    }
//===============================================================    
    public String getFilename() {return filename;}
    public void setFilename(String filename) {this.filename = filename;}
    
    //public void getInfo(String filename){this.filename = filename;}
//===============================================================    
    @Override
    public String toString() {
        return "MediaFile [filename=" + filename + "]";
    }
    
    public abstract void play();
}


