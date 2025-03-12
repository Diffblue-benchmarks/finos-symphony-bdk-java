package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V4ConnectionRequestedDiffblueTest {
  /**
   * Test {@link V4ConnectionRequested#equals(Object)}, and {@link V4ConnectionRequested#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4ConnectionRequested#equals(Object)}
   *   <li>{@link V4ConnectionRequested#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4ConnectionRequested.equals(Object)", "int V4ConnectionRequested.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4ConnectionRequested v4ConnectionRequested = new V4ConnectionRequested();
    V4ConnectionRequested v4ConnectionRequested2 = new V4ConnectionRequested();

    // Act and Assert
    assertEquals(v4ConnectionRequested, v4ConnectionRequested2);
    int expectedHashCodeResult = v4ConnectionRequested.hashCode();
    assertEquals(expectedHashCodeResult, v4ConnectionRequested2.hashCode());
  }

  /**
   * Test {@link V4ConnectionRequested#equals(Object)}, and {@link V4ConnectionRequested#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4ConnectionRequested#equals(Object)}
   *   <li>{@link V4ConnectionRequested#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4ConnectionRequested.equals(Object)", "int V4ConnectionRequested.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4ConnectionRequested v4ConnectionRequested = new V4ConnectionRequested();

    // Act and Assert
    assertEquals(v4ConnectionRequested, v4ConnectionRequested);
    int expectedHashCodeResult = v4ConnectionRequested.hashCode();
    assertEquals(expectedHashCodeResult, v4ConnectionRequested.hashCode());
  }

  /**
   * Test {@link V4ConnectionRequested#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4ConnectionRequested#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4ConnectionRequested.equals(Object)", "int V4ConnectionRequested.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4ConnectionRequested(), null);
  }

  /**
   * Test {@link V4ConnectionRequested#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4ConnectionRequested#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4ConnectionRequested.equals(Object)", "int V4ConnectionRequested.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4ConnectionRequested(), null);
  }

  /**
   * Test {@link V4ConnectionRequested#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4ConnectionRequested#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4ConnectionRequested.equals(Object)", "int V4ConnectionRequested.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4ConnectionRequested(), "Different type to V4ConnectionRequested");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V4ConnectionRequested}
   *   <li>{@link V4ConnectionRequested#setToUser(V4User)}
   *   <li>{@link V4ConnectionRequested#toString()}
   *   <li>{@link V4ConnectionRequested#toUser(V4User)}
   *   <li>{@link V4ConnectionRequested#getToUser()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V4ConnectionRequested.<init>()", "V4User V4ConnectionRequested.getToUser()",
      "void V4ConnectionRequested.setToUser(V4User)", "String V4ConnectionRequested.toString()",
      "V4ConnectionRequested V4ConnectionRequested.toUser(V4User)"})
  void testGettersAndSetters() {
    // Arrange and Act
    V4ConnectionRequested actualV4ConnectionRequested = new V4ConnectionRequested();
    actualV4ConnectionRequested.setToUser(new V4User());
    String actualToStringResult = actualV4ConnectionRequested.toString();
    V4User toUser = new V4User();
    V4ConnectionRequested actualToUserResult = actualV4ConnectionRequested.toUser(toUser);

    // Assert
    assertEquals("class V4ConnectionRequested {\n" + "    toUser: class V4User {\n" + "        userId: null\n"
        + "        firstName: null\n" + "        lastName: null\n" + "        displayName: null\n"
        + "        email: null\n" + "        username: null\n" + "    }\n" + "}", actualToStringResult);
    assertSame(actualV4ConnectionRequested, actualToUserResult);
    assertSame(toUser, actualV4ConnectionRequested.getToUser());
  }
}
