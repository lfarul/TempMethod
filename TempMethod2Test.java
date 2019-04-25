package tempmethod2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TempMethod2Test extends TempMethod2 {

@Test
public void shouldGetTemperatureDouble(){

TempMethod2 t = new TempMethod2();

t.Ctemp = t.Ktemp + 273.15;
  
  }
}
