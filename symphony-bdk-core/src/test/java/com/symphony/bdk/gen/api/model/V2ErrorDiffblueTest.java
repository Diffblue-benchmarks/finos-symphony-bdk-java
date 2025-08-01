package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V2ErrorDiffblueTest {
  /**
   * Test {@link V2Error#equals(Object)}, and {@link V2Error#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2Error#equals(Object)}
   *   <li>{@link V2Error#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2Error.equals(Object)", "int V2Error.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2Error v2Error = new V2Error();
    V2Error v2Error2 = new V2Error();

    // Act and Assert
    assertEquals(v2Error, v2Error2);
    int expectedHashCodeResult = v2Error.hashCode();
    assertEquals(expectedHashCodeResult, v2Error2.hashCode());
  }

  /**
   * Test {@link V2Error#equals(Object)}, and {@link V2Error#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2Error#equals(Object)}
   *   <li>{@link V2Error#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2Error.equals(Object)", "int V2Error.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2Error v2Error = new V2Error();

    // Act and Assert
    assertEquals(v2Error, v2Error);
    int expectedHashCodeResult = v2Error.hashCode();
    assertEquals(expectedHashCodeResult, v2Error.hashCode());
  }

  /**
   * Test {@link V2Error#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2Error#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2Error.equals(Object)", "int V2Error.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2Error(), 1);
  }

  /**
   * Test {@link V2Error#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2Error#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2Error.equals(Object)", "int V2Error.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V2Error v2Error = new V2Error();
    v2Error.code(1);

    // Act and Assert
    assertNotEquals(v2Error, new V2Error());
  }

  /**
   * Test {@link V2Error#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2Error#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2Error.equals(Object)", "int V2Error.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V2Error v2Error = new V2Error();
    v2Error.message("Not all who wander are lost");

    // Act and Assert
    assertNotEquals(v2Error, new V2Error());
  }

  /**
   * Test {@link V2Error#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2Error#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2Error.equals(Object)", "int V2Error.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V2Error v2Error = new V2Error();
    v2Error.details("Details");

    // Act and Assert
    assertNotEquals(v2Error, new V2Error());
  }

  /**
   * Test {@link V2Error#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2Error#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2Error.equals(Object)", "int V2Error.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V2Error v2Error = new V2Error();
    v2Error.details(new V2Error());

    // Act and Assert
    assertNotEquals(v2Error, new V2Error());
  }

  /**
   * Test {@link V2Error#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2Error#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2Error.equals(Object)", "int V2Error.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2Error(), null);
  }

  /**
   * Test {@link V2Error#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2Error#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2Error.equals(Object)", "int V2Error.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2Error(), "Different type to V2Error");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V2Error}
   *   <li>{@link V2Error#code(Integer)}
   *   <li>{@link V2Error#details(Object)}
   *   <li>{@link V2Error#message(String)}
   *   <li>{@link V2Error#setCode(Integer)}
   *   <li>{@link V2Error#setDetails(Object)}
   *   <li>{@link V2Error#setMessage(String)}
   *   <li>{@link V2Error#toString()}
   *   <li>{@link V2Error#getCode()}
   *   <li>{@link V2Error#getDetails()}
   *   <li>{@link V2Error#getMessage()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V2Error.<init>()",
    "V2Error V2Error.code(Integer)",
    "V2Error V2Error.details(Object)",
    "Integer V2Error.getCode()",
    "Object V2Error.getDetails()",
    "String V2Error.getMessage()",
    "V2Error V2Error.message(String)",
    "void V2Error.setCode(Integer)",
    "void V2Error.setDetails(Object)",
    "void V2Error.setMessage(String)",
    "String V2Error.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V2Error actualV2Error = new V2Error();
    V2Error actualCodeResult = actualV2Error.code(1);
    V2Error actualDetailsResult = actualV2Error.details("Details");
    V2Error actualMessageResult = actualV2Error.message("Not all who wander are lost");
    actualV2Error.setCode(1);
    actualV2Error.setDetails("Details");
    actualV2Error.setMessage("Not all who wander are lost");
    String actualToStringResult = actualV2Error.toString();
    Integer actualCode = actualV2Error.getCode();
    Object actualDetails = actualV2Error.getDetails();

    // Assert
    assertEquals("Details", actualDetails);
    assertEquals("Not all who wander are lost", actualV2Error.getMessage());
    assertEquals(
        "class V2Error {\n    code: 1\n    message: Not all who wander are lost\n    details: Details\n}",
        actualToStringResult);
    assertEquals(1, actualCode.intValue());
    assertSame(actualV2Error, actualCodeResult);
    assertSame(actualV2Error, actualDetailsResult);
    assertSame(actualV2Error, actualMessageResult);
  }
}
