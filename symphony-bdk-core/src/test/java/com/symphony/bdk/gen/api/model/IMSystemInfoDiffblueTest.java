package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IMSystemInfoDiffblueTest {
  /**
   * Test {@link IMSystemInfo#equals(Object)}, and {@link IMSystemInfo#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IMSystemInfo#equals(Object)}
   *   <li>{@link IMSystemInfo#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IMSystemInfo.equals(Object)", "int IMSystemInfo.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    IMSystemInfo imSystemInfo = new IMSystemInfo();
    IMSystemInfo imSystemInfo2 = new IMSystemInfo();

    // Act and Assert
    assertEquals(imSystemInfo, imSystemInfo2);
    assertEquals(imSystemInfo.hashCode(), imSystemInfo2.hashCode());
  }

  /**
   * Test {@link IMSystemInfo#equals(Object)}, and {@link IMSystemInfo#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IMSystemInfo#equals(Object)}
   *   <li>{@link IMSystemInfo#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IMSystemInfo.equals(Object)", "int IMSystemInfo.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    IMSystemInfo imSystemInfo = new IMSystemInfo();

    // Act and Assert
    assertEquals(imSystemInfo, imSystemInfo);
    int expectedHashCodeResult = imSystemInfo.hashCode();
    assertEquals(expectedHashCodeResult, imSystemInfo.hashCode());
  }

  /**
   * Test {@link IMSystemInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IMSystemInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IMSystemInfo.equals(Object)", "int IMSystemInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new IMSystemInfo(), 1);
  }

  /**
   * Test {@link IMSystemInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IMSystemInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IMSystemInfo.equals(Object)", "int IMSystemInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    IMSystemInfo imSystemInfo = new IMSystemInfo();
    imSystemInfo.id("42");

    // Act and Assert
    assertNotEquals(imSystemInfo, new IMSystemInfo());
  }

  /**
   * Test {@link IMSystemInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IMSystemInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IMSystemInfo.equals(Object)", "int IMSystemInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    IMSystemInfo imSystemInfo = new IMSystemInfo();
    imSystemInfo.creationDate(1L);

    // Act and Assert
    assertNotEquals(imSystemInfo, new IMSystemInfo());
  }

  /**
   * Test {@link IMSystemInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IMSystemInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IMSystemInfo.equals(Object)", "int IMSystemInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    IMSystemInfo imSystemInfo = new IMSystemInfo();
    imSystemInfo.active(true);

    // Act and Assert
    assertNotEquals(imSystemInfo, new IMSystemInfo());
  }

  /**
   * Test {@link IMSystemInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IMSystemInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IMSystemInfo.equals(Object)", "int IMSystemInfo.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new IMSystemInfo(), null);
  }

  /**
   * Test {@link IMSystemInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IMSystemInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IMSystemInfo.equals(Object)", "int IMSystemInfo.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new IMSystemInfo(), "Different type to IMSystemInfo");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link IMSystemInfo}
   *   <li>{@link IMSystemInfo#active(Boolean)}
   *   <li>{@link IMSystemInfo#creationDate(Long)}
   *   <li>{@link IMSystemInfo#id(String)}
   *   <li>{@link IMSystemInfo#setActive(Boolean)}
   *   <li>{@link IMSystemInfo#setCreationDate(Long)}
   *   <li>{@link IMSystemInfo#setId(String)}
   *   <li>{@link IMSystemInfo#toString()}
   *   <li>{@link IMSystemInfo#getActive()}
   *   <li>{@link IMSystemInfo#getCreationDate()}
   *   <li>{@link IMSystemInfo#getId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void IMSystemInfo.<init>()",
    "IMSystemInfo IMSystemInfo.active(Boolean)",
    "IMSystemInfo IMSystemInfo.creationDate(Long)",
    "Boolean IMSystemInfo.getActive()",
    "Long IMSystemInfo.getCreationDate()",
    "String IMSystemInfo.getId()",
    "IMSystemInfo IMSystemInfo.id(String)",
    "void IMSystemInfo.setActive(Boolean)",
    "void IMSystemInfo.setCreationDate(Long)",
    "void IMSystemInfo.setId(String)",
    "String IMSystemInfo.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    IMSystemInfo actualImSystemInfo = new IMSystemInfo();
    IMSystemInfo actualActiveResult = actualImSystemInfo.active(true);
    IMSystemInfo actualCreationDateResult = actualImSystemInfo.creationDate(1L);
    IMSystemInfo actualIdResult = actualImSystemInfo.id("42");
    actualImSystemInfo.setActive(true);
    actualImSystemInfo.setCreationDate(1L);
    actualImSystemInfo.setId("42");
    String actualToStringResult = actualImSystemInfo.toString();
    Boolean actualActive = actualImSystemInfo.getActive();
    Long actualCreationDate = actualImSystemInfo.getCreationDate();

    // Assert
    assertEquals("42", actualImSystemInfo.getId());
    assertEquals(
        "class IMSystemInfo {\n    id: 42\n    creationDate: 1\n    active: true\n}",
        actualToStringResult);
    assertEquals(1L, actualCreationDate.longValue());
    assertTrue(actualActive);
    assertSame(actualImSystemInfo, actualActiveResult);
    assertSame(actualImSystemInfo, actualCreationDateResult);
    assertSame(actualImSystemInfo, actualIdResult);
  }
}
