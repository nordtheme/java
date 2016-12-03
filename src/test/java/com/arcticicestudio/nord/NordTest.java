/*
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
title      Nord API Unit Test                           +
project    nord-java                                    +
repository https://github.com/arcticicestudio/nord-java +
author     Arctic Ice Studio                            +
email      development@arcticicestudio.com              +
copyright  Copyright (C) 2016                           +
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/
package com.arcticicestudio.nord;

import com.arcticicestudio.arcver.Version;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit tests for the {@link Nord} public API.
 *
 * @author Arctic Ice Studio &lt;development@arcticicestudio.com&gt;
 * @since 0.1.0
 */
public class NordTest {

  @Test
  public void shouldReturnHEXColorCode() {
    assertEquals(Nord.hex(Nord.NORD0.get()), "#2E3440");
    assertEquals(Nord.hex(Nord.NORD1.get()), "#3B4252");
    assertEquals(Nord.hex(Nord.NORD2.get()), "#434C5E");
    assertEquals(Nord.hex(Nord.NORD3.get()), "#4C566A");
    assertEquals(Nord.hex(Nord.NORD4.get()), "#D8DEE9");
    assertEquals(Nord.hex(Nord.NORD5.get()), "#E5E9F0");
    assertEquals(Nord.hex(Nord.NORD6.get()), "#ECEFF4");
    assertEquals(Nord.hex(Nord.NORD7.get()), "#8FBCBB");
    assertEquals(Nord.hex(Nord.NORD8.get()), "#88C0D0");
    assertEquals(Nord.hex(Nord.NORD9.get()), "#81A1C1");
    assertEquals(Nord.hex(Nord.NORD10.get()), "#5E81AC");
    assertEquals(Nord.hex(Nord.NORD11.get()), "#BF616A");
    assertEquals(Nord.hex(Nord.NORD12.get()), "#D08770");
    assertEquals(Nord.hex(Nord.NORD13.get()), "#EBCB8B");
    assertEquals(Nord.hex(Nord.NORD14.get()), "#A3BE8C");
    assertEquals(Nord.hex(Nord.NORD15.get()), "#B48EAD");
  }

  @Test
  public void shouldReturnTheCorrectRGBColorCode() {
    assertEquals(Nord.rgb(Nord.NORD0.get()), "rgb(46, 52, 64)");
    assertEquals(Nord.rgb(Nord.NORD1.get()), "rgb(59, 66, 82)");
    assertEquals(Nord.rgb(Nord.NORD2.get()), "rgb(67, 76, 94)");
    assertEquals(Nord.rgb(Nord.NORD3.get()), "rgb(76, 86, 106)");
    assertEquals(Nord.rgb(Nord.NORD4.get()), "rgb(216, 222, 233)");
    assertEquals(Nord.rgb(Nord.NORD5.get()), "rgb(229, 233, 240)");
    assertEquals(Nord.rgb(Nord.NORD6.get()), "rgb(236, 239, 244)");
    assertEquals(Nord.rgb(Nord.NORD7.get()), "rgb(143, 188, 187)");
    assertEquals(Nord.rgb(Nord.NORD8.get()), "rgb(136, 192, 208)");
    assertEquals(Nord.rgb(Nord.NORD9.get()), "rgb(129, 161, 193)");
    assertEquals(Nord.rgb(Nord.NORD10.get()), "rgb(94, 129, 172)");
    assertEquals(Nord.rgb(Nord.NORD11.get()), "rgb(191, 97, 106)");
    assertEquals(Nord.rgb(Nord.NORD12.get()), "rgb(208, 135, 112)");
    assertEquals(Nord.rgb(Nord.NORD13.get()), "rgb(235, 203, 139)");
    assertEquals(Nord.rgb(Nord.NORD14.get()), "rgb(163, 190, 140)");
    assertEquals(Nord.rgb(Nord.NORD15.get()), "rgb(180, 142, 173)");
  }

  @Test
  public void shouldReturnTheCorrectVersionString() {
    assertTrue(Version.valueOf(Nord.getVersion()).satisfies("0.1.0"));
  }
}
