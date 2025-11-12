package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.SuccessResponse.FormatEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SuccessResponseDiffblueTest {
  /**
   * Test {@link SuccessResponse#equals(Object)}, and {@link SuccessResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SuccessResponse#equals(Object)}
   *   <li>{@link SuccessResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SuccessResponse.equals(Object)", "int SuccessResponse.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    SuccessResponse successResponse = new SuccessResponse();
    SuccessResponse successResponse2 = new SuccessResponse();

    // Act and Assert
    assertEquals(successResponse, successResponse2);
    assertEquals(successResponse.hashCode(), successResponse2.hashCode());
  }

  /**
   * Test {@link SuccessResponse#equals(Object)}, and {@link SuccessResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SuccessResponse#equals(Object)}
   *   <li>{@link SuccessResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SuccessResponse.equals(Object)", "int SuccessResponse.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    SuccessResponse successResponse = new SuccessResponse();

    // Act and Assert
    assertEquals(successResponse, successResponse);
    int expectedHashCodeResult = successResponse.hashCode();
    assertEquals(expectedHashCodeResult, successResponse.hashCode());
  }

  /**
   * Test {@link SuccessResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SuccessResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SuccessResponse.equals(Object)", "int SuccessResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new SuccessResponse(), 1);
  }

  /**
   * Test {@link SuccessResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SuccessResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SuccessResponse.equals(Object)", "int SuccessResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    SuccessResponse successResponse = new SuccessResponse();
    successResponse.format(FormatEnum.TEXT);

    // Act and Assert
    assertNotEquals(successResponse, new SuccessResponse());
  }

  /**
   * Test {@link SuccessResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SuccessResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SuccessResponse.equals(Object)", "int SuccessResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    SuccessResponse successResponse = new SuccessResponse();
    successResponse.message("Not all who wander are lost");

    // Act and Assert
    assertNotEquals(successResponse, new SuccessResponse());
  }

  /**
   * Test {@link SuccessResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SuccessResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SuccessResponse.equals(Object)", "int SuccessResponse.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new SuccessResponse(), null);
  }

  /**
   * Test {@link SuccessResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SuccessResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SuccessResponse.equals(Object)", "int SuccessResponse.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new SuccessResponse(), "Different type to SuccessResponse");
  }

  /**
   * Test FormatEnum {@link FormatEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link FormatEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test FormatEnum fromValue(String); when '42'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FormatEnum FormatEnum.fromValue(String)"})
  void testFormatEnumFromValue_when42_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(FormatEnum.fromValue("42"));
  }

  /**
   * Test FormatEnum {@link FormatEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code TEXT}.
   *   <li>Then return {@code TEXT}.
   * </ul>
   *
   * <p>Method under test: {@link FormatEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test FormatEnum fromValue(String); when 'TEXT'; then return 'TEXT'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FormatEnum FormatEnum.fromValue(String)"})
  void testFormatEnumFromValue_whenText_thenReturnText() {
    // Arrange, Act and Assert
    assertEquals(FormatEnum.TEXT, FormatEnum.fromValue("TEXT"));
  }

  /**
   * Test FormatEnum getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FormatEnum#toString()}
   *   <li>{@link FormatEnum#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test FormatEnum getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FormatEnum.getValue()", "String FormatEnum.toString()"})
  void testFormatEnumGettersAndSetters() {
    // Arrange
    FormatEnum valueOfResult = FormatEnum.valueOf("TEXT");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("TEXT", valueOfResult.getValue());
    assertEquals("TEXT", actualToStringResult);
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link SuccessResponse}
   *   <li>{@link SuccessResponse#format(FormatEnum)}
   *   <li>{@link SuccessResponse#message(String)}
   *   <li>{@link SuccessResponse#setFormat(FormatEnum)}
   *   <li>{@link SuccessResponse#setMessage(String)}
   *   <li>{@link SuccessResponse#toString()}
   *   <li>{@link SuccessResponse#getFormat()}
   *   <li>{@link SuccessResponse#getMessage()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SuccessResponse.<init>()",
    "SuccessResponse SuccessResponse.format(FormatEnum)",
    "FormatEnum SuccessResponse.getFormat()",
    "String SuccessResponse.getMessage()",
    "SuccessResponse SuccessResponse.message(String)",
    "void SuccessResponse.setFormat(FormatEnum)",
    "void SuccessResponse.setMessage(String)",
    "String SuccessResponse.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    SuccessResponse actualSuccessResponse = new SuccessResponse();
    SuccessResponse actualFormatResult = actualSuccessResponse.format(FormatEnum.TEXT);
    SuccessResponse actualMessageResult =
        actualSuccessResponse.message("Not all who wander are lost");
    actualSuccessResponse.setFormat(FormatEnum.TEXT);
    actualSuccessResponse.setMessage("Not all who wander are lost");
    String actualToStringResult = actualSuccessResponse.toString();
    FormatEnum actualFormat = actualSuccessResponse.getFormat();

    // Assert
    assertEquals("Not all who wander are lost", actualSuccessResponse.getMessage());
    assertEquals(
        "class SuccessResponse {\n    format: TEXT\n    message: Not all who wander are lost\n}",
        actualToStringResult);
    assertEquals(FormatEnum.TEXT, actualFormat);
    assertSame(actualSuccessResponse, actualFormatResult);
    assertSame(actualSuccessResponse, actualMessageResult);
  }
}
