import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {

  @After
  public void autoClear() {
    Hero.clear();
  }

  @Test
  public void Hero_instantiatesCorrectly_true() {
    Hero newHero = new Hero("Spider Man", 30, "Flying Around", "Beautiful Girl");
    assertEquals(true, newHero instanceof Hero);
  }
  @Test
  public void all_returnsAllInstancesOfHero_true() {
    Hero firstHero = new Hero("Spider Man", 30, "Flying Around", "Beautiful Girl");
    Hero secondHero = new Hero("Black Panther", 35, "Technology", "Fighting");
    assertEquals(true, Hero.all().contains(firstHero));
    assertEquals(true, Hero.all().contains(secondHero));
  }

  // @Test
  // public void clear_emptiesAllHeroesFromList_0() {
  //   Hero newHero = new Hero("Spider Man", 30, "Flying Around", "Beautiful Girl");
  //   assertEquals(0, Hero.all().size());
  // }

  @Test
  public void getId_heroInstantiatesWithId_1() {
    Hero newHero = new Hero("Spider Man", 30, "Flying Around", "Beautiful Girl");
    assertEquals(1, newHero.getId());
  }

  @Test
  public void find_returnsHeroWithSameId_secondHero() {
  Hero firstHero = new Hero("Spider Man", 30, "Flying Around", "Beautiful Girl");
  Hero secondHero = new Hero("Black Panther", 35, "Technology", "Fighting");
  assertEquals(secondHero, Hero.find(secondHero.getId()));
  }
}
