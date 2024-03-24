package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.engine.support.hierarchical.SingleTestExecutor;

public class RadioTest {
    Radio stat = new Radio();
    Radio vol = new Radio();

    @Test
    public void shouldSetStation() {

        stat.setCurrentStation(5);
        int expected = 5;
        int actual = stat.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {

        vol.setCurrentVolume(25);
        int expected = 25;
        int actual = vol.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAboveMax() {

        stat.setCurrentStation(10);
        int expected = 0;
        int actual = stat.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBelowMin() {

        stat.setCurrentStation(-1);
        int expected = 0;
        int actual = stat.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeAboveMax() {

        vol.setCurrentVolume(101);
        int expected = 0;
        int actual = vol.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeBelowMin() {

        vol.setCurrentVolume(-1);
        int expected = 0;
        int actual = vol.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNext() {

        stat.setCurrentStation(8);
        stat.setNextStation();
        int expected = 9;
        int actual = stat.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationPrev() {

        stat.setCurrentStation(9);
        stat.setPrevStation();
        int expected = 8;
        int actual = stat.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNext9() {

        stat.setCurrentStation(9);
        stat.setNextStation();
        int expected = 0;
        int actual = stat.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationPrev0() {

        stat.setCurrentStation(0);
        stat.setPrevStation();
        int expected = 9;
        int actual = stat.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeIncrease() {

        vol.setCurrentVolume(99);
        vol.setIncreaseVolume();
        int expected = 100;
        int actual = vol.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeDecrease() {

        vol.setCurrentVolume(100);
        vol.setDecreaseVolume();
        int expected = 99;
        int actual = vol.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeIncrease100() {

        vol.setCurrentVolume(100);
        vol.setIncreaseVolume();
        int expected = 100;
        int actual = vol.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeDecrease0() {

        vol.setCurrentVolume(0);
        vol.setDecreaseVolume();
        int expected = 0;
        int actual = vol.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
