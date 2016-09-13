import org.junit.*;
import static org.junit.Assert.*;

public class CDTest {

  @Test
  public void CD_instantiatesCorrectly_true(){
    CD myCD = new CD("Album", "Band", "2000");
    assertEquals(true, myCD instanceof CD);
  }

  @Test
  public void CD_getsAlbum_Album(){
    CD myCD = new CD("Album", "Band", "2000");
    assertEquals("Album", myCD.getCDName());
  }

}
