package cz.pa181.project.dao.obyvatelstvo;

import com.j256.ormlite.dao.Dao;
import cz.pa181.project.entity.obyvatelstvo.ObyvatelstvoPrirastok;

import java.sql.SQLException;
import java.util.List;

/**
 * Class represents:
 * @author xholecko
 */
public interface ObyvatelstvoPrirastokDao extends Dao<ObyvatelstvoPrirastok,Long> {

    /**
     *
     * @param rok rok (hodnoty od 1993 - 2018) hodnoty rovne ako zadany rok
     * @return zoradeny list casti bratislavy podla priemerneho prirastku, od casti ktora ma najvacsi rocny prirastok po cast ktora ma najmensi prirastok
     * @throws SQLException e
     */
    List<String[]> getPrirastokByRokSorted(int rok) throws SQLException;
}
