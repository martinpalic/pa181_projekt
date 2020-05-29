package entity.vzdelanie;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import dao.spravodlivost.SpravodlivostTrestneCinyPodVplyvomDaoImpl;
import dao.vzdelanie.VzdelanieInternatyVSDaoImpl;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

/**
 * Class represents: POČET VYSOKOŠKOLSKÝCH INTERNÁTOV A POČET LÔŽOK
 * https://opendata.bratislava.sk/dataset/show/pocet-vysokoskolskych-internatov-a-pocet-lozok
 * @author xholecko
 */
@Getter
@Setter
@DatabaseTable(tableName = "vzdelanie_internaty_VS", daoClass = VzdelanieInternatyVSDaoImpl.class)
public class VzdelanieInternatyVS {

    @DatabaseField(generatedId = true)
    private long id;

    @DatabaseField(canBeNull = false)
    private String okres;

    @DatabaseField(canBeNull = false)
    private String mestskaCast;

    @DatabaseField(canBeNull = false)
    private String rok;

    @DatabaseField(canBeNull = false)
    private String pocetInternatov;

    @DatabaseField(canBeNull = false)
    private String pocetLozok;

    public VzdelanieInternatyVS(String okres, String mestskaCast, String rok, String pocetInternatov, String pocetLozok) {
        this.okres = okres;
        this.mestskaCast = mestskaCast;
        this.rok = rok;
        this.pocetInternatov = pocetInternatov;
        this.pocetLozok = pocetLozok;
    }

    public VzdelanieInternatyVS() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VzdelanieInternatyVS that = (VzdelanieInternatyVS) o;
        return getOkres().equals(that.getOkres()) &&
                getMestskaCast().equals(that.getMestskaCast()) &&
                getRok().equals(that.getRok()) &&
                getPocetInternatov().equals(that.getPocetInternatov()) &&
                getPocetLozok().equals(that.getPocetLozok());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOkres(), getMestskaCast(), getRok(), getPocetInternatov(), getPocetLozok());
    }

    @Override
    public String toString() {
        return "VzdelanieInternatyVS{" +
                "id=" + id +
                ", okres='" + okres + '\'' +
                ", mestskaCast='" + mestskaCast + '\'' +
                ", rok='" + rok + '\'' +
                ", pocetInternatov='" + pocetInternatov + '\'' +
                ", pocetLozok='" + pocetLozok + '\'' +
                '}';
    }
}
