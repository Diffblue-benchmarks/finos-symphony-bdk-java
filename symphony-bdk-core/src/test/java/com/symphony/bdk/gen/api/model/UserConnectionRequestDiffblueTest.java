package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserConnectionRequestDiffblueTest {
  /**
   * Test {@link UserConnectionRequest#equals(Object)}, and {@link UserConnectionRequest#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserConnectionRequest#equals(Object)}
   *   <li>{@link UserConnectionRequest#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserConnectionRequest.equals(Object)", "int UserConnectionRequest.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserConnectionRequest userConnectionRequest = new UserConnectionRequest();
    UserConnectionRequest userConnectionRequest2 = new UserConnectionRequest();

    // Act and Assert
    assertEquals(userConnectionRequest, userConnectionRequest2);
    int expectedHashCodeResult = userConnectionRequest.hashCode();
    assertEquals(expectedHashCodeResult, userConnectionRequest2.hashCode());
  }

  /**
   * Test {@link UserConnectionRequest#equals(Object)}, and {@link UserConnectionRequest#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserConnectionRequest#equals(Object)}
   *   <li>{@link UserConnectionRequest#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserConnectionRequest.equals(Object)", "int UserConnectionRequest.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserConnectionRequest userConnectionRequest = new UserConnectionRequest();

    // Act and Assert
    assertEquals(userConnectionRequest, userConnectionRequest);
    int expectedHashCodeResult = userConnectionRequest.hashCode();
    assertEquals(expectedHashCodeResult, userConnectionRequest.hashCode());
  }

  /**
   * Test {@link UserConnectionRequest#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserConnectionRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserConnectionRequest.equals(Object)", "int UserConnectionRequest.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserConnectionRequest(), null);
  }

  /**
   * Test {@link UserConnectionRequest#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserConnectionRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserConnectionRequest.equals(Object)", "int UserConnectionRequest.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserConnectionRequest(), null);
  }

  /**
   * Test {@link UserConnectionRequest#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserConnectionRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserConnectionRequest.equals(Object)", "int UserConnectionRequest.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserConnectionRequest(), "Different type to UserConnectionRequest");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link UserConnectionRequest}
   *   <li>{@link UserConnectionRequest#setUserId(Long)}
   *   <li>{@link UserConnectionRequest#userId(Long)}
   *   <li>{@link UserConnectionRequest#toString()}
   *   <li>{@link UserConnectionRequest#getUserId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void UserConnectionRequest.<init>()", "Long UserConnectionRequest.getUserId()",
      "void UserConnectionRequest.setUserId(Long)", "String UserConnectionRequest.toString()",
      "UserConnectionRequest UserConnectionRequest.userId(Long)"})
  void testGettersAndSetters() {
    // Arrange and Act
    UserConnectionRequest actualUserConnectionRequest = new UserConnectionRequest();
    actualUserConnectionRequest.setUserId(1L);
    UserConnectionRequest actualUserIdResult = actualUserConnectionRequest.userId(1L);
    String actualToStringResult = actualUserConnectionRequest.toString();

    // Assert
    assertEquals("class UserConnectionRequest {\n    userId: 1\n}", actualToStringResult);
    assertEquals(1L, actualUserConnectionRequest.getUserId().longValue());
    assertSame(actualUserConnectionRequest, actualUserIdResult);
  }
}
