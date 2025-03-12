package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserLeftRoomMessageAllOfDiffblueTest {
  /**
   * Test {@link UserLeftRoomMessageAllOf#equals(Object)}, and {@link UserLeftRoomMessageAllOf#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserLeftRoomMessageAllOf#equals(Object)}
   *   <li>{@link UserLeftRoomMessageAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserLeftRoomMessageAllOf.equals(Object)", "int UserLeftRoomMessageAllOf.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserLeftRoomMessageAllOf userLeftRoomMessageAllOf = new UserLeftRoomMessageAllOf();
    UserLeftRoomMessageAllOf userLeftRoomMessageAllOf2 = new UserLeftRoomMessageAllOf();

    // Act and Assert
    assertEquals(userLeftRoomMessageAllOf, userLeftRoomMessageAllOf2);
    int expectedHashCodeResult = userLeftRoomMessageAllOf.hashCode();
    assertEquals(expectedHashCodeResult, userLeftRoomMessageAllOf2.hashCode());
  }

  /**
   * Test {@link UserLeftRoomMessageAllOf#equals(Object)}, and {@link UserLeftRoomMessageAllOf#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserLeftRoomMessageAllOf#equals(Object)}
   *   <li>{@link UserLeftRoomMessageAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserLeftRoomMessageAllOf.equals(Object)", "int UserLeftRoomMessageAllOf.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserLeftRoomMessageAllOf userLeftRoomMessageAllOf = new UserLeftRoomMessageAllOf();

    // Act and Assert
    assertEquals(userLeftRoomMessageAllOf, userLeftRoomMessageAllOf);
    int expectedHashCodeResult = userLeftRoomMessageAllOf.hashCode();
    assertEquals(expectedHashCodeResult, userLeftRoomMessageAllOf.hashCode());
  }

  /**
   * Test {@link UserLeftRoomMessageAllOf#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserLeftRoomMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserLeftRoomMessageAllOf.equals(Object)", "int UserLeftRoomMessageAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserLeftRoomMessageAllOf(), 1);
  }

  /**
   * Test {@link UserLeftRoomMessageAllOf#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserLeftRoomMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserLeftRoomMessageAllOf.equals(Object)", "int UserLeftRoomMessageAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserLeftRoomMessageAllOf userLeftRoomMessageAllOf = new UserLeftRoomMessageAllOf();
    userLeftRoomMessageAllOf.setRemovedByUserId(1L);

    // Act and Assert
    assertNotEquals(userLeftRoomMessageAllOf, new UserLeftRoomMessageAllOf());
  }

  /**
   * Test {@link UserLeftRoomMessageAllOf#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserLeftRoomMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserLeftRoomMessageAllOf.equals(Object)", "int UserLeftRoomMessageAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UserLeftRoomMessageAllOf userLeftRoomMessageAllOf = new UserLeftRoomMessageAllOf();
    userLeftRoomMessageAllOf.memberLeftUserId(1L);

    // Act and Assert
    assertNotEquals(userLeftRoomMessageAllOf, new UserLeftRoomMessageAllOf());
  }

  /**
   * Test {@link UserLeftRoomMessageAllOf#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserLeftRoomMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserLeftRoomMessageAllOf.equals(Object)", "int UserLeftRoomMessageAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    UserLeftRoomMessageAllOf userLeftRoomMessageAllOf = new UserLeftRoomMessageAllOf();
    userLeftRoomMessageAllOf.informationBarrierRemediation(true);

    // Act and Assert
    assertNotEquals(userLeftRoomMessageAllOf, new UserLeftRoomMessageAllOf());
  }

  /**
   * Test {@link UserLeftRoomMessageAllOf#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserLeftRoomMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserLeftRoomMessageAllOf.equals(Object)", "int UserLeftRoomMessageAllOf.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserLeftRoomMessageAllOf(), null);
  }

  /**
   * Test {@link UserLeftRoomMessageAllOf#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserLeftRoomMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserLeftRoomMessageAllOf.equals(Object)", "int UserLeftRoomMessageAllOf.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserLeftRoomMessageAllOf(), "Different type to UserLeftRoomMessageAllOf");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link UserLeftRoomMessageAllOf}
   *   <li>{@link UserLeftRoomMessageAllOf#informationBarrierRemediation(Boolean)}
   *   <li>{@link UserLeftRoomMessageAllOf#memberLeftUserId(Long)}
   *   <li>{@link UserLeftRoomMessageAllOf#setInformationBarrierRemediation(Boolean)}
   *   <li>{@link UserLeftRoomMessageAllOf#setMemberLeftUserId(Long)}
   *   <li>{@link UserLeftRoomMessageAllOf#setRemovedByUserId(Long)}
   *   <li>{@link UserLeftRoomMessageAllOf#removedByUserId(Long)}
   *   <li>{@link UserLeftRoomMessageAllOf#toString()}
   *   <li>{@link UserLeftRoomMessageAllOf#getInformationBarrierRemediation()}
   *   <li>{@link UserLeftRoomMessageAllOf#getMemberLeftUserId()}
   *   <li>{@link UserLeftRoomMessageAllOf#getRemovedByUserId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void UserLeftRoomMessageAllOf.<init>()",
      "Boolean UserLeftRoomMessageAllOf.getInformationBarrierRemediation()",
      "Long UserLeftRoomMessageAllOf.getMemberLeftUserId()", "Long UserLeftRoomMessageAllOf.getRemovedByUserId()",
      "UserLeftRoomMessageAllOf UserLeftRoomMessageAllOf.informationBarrierRemediation(Boolean)",
      "UserLeftRoomMessageAllOf UserLeftRoomMessageAllOf.memberLeftUserId(Long)",
      "UserLeftRoomMessageAllOf UserLeftRoomMessageAllOf.removedByUserId(Long)",
      "void UserLeftRoomMessageAllOf.setInformationBarrierRemediation(Boolean)",
      "void UserLeftRoomMessageAllOf.setMemberLeftUserId(Long)",
      "void UserLeftRoomMessageAllOf.setRemovedByUserId(Long)", "String UserLeftRoomMessageAllOf.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    UserLeftRoomMessageAllOf actualUserLeftRoomMessageAllOf = new UserLeftRoomMessageAllOf();
    UserLeftRoomMessageAllOf actualInformationBarrierRemediationResult = actualUserLeftRoomMessageAllOf
        .informationBarrierRemediation(true);
    UserLeftRoomMessageAllOf actualMemberLeftUserIdResult = actualUserLeftRoomMessageAllOf.memberLeftUserId(1L);
    actualUserLeftRoomMessageAllOf.setInformationBarrierRemediation(true);
    actualUserLeftRoomMessageAllOf.setMemberLeftUserId(1L);
    actualUserLeftRoomMessageAllOf.setRemovedByUserId(1L);
    UserLeftRoomMessageAllOf actualRemovedByUserIdResult = actualUserLeftRoomMessageAllOf.removedByUserId(1L);
    String actualToStringResult = actualUserLeftRoomMessageAllOf.toString();
    Boolean actualInformationBarrierRemediation = actualUserLeftRoomMessageAllOf.getInformationBarrierRemediation();
    Long actualMemberLeftUserId = actualUserLeftRoomMessageAllOf.getMemberLeftUserId();
    Long actualRemovedByUserId = actualUserLeftRoomMessageAllOf.getRemovedByUserId();

    // Assert
    assertEquals("class UserLeftRoomMessageAllOf {\n" + "    removedByUserId: 1\n" + "    memberLeftUserId: 1\n"
        + "    informationBarrierRemediation: true\n" + "}", actualToStringResult);
    assertEquals(1L, actualMemberLeftUserId.longValue());
    assertEquals(1L, actualRemovedByUserId.longValue());
    assertTrue(actualInformationBarrierRemediation);
    assertSame(actualUserLeftRoomMessageAllOf, actualInformationBarrierRemediationResult);
    assertSame(actualUserLeftRoomMessageAllOf, actualMemberLeftUserIdResult);
    assertSame(actualUserLeftRoomMessageAllOf, actualRemovedByUserIdResult);
  }
}
