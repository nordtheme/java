/*
 * Copyright (c) 2016-present Arctic Ice Studio <development@arcticicestudio.com>
 * Copyright (c) 2016-present Sven Greb <code@svengreb.de>
 *
 * Nord API.
 *
 * Project:    Nord Java
 * Repository: https://github.com/arcticicestudio/nord-java
 * License:    MIT
 */

package com.arcticicestudio.nord;

import javafx.scene.paint.Color;

import java.util.regex.Pattern;

/**
 * A arctic, north-bluish color palette Java library.
 * Created for the clean- and minimal flat design pattern to achieve a optimal focus and readability for code syntax
 * highlighting and UI.
 * It consists of a total of sixteen, carefully selected, dimmed pastel colors for a eye-comfortable, but yet colorful
 * ambiance.
 * <p>
 *   Public API entry point of the <a href="https://github.com/arcticicestudio/nord-java">Nord Java</a> project, which
 *   implements the <a href="https://github.com/arcticicestudio/nord">Nord</a> color palette.
 *
 * <div>
 *   <table summary="Nord Color Palette">
 *     <tbody>
 *       <tr>
 *         <th style="border:0;">Polar Night</th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(46,52,64);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(59,66,82);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(67,76,94);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(76,86,106);margin:0"></th>
 *       </tr>
 *       <tr>
 *         <th style="border:0;">Snow Storm</th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(216,222,233);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(229,233,240);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(236,239,244);margin:0"></th>
 *       </tr>
 *       <tr>
 *         <th style="border:0;">Frost</th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(143,188,187);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(136,192,208);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(129,161,193);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(94,129,172);margin:0"></th>
 *       </tr>
 *       <tr>
 *         <th style="border:0;">Aurora</th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(191,97,106);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(208,135,112);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(235,203,139);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(163,190,140);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(180,142,173);margin:0"></th>
 *       </tr>
 *     </tbody>
 *   </table>
 * </div>
 *
 * @author Arctic Ice Studio &lt;development@arcticicestudio.com&gt;
 * @version 0.2.0
 * @since 0.1.0
 */
public enum Nord {
  /**
   * Base component color "{@code nord0}" of "Polar Night" with a RGB value of {@code rgb(46, 52, 64)} and a HEX value
   * of {@code #2E3440}.
   * <p>
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(46,52,64);margin:0"></div>
   */
  NORD0(46, 52, 64),

  /**
   * Brighter color "{@code nord1}" of the "Polar Night" component base color {@link #NORD0} with a RGB value of
   * {@code rgb(59, 66, 82)} and a HEX value of {@code #3B4252}.
   * <p>
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(59,66,82);margin:0"></div>
   */
  NORD1(59, 66, 82),

  /**
   * Brighter color "{@code nord2}" of the "Polar Night" component base color {@link #NORD0} with a RGB value of
   * {@code rgb(67, 76, 94)} and a HEX value of {@code #434C5E}.
   * <p>
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(67,76,94);margin:0"></div>
   */
  NORD2(67, 76, 94),

  /**
   * Brighter color "{@code nord3}" of the "Polar Night" component base color {@link #NORD0} with a RGB value of
   * {@code rgb(76, 86, 106)} and a HEX value of {@code #4C566A}.
   * <p>
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(76,86,106);margin:0"></div>
   */
  NORD3(76, 86, 106),

  /**
   * Base component color "{@code nord4}" of "Snow Storm" with a RGB value of {@code rgb(216, 222, 233)} and a HEX value
   * of {@code #D8DEE9}.
   * <p>
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(216,222,233);margin:0"></div>
   */
  NORD4(216, 222, 233),

  /**
   * Brighter color "{@code nord5}" of the "Snow Storm" component base color {@link #NORD4} with a RGB value of
   * {@code rgb(229, 233, 240)} and a HEX value of {@code #E5E9F0}.
   * <p>
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(229,233,240);margin:0"></div>
   */
  NORD5(229, 233, 240),

  /**
   * Brighter color "{@code nord6}" of the "Snow Storm" component base color {@link #NORD4} with a RGB value of
   * {@code rgb(236, 239, 244)} and a HEX value of {@code #ECEFF4}.
   * <p>
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(236,239,244);margin:0"></div>
   */
  NORD6(236, 239, 244),

  /**
   * Bluish core color "{@code nord7}" of the "Frost" component with a RGB value of {@code rgb(143, 188, 187)} and a
   * HEX value of {@code #8FBCBB}.
   * <p>
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(143,188,187);margin:0"></div>
   */
  NORD7(143, 188, 187),

  /**
   * Bluish core accent color "{@code nord8}" of the "Frost" component with a RGB value of {@code rgb(136, 192, 208)}
   * and a HEX value of {@code #88C0D0}.
   * <p>
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(136,192,208);margin:0"></div>
   */
  NORD8(136, 192, 208),

  /**
   * Bluish core color "{@code nord9}" of the "Frost" component with a RGB value of {@code rgb(129, 161, 193)} and a
   * HEX value of {@code #81A1C1}.
   * <p>
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(129,161,193);margin:0"></div>
   */
  NORD9(129, 161, 193),

  /**
   * Bluish core color "{@code nord10}" of the "Frost" component with a RGB value of {@code rgb(94, 129, 172)} and a
   * HEX value of {@code #5E81AC}.
   * <p>
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(94,129,172);margin:0"></div>
   */
  NORD10(94, 129, 172),

  /**
   * Colorful color "{@code nord11}" of the "Aurora" component with a RGB value of {@code rgb(191, 97, 106)} and a
   * HEX value of {@code #BF616A}.
   * <p>
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(191,97,106);margin:0"></div>
   */
  NORD11(191, 97, 106),

  /**
   * Colorful color "{@code nord12}" of the "Aurora" component with a RGB value of {@code rgb(208, 135, 112)} and a
   * HEX value of {@code #D08770}.
   * <p>
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(208,135,112);margin:0"></div>
   */
  NORD12(208, 135, 112),

  /**
   * Colorful color "{@code nord13}" of the "Aurora" component with a RGB value of {@code rgb(235, 203, 139)} and a
   * HEX value of {@code #EBCB8B}.
   * <p>
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(235,203,139);margin:0"></div>
   */
  NORD13(235, 203, 139),

  /**
   * The color {@code nord14} of the "Aurora" component with an RGB value of {@code rgb(163, 190, 140)} and an HEX
   * value of {@code #A3BE8C}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(163,190,140);margin: 0"></div>
   */
  NORD14(163, 190, 140),

  /**
   * Colorful color "{@code nord15}" of the "Aurora" component with a RGB value of {@code rgb(180, 142, 173)} and a
   * HEX value of {@code #B48EAD}.
   * <p>
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(180,142,173);margin:0"></div>
   */
  NORD15(180, 142, 173);

  /**
   * Prefix pattern to convert RGB- and HEX color values.
   */
  private static final Pattern COLOR_PREFIX = Pattern.compile("0x", Pattern.LITERAL);

  /**
   * The RGB color code.
   */
  private final Color color;

  /**
   * The <a href="https://github.com/arcticicestudio/arcver">ArcVer</a> version of the public API.
   */
  private static final String VERSION = "0.2.0";

  /**
   * Constructs a new color object.
   *
   * @param red the value for the additive primary color {@code red}
   * @param green the value for the additive primary color {@code green}
   * @param blue the value for the additive primary color {@code blue}
   */
  Nord(final int red, final int green, final int blue) {
    color = Color.rgb(red, green, blue);
  }

  /**
   * Converts the specified color to the HEX identifier.
   *
   * @param color the color object to convert
   * @return the string representation of the HEX identifier
   */
  public static String hex(final Color color) {
    return COLOR_PREFIX.matcher(color.toString()).replaceAll("#").substring(0, 7).toUpperCase();
  }

  /**
   * Converts the specified color to the RGB identifier.
   *
   * @param color the color object to convert
   * @return the string representation of the RGB identifier
   */
  public static String rgb(final Color color) {
    String hex = COLOR_PREFIX.matcher(color.toString()).replaceAll("");
    String hexRed = hex.substring(0, 2).toUpperCase();
    String hexGreen = hex.substring(2, 4).toUpperCase();
    String hexBlue = hex.substring(4, 6).toUpperCase();

    String intRed = Integer.toString(Integer.parseInt(hexRed, 16));
    String intGreen = Integer.toString(Integer.parseInt(hexGreen, 16));
    String intBlue = Integer.toString(Integer.parseInt(hexBlue, 16));

    return String.join("", "rgb(", intRed, ", ", intGreen, ", ", intBlue, ")");
  }

  /**
   * The color constant as color object.
   *
   * @return the color object
   */
  public Color get() {
    return color;
  }

  /**
   * Returns the <a href="https://github.com/arcticicestudio/arcver">ArcVer</a> version of the public API.
   *
   * @return the ArcVer version string
   * @see <a href="http://semver.org">SemVer</a>
   */
  public static String getVersion() {
    return VERSION;
  }
}
