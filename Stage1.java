
public class Stage1 {

    public static Room initialize() {
        Room livingRoom = new Room("Living Room", "a house's typical living room, it has a couch and a TV");
        Room kitchen = new Room("Kitchen", "an ordinary kitchen, the tap is leaking");
        Room upstairs = new Room("Second Floor", "a small hallway with a few doors");
        Room bathroom = new Room("Bathroom", "a bathroom with a toilet and a sink");
        Room bedroom = new Room("Bedroom", "a bedroom with a bed");
        Room library = new Room("Library",
                "2 shelves contaning dozens of books and a very confy looking chair with a lamp on it's side");

        livingRoom.addExit("left", kitchen);
        kitchen.addExit("right", livingRoom);

        livingRoom.addExit("right", bathroom);
        bathroom.addExit("left", livingRoom);

        livingRoom.addExit("up", upstairs);
        upstairs.addExit("down", livingRoom);

        upstairs.addExit("left", bedroom);
        bedroom.addExit("right", upstairs);

        upstairs.addExit("right", library);
        library.addExit("left", upstairs);

        return livingRoom;

    }

}
