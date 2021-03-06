package cafe.adriel.androidaudioconverter.model;

public enum AudioFormat {
    AAC,
    MP3,
    M4A,
    WMA,
    WAV,
    FLAC,
    MP4;

    public String getFormat() {
        return name().toLowerCase();
    }
}