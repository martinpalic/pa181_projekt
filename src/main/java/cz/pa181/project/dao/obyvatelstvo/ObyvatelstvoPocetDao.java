package cz.pa181.project.dao.obyvatelstvo;

import com.j256.ormlite.dao.Dao;
import cz.pa181.project.entity.obyvatelstvo.ObyvatelstvoPocet;

import java.sql.SQLException;
import java.util.List;

/**
 * Class represents:
 * @author xholecko
 */
public interface ObyvatelstvoPocetDao extends Dao<ObyvatelstvoPocet, Long> {

    /**
     *
     * @param rok rok (hodnoty od 1993 - 2019) hodnoty rovne ako zadany rok
     * @return zoradeny list casti bratislavy podla poctu obyvatelov od casti ktora ma najmenej obyvatelov po cast ktora ma najviac obyvatelov
     * @throws SQLException e
     */
    List<String[]> getPocetObyvatelovByRokSorted(int rok) throws SQLException;
}
