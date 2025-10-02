package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.Disclaimer.FormatEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DisclaimerDiffblueTest {
  /**
   * Test {@link Disclaimer#equals(Object)}, and {@link Disclaimer#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Disclaimer#equals(Object)}
   *   <li>{@link Disclaimer#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Disclaimer.equals(Object)", "int Disclaimer.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Disclaimer disclaimer = new Disclaimer();
    Disclaimer disclaimer2 = new Disclaimer();

    // Act and Assert
    assertEquals(disclaimer, disclaimer2);
    assertEquals(disclaimer.hashCode(), disclaimer2.hashCode());
  }

  /**
   * Test {@link Disclaimer#equals(Object)}, and {@link Disclaimer#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Disclaimer#equals(Object)}
   *   <li>{@link Disclaimer#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Disclaimer.equals(Object)", "int Disclaimer.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Disclaimer disclaimer = new Disclaimer();

    // Act and Assert
    assertEquals(disclaimer, disclaimer);
    int expectedHashCodeResult = disclaimer.hashCode();
    assertEquals(expectedHashCodeResult, disclaimer.hashCode());
  }

  /**
   * Test {@link Disclaimer#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Disclaimer#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Disclaimer.equals(Object)", "int Disclaimer.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Disclaimer(), 1);
  }

  /**
   * Test {@link Disclaimer#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Disclaimer#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Disclaimer.equals(Object)", "int Disclaimer.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Disclaimer disclaimer = new Disclaimer();
    disclaimer.id("42");

    // Act and Assert
    assertNotEquals(disclaimer, new Disclaimer());
  }

  /**
   * Test {@link Disclaimer#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Disclaimer#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Disclaimer.equals(Object)", "int Disclaimer.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Disclaimer disclaimer = new Disclaimer();
    disclaimer.name("Name");

    // Act and Assert
    assertNotEquals(disclaimer, new Disclaimer());
  }

  /**
   * Test {@link Disclaimer#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Disclaimer#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Disclaimer.equals(Object)", "int Disclaimer.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    Disclaimer disclaimer = new Disclaimer();
    disclaimer.content("Not all who wander are lost");

    // Act and Assert
    assertNotEquals(disclaimer, new Disclaimer());
  }

  /**
   * Test {@link Disclaimer#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Disclaimer#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Disclaimer.equals(Object)", "int Disclaimer.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    Disclaimer disclaimer = new Disclaimer();
    disclaimer.frequencyInHours(1);

    // Act and Assert
    assertNotEquals(disclaimer, new Disclaimer());
  }

  /**
   * Test {@link Disclaimer#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Disclaimer#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Disclaimer.equals(Object)", "int Disclaimer.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    Disclaimer disclaimer = new Disclaimer();
    disclaimer.setIsDefault(true);

    // Act and Assert
    assertNotEquals(disclaimer, new Disclaimer());
  }

  /**
   * Test {@link Disclaimer#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Disclaimer#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Disclaimer.equals(Object)", "int Disclaimer.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    Disclaimer disclaimer = new Disclaimer();
    disclaimer.setIsActive(true);

    // Act and Assert
    assertNotEquals(disclaimer, new Disclaimer());
  }

  /**
   * Test {@link Disclaimer#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Disclaimer#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Disclaimer.equals(Object)", "int Disclaimer.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    Disclaimer disclaimer = new Disclaimer();
    disclaimer.createdDate(1L);

    // Act and Assert
    assertNotEquals(disclaimer, new Disclaimer());
  }

  /**
   * Test {@link Disclaimer#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Disclaimer#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Disclaimer.equals(Object)", "int Disclaimer.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    Disclaimer disclaimer = new Disclaimer();
    disclaimer.modifiedDate(1L);

    // Act and Assert
    assertNotEquals(disclaimer, new Disclaimer());
  }

  /**
   * Test {@link Disclaimer#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Disclaimer#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Disclaimer.equals(Object)", "int Disclaimer.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual10() {
    // Arrange
    Disclaimer disclaimer = new Disclaimer();
    disclaimer.format(FormatEnum.TEXT);

    // Act and Assert
    assertNotEquals(disclaimer, new Disclaimer());
  }

  /**
   * Test {@link Disclaimer#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Disclaimer#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Disclaimer.equals(Object)", "int Disclaimer.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Disclaimer(), null);
  }

  /**
   * Test {@link Disclaimer#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Disclaimer#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Disclaimer.equals(Object)", "int Disclaimer.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Disclaimer(), "Different type to Disclaimer");
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
   *   <li>default or parameterless constructor of {@link Disclaimer}
   *   <li>{@link Disclaimer#content(String)}
   *   <li>{@link Disclaimer#createdDate(Long)}
   *   <li>{@link Disclaimer#format(FormatEnum)}
   *   <li>{@link Disclaimer#frequencyInHours(Integer)}
   *   <li>{@link Disclaimer#id(String)}
   *   <li>{@link Disclaimer#modifiedDate(Long)}
   *   <li>{@link Disclaimer#name(String)}
   *   <li>{@link Disclaimer#setContent(String)}
   *   <li>{@link Disclaimer#setCreatedDate(Long)}
   *   <li>{@link Disclaimer#setFormat(FormatEnum)}
   *   <li>{@link Disclaimer#setFrequencyInHours(Integer)}
   *   <li>{@link Disclaimer#setId(String)}
   *   <li>{@link Disclaimer#setIsActive(Boolean)}
   *   <li>{@link Disclaimer#setIsDefault(Boolean)}
   *   <li>{@link Disclaimer#setModifiedDate(Long)}
   *   <li>{@link Disclaimer#setName(String)}
   *   <li>{@link Disclaimer#isActive(Boolean)}
   *   <li>{@link Disclaimer#isDefault(Boolean)}
   *   <li>{@link Disclaimer#toString()}
   *   <li>{@link Disclaimer#getContent()}
   *   <li>{@link Disclaimer#getCreatedDate()}
   *   <li>{@link Disclaimer#getFormat()}
   *   <li>{@link Disclaimer#getFrequencyInHours()}
   *   <li>{@link Disclaimer#getId()}
   *   <li>{@link Disclaimer#getIsActive()}
   *   <li>{@link Disclaimer#getIsDefault()}
   *   <li>{@link Disclaimer#getModifiedDate()}
   *   <li>{@link Disclaimer#getName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Disclaimer.<init>()",
    "Disclaimer Disclaimer.content(String)",
    "Disclaimer Disclaimer.createdDate(Long)",
    "Disclaimer Disclaimer.format(FormatEnum)",
    "Disclaimer Disclaimer.frequencyInHours(Integer)",
    "String Disclaimer.getContent()",
    "Long Disclaimer.getCreatedDate()",
    "FormatEnum Disclaimer.getFormat()",
    "Integer Disclaimer.getFrequencyInHours()",
    "String Disclaimer.getId()",
    "Boolean Disclaimer.getIsActive()",
    "Boolean Disclaimer.getIsDefault()",
    "Long Disclaimer.getModifiedDate()",
    "String Disclaimer.getName()",
    "Disclaimer Disclaimer.id(String)",
    "Disclaimer Disclaimer.isActive(Boolean)",
    "Disclaimer Disclaimer.isDefault(Boolean)",
    "Disclaimer Disclaimer.modifiedDate(Long)",
    "Disclaimer Disclaimer.name(String)",
    "void Disclaimer.setContent(String)",
    "void Disclaimer.setCreatedDate(Long)",
    "void Disclaimer.setFormat(FormatEnum)",
    "void Disclaimer.setFrequencyInHours(Integer)",
    "void Disclaimer.setId(String)",
    "void Disclaimer.setIsActive(Boolean)",
    "void Disclaimer.setIsDefault(Boolean)",
    "void Disclaimer.setModifiedDate(Long)",
    "void Disclaimer.setName(String)",
    "String Disclaimer.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    Disclaimer actualDisclaimer = new Disclaimer();
    Disclaimer actualContentResult = actualDisclaimer.content("Not all who wander are lost");
    Disclaimer actualCreatedDateResult = actualDisclaimer.createdDate(1L);
    Disclaimer actualFormatResult = actualDisclaimer.format(FormatEnum.TEXT);
    Disclaimer actualFrequencyInHoursResult = actualDisclaimer.frequencyInHours(1);
    Disclaimer actualIdResult = actualDisclaimer.id("42");
    Disclaimer actualModifiedDateResult = actualDisclaimer.modifiedDate(1L);
    Disclaimer actualNameResult = actualDisclaimer.name("Name");
    actualDisclaimer.setContent("Not all who wander are lost");
    actualDisclaimer.setCreatedDate(1L);
    actualDisclaimer.setFormat(FormatEnum.TEXT);
    actualDisclaimer.setFrequencyInHours(1);
    actualDisclaimer.setId("42");
    actualDisclaimer.setIsActive(true);
    actualDisclaimer.setIsDefault(true);
    actualDisclaimer.setModifiedDate(1L);
    actualDisclaimer.setName("Name");
    Disclaimer actualIsActiveResult = actualDisclaimer.isActive(true);
    Disclaimer actualIsDefaultResult = actualDisclaimer.isDefault(true);
    String actualToStringResult = actualDisclaimer.toString();
    String actualContent = actualDisclaimer.getContent();
    Long actualCreatedDate = actualDisclaimer.getCreatedDate();
    FormatEnum actualFormat = actualDisclaimer.getFormat();
    Integer actualFrequencyInHours = actualDisclaimer.getFrequencyInHours();
    String actualId = actualDisclaimer.getId();
    Boolean actualIsActive = actualDisclaimer.getIsActive();
    Boolean actualIsDefault = actualDisclaimer.getIsDefault();
    Long actualModifiedDate = actualDisclaimer.getModifiedDate();

    // Assert
    assertEquals("42", actualId);
    assertEquals("Name", actualDisclaimer.getName());
    assertEquals("Not all who wander are lost", actualContent);
    assertEquals(
        "class Disclaimer {\n"
            + "    id: 42\n"
            + "    name: Name\n"
            + "    content: Not all who wander are lost\n"
            + "    frequencyInHours: 1\n"
            + "    isDefault: true\n"
            + "    isActive: true\n"
            + "    createdDate: 1\n"
            + "    modifiedDate: 1\n"
            + "    format: TEXT\n"
            + "}",
        actualToStringResult);
    assertEquals(1, actualFrequencyInHours.intValue());
    assertEquals(1L, actualCreatedDate.longValue());
    assertEquals(1L, actualModifiedDate.longValue());
    assertEquals(FormatEnum.TEXT, actualFormat);
    assertTrue(actualIsActive);
    assertTrue(actualIsDefault);
    assertSame(actualDisclaimer, actualContentResult);
    assertSame(actualDisclaimer, actualCreatedDateResult);
    assertSame(actualDisclaimer, actualFormatResult);
    assertSame(actualDisclaimer, actualFrequencyInHoursResult);
    assertSame(actualDisclaimer, actualIdResult);
    assertSame(actualDisclaimer, actualIsActiveResult);
    assertSame(actualDisclaimer, actualIsDefaultResult);
    assertSame(actualDisclaimer, actualModifiedDateResult);
    assertSame(actualDisclaimer, actualNameResult);
  }
}
