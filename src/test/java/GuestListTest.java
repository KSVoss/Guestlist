
import model.GuestList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GuestListTest {
    @Test
    void shouldBeEmptyInitially(){
        // given
        GuestList guestList = new GuestList();
        guestList.setGuests(  );
        List<String> allGuests= guestList.getGuests();
        boolean actual=allGuests.isEmpty();
        Assertions.assertEquals(true,actual);

    }
    @Test
    void shouldReadSameGuestAsWrittenBefore() throws IOException {
        GuestList guestList=new GuestList();
        List<String> test=new ArrayList<>();
        test.add("Karl");
        test.add("Ute");
        guestList.setGuests(test);
        // Alternative guestList.setGuest(List.of("Karl","Ute");
        // when
        List<String> actual=guestList.getGuests();
        //then
        Assertions.assertEquals(test,actual);
    }
    @Test
    void shouldReadSameGuestAsWrittenBefore2(){
        GuestList guestList=new GuestList();
        List<String> test=new ArrayList<>();
        test.add("Karl");
        test.add("Ute");
        guestList.setGuests("Karl" );
        guestList.setGuests("Ute");


        // when
        List<String> actual=guestList.getGuests();
        //then
        Assertions.assertEquals(test,actual);
    }
    @Test
    void shouldWriteToFileSystem() throws IOException {
        // given
        GuestList guestList = new GuestList();
        guestList.setGuests(List.of("Theodor","Anette"));
        try {
        List<String> actual = Files.readAllLines(Path.of("guest.txt"));
         // when


         }catch (IOException e){
            e.printStackTrace();
            Assertions.fail();
            // Alternativ throw new AssertionFailedError("Cannot find file",e);
        }
        // then
        //Assertions.assertEquals(List.of("Theodor","Anette"),actual);
    Assertions.assertEquals(true,true);
    }
    @Test
    void shouldWriteToFileSystem2() throws IOException {
        // given
        GuestList guestList = new GuestList();
        guestList.setGuests(List.of("Theodor","Anette"));
        // when
        List<String> actual = Files.readAllLines(Path.of("guest.txt"));


         // then
        Assertions.assertEquals(List.of("Theodor","Anette"),actual);
    }

}
