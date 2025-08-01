package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class StreamDiffblueTest {
  /**
   * Test {@link Stream#equals(Object)}, and {@link Stream#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Stream#equals(Object)}
   *   <li>{@link Stream#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Stream.equals(Object)", "int Stream.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Stream stream = new Stream();
    Stream stream2 = new Stream();

    // Act and Assert
    assertEquals(stream, stream2);
    int expectedHashCodeResult = stream.hashCode();
    assertEquals(expectedHashCodeResult, stream2.hashCode());
  }

  /**
   * Test {@link Stream#equals(Object)}, and {@link Stream#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Stream#equals(Object)}
   *   <li>{@link Stream#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Stream.equals(Object)", "int Stream.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Stream stream = new Stream();

    // Act and Assert
    assertEquals(stream, stream);
    int expectedHashCodeResult = stream.hashCode();
    assertEquals(expectedHashCodeResult, stream.hashCode());
  }

  /**
   * Test {@link Stream#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Stream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Stream.equals(Object)", "int Stream.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Stream(), null);
  }

  /**
   * Test {@link Stream#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Stream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Stream.equals(Object)", "int Stream.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Stream(), "Different type to Stream");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link Stream}
   *   <li>{@link Stream#id(String)}
   *   <li>{@link Stream#setId(String)}
   *   <li>{@link Stream#toString()}
   *   <li>{@link Stream#getId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Stream.<init>()",
    "String Stream.getId()",
    "Stream Stream.id(String)",
    "void Stream.setId(String)",
    "String Stream.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    Stream actualStream = new Stream();
    Stream actualIdResult = actualStream.id("42");
    actualStream.setId("42");
    String actualToStringResult = actualStream.toString();

    // Assert
    assertEquals("42", actualStream.getId());
    assertEquals("class Stream {\n    id: 42\n}", actualToStringResult);
    assertSame(actualStream, actualIdResult);
  }
}
