public class Guy extends Adventurer{

  private int special = 0;
  public Guy (String x)
  {
    super(x);
  }
  public Guy (String x,int y)
  {
    super(x, y);
  }
  public String getSpecialName()
  {
    return "taxes";
  }
  public int getSpecial()
  {
    return special;
  }
  public void setSpecial(int n)
  {
    special = n;
  }
  public int getSpecialMax()
  {
    return 100;
  }
  //hurt or hinder the target adventurer
  public  String attack(Adventurer other)
  {
    other.applyDamage(1);
    System.out.println("It did 1 dmg");
    return other.getName();
  }

  //heall or buff the target adventurer
  public String support(Adventurer other)
  {
    other.setHP(other.getHP() + 1);
    System.out.println("It gave 1 dmg");
    return other.getName();
  }

  //heall or buff self
  public String support()
  {
    super.setHP(super.getHP() + 1);
    System.out.println("It did nothing!");
    return super.getName();
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other)
  {
    special--;
    attack(other);
    return super.getName();
  }
}
