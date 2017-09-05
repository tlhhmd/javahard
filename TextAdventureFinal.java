import java.util.Scanner;
import static java.lang.System.*;

class Room {
  int roomNumber, numExits;
  String roomName, description;

  int[] destinations = new int[10];
  String[] exits = new String[10];
}

public class TextAdventureFinal {
  public static void main (String[] args) {
    Scanner keyboard = new Scanner(System.in);

    // initialize rooms from file
    Room[] rooms = loadRoomsFromFile("text-adventure-rooms.txt");

    // showAllRooms(rooms); // for debugging

    // Okay, so let's play
    int currentRoom = 0;
    String ans;

    while(currentRoom >= 0) {
      Room cur = rooms[currentRoom];
      out.print(cur.description + "> ");
      ans = keyboard.nextLine();

      // See if what they type matches any of our exit names
      boolean found = false;

      for (int i = 0; i < cur.numExits; i++)
        if (cur.exits[i].equals(ans)) {
          found = true;
          // if so, change our next room to that exit's room #
          currentRoom = cur.destinations[i];
        }

        if (!found)
          out.println("Sorry, I don't understand.");
    }
  }

  public static Room[] loadRoomsFromFile(String filename) {
    Scanner file = null;

    try{
      // file = new Scanner(new java.io.File(filename));
      file = new Scanner((new java.net.URL("http://learnjavathehardway.org/txt/" + filename)).openStream());
    }

    catch(java.io.IOException e) {
      err.println("Sorry, I can't read from the file '" + filename + "'.");
      exit(1);
    }

    int numRooms = file.nextInt();
    Room[] rooms = new Room[numRooms];

    // initialize rooms from file
    int roomNum = 0;

    while (file.hasNext()) {

      Room r = getRoom(file);

      if (r.roomNumber != roomNum) {
        err.println("Reading room # " + r.roomNumber + ", but " + roomNum + " was expected.");
        System.exit(2);
      }

      rooms[roomNum] = r;
      roomNum++;
    }

    file.close();

    return rooms;
  }

  public static void showAllRooms(Room[] rooms) {
    for (Room r: rooms) {
      String exitString = "";
      for (int i = 0; i < r.numExits; i++)
        exitString += "\t" + r.exits[i] + " (" + r.destinations[i] + ")";

      out.println(r.roomNumber + ") " + r.roomName + "\n" + exitString);
    }
  }

  public static Room getRoom(Scanner f) {
    // any rooms left in the file?
    if (!f.hasNextInt())
      return null;

    Room r = new Room();
    String line;

    // read in the room # for error-checking later
    r.roomNumber = f.nextInt();
    f.nextLine(); // skip "\n" after room #

    r.roomName = f.nextLine();

    r.description = "";
    while (true) {
      line = f.nextLine();
      if (line.equals("%%"))
        break;
      r.description += line + "\n";
    }

    int i = 0;

    while(true) {
      line = f.nextLine();
      if (line.equals("%%"))
        break;
      String[] parts = line.split(":");
      r.exits[i] = parts[0];
      r.destinations[i] = Integer.parseInt(parts[1]);
      i++;
    }

    r.numExits = i;

    return r;
  }
}
