package model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.nio.file.*;

public class GuestList {
    public static final Path PATH =Path.of("guest.txt");
    //private List<String> guestList=new ArrayList<>();

    List<String> guestList = new ArrayList<>();
    private void writeToFileSystem()
    {

    }


    public void setGuests(){

    }

    public void setGuests (List<String>guestList) throws IOException {
        this.guestList=guestList;
        String text=String.join("\n",guestList);
        Files.writeString(Paths.get("guest.txt"),text);
    //    if(guestList=null){ guestList.add("");}
    //    Files.writeString(PATH,guestList.toString());
    };
    public void setGuests(String guest){
        guestList.add(guest);

    }

    public List<String> getGuests() {

        return  guestList;
    }

    public boolean doesFileExist() {
        return  true;
    }
}
