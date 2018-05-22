public class Monster
{
    private String name;
    private int xpValue;
    private int hitPoints;

    public Monster( String name )
    {
        this.name = name;
        this.hitPoints = 30;
    }

    public boolean receiveDamage( int damage )
    {
        this.hitPoints -= damage;
        if( this.hitPoints <= 0 )
            return true;
        return false;
    }

    public int getXPValue()
    {
        return 100;
    }
}
