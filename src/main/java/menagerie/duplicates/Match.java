package menagerie.duplicates;

import java.util.List;

public class Match {

    private final String pageURL;
    private final String thumbnailURL;


    public Match(String pageURL, String thumbnailURL) {
        this.pageURL = pageURL;
        this.thumbnailURL = thumbnailURL;
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

}
