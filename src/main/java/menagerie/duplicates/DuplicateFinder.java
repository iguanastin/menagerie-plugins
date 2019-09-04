package menagerie.duplicates;

import java.io.File;
import java.util.List;

public interface DuplicateFinder {

    List<Match> getMatchesFor(File file);

}
