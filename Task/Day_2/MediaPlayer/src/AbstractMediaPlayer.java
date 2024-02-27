public abstract class AbstractMediaPlayer implements MediaPlayer{
    private String mediaTitle;

    // Constructor
    public AbstractMediaPlayer(String mediaTitle) {
        this.mediaTitle = mediaTitle;
    }

    // Getter and setter for media title
    public String getMediaTitle() {
        return mediaTitle;
    }

    public void setMediaTitle(String mediaTitle) {
        this.mediaTitle = mediaTitle;
    }

}
