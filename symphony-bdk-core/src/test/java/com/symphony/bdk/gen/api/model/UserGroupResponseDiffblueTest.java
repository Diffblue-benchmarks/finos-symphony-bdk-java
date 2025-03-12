package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserGroupResponseDiffblueTest {
  /**
   * Test {@link UserGroupResponse#equals(Object)}, and {@link UserGroupResponse#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserGroupResponse#equals(Object)}
   *   <li>{@link UserGroupResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupResponse.equals(Object)", "int UserGroupResponse.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserGroupResponse userGroupResponse = new UserGroupResponse();
    UserGroupResponse userGroupResponse2 = new UserGroupResponse();

    // Act and Assert
    assertEquals(userGroupResponse, userGroupResponse2);
    int expectedHashCodeResult = userGroupResponse.hashCode();
    assertEquals(expectedHashCodeResult, userGroupResponse2.hashCode());
  }

  /**
   * Test {@link UserGroupResponse#equals(Object)}, and {@link UserGroupResponse#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserGroupResponse#equals(Object)}
   *   <li>{@link UserGroupResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupResponse.equals(Object)", "int UserGroupResponse.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserGroupResponse userGroupResponse = new UserGroupResponse();

    // Act and Assert
    assertEquals(userGroupResponse, userGroupResponse);
    int expectedHashCodeResult = userGroupResponse.hashCode();
    assertEquals(expectedHashCodeResult, userGroupResponse.hashCode());
  }

  /**
   * Test {@link UserGroupResponse#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupResponse.equals(Object)", "int UserGroupResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserGroupResponse(), 1);
  }

  /**
   * Test {@link UserGroupResponse#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupResponse.equals(Object)", "int UserGroupResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserGroupResponse userGroupResponse = new UserGroupResponse();
    userGroupResponse.id("42");

    // Act and Assert
    assertNotEquals(userGroupResponse, new UserGroupResponse());
  }

  /**
   * Test {@link UserGroupResponse#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupResponse.equals(Object)", "int UserGroupResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UserGroupResponse userGroupResponse = new UserGroupResponse();
    userGroupResponse.name("Name");

    // Act and Assert
    assertNotEquals(userGroupResponse, new UserGroupResponse());
  }

  /**
   * Test {@link UserGroupResponse#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupResponse.equals(Object)", "int UserGroupResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    UserGroupResponse userGroupResponse = new UserGroupResponse();
    userGroupResponse.area("Area");

    // Act and Assert
    assertNotEquals(userGroupResponse, new UserGroupResponse());
  }

  /**
   * Test {@link UserGroupResponse#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupResponse.equals(Object)", "int UserGroupResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    UserGroupResponse userGroupResponse = new UserGroupResponse();
    userGroupResponse.description("The characteristics of someone or something");

    // Act and Assert
    assertNotEquals(userGroupResponse, new UserGroupResponse());
  }

  /**
   * Test {@link UserGroupResponse#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupResponse.equals(Object)", "int UserGroupResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    UserGroupResponse userGroupResponse = new UserGroupResponse();
    userGroupResponse.type("Type");

    // Act and Assert
    assertNotEquals(userGroupResponse, new UserGroupResponse());
  }

  /**
   * Test {@link UserGroupResponse#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupResponse.equals(Object)", "int UserGroupResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    UserGroupResponse userGroupResponse = new UserGroupResponse();
    userGroupResponse.active(true);

    // Act and Assert
    assertNotEquals(userGroupResponse, new UserGroupResponse());
  }

  /**
   * Test {@link UserGroupResponse#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupResponse.equals(Object)", "int UserGroupResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    UserGroupResponse userGroupResponse = new UserGroupResponse();
    userGroupResponse.createdDate(1L);

    // Act and Assert
    assertNotEquals(userGroupResponse, new UserGroupResponse());
  }

  /**
   * Test {@link UserGroupResponse#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupResponse.equals(Object)", "int UserGroupResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    UserGroupResponse userGroupResponse = new UserGroupResponse();
    userGroupResponse.modifiedDate(1L);

    // Act and Assert
    assertNotEquals(userGroupResponse, new UserGroupResponse());
  }

  /**
   * Test {@link UserGroupResponse#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupResponse.equals(Object)", "int UserGroupResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual10() {
    // Arrange
    UserGroupResponse userGroupResponse = new UserGroupResponse();
    userGroupResponse.memberCount(3L);

    // Act and Assert
    assertNotEquals(userGroupResponse, new UserGroupResponse());
  }

  /**
   * Test {@link UserGroupResponse#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupResponse.equals(Object)", "int UserGroupResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual11() {
    // Arrange
    UserGroupResponse userGroupResponse = new UserGroupResponse();
    userGroupResponse.assigneeCount(3L);

    // Act and Assert
    assertNotEquals(userGroupResponse, new UserGroupResponse());
  }

  /**
   * Test {@link UserGroupResponse#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupResponse.equals(Object)", "int UserGroupResponse.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserGroupResponse(), null);
  }

  /**
   * Test {@link UserGroupResponse#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupResponse.equals(Object)", "int UserGroupResponse.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserGroupResponse(), "Different type to UserGroupResponse");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link UserGroupResponse}
   *   <li>{@link UserGroupResponse#active(Boolean)}
   *   <li>{@link UserGroupResponse#area(String)}
   *   <li>{@link UserGroupResponse#assigneeCount(Long)}
   *   <li>{@link UserGroupResponse#createdDate(Long)}
   *   <li>{@link UserGroupResponse#description(String)}
   *   <li>{@link UserGroupResponse#id(String)}
   *   <li>{@link UserGroupResponse#memberCount(Long)}
   *   <li>{@link UserGroupResponse#modifiedDate(Long)}
   *   <li>{@link UserGroupResponse#name(String)}
   *   <li>{@link UserGroupResponse#setActive(Boolean)}
   *   <li>{@link UserGroupResponse#setArea(String)}
   *   <li>{@link UserGroupResponse#setAssigneeCount(Long)}
   *   <li>{@link UserGroupResponse#setCreatedDate(Long)}
   *   <li>{@link UserGroupResponse#setDescription(String)}
   *   <li>{@link UserGroupResponse#setId(String)}
   *   <li>{@link UserGroupResponse#setMemberCount(Long)}
   *   <li>{@link UserGroupResponse#setModifiedDate(Long)}
   *   <li>{@link UserGroupResponse#setName(String)}
   *   <li>{@link UserGroupResponse#setType(String)}
   *   <li>{@link UserGroupResponse#type(String)}
   *   <li>{@link UserGroupResponse#toString()}
   *   <li>{@link UserGroupResponse#getActive()}
   *   <li>{@link UserGroupResponse#getArea()}
   *   <li>{@link UserGroupResponse#getAssigneeCount()}
   *   <li>{@link UserGroupResponse#getCreatedDate()}
   *   <li>{@link UserGroupResponse#getDescription()}
   *   <li>{@link UserGroupResponse#getId()}
   *   <li>{@link UserGroupResponse#getMemberCount()}
   *   <li>{@link UserGroupResponse#getModifiedDate()}
   *   <li>{@link UserGroupResponse#getName()}
   *   <li>{@link UserGroupResponse#getType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void UserGroupResponse.<init>()", "UserGroupResponse UserGroupResponse.active(Boolean)",
      "UserGroupResponse UserGroupResponse.area(String)", "UserGroupResponse UserGroupResponse.assigneeCount(Long)",
      "UserGroupResponse UserGroupResponse.createdDate(Long)",
      "UserGroupResponse UserGroupResponse.description(String)", "Boolean UserGroupResponse.getActive()",
      "String UserGroupResponse.getArea()", "Long UserGroupResponse.getAssigneeCount()",
      "Long UserGroupResponse.getCreatedDate()", "String UserGroupResponse.getDescription()",
      "String UserGroupResponse.getId()", "Long UserGroupResponse.getMemberCount()",
      "Long UserGroupResponse.getModifiedDate()", "String UserGroupResponse.getName()",
      "String UserGroupResponse.getType()", "UserGroupResponse UserGroupResponse.id(String)",
      "UserGroupResponse UserGroupResponse.memberCount(Long)", "UserGroupResponse UserGroupResponse.modifiedDate(Long)",
      "UserGroupResponse UserGroupResponse.name(String)", "void UserGroupResponse.setActive(Boolean)",
      "void UserGroupResponse.setArea(String)", "void UserGroupResponse.setAssigneeCount(Long)",
      "void UserGroupResponse.setCreatedDate(Long)", "void UserGroupResponse.setDescription(String)",
      "void UserGroupResponse.setId(String)", "void UserGroupResponse.setMemberCount(Long)",
      "void UserGroupResponse.setModifiedDate(Long)", "void UserGroupResponse.setName(String)",
      "void UserGroupResponse.setType(String)", "String UserGroupResponse.toString()",
      "UserGroupResponse UserGroupResponse.type(String)"})
  void testGettersAndSetters() {
    // Arrange and Act
    UserGroupResponse actualUserGroupResponse = new UserGroupResponse();
    UserGroupResponse actualActiveResult = actualUserGroupResponse.active(true);
    UserGroupResponse actualAreaResult = actualUserGroupResponse.area("Area");
    UserGroupResponse actualAssigneeCountResult = actualUserGroupResponse.assigneeCount(3L);
    UserGroupResponse actualCreatedDateResult = actualUserGroupResponse.createdDate(1L);
    UserGroupResponse actualDescriptionResult = actualUserGroupResponse
        .description("The characteristics of someone or something");
    UserGroupResponse actualIdResult = actualUserGroupResponse.id("42");
    UserGroupResponse actualMemberCountResult = actualUserGroupResponse.memberCount(3L);
    UserGroupResponse actualModifiedDateResult = actualUserGroupResponse.modifiedDate(1L);
    UserGroupResponse actualNameResult = actualUserGroupResponse.name("Name");
    actualUserGroupResponse.setActive(true);
    actualUserGroupResponse.setArea("Area");
    actualUserGroupResponse.setAssigneeCount(3L);
    actualUserGroupResponse.setCreatedDate(1L);
    actualUserGroupResponse.setDescription("The characteristics of someone or something");
    actualUserGroupResponse.setId("42");
    actualUserGroupResponse.setMemberCount(3L);
    actualUserGroupResponse.setModifiedDate(1L);
    actualUserGroupResponse.setName("Name");
    actualUserGroupResponse.setType("Type");
    UserGroupResponse actualTypeResult = actualUserGroupResponse.type("Type");
    String actualToStringResult = actualUserGroupResponse.toString();
    Boolean actualActive = actualUserGroupResponse.getActive();
    String actualArea = actualUserGroupResponse.getArea();
    Long actualAssigneeCount = actualUserGroupResponse.getAssigneeCount();
    Long actualCreatedDate = actualUserGroupResponse.getCreatedDate();
    String actualDescription = actualUserGroupResponse.getDescription();
    String actualId = actualUserGroupResponse.getId();
    Long actualMemberCount = actualUserGroupResponse.getMemberCount();
    Long actualModifiedDate = actualUserGroupResponse.getModifiedDate();
    String actualName = actualUserGroupResponse.getName();

    // Assert
    assertEquals("42", actualId);
    assertEquals("Area", actualArea);
    assertEquals("Name", actualName);
    assertEquals("The characteristics of someone or something", actualDescription);
    assertEquals("Type", actualUserGroupResponse.getType());
    assertEquals("class UserGroupResponse {\n" + "    id: 42\n" + "    name: Name\n" + "    area: Area\n"
        + "    description: The characteristics of someone or something\n" + "    type: Type\n" + "    active: true\n"
        + "    createdDate: 1\n" + "    modifiedDate: 1\n" + "    memberCount: 3\n" + "    assigneeCount: 3\n" + "}",
        actualToStringResult);
    assertEquals(1L, actualCreatedDate.longValue());
    assertEquals(1L, actualModifiedDate.longValue());
    assertEquals(3L, actualAssigneeCount.longValue());
    assertEquals(3L, actualMemberCount.longValue());
    assertTrue(actualActive);
    assertSame(actualUserGroupResponse, actualActiveResult);
    assertSame(actualUserGroupResponse, actualAreaResult);
    assertSame(actualUserGroupResponse, actualAssigneeCountResult);
    assertSame(actualUserGroupResponse, actualCreatedDateResult);
    assertSame(actualUserGroupResponse, actualDescriptionResult);
    assertSame(actualUserGroupResponse, actualIdResult);
    assertSame(actualUserGroupResponse, actualMemberCountResult);
    assertSame(actualUserGroupResponse, actualModifiedDateResult);
    assertSame(actualUserGroupResponse, actualNameResult);
    assertSame(actualUserGroupResponse, actualTypeResult);
  }
}
