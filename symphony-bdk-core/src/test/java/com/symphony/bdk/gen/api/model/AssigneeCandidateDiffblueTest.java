package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AssigneeCandidateDiffblueTest {
  /**
   * Test {@link AssigneeCandidate#addRolesItem(String)}.
   *
   * <ul>
   *   <li>Given {@link AssigneeCandidate} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link AssigneeCandidate#addRolesItem(String)}
   */
  @Test
  @DisplayName("Test addRolesItem(String); given AssigneeCandidate (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AssigneeCandidate AssigneeCandidate.addRolesItem(String)"})
  void testAddRolesItem_givenAssigneeCandidate() {
    // Arrange
    AssigneeCandidate assigneeCandidate = new AssigneeCandidate();

    // Act
    AssigneeCandidate actualAddRolesItemResult = assigneeCandidate.addRolesItem("Roles Item");

    // Assert
    assertSame(assigneeCandidate, actualAddRolesItemResult);
  }

  /**
   * Test {@link AssigneeCandidate#addRolesItem(String)}.
   *
   * <ul>
   *   <li>Given {@link AssigneeCandidate} (default constructor) roles {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link AssigneeCandidate#addRolesItem(String)}
   */
  @Test
  @DisplayName(
      "Test addRolesItem(String); given AssigneeCandidate (default constructor) roles ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AssigneeCandidate AssigneeCandidate.addRolesItem(String)"})
  void testAddRolesItem_givenAssigneeCandidateRolesArrayList() {
    // Arrange
    AssigneeCandidate assigneeCandidate = new AssigneeCandidate();
    assigneeCandidate.roles(new ArrayList<>());

    // Act
    AssigneeCandidate actualAddRolesItemResult = assigneeCandidate.addRolesItem("Roles Item");

    // Assert
    assertSame(assigneeCandidate, actualAddRolesItemResult);
  }

  /**
   * Test {@link AssigneeCandidate#equals(Object)}, and {@link AssigneeCandidate#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AssigneeCandidate#equals(Object)}
   *   <li>{@link AssigneeCandidate#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AssigneeCandidate.equals(Object)",
    "int AssigneeCandidate.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AssigneeCandidate assigneeCandidate = new AssigneeCandidate();
    AssigneeCandidate assigneeCandidate2 = new AssigneeCandidate();

    // Act and Assert
    assertEquals(assigneeCandidate, assigneeCandidate2);
    assertEquals(assigneeCandidate.hashCode(), assigneeCandidate2.hashCode());
  }

  /**
   * Test {@link AssigneeCandidate#equals(Object)}, and {@link AssigneeCandidate#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AssigneeCandidate#equals(Object)}
   *   <li>{@link AssigneeCandidate#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AssigneeCandidate.equals(Object)",
    "int AssigneeCandidate.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AssigneeCandidate assigneeCandidate = new AssigneeCandidate();

    // Act and Assert
    assertEquals(assigneeCandidate, assigneeCandidate);
    int expectedHashCodeResult = assigneeCandidate.hashCode();
    assertEquals(expectedHashCodeResult, assigneeCandidate.hashCode());
  }

  /**
   * Test {@link AssigneeCandidate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AssigneeCandidate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AssigneeCandidate.equals(Object)",
    "int AssigneeCandidate.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    AssigneeCandidate assigneeCandidate = new AssigneeCandidate();
    assigneeCandidate.addRolesItem("Roles Item");

    // Act and Assert
    assertNotEquals(assigneeCandidate, new AssigneeCandidate());
  }

  /**
   * Test {@link AssigneeCandidate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AssigneeCandidate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AssigneeCandidate.equals(Object)",
    "int AssigneeCandidate.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    AssigneeCandidate assigneeCandidate = new AssigneeCandidate();
    assigneeCandidate.userId(1L);
    assigneeCandidate.addRolesItem("Roles Item");

    // Act and Assert
    assertNotEquals(assigneeCandidate, new AssigneeCandidate());
  }

  /**
   * Test {@link AssigneeCandidate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AssigneeCandidate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AssigneeCandidate.equals(Object)",
    "int AssigneeCandidate.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    AssigneeCandidate assigneeCandidate = new AssigneeCandidate();
    assigneeCandidate.username("janedoe");
    assigneeCandidate.addRolesItem("Roles Item");

    // Act and Assert
    assertNotEquals(assigneeCandidate, new AssigneeCandidate());
  }

  /**
   * Test {@link AssigneeCandidate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AssigneeCandidate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AssigneeCandidate.equals(Object)",
    "int AssigneeCandidate.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    AssigneeCandidate assigneeCandidate = new AssigneeCandidate();
    assigneeCandidate.firstName("Jane");
    assigneeCandidate.addRolesItem("Roles Item");

    // Act and Assert
    assertNotEquals(assigneeCandidate, new AssigneeCandidate());
  }

  /**
   * Test {@link AssigneeCandidate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AssigneeCandidate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AssigneeCandidate.equals(Object)",
    "int AssigneeCandidate.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    AssigneeCandidate assigneeCandidate = new AssigneeCandidate();
    assigneeCandidate.surname("Doe");
    assigneeCandidate.addRolesItem("Roles Item");

    // Act and Assert
    assertNotEquals(assigneeCandidate, new AssigneeCandidate());
  }

  /**
   * Test {@link AssigneeCandidate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AssigneeCandidate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AssigneeCandidate.equals(Object)",
    "int AssigneeCandidate.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    AssigneeCandidate assigneeCandidate = new AssigneeCandidate();
    assigneeCandidate.emailAddress("42 Main St");
    assigneeCandidate.addRolesItem("Roles Item");

    // Act and Assert
    assertNotEquals(assigneeCandidate, new AssigneeCandidate());
  }

  /**
   * Test {@link AssigneeCandidate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AssigneeCandidate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AssigneeCandidate.equals(Object)",
    "int AssigneeCandidate.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    AssigneeCandidate assigneeCandidate = new AssigneeCandidate();
    assigneeCandidate.canBeAssigned(true);
    assigneeCandidate.addRolesItem("Roles Item");

    // Act and Assert
    assertNotEquals(assigneeCandidate, new AssigneeCandidate());
  }

  /**
   * Test {@link AssigneeCandidate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AssigneeCandidate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AssigneeCandidate.equals(Object)",
    "int AssigneeCandidate.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AssigneeCandidate(), null);
  }

  /**
   * Test {@link AssigneeCandidate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AssigneeCandidate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AssigneeCandidate.equals(Object)",
    "int AssigneeCandidate.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AssigneeCandidate(), "Different type to AssigneeCandidate");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link AssigneeCandidate}
   *   <li>{@link AssigneeCandidate#canBeAssigned(Boolean)}
   *   <li>{@link AssigneeCandidate#emailAddress(String)}
   *   <li>{@link AssigneeCandidate#firstName(String)}
   *   <li>{@link AssigneeCandidate#roles(List)}
   *   <li>{@link AssigneeCandidate#setCanBeAssigned(Boolean)}
   *   <li>{@link AssigneeCandidate#setEmailAddress(String)}
   *   <li>{@link AssigneeCandidate#setFirstName(String)}
   *   <li>{@link AssigneeCandidate#setRoles(List)}
   *   <li>{@link AssigneeCandidate#setSurname(String)}
   *   <li>{@link AssigneeCandidate#setUserId(Long)}
   *   <li>{@link AssigneeCandidate#setUsername(String)}
   *   <li>{@link AssigneeCandidate#surname(String)}
   *   <li>{@link AssigneeCandidate#userId(Long)}
   *   <li>{@link AssigneeCandidate#username(String)}
   *   <li>{@link AssigneeCandidate#toString()}
   *   <li>{@link AssigneeCandidate#getCanBeAssigned()}
   *   <li>{@link AssigneeCandidate#getEmailAddress()}
   *   <li>{@link AssigneeCandidate#getFirstName()}
   *   <li>{@link AssigneeCandidate#getRoles()}
   *   <li>{@link AssigneeCandidate#getSurname()}
   *   <li>{@link AssigneeCandidate#getUserId()}
   *   <li>{@link AssigneeCandidate#getUsername()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AssigneeCandidate.<init>()",
    "AssigneeCandidate AssigneeCandidate.canBeAssigned(Boolean)",
    "AssigneeCandidate AssigneeCandidate.emailAddress(String)",
    "AssigneeCandidate AssigneeCandidate.firstName(String)",
    "Boolean AssigneeCandidate.getCanBeAssigned()",
    "String AssigneeCandidate.getEmailAddress()",
    "String AssigneeCandidate.getFirstName()",
    "List AssigneeCandidate.getRoles()",
    "String AssigneeCandidate.getSurname()",
    "Long AssigneeCandidate.getUserId()",
    "String AssigneeCandidate.getUsername()",
    "AssigneeCandidate AssigneeCandidate.roles(List)",
    "void AssigneeCandidate.setCanBeAssigned(Boolean)",
    "void AssigneeCandidate.setEmailAddress(String)",
    "void AssigneeCandidate.setFirstName(String)",
    "void AssigneeCandidate.setRoles(List)",
    "void AssigneeCandidate.setSurname(String)",
    "void AssigneeCandidate.setUserId(Long)",
    "void AssigneeCandidate.setUsername(String)",
    "AssigneeCandidate AssigneeCandidate.surname(String)",
    "String AssigneeCandidate.toString()",
    "AssigneeCandidate AssigneeCandidate.userId(Long)",
    "AssigneeCandidate AssigneeCandidate.username(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    AssigneeCandidate actualAssigneeCandidate = new AssigneeCandidate();
    AssigneeCandidate actualCanBeAssignedResult = actualAssigneeCandidate.canBeAssigned(true);
    AssigneeCandidate actualEmailAddressResult = actualAssigneeCandidate.emailAddress("42 Main St");
    AssigneeCandidate actualFirstNameResult = actualAssigneeCandidate.firstName("Jane");
    AssigneeCandidate actualRolesResult = actualAssigneeCandidate.roles(new ArrayList<>());
    actualAssigneeCandidate.setCanBeAssigned(true);
    actualAssigneeCandidate.setEmailAddress("42 Main St");
    actualAssigneeCandidate.setFirstName("Jane");
    ArrayList<String> roles = new ArrayList<>();
    actualAssigneeCandidate.setRoles(roles);
    actualAssigneeCandidate.setSurname("Doe");
    actualAssigneeCandidate.setUserId(1L);
    actualAssigneeCandidate.setUsername("janedoe");
    AssigneeCandidate actualSurnameResult = actualAssigneeCandidate.surname("Doe");
    AssigneeCandidate actualUserIdResult = actualAssigneeCandidate.userId(1L);
    AssigneeCandidate actualUsernameResult = actualAssigneeCandidate.username("janedoe");
    String actualToStringResult = actualAssigneeCandidate.toString();
    Boolean actualCanBeAssigned = actualAssigneeCandidate.getCanBeAssigned();
    String actualEmailAddress = actualAssigneeCandidate.getEmailAddress();
    String actualFirstName = actualAssigneeCandidate.getFirstName();
    List<String> actualRoles = actualAssigneeCandidate.getRoles();
    String actualSurname = actualAssigneeCandidate.getSurname();
    Long actualUserId = actualAssigneeCandidate.getUserId();

    // Assert
    assertEquals("42 Main St", actualEmailAddress);
    assertEquals("Doe", actualSurname);
    assertEquals("Jane", actualFirstName);
    assertEquals(
        "class AssigneeCandidate {\n"
            + "    userId: 1\n"
            + "    username: janedoe\n"
            + "    firstName: Jane\n"
            + "    surname: Doe\n"
            + "    emailAddress: 42 Main St\n"
            + "    canBeAssigned: true\n"
            + "    roles: []\n"
            + "}",
        actualToStringResult);
    assertEquals("janedoe", actualAssigneeCandidate.getUsername());
    assertEquals(1L, actualUserId.longValue());
    assertTrue(actualCanBeAssigned);
    assertTrue(actualRoles.isEmpty());
    assertSame(actualAssigneeCandidate, actualCanBeAssignedResult);
    assertSame(actualAssigneeCandidate, actualEmailAddressResult);
    assertSame(actualAssigneeCandidate, actualFirstNameResult);
    assertSame(actualAssigneeCandidate, actualRolesResult);
    assertSame(actualAssigneeCandidate, actualSurnameResult);
    assertSame(actualAssigneeCandidate, actualUserIdResult);
    assertSame(actualAssigneeCandidate, actualUsernameResult);
    assertSame(roles, actualRoles);
  }
}
