
public class Player
{
    private int xp = 0;
    private String name;
    private int attack = 5;

    /**
     * Attack a monster.
     */
    public void attackMonster( Monster m )
    {
        boolean isDead = m.receiveDamage( attack );
        if( isDead )
            xp += m.getXPValue();
    }
}
