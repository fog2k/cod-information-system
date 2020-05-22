
abstract class Entity
{
  private int id;

  Entity(int id)
  {
    this.id = id;
  }

  public int getId()
  {
      return id;
  }

  @Override
  public int hashCode()
  {
    return id;
  }

  public Boolean equals(Entity other)
  {
    return id==other.id;
  }
}