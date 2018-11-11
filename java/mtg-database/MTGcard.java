import java.util.Scanner;

public class MTGcard
{
   private String name;
   private int attack;
   private int defense;
   private String set;
   
   public MTGcard(final String name, final int attack, final int defense, final String set)
   {
      this.name = name;
      this.attack = attack;
      this.defense = defense;
      this.set = set;
   }
   
   @Override
   public String toString()
   {
      String output = this.name + " - " + this.attack + "/" + this.defense + "      " + this.set;
      
      return output;
   }
}