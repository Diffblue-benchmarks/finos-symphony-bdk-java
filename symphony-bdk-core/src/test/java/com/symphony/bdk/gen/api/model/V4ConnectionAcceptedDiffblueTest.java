package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V4ConnectionAcceptedDiffblueTest {
  /**
   * Test {@link V4ConnectionAccepted#equals(Object)}, and {@link V4ConnectionAccepted#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4ConnectionAccepted#equals(Object)}
   *   <li>{@link V4ConnectionAccepted#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4ConnectionAccepted.equals(Object)", "int V4ConnectionAccepted.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4ConnectionAccepted v4ConnectionAccepted = new V4ConnectionAccepted();
    V4ConnectionAccepted v4ConnectionAccepted2 = new V4ConnectionAccepted();

    // Act and Assert
    assertEquals(v4ConnectionAccepted, v4ConnectionAccepted2);
    int expectedHashCodeResult = v4ConnectionAccepted.hashCode();
    assertEquals(expectedHashCodeResult, v4ConnectionAccepted2.hashCode());
  }

  /**
   * Test {@link V4ConnectionAccepted#equals(Object)}, and {@link V4ConnectionAccepted#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4ConnectionAccepted#equals(Object)}
   *   <li>{@link V4ConnectionAccepted#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4ConnectionAccepted.equals(Object)", "int V4ConnectionAccepted.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4ConnectionAccepted v4ConnectionAccepted = new V4ConnectionAccepted();

    // Act and Assert
    assertEquals(v4ConnectionAccepted, v4ConnectionAccepted);
    int expectedHashCodeResult = v4ConnectionAccepted.hashCode();
    assertEquals(expectedHashCodeResult, v4ConnectionAccepted.hashCode());
  }

  /**
   * Test {@link V4ConnectionAccepted#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4ConnectionAccepted#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4ConnectionAccepted.equals(Object)", "int V4ConnectionAccepted.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4ConnectionAccepted(), null);
  }

  /**
   * Test {@link V4ConnectionAccepted#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4ConnectionAccepted#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4ConnectionAccepted.equals(Object)", "int V4ConnectionAccepted.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4ConnectionAccepted(), null);
  }

  /**
   * Test {@link V4ConnectionAccepted#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4ConnectionAccepted#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4ConnectionAccepted.equals(Object)", "int V4ConnectionAccepted.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4ConnectionAccepted(), "Different type to V4ConnectionAccepted");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V4ConnectionAccepted}
   *   <li>{@link V4ConnectionAccepted#fromUser(V4User)}
   *   <li>{@link V4ConnectionAccepted#setFromUser(V4User)}
   *   <li>{@link V4ConnectionAccepted#toString()}
   *   <li>{@link V4ConnectionAccepted#getFromUser()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V4ConnectionAccepted.<init>()", "V4ConnectionAccepted V4ConnectionAccepted.fromUser(V4User)",
      "V4User V4ConnectionAccepted.getFromUser()", "void V4ConnectionAccepted.setFromUser(V4User)",
      "String V4ConnectionAccepted.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    V4ConnectionAccepted actualV4ConnectionAccepted = new V4ConnectionAccepted();
    V4ConnectionAccepted actualFromUserResult = actualV4ConnectionAccepted.fromUser(new V4User());
    V4User fromUser = new V4User();
    actualV4ConnectionAccepted.setFromUser(fromUser);
    String actualToStringResult = actualV4ConnectionAccepted.toString();

    // Assert
    assertEquals("class V4ConnectionAccepted {\n" + "    fromUser: class V4User {\n" + "        userId: null\n"
        + "        firstName: null\n" + "        lastName: null\n" + "        displayName: null\n"
        + "        email: null\n" + "        username: null\n" + "    }\n" + "}", actualToStringResult);
    assertSame(actualV4ConnectionAccepted, actualFromUserResult);
    assertSame(fromUser, actualV4ConnectionAccepted.getFromUser());
  }
}
