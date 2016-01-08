/**
 * Write a description of class Room here.
 * 
 * @author John Chen 
 * @version (a version number or a date)
 */
public class Room
{
    public static String pathTaken = "";
    private static int x = 1;
    private static int y = 2;
    public static String name;
    public static String description;
    public static Item Item[] = new Item[20];
    public static Character character[] = new Character[20];
    public static Room room[][] = new Room[5][5];
    public Room(Item[] s, Character[] p, String name, String description){
        this.name = name;
        this.description = description;
    }

    public static Room currentRoomIn(int y, int x){
        return null;
    }

    public static Room goNorth(){
        whereCanGo(y, x, "north");
        return currentRoomIn(y,x);
    }

    public static String goSouth(){
        whereCanGo(y, x, "south");
        return description;
    }

    public static Room goEast(){
        whereCanGo(y, x, "east");
        return currentRoomIn(y,x);
    }

    public static Room goWest(){
        whereCanGo(y, x, "west");
        return currentRoomIn(y,x);
    }

    public static void pathTraveled(){
        System.out.println(pathTaken.substring(0,pathTaken.length()-3));
    }

    public String getDescription(){
        return currentRoomIn(y,x).description;
    }
    
    public static void whereCanGo(int a, int b, String direction){
        String RoomNumber = "" + a;
        RoomNumber += b;
        switch(RoomNumber){
            case "00":
            if(direction.equals("north")){ System.out.println("You cannot go in that direction."); }
            else if(direction.equals("south")){ System.out.println("You cannot go in that direction."); }
            else if(direction.equals("east")){ System.out.println("Burley aggresive aliens are located here. wits and common sense will be your greatest."); x+=1;}
            else{ System.out.println("You cannot go in that direction."); }
            break;
            case "01":
            if(direction.equals("north")){ System.out.println("You cannot go in that direction."); }
            else if(direction.equals("south")){ System.out.println("You cannot go in that direction."); }
            else if(direction.equals("east")){ System.out.println("Rubble from the wall you blew up."); x+=1;}
            else{ System.out.println("Here lies the ultimate boss and the most important part of the time machine."); x-=1;}
            break;
            case "02":
            if(direction.equals("north")){ System.out.println("You cannot go in that direction."); }
            else if(direction.equals("south")){ System.out.println("You cannot go in that direction."); }
            else if(direction.equals("east")){ System.out.println("Big and mean, these aliens located here aren't friendly."); x+=1;}
            else{ System.out.println("Burley aggresive aliens are located here. wits and common sense will be your greatest."); x-=1;}
            break;
            case "03":
            if(direction.equals("north")){ System.out.println("You cannot go in that direction."); }
            else if(direction.equals("south")){ System.out.println("Tar pits"); y+=1;}
            else if(direction.equals("east")){ System.out.println("A sparse forest."); x+=1;}
            else{ System.out.println("A wall stands in you're way. What are you going to do about it?"); x-=1;}
            break;
            case "04":            
            if(direction.equals("north")){ System.out.println("You cannot go in that direction."); }
            else if(direction.equals("south")){ System.out.println("A dense jungle with danger lurking in every shadow."); y+=1;}
            else if(direction.equals("east")){ System.out.println("You cannot go in that direction."); }
            else{ System.out.println("Forest"); x-=1;}
            break;
            case "10":
            if(direction.equals("north")){ System.out.println("You cannot go in that direction."); }
            else if(direction.equals("south")){ System.out.println("Walking down the clostaphobic halls of the cave, light can be seen not to far ahead. You walk into a cavern, your breathing being the only thing making noise. In the middle of the room, a pond of crystal clear water shimmers from the light above from outside. You noticesomething something oddly refelective at the bottom... \n there is a path to the north and the south"); y+=1;}
            else if(direction.equals("east")){ System.out.println("You cannot go in that direction."); }
            else{ System.out.println("You cannot go in that direction."); }
            break;
            case "11":
            if(direction.equals("north")){ System.out.println("Big and mean, these aliens located here aren't friendly."); y-=1;}
            else if(direction.equals("south")){ System.out.println("More jungle, more unknown."); y+=1;}
            else if(direction.equals("east")){ System.out.println("You cannot go in that direction."); }
            else{ System.out.println("You cannot go in that direction."); }
            break;
            case "12":
            if(direction.equals("north")){ System.out.println("You cannot go in that direction."); }
            else if(direction.equals("south")){ System.out.println("You cannot go in that direction."); }
            else if(direction.equals("east")){ System.out.println("You cannot go in that direction."); ;}
            else{ System.out.println("You cannot go in that direction."); }
            break;
            case "13":
            if(direction.equals("north")){ System.out.println("Big and mean, these aliens located here aren't friendly."); y-=1;}
            else if(direction.equals("south")){ System.out.println("More jungle, more unknown."); y+=1;}
            else if(direction.equals("east")){ System.out.println("You cannot go in that direction."); }
            else{ System.out.println("You cannot go in that direction."); }
            break;
            case "14":
            if(direction.equals("north")){ System.out.println("A sparse forest."); y-=1;}
            else if(direction.equals("south")){ System.out.println("This is quite and explosive part of the jungle."); y+=1;}
            else if(direction.equals("east")){ System.out.println("You cannot go in that direction."); }
            else{ System.out.println("You cannot go in that direction."); }
            break;
            case "20":
            if(direction.equals("north")){ System.out.println("Light slowly fades and fades until you can barely see you're own hands infront of your face. Torches suddenly light and you are in a tight fitting room within the caves. There is a door infront of you, but first you need all of your time machine parts!"); y-=1;}
            else if(direction.equals("south")){ System.out.println("A dark cave. Who knows who/what lurks here?"); y+=1;}
            else if(direction.equals("east")){ System.out.println("This spot is where you crashed your time machine into pieces. Thinking of your present life gives you determination to find all the missing parts."); x+=1;}
            else{ System.out.println("You cannot go in that direction."); }
            break;
            case "21":
            if(direction.equals("north")){ System.out.println("You cannot go in that direction."); }
            else if(direction.equals("south")){ System.out.println("You cannot go in that direction."); }
            else if(direction.equals("east")){ System.out.println("You take your first step into the unknown wilderness."); x+=1;}
            else{ System.out.println("Walking down the clostaphobic halls of the cave, light can be seen not to far ahead. You walk into a cavern, your breathing being the only thing making noise. In the middle of the room, a pond of crystal clear water shimmers from the light above from outside. You notice something something oddly refelective at the bottom... \n there is a path to the north and the south"); x-=1;}
            break;
            case "22":
            if(direction.equals("north")){ System.out.println("You cannot go in that direction."); }
            else if(direction.equals("south")){ System.out.println("Jungle. Nothing but jungle, right?"); y+=1;}
            else if(direction.equals("east")){ System.out.println("More jungle, more unknown."); x+=1;}
            else{ System.out.println("This spot is where you crashed your time machine into pieces. Thinking of your present life gives you determination to find all the missing parts."); x-=1;}
            break;
            case "23":
            if(direction.equals("north")){ System.out.println("You come across a small canyon filled up about half way with bubbly, steamy tar. The large gap is to large to jump across."); y-=1;}
            else if(direction.equals("south")){ System.out.println("A passable mountain. But don't be so sure that you'll make it out alive."); y+=1;}
            else if(direction.equals("east")){ System.out.println("This is quite and explosive part of the jungle."); x+=1;}
            else{ System.out.println("You take your first step into the unknown wilderness."); x-=1;}
            break;
            case "24":
            if(direction.equals("north")){ System.out.println("A dense jungle with danger lurking in every shadow."); y-=1;}
            else if(direction.equals("south")){ System.out.println("I'm afraid that that is a one way corridor."); y+=1;}
            else if(direction.equals("east")){ System.out.println("You cannot go in that direction."); }
            else{ System.out.println("More jungle, more unknown."); x-=1;}
            break;
            case "30":
            if(direction.equals("north")){ System.out.println("Walking down the clostaphobic halls of the cave, light can be seen not to far ahead. You walk into a cavern, your breathing being the only thing making noise. In the middle of the room, a pond of crystal clear water shimmers from the light above from outside. You noticesomething something oddly refelective at the bottom... \n there is a path to the north and the south"); y-=1;}
            else if(direction.equals("south")){ System.out.println("You cannot go in that direction."); }
            else if(direction.equals("east")){ System.out.println("A big cavern."); x+=1;}
            else{ System.out.println("You cannot go in that direction."); }
            break;
            case "31":
            if(direction.equals("north")){ System.out.println("You cannot go in that direction."); }
            else if(direction.equals("south")){ System.out.println("A big pool of water."); y+=1;}
            else if(direction.equals("east")){ System.out.println("You cannot go in that direction."); }
            else{ System.out.println("A dark cave. Who knows who/what lurks here?"); x-=1;}
            break;
            case "32":
            if(direction.equals("north")){ System.out.println("You take your first step into the unknown wilderness."); y-=1;}
            else if(direction.equals("south")){ System.out.println("You cannot go in that direction."); }
            else if(direction.equals("east")){ System.out.println("A passable mountain. But don't be so sure that you'll make it out alive."); x+=1;}
            else{ System.out.println("You cannot go in that direction."); }
            break;
            case "33":
            if(direction.equals("north")){ System.out.println("More jungle, more unknown.");y-=1;}
            else if(direction.equals("south")){ System.out.println("A dense jungle. Did I mention that it was dark?"); y+=1;}
            else if(direction.equals("east")){ System.out.println("You cannot go in that direction."); }
            else{ System.out.println("Jungle. Nothing but jungle, right?"); x-=1;}
            break;
            case "34":
            if(direction.equals("north")){ System.out.println("This is quite and explosive part of the jungle."); y-=1;}
            else if(direction.equals("south")){ System.out.println("E.T. is meditating in the middle of a clearing. He looks at you as if he was expecting you to walk through the forest"); y+=1;}
            else if(direction.equals("east")){ System.out.println("You cannot go in that direction."); }
            else{ System.out.println("You cannot go in that direction."); }
            break;
            case "40":
            if(direction.equals("north")){ System.out.println("You cannot go in that direction."); }
            else if(direction.equals("south")){ System.out.println("You cannot go in that direction."); }
            else if(direction.equals("east")){ System.out.println("A big pool of water."); x+=1;}
            else{ System.out.println("You cannot go in that direction."); }
            break;
            case "41":
            if(direction.equals("north")){ System.out.println("A big cavern."); y-=1;}
            else if(direction.equals("south")){ System.out.println("You cannot go in that direction."); }
            else if(direction.equals("east")){ System.out.println("More boring cave."); x+=1;}
            else{ System.out.println("Another room to the cave. Who would have thought?"); x-=1;}
            break;
            case "42":
            if(direction.equals("north")){ System.out.println("You cannot go in that direction."); }
            else if(direction.equals("south")){ System.out.println("You cannot go in that direction."); }
            else if(direction.equals("east")){ System.out.println("A dense jungle. Did I mention that it was dark?"); x+=1;}
            else{ System.out.println("A big pool of water."); x-=1;}
            break;
            case "43":
            if(direction.equals("north")){ System.out.println("A passable mountain. But don't be so sure that you'll make it out alive."); y-=1;}
            else if(direction.equals("south")){ System.out.println("You cannot go in that direction."); }
            else if(direction.equals("east")){ System.out.println("E.T. is meditating in the middle of a clearing. He looks at you as if he was expecting you to walk through the forest."); x+=1;}
            else{ System.out.println("More boring cave."); x-=1;}
            break;
            case "44":
            if(direction.equals("north")){ System.out.println("A one way coridor."); y-=1;}
            else if(direction.equals("south")){ System.out.println("You cannot go in that direction."); }
            else if(direction.equals("east")){ System.out.println("You cannot go in that direction."); }
            else{ System.out.println("A dense jungle. Did I mention that it was dark?"); x-=1;}
            break;
        }
        System.out.println("\n");
    }

    public static void createRooms(){
        Room o00 = new Room(Item, character, "o00", "Here lies the ultimate boss and the most important part of the time machine.");
        Room o01 = new Room(Item, character, "o01", "Burley aggresive aliens are located here. Wits and common sense will be your greatest.");
        Room o02 = new Room(Item, character, "o02", "A wall stands in you're way. What are you going to do about it?");
        Room o03 = new Room(Item, character, "o03", "Big and mean, these aliens located here aren't friendly.");
        Room o04 = new Room(Item, character, "o04", "A sparse forest.");
        Room o10 = new Room(Item, character, "o10", "As you head north, the walls of the cave gradually get narrower. Soon, there isn’t enough space so you have to walk sideways. There isn’t much air down in the caves, so it is becoming harder to breath. Just as you’re about to pass out, you enter a big cavern.");
        Room o11 = new Room(Item, character, "o11", "An indestructable cave wall");
        Room o12 = new Room(Item, character, "o12", "You walk to the steep mountain face and stare up. You know you will survive the climb, but just barely.");
        Room o13 = new Room(Item, character, "o13", "You come across a small canyon filled up about half way with bubbly, steamy tar. The large gap is too large to jump across.");
        Room o14 = new Room(Item, character, "o14", "A dense jungle with danger lurking in every shadow.");
        Room o20 = new Room(Item, character, "o20", "As you descend deeper into the cave, it becomes harder to see. Suddenly, a bright light appeared out of nowhere. Standing in front of you is a cute little green alien. The green alien starts to raise its hand.");
        Room o21 = new Room(Item, character, "o21", "This spot is where you crashed your time machine into pieces. Thinking of you present life gives you determination to find all the missing parts.");
        Room o22 = new Room(Item, character, "o22", "You take your first step into the unknown wilderness.");
        Room o23 = new Room(Item, character, "o23", "More jungle, more unknown.");
        Room o24 = new Room(Item, character, "o24", "This is quite and explosive part of the jungle.");
        Room o30 = new Room(Item, character, "o30", "A dark cave. Who knows who/what lurks here?");
        Room o31 = new Room(Item, character, "o31", "A big cavern.");
        Room o32 = new Room(Item, character, "o32", "Jungle. Nothing but jungle, right?");
        Room o33 = new Room(Item, character, "o33", "A passable mountain. But don't be so sure that you'll make it out alive.");
        Room o34 = new Room(Item, character, "o34", "A one way coridor.");
        Room o40 = new Room(Item, character, "o40", "Another room to the cave. Who would have thought?");
        Room o41 = new Room(Item, character, "o41", "A big pool of water.");
        Room o42 = new Room(Item, character, "o42", "More boring cave.");
        Room o43 = new Room(Item, character, "o43", "A dense jungle. Did I mention that it was dark?");
        Room o44 = new Room(Item, character, "o44", "E.T. is meditating in the middle of a clearing. He looks at you as if he was expecting you to walk through the forest");
        room[0][0] = o00;
        room[0][1] = o01;
        room[0][2] = o02;
        room[0][3] = o03;
        room[0][4] = o04;
        room[1][0] = o10;
        room[1][1] = o11;
        room[1][2] = o12;
        room[1][3] = o13;
        room[1][4] = o14;
        room[2][0] = o20;
        room[2][1] = o21;
        room[2][2] = o22;
        room[2][3] = o23;
        room[2][4] = o24;
        room[3][0] = o30;
        room[3][1] = o31;
        room[3][2] = o32;
        room[3][3] = o33;
        room[3][4] = o34;
        room[4][0] = o40;
        room[4][1] = o41;
        room[4][2] = o42;
        room[4][3] = o43;
        room[4][4] = o44;
    }
}
