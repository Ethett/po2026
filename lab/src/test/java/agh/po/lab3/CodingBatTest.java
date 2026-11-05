package agh.po.lab3;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CodingBatTest {
    CodingBat bat = new CodingBat();

    @org.junit.Test
    public void nearHundred() {
        assertTrue(bat.nearHundred(93));
        assertTrue(bat.nearHundred(90));
        assertTrue(bat.nearHundred(195));

        assertFalse(bat.nearHundred(89));
        assertFalse(bat.nearHundred(111));
    }

    @org.junit.Test
    public void startOz() {
        assertEquals("oz", bat.startOz("ozymandias"));
        assertEquals("z", bat.startOz("bzoo"));
        assertEquals("o", bat.startOz("oxx"));
        assertEquals("", bat.startOz("kite"));
    }
    @org.junit.Test
    public void countEvens() {
        assertEquals(3, bat.countEvens(new int[]{2, 1, 2, 3, 4}));
        assertEquals(3, bat.countEvens(new int[]{2, 2, 0}));
        assertEquals(0, bat.countEvens(new int[]{1, 3 ,5}));
    }

    @org.junit.Test
    public void helloName() {
        assertEquals("Hello Janusz!", bat.helloName("Janusz"));
        assertEquals("Hello Andrzej!", bat.helloName("Andrzej"));
        assertEquals("Hello Marcin!", bat.helloName("Marcin"));

    }
    @org.junit.Test
    public void mapAB2() {
        assertEquals(
                Map.of("c", "cake"),
                bat.mapAB2(new HashMap<>(Map.of("a", "aaa", "b", "aaa", "c", "cake")))
        );
        assertEquals(
                Map.of("a", "aaa", "b", "bbb"),
                bat.mapAB2(new HashMap<>(Map.of("a", "aaa", "b", "bbb")))
        );
        assertEquals(
                Map.of("a", "aaa", "b", "bbb", "c", "aaa"),
                bat.mapAB2(new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "aaa")))
        );
    }

    @org.junit.Test
    public void wordCount() {
        assertEquals(
                Map.of("a", 2, "b", 2, "c", 1),
                bat.wordCount(new String[]{"a", "b", "a", "c", "b"})
        );

        assertEquals(
                Map.of("a", 1, "b", 1, "c", 1),
                bat.wordCount(new String[]{"c", "b", "a"})
        );

        assertEquals(
                Map.of("c", 4),
                bat.wordCount(new String[]{"c", "c", "c", "c"})
        );
    }

}

