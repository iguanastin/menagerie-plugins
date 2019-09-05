package menagerie.duplicates;

import java.util.List;

public class Match {

    private final String pageURL;
    private final String thumbnailURL;
    private final double similarity;
    private final int width, height;


    public Match(String pageURL, String thumbnailURL, double similarity, int width, int height) {
        this.pageURL = pageURL;
        this.thumbnailURL = thumbnailURL;
        this.similarity = similarity;
        this.width = width;
        this.height = height;
    }

    public String getPageURL() {
        return pageURL;
    }

    public String getThumbnailURL() {
        return thumbnailURL;
    }

    public List<String> getTags() {
        return null;
    }

    public String getImageURL() {
        return null;
    }

    public double getSimilarity() {
        return similarity;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

}
