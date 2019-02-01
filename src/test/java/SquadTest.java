import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest {

  @After
  public void autoClear() {
    Squad.clear();
  }

    @Test
    public void squad_instantiatesCorrectly_true() {
      Squad testSquad = new Squad("Strongest", 5, "Girl trafficking");
      assertEquals(true, testSquad instanceof Squad);
   }

    @Test
    public void getName_squadInstantiatesWithName_Strongest() {
      Squad testSquad = new Squad("Strongest", 5, "Girl trafficking");
      assertEquals("Strongest", testSquad.getName());
   }

    @Test
    public void all_returnsAllInstancesOfSquad_true() {
      Squad firstSquad = new Squad("Strongest", 5, "Girl trafficking");
      Squad secondSquad = new Squad("Modern", 6, "Computer illiteracy");
      assertEquals(true, Squad.all().contains(firstSquad));
      assertEquals(true, Squad.all().contains(secondSquad));
   }

   // @Test
   // public void clear_emptiesAllSquadFromList_0() {
   //   Squad testSquad = new Squad("Strongest", 5, "Girl trafficking");
   //   assertEquals(0, Squad.all().size());
   // }

   @Test
   public void getId_squadInstantiatesWithId_1() {
     Squad testSquad = new Squad("Strongest", 5, "Girl trafficking");
     assertEquals(1, testSquad.getId());
  }

   @Test
   public void find_returnsSquadWihSameId_secondSquad() {
     Squad firstSquad = new Squad("Strongest", 5, "Girl trafficking");
     Squad secondSquad = new Squad("Modern", 6, "Computer illiteracy");
     assertEquals(secondSquad, Squad.find(secondSquad.getId()));
   }

   @Test
   public void getHeroes_returnsEmptyList_ArrayList() {
     Squad testSquad = new Squad("Strongest", 5, "Girl trafficking");
     assertEquals(0, testSquad.getHeroes().size());
   }

   @Test
   public void addHero_addsHeroToList_true() {
     Squad testSquad = new Squad("Strongest", 5, "Girl trafficking");
     Hero newHero = new Hero("Spider Man", 30, "Flying Around", "Beautiful Girl");
     testSquad.addHero(newHero);
     assertTrue(testSquad.getHeroes().contains(newHero));
   }

   // @Test
   // public void find_returnsNullWhenNoHeroFound_null() {
   //   assertTrue(Squad.find() == null);
   // }
}
