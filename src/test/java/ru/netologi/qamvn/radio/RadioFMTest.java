package ru.netologi.qamvn.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioFMTest {
    @Test
    public void SetSizeNextMaxChannelTest() { //тест конструктора с параметром диапазона каналлов
        RadioFM rad = new RadioFM(20);

        rad.setChannelRadio(19);
        rad.nextChannelRadio();
        int expected = 0;
        int actual = rad.getChannelRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetSizePrevChannelTest() { //тест конструктора с параметром диапазона каналлов
        RadioFM rad = new RadioFM(20);

        rad.setChannelRadio(19);
        rad.prevChannelRadio();
        int expected = 18;
        int actual = rad.getChannelRadio();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void SetSizePrevMinChannelTest() { //тест конструктора с параметром диапазона каналлов
        RadioFM rad = new RadioFM(20);

        rad.setChannelRadio(0);
        rad.prevChannelRadio();
        int expected = 19;
        int actual = rad.getChannelRadio();
        Assertions.assertEquals(expected, actual);
    }

    /////////////////////////////
    @Test
    public void NextChannel() {
        RadioFM rad = new RadioFM();
        rad.setChannelRadio(1);
        rad.nextChannelRadio();
        int expected = 2;
        int actual = rad.getChannelRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NullNextChannel() {
        RadioFM rad = new RadioFM();
        rad.setChannelRadio(0);
        rad.nextChannelRadio();
        int expected = 1;
        int actual = rad.getChannelRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxNextChannel() {
        RadioFM rad = new RadioFM();
        rad.setChannelRadio(8);
        rad.nextChannelRadio();
        int expected = 9;
        int actual = rad.getChannelRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxMinNextChannel() {
        RadioFM rad = new RadioFM();
        rad.setChannelRadio(9);
        rad.nextChannelRadio();
        int expected = 0;
        int actual = rad.getChannelRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void OverMinNextChannel() {//тест только для покрытия всех веток set'а
        RadioFM rad = new RadioFM();
        rad.setChannelRadio(-1);
        rad.nextChannelRadio();
        int expected = 1;
        int actual = rad.getChannelRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void OverMaxNextChannel() {//тест только для покрытия всех веток set'а
        RadioFM rad = new RadioFM();
        rad.setChannelRadio(10);
        rad.nextChannelRadio();
        int expected = 1;
        int actual = rad.getChannelRadio();

        Assertions.assertEquals(expected, actual);
    }

    ////////////////////////
    @Test
    public void MaxPrevChannel() {
        RadioFM rad = new RadioFM();
        rad.setChannelRadio(9);
        rad.prevChannelRadio();
        int expected = 8;
        int actual = rad.getChannelRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinMaxPrevChannel() {
        RadioFM rad = new RadioFM();
        rad.setChannelRadio(0);
        rad.prevChannelRadio();
        int expected = 9;
        int actual = rad.getChannelRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinPrevChannel() {
        RadioFM rad = new RadioFM();
        rad.setChannelRadio(1);
        rad.prevChannelRadio();
        int expected = 0;
        int actual = rad.getChannelRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxMinPrevChannel() {
        RadioFM rad = new RadioFM();
        rad.setChannelRadio(9);
        rad.prevChannelRadio();
        int expected = 8;
        int actual = rad.getChannelRadio();

        Assertions.assertEquals(expected, actual);
    }

    ////////////////////////////////////////////
    @Test
    public void NextVolumeRadio() {
        RadioFM rad = new RadioFM();
        rad.setVolumeRadio(50);
        rad.nextVolumeRadio();
        int expected = 51;
        int actual = rad.getVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PreMaxNextVolumeRadio() {
        RadioFM rad = new RadioFM();
        rad.setVolumeRadio(99);
        rad.nextVolumeRadio();
        int expected = 100;
        int actual = rad.getVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxNextVolumeRadio() {
        RadioFM rad = new RadioFM();
        rad.setVolumeRadio(100);
        rad.nextVolumeRadio();
        int expected = 100;
        int actual = rad.getVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinNextVolumeRadio() {
        RadioFM rad = new RadioFM();
        rad.setVolumeRadio(0);
        rad.nextVolumeRadio();
        int expected = 1;
        int actual = rad.getVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    ////////////////////////////
    @Test
    public void PrevVolumeRadio() {
        RadioFM rad = new RadioFM();
        rad.setVolumeRadio(50);
        rad.prevVolumeRadio();
        int expected = 49;
        int actual = rad.getVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinPrevVolumeRadio() {
        RadioFM rad = new RadioFM();
        rad.setVolumeRadio(0);
        rad.prevVolumeRadio();
        int expected = 0;
        int actual = rad.getVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PreMinPrevVolumeRadio() {
        RadioFM rad = new RadioFM();
        rad.setVolumeRadio(1);
        rad.prevVolumeRadio();
        int expected = 0;
        int actual = rad.getVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxPrevVolumeRadio() {
        RadioFM rad = new RadioFM();
        rad.setVolumeRadio(100);
        rad.prevVolumeRadio();
        int expected = 99;
        int actual = rad.getVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void OverMaxPrevVolumeRadio() {//тест только для покрытия всех веток set'а
        RadioFM rad = new RadioFM();
        rad.setVolumeRadio(101);
        rad.prevVolumeRadio();
        int expected = 0;
        int actual = rad.getVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void OverMinPrevVolumeRadio() {//тест только для покрытия всех веток set'а
        RadioFM rad = new RadioFM();
        rad.setVolumeRadio(-1);
        rad.prevVolumeRadio();
        int expected = 0;
        int actual = rad.getVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }
}
