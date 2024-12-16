package com.hel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.assertj.core.api.Assertions.*;
import java.time.LocalDate;

import org.junit.Test;

import com.erraoucha.Person;

public class PersonConstructerAndGetAndSetTest {

    @Test
    public void testConstructer(){
       Person  gis1 = new Person();
        gis1.setFirstname("yassine");
        gis1.setLastname("erraoucha");
        gis1.setBirthdate(LocalDate.of(2003,6,27));
        assertThat(gis1).isNotNull();

        assertThat(gis1.getFirstname()).isEqualTo("yassine");  
        assertThat(gis1.getLastname()).isEqualTo("erraoucha");
        assertThat(gis1.getBirthdate()).isEqualTo(LocalDate.of(2003, 6, 27));
        



      // assertNotNull(gis1);
      // assertEquals("yassine",gis1.getFirstname());
      // assertEquals("erraoucha",gis1.getLastname());
      // assertEquals(LocalDate.now().getYear()-2003, gis1.calculateAge());
    }
 

    
}
