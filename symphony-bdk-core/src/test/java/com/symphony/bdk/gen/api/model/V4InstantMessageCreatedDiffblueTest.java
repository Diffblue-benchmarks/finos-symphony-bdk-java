package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V4InstantMessageCreatedDiffblueTest {
  /**
   * Test {@link V4InstantMessageCreated#equals(Object)}, and {@link
   * V4InstantMessageCreated#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4InstantMessageCreated#equals(Object)}
   *   <li>{@link V4InstantMessageCreated#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4InstantMessageCreated.equals(Object)",
    "int V4InstantMessageCreated.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4InstantMessageCreated v4InstantMessageCreated = new V4InstantMessageCreated();
    V4InstantMessageCreated v4InstantMessageCreated2 = new V4InstantMessageCreated();

    // Act and Assert
    assertEquals(v4InstantMessageCreated, v4InstantMessageCreated2);
    assertEquals(v4InstantMessageCreated.hashCode(), v4InstantMessageCreated2.hashCode());
  }

  /**
   * Test {@link V4InstantMessageCreated#equals(Object)}, and {@link
   * V4InstantMessageCreated#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4InstantMessageCreated#equals(Object)}
   *   <li>{@link V4InstantMessageCreated#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4InstantMessageCreated.equals(Object)",
    "int V4InstantMessageCreated.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4InstantMessageCreated v4InstantMessageCreated = new V4InstantMessageCreated();

    // Act and Assert
    assertEquals(v4InstantMessageCreated, v4InstantMessageCreated);
    int expectedHashCodeResult = v4InstantMessageCreated.hashCode();
    assertEquals(expectedHashCodeResult, v4InstantMessageCreated.hashCode());
  }

  /**
   * Test {@link V4InstantMessageCreated#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4InstantMessageCreated#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4InstantMessageCreated.equals(Object)",
    "int V4InstantMessageCreated.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4InstantMessageCreated(), null);
  }

  /**
   * Test {@link V4InstantMessageCreated#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4InstantMessageCreated#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4InstantMessageCreated.equals(Object)",
    "int V4InstantMessageCreated.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4InstantMessageCreated(), "Different type to V4InstantMessageCreated");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V4InstantMessageCreated}
   *   <li>{@link V4InstantMessageCreated#setStream(V4Stream)}
   *   <li>{@link V4InstantMessageCreated#stream(V4Stream)}
   *   <li>{@link V4InstantMessageCreated#toString()}
   *   <li>{@link V4InstantMessageCreated#getStream()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V4InstantMessageCreated.<init>()",
    "V4Stream V4InstantMessageCreated.getStream()",
    "void V4InstantMessageCreated.setStream(V4Stream)",
    "V4InstantMessageCreated V4InstantMessageCreated.stream(V4Stream)",
    "String V4InstantMessageCreated.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V4InstantMessageCreated actualV4InstantMessageCreated = new V4InstantMessageCreated();
    actualV4InstantMessageCreated.setStream(new V4Stream());
    V4Stream stream = new V4Stream();
    V4InstantMessageCreated actualStreamResult = actualV4InstantMessageCreated.stream(stream);
    String actualToStringResult = actualV4InstantMessageCreated.toString();
    V4Stream actualStream = actualV4InstantMessageCreated.getStream();

    // Assert
    assertEquals(
        "class V4InstantMessageCreated {\n"
            + "    stream: class V4Stream {\n"
            + "        streamId: null\n"
            + "        streamType: null\n"
            + "        roomName: null\n"
            + "        members: null\n"
            + "        external: null\n"
            + "        crossPod: null\n"
            + "        recipientTenantIds: null\n"
            + "    }\n"
            + "}",
        actualToStringResult);
    assertSame(actualV4InstantMessageCreated, actualStreamResult);
    assertSame(stream, actualStream);
  }
}
