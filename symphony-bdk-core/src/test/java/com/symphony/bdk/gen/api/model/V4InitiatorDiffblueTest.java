package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V4InitiatorDiffblueTest {
  /**
   * Test {@link V4Initiator#equals(Object)}, and {@link V4Initiator#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4Initiator#equals(Object)}
   *   <li>{@link V4Initiator#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Initiator.equals(Object)", "int V4Initiator.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4Initiator v4Initiator = new V4Initiator();
    V4Initiator v4Initiator2 = new V4Initiator();

    // Act and Assert
    assertEquals(v4Initiator, v4Initiator2);
    assertEquals(v4Initiator.hashCode(), v4Initiator2.hashCode());
  }

  /**
   * Test {@link V4Initiator#equals(Object)}, and {@link V4Initiator#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4Initiator#equals(Object)}
   *   <li>{@link V4Initiator#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Initiator.equals(Object)", "int V4Initiator.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4Initiator v4Initiator = new V4Initiator();

    // Act and Assert
    assertEquals(v4Initiator, v4Initiator);
    int expectedHashCodeResult = v4Initiator.hashCode();
    assertEquals(expectedHashCodeResult, v4Initiator.hashCode());
  }

  /**
   * Test {@link V4Initiator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Initiator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Initiator.equals(Object)", "int V4Initiator.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4Initiator(), null);
  }

  /**
   * Test {@link V4Initiator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Initiator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Initiator.equals(Object)", "int V4Initiator.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4Initiator(), "Different type to V4Initiator");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V4Initiator}
   *   <li>{@link V4Initiator#setUser(V4User)}
   *   <li>{@link V4Initiator#user(V4User)}
   *   <li>{@link V4Initiator#toString()}
   *   <li>{@link V4Initiator#getUser()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V4Initiator.<init>()",
    "V4User V4Initiator.getUser()",
    "void V4Initiator.setUser(V4User)",
    "String V4Initiator.toString()",
    "V4Initiator V4Initiator.user(V4User)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V4Initiator actualV4Initiator = new V4Initiator();
    actualV4Initiator.setUser(new V4User());
    V4User user = new V4User();
    V4Initiator actualUserResult = actualV4Initiator.user(user);
    String actualToStringResult = actualV4Initiator.toString();
    V4User actualUser = actualV4Initiator.getUser();

    // Assert
    assertEquals(
        "class V4Initiator {\n"
            + "    user: class V4User {\n"
            + "        userId: null\n"
            + "        firstName: null\n"
            + "        lastName: null\n"
            + "        displayName: null\n"
            + "        email: null\n"
            + "        username: null\n"
            + "    }\n"
            + "}",
        actualToStringResult);
    assertSame(actualV4Initiator, actualUserResult);
    assertSame(user, actualUser);
  }
}
