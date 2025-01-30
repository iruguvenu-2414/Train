// Source code is decompiled from a .class file using FernFlower decompiler.
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Train {
   String name;
   String route;
   boolean[] seats;
   List<String> waitingList;

   public Train(String var1, String var2) {
      this.name = var1;
      this.route = var2;
      this.seats = new boolean[100];
      Arrays.fill(this.seats, true);
      this.waitingList = new ArrayList();
   }

   public void displayAvailableSeats() {
      System.out.println("\nAvailable seats in " + this.name + " (" + this.route + "):");
      ArrayList var1 = new ArrayList();

      int var2;
      for(var2 = 0; var2 < this.seats.length; ++var2) {
         if (this.seats[var2]) {
            var1.add(var2 + 1);
         }
      }

      if (var1.isEmpty()) {
         System.out.println("No available seats.");
      } else {
         for(var2 = 0; var2 < var1.size(); ++var2) {
            PrintStream var10000 = System.out;
            Object var10001 = var1.get(var2);
            var10000.print(String.valueOf(var10001) + "\t");
            if ((var2 + 1) % 10 == 0) {
               System.out.println();
            }
         }

         System.out.println();
      }
   }
}
