package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V4UserDiffblueTest {
  /**
   * Test {@link V4User#equals(Object)}, and {@link V4User#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4User#equals(Object)}
   *   <li>{@link V4User#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4User.equals(Object)", "int V4User.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4User v4User = new V4User();
    V4User v4User2 = new V4User();

    // Act and Assert
    assertEquals(v4User, v4User2);
    int expectedHashCodeResult = v4User.hashCode();
    assertEquals(expectedHashCodeResult, v4User2.hashCode());
  }

  /**
   * Test {@link V4User#equals(Object)}, and {@link V4User#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4User#equals(Object)}
   *   <li>{@link V4User#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4User.equals(Object)", "int V4User.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4User v4User = new V4User();

    // Act and Assert
    assertEquals(v4User, v4User);
    int expectedHashCodeResult = v4User.hashCode();
    assertEquals(expectedHashCodeResult, v4User.hashCode());
  }

  /**
   * Test {@link V4User#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4User#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4User.equals(Object)", "int V4User.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4User(), 1);
  }

  /**
   * Test {@link V4User#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4User#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4User.equals(Object)", "int V4User.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V4User v4User = new V4User();
    v4User.userId(1L);

    // Act and Assert
    assertNotEquals(v4User, new V4User());
  }

  /**
   * Test {@link V4User#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4User#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4User.equals(Object)", "int V4User.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V4User v4User = new V4User();
    v4User.firstName("Jane");

    // Act and Assert
    assertNotEquals(v4User, new V4User());
  }

  /**
   * Test {@link V4User#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4User#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4User.equals(Object)", "int V4User.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V4User v4User = new V4User();
    v4User.lastName("Doe");

    // Act and Assert
    assertNotEquals(v4User, new V4User());
  }

  /**
   * Test {@link V4User#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4User#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4User.equals(Object)", "int V4User.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V4User v4User = new V4User();
    v4User.displayName("Display Name");

    // Act and Assert
    assertNotEquals(v4User, new V4User());
  }

  /**
   * Test {@link V4User#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4User#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4User.equals(Object)", "int V4User.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    V4User v4User = new V4User();
    v4User.email("jane.doe@example.org");

    // Act and Assert
    assertNotEquals(v4User, new V4User());
  }

  /**
   * Test {@link V4User#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4User#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4User.equals(Object)", "int V4User.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    V4User v4User = new V4User();
    v4User.username("janedoe");

    // Act and Assert
    assertNotEquals(v4User, new V4User());
  }

  /**
   * Test {@link V4User#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4User#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4User.equals(Object)", "int V4User.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4User(), null);
  }

  /**
   * Test {@link V4User#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4User#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4User.equals(Object)", "int V4User.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4User(), "Different type to V4User");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V4User}
   *   <li>{@link V4User#displayName(String)}
   *   <li>{@link V4User#email(String)}
   *   <li>{@link V4User#firstName(String)}
   *   <li>{@link V4User#lastName(String)}
   *   <li>{@link V4User#setDisplayName(String)}
   *   <li>{@link V4User#setEmail(String)}
   *   <li>{@link V4User#setFirstName(String)}
   *   <li>{@link V4User#setLastName(String)}
   *   <li>{@link V4User#setUserId(Long)}
   *   <li>{@link V4User#setUsername(String)}
   *   <li>{@link V4User#userId(Long)}
   *   <li>{@link V4User#username(String)}
   *   <li>{@link V4User#toString()}
   *   <li>{@link V4User#getDisplayName()}
   *   <li>{@link V4User#getEmail()}
   *   <li>{@link V4User#getFirstName()}
   *   <li>{@link V4User#getLastName()}
   *   <li>{@link V4User#getUserId()}
   *   <li>{@link V4User#getUsername()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V4User.<init>()", "V4User V4User.displayName(String)", "V4User V4User.email(String)",
      "V4User V4User.firstName(String)", "String V4User.getDisplayName()", "String V4User.getEmail()",
      "String V4User.getFirstName()", "String V4User.getLastName()", "Long V4User.getUserId()",
      "String V4User.getUsername()", "V4User V4User.lastName(String)", "void V4User.setDisplayName(String)",
      "void V4User.setEmail(String)", "void V4User.setFirstName(String)", "void V4User.setLastName(String)",
      "void V4User.setUserId(Long)", "void V4User.setUsername(String)", "String V4User.toString()",
      "V4User V4User.userId(Long)", "V4User V4User.username(String)"})
  void testGettersAndSetters() {
    // Arrange and Act
    V4User actualV4User = new V4User();
    V4User actualDisplayNameResult = actualV4User.displayName("Display Name");
    V4User actualEmailResult = actualV4User.email("jane.doe@example.org");
    V4User actualFirstNameResult = actualV4User.firstName("Jane");
    V4User actualLastNameResult = actualV4User.lastName("Doe");
    actualV4User.setDisplayName("Display Name");
    actualV4User.setEmail("jane.doe@example.org");
    actualV4User.setFirstName("Jane");
    actualV4User.setLastName("Doe");
    actualV4User.setUserId(1L);
    actualV4User.setUsername("janedoe");
    V4User actualUserIdResult = actualV4User.userId(1L);
    V4User actualUsernameResult = actualV4User.username("janedoe");
    String actualToStringResult = actualV4User.toString();
    String actualDisplayName = actualV4User.getDisplayName();
    String actualEmail = actualV4User.getEmail();
    String actualFirstName = actualV4User.getFirstName();
    String actualLastName = actualV4User.getLastName();
    Long actualUserId = actualV4User.getUserId();

    // Assert
    assertEquals("Display Name", actualDisplayName);
    assertEquals("Doe", actualLastName);
    assertEquals("Jane", actualFirstName);
    assertEquals(
        "class V4User {\n" + "    userId: 1\n" + "    firstName: Jane\n" + "    lastName: Doe\n"
            + "    displayName: Display Name\n" + "    email: jane.doe@example.org\n" + "    username: janedoe\n" + "}",
        actualToStringResult);
    assertEquals("jane.doe@example.org", actualEmail);
    assertEquals("janedoe", actualV4User.getUsername());
    assertEquals(1L, actualUserId.longValue());
    assertSame(actualV4User, actualDisplayNameResult);
    assertSame(actualV4User, actualEmailResult);
    assertSame(actualV4User, actualFirstNameResult);
    assertSame(actualV4User, actualLastNameResult);
    assertSame(actualV4User, actualUserIdResult);
    assertSame(actualV4User, actualUsernameResult);
  }
}
