package menagerie.duplicates;

import menagerie.MenageriePlugin;

import java.io.File;
import java.util.List;

public interface DuplicateSearcher extends MenageriePlugin {

    List<Match> getMatchesFor(File file);

}
