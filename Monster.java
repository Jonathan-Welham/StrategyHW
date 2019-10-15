//Name: Jonathan Welham
//Date: 10-5-19
//Description: The monster class is an abstract no definition. It only holds parameters which are then defined in
//              the child classes.

package Monsters;

import Abilities.Attack;

import java.util.HashMap;
import java.util.Random;

public abstract class Monster {
    private Integer hp;
    private Integer xp;
    private Integer maxHP;
    Integer agi;
    Integer def;
    Integer str;
    Attack attack;
    private HashMap<String, Integer> items;

    public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items){
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }

    //TODO finish attackTarget
    public Integer attackTarget(Monster m){

    }

    public Integer getHp() {
        return hp;
    }
    public void setHp(Integer hp) {
        this.hp = hp;
    }
    public Integer getXp() {
        return xp;
    }
    public HashMap<String, Integer> getItems() {
        return items;
    }
    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }
    public Integer getMaxHP() {
        return maxHP;
    }
    public Integer getAgi() {
        return agi;
    }
    public Integer getDef() {
        return def;
    }
    public Integer getStr() {
        return str;
    }

    Integer getAttribute(Integer min, Integer max){
        Random rand = new Random();
        if(min > max){
            Integer temp = min;
            min = max;
            max = temp;
        }
        return rand.nextInt(max-min) + min;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Monster monster = (Monster) o;

        if (hp != null ? !hp.equals(monster.hp) : monster.hp != null) return false;
        if (xp != null ? !xp.equals(monster.xp) : monster.xp != null) return false;
        if (maxHP != null ? !maxHP.equals(monster.maxHP) : monster.maxHP != null) return false;
        return items != null ? items.equals(monster.items) : monster.items == null;
    }

    @Override
    public int hashCode() {
        int result = hp != null ? hp.hashCode() : 0;
        result = 31 * result + (xp != null ? xp.hashCode() : 0);
        result = 31 * result + (maxHP != null ? maxHP.hashCode() : 0);
        result = 31 * result + (items != null ? items.hashCode() : 0);
        return result;
    }

    public String toString(){
        return "hp=" + this.hp + "/" + this.maxHP;
    }
}
