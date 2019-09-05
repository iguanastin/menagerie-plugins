package menagerie.duplicates;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface DuplicateFinder {

    List<Match> getMatchesFor(File file) throws IOException;

}
