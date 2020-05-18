package ro.fasttrackit.curs24heroservice.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Hero {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private int skill;
    private int stamina;
    private int wins;

    public Hero() {
    }

    public Hero(String name, int skill, int stamina, int wins) {
        this.name = name;
        this.skill = skill;
        this.stamina = stamina;
        this.wins = wins;
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(final int skill) {
        this.skill = skill;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(final int stamina) {
        this.stamina = stamina;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(final int wins) {
        this.wins = wins;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Hero hero = (Hero) o;
        return skill == hero.skill &&
                stamina == hero.stamina &&
                wins == hero.wins &&
                Objects.equals(id, hero.id) &&
                Objects.equals(name, hero.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, skill, stamina, wins);
    }

    @Override
    public String toString() {
        return "Hero{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", skill=" + skill +
                ", stamina=" + stamina +
                ", wins=" + wins +
                '}';
    }
}
