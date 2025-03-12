package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MembershipDataDiffblueTest {
  /**
   * Test {@link MembershipData#equals(Object)}, and {@link MembershipData#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link MembershipData#equals(Object)}
   *   <li>{@link MembershipData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MembershipData.equals(Object)", "int MembershipData.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MembershipData membershipData = new MembershipData();
    MembershipData membershipData2 = new MembershipData();

    // Act and Assert
    assertEquals(membershipData, membershipData2);
    int expectedHashCodeResult = membershipData.hashCode();
    assertEquals(expectedHashCodeResult, membershipData2.hashCode());
  }

  /**
   * Test {@link MembershipData#equals(Object)}, and {@link MembershipData#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link MembershipData#equals(Object)}
   *   <li>{@link MembershipData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MembershipData.equals(Object)", "int MembershipData.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MembershipData membershipData = new MembershipData();

    // Act and Assert
    assertEquals(membershipData, membershipData);
    int expectedHashCodeResult = membershipData.hashCode();
    assertEquals(expectedHashCodeResult, membershipData.hashCode());
  }

  /**
   * Test {@link MembershipData#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MembershipData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MembershipData.equals(Object)", "int MembershipData.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MembershipData(), 1);
  }

  /**
   * Test {@link MembershipData#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MembershipData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MembershipData.equals(Object)", "int MembershipData.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    MembershipData membershipData = new MembershipData();
    membershipData.id(1L);

    // Act and Assert
    assertNotEquals(membershipData, new MembershipData());
  }

  /**
   * Test {@link MembershipData#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MembershipData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MembershipData.equals(Object)", "int MembershipData.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    MembershipData membershipData = new MembershipData();
    membershipData.userName("janedoe");

    // Act and Assert
    assertNotEquals(membershipData, new MembershipData());
  }

  /**
   * Test {@link MembershipData#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MembershipData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MembershipData.equals(Object)", "int MembershipData.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    MembershipData membershipData = new MembershipData();
    membershipData.firstName("Jane");

    // Act and Assert
    assertNotEquals(membershipData, new MembershipData());
  }

  /**
   * Test {@link MembershipData#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MembershipData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MembershipData.equals(Object)", "int MembershipData.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    MembershipData membershipData = new MembershipData();
    membershipData.lastName("Doe");

    // Act and Assert
    assertNotEquals(membershipData, new MembershipData());
  }

  /**
   * Test {@link MembershipData#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MembershipData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MembershipData.equals(Object)", "int MembershipData.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    MembershipData membershipData = new MembershipData();
    membershipData.emailAddress("42 Main St");

    // Act and Assert
    assertNotEquals(membershipData, new MembershipData());
  }

  /**
   * Test {@link MembershipData#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MembershipData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MembershipData.equals(Object)", "int MembershipData.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MembershipData(), null);
  }

  /**
   * Test {@link MembershipData#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MembershipData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MembershipData.equals(Object)", "int MembershipData.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MembershipData(), "Different type to MembershipData");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link MembershipData}
   *   <li>{@link MembershipData#emailAddress(String)}
   *   <li>{@link MembershipData#firstName(String)}
   *   <li>{@link MembershipData#id(Long)}
   *   <li>{@link MembershipData#lastName(String)}
   *   <li>{@link MembershipData#setEmailAddress(String)}
   *   <li>{@link MembershipData#setFirstName(String)}
   *   <li>{@link MembershipData#setId(Long)}
   *   <li>{@link MembershipData#setLastName(String)}
   *   <li>{@link MembershipData#setUserName(String)}
   *   <li>{@link MembershipData#userName(String)}
   *   <li>{@link MembershipData#toString()}
   *   <li>{@link MembershipData#getEmailAddress()}
   *   <li>{@link MembershipData#getFirstName()}
   *   <li>{@link MembershipData#getId()}
   *   <li>{@link MembershipData#getLastName()}
   *   <li>{@link MembershipData#getUserName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void MembershipData.<init>()", "MembershipData MembershipData.emailAddress(String)",
      "MembershipData MembershipData.firstName(String)", "String MembershipData.getEmailAddress()",
      "String MembershipData.getFirstName()", "Long MembershipData.getId()", "String MembershipData.getLastName()",
      "String MembershipData.getUserName()", "MembershipData MembershipData.id(Long)",
      "MembershipData MembershipData.lastName(String)", "void MembershipData.setEmailAddress(String)",
      "void MembershipData.setFirstName(String)", "void MembershipData.setId(Long)",
      "void MembershipData.setLastName(String)", "void MembershipData.setUserName(String)",
      "String MembershipData.toString()", "MembershipData MembershipData.userName(String)"})
  void testGettersAndSetters() {
    // Arrange and Act
    MembershipData actualMembershipData = new MembershipData();
    MembershipData actualEmailAddressResult = actualMembershipData.emailAddress("42 Main St");
    MembershipData actualFirstNameResult = actualMembershipData.firstName("Jane");
    MembershipData actualIdResult = actualMembershipData.id(1L);
    MembershipData actualLastNameResult = actualMembershipData.lastName("Doe");
    actualMembershipData.setEmailAddress("42 Main St");
    actualMembershipData.setFirstName("Jane");
    actualMembershipData.setId(1L);
    actualMembershipData.setLastName("Doe");
    actualMembershipData.setUserName("janedoe");
    MembershipData actualUserNameResult = actualMembershipData.userName("janedoe");
    String actualToStringResult = actualMembershipData.toString();
    String actualEmailAddress = actualMembershipData.getEmailAddress();
    String actualFirstName = actualMembershipData.getFirstName();
    Long actualId = actualMembershipData.getId();
    String actualLastName = actualMembershipData.getLastName();

    // Assert
    assertEquals("42 Main St", actualEmailAddress);
    assertEquals("Doe", actualLastName);
    assertEquals("Jane", actualFirstName);
    assertEquals("class MembershipData {\n" + "    id: 1\n" + "    userName: janedoe\n" + "    firstName: Jane\n"
        + "    lastName: Doe\n" + "    emailAddress: 42 Main St\n" + "}", actualToStringResult);
    assertEquals("janedoe", actualMembershipData.getUserName());
    assertEquals(1L, actualId.longValue());
    assertSame(actualMembershipData, actualEmailAddressResult);
    assertSame(actualMembershipData, actualFirstNameResult);
    assertSame(actualMembershipData, actualIdResult);
    assertSame(actualMembershipData, actualLastNameResult);
    assertSame(actualMembershipData, actualUserNameResult);
  }
}
