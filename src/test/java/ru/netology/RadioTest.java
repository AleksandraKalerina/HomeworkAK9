package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.engine.support.hierarchical.SingleTestExecutor;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio stat = new Radio();
        stat.setCurrentStation(5);
        int expected = 5;
        int actual = stat.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio vol = new Radio();
        vol.setCurrentVolume(25);
        int expected = 25;
        int actual = vol.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAboveMax() {
        Radio stat = new Radio();
        stat.setCurrentStation(10);
        int expected = 0;
        int actual = stat.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBelowMin() {
        Radio stat = new Radio();
        stat.setCurrentStation(-1);
        int expected = 0;
        int actual = stat.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeAboveMax() {
        Radio vol = new Radio();
        vol.setCurrentVolume(101);
        int expected = 0;
        int actual = vol.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeBelowMin() {
        Radio vol = new Radio();
        vol.setCurrentVolume(-1);
        int expected = 0;
        int actual = vol.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNext() {
        Radio stat = new Radio();
        stat.setCurrentStation(8);
        stat.setNextStation();
        int expected = 9;
        int actual = stat.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationPrev() {
        Radio stat = new Radio();
        stat.setCurrentStation(9);
        stat.setPrevStation();
        int expected = 8;
        int actual = stat.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNext9() {
        Radio stat = new Radio();
        stat.setCurrentStation(9);
        stat.setNextStation();
        int expected = 0;
        int actual = stat.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationPrev0() {
        Radio stat = new Radio();
        stat.setCurrentStation(0);
        stat.setPrevStation();
        int expected = 9;
        int actual = stat.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeIncrease() {
        Radio vol = new Radio();
        vol.setCurrentVolume(99);
        vol.setIncreaseVolume();
        int expected = 100;
        int actual = vol.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeDecrease() {
        Radio vol = new Radio();
        vol.setCurrentVolume(100);
        vol.setDecreaseVolume();
        int expected = 99;
        int actual = vol.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeIncrease100() {
        Radio vol = new Radio();
        vol.setCurrentVolume(100);
        vol.setIncreaseVolume();
        int expected = 100;
        int actual = vol.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeDecrease0() {
        Radio vol = new Radio();
        vol.setCurrentVolume(0);
        vol.setDecreaseVolume();
        int expected = 0;
        int actual = vol.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
