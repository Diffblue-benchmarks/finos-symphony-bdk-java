package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AssigneeCandidatesDiffblueTest {
  /**
   * Test {@link AssigneeCandidates#addUsersItem(AssigneeCandidate)}.
   * <ul>
   *   <li>Given {@link AssigneeCandidates} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link AssigneeCandidates#addUsersItem(AssigneeCandidate)}
   */
  @Test
  @DisplayName("Test addUsersItem(AssigneeCandidate); given AssigneeCandidates (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"AssigneeCandidates AssigneeCandidates.addUsersItem(AssigneeCandidate)"})
  void testAddUsersItem_givenAssigneeCandidates() {
    // Arrange
    AssigneeCandidates assigneeCandidates = new AssigneeCandidates();

    // Act and Assert
    assertSame(assigneeCandidates, assigneeCandidates.addUsersItem(new AssigneeCandidate()));
  }

  /**
   * Test {@link AssigneeCandidates#addUsersItem(AssigneeCandidate)}.
   * <ul>
   *   <li>Given {@link AssigneeCandidates} (default constructor) users {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AssigneeCandidates#addUsersItem(AssigneeCandidate)}
   */
  @Test
  @DisplayName("Test addUsersItem(AssigneeCandidate); given AssigneeCandidates (default constructor) users ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"AssigneeCandidates AssigneeCandidates.addUsersItem(AssigneeCandidate)"})
  void testAddUsersItem_givenAssigneeCandidatesUsersArrayList() {
    // Arrange
    AssigneeCandidates assigneeCandidates = new AssigneeCandidates();
    assigneeCandidates.users(new ArrayList<>());

    // Act and Assert
    assertSame(assigneeCandidates, assigneeCandidates.addUsersItem(new AssigneeCandidate()));
  }

  /**
   * Test {@link AssigneeCandidates#equals(Object)}, and {@link AssigneeCandidates#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AssigneeCandidates#equals(Object)}
   *   <li>{@link AssigneeCandidates#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AssigneeCandidates.equals(Object)", "int AssigneeCandidates.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AssigneeCandidates assigneeCandidates = new AssigneeCandidates();
    AssigneeCandidates assigneeCandidates2 = new AssigneeCandidates();

    // Act and Assert
    assertEquals(assigneeCandidates, assigneeCandidates2);
    int expectedHashCodeResult = assigneeCandidates.hashCode();
    assertEquals(expectedHashCodeResult, assigneeCandidates2.hashCode());
  }

  /**
   * Test {@link AssigneeCandidates#equals(Object)}, and {@link AssigneeCandidates#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AssigneeCandidates#equals(Object)}
   *   <li>{@link AssigneeCandidates#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AssigneeCandidates.equals(Object)", "int AssigneeCandidates.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AssigneeCandidates assigneeCandidates = new AssigneeCandidates();

    // Act and Assert
    assertEquals(assigneeCandidates, assigneeCandidates);
    int expectedHashCodeResult = assigneeCandidates.hashCode();
    assertEquals(expectedHashCodeResult, assigneeCandidates.hashCode());
  }

  /**
   * Test {@link AssigneeCandidates#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AssigneeCandidates#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AssigneeCandidates.equals(Object)", "int AssigneeCandidates.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    AssigneeCandidates assigneeCandidates = new AssigneeCandidates();
    assigneeCandidates.addUsersItem(new AssigneeCandidate());

    // Act and Assert
    assertNotEquals(assigneeCandidates, new AssigneeCandidates());
  }

  /**
   * Test {@link AssigneeCandidates#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AssigneeCandidates#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AssigneeCandidates.equals(Object)", "int AssigneeCandidates.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    AssigneeCandidates assigneeCandidates = new AssigneeCandidates();
    assigneeCandidates.pagination(new Pagination());

    // Act and Assert
    assertNotEquals(assigneeCandidates, new AssigneeCandidates());
  }

  /**
   * Test {@link AssigneeCandidates#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AssigneeCandidates#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AssigneeCandidates.equals(Object)", "int AssigneeCandidates.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AssigneeCandidates(), null);
  }

  /**
   * Test {@link AssigneeCandidates#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AssigneeCandidates#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AssigneeCandidates.equals(Object)", "int AssigneeCandidates.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AssigneeCandidates(), "Different type to AssigneeCandidates");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link AssigneeCandidates}
   *   <li>{@link AssigneeCandidates#pagination(Pagination)}
   *   <li>{@link AssigneeCandidates#setPagination(Pagination)}
   *   <li>{@link AssigneeCandidates#setUsers(List)}
   *   <li>{@link AssigneeCandidates#users(List)}
   *   <li>{@link AssigneeCandidates#toString()}
   *   <li>{@link AssigneeCandidates#getPagination()}
   *   <li>{@link AssigneeCandidates#getUsers()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AssigneeCandidates.<init>()", "Pagination AssigneeCandidates.getPagination()",
      "List AssigneeCandidates.getUsers()", "AssigneeCandidates AssigneeCandidates.pagination(Pagination)",
      "void AssigneeCandidates.setPagination(Pagination)", "void AssigneeCandidates.setUsers(List)",
      "String AssigneeCandidates.toString()", "AssigneeCandidates AssigneeCandidates.users(List)"})
  void testGettersAndSetters() {
    // Arrange and Act
    AssigneeCandidates actualAssigneeCandidates = new AssigneeCandidates();
    AssigneeCandidates actualPaginationResult = actualAssigneeCandidates.pagination(new Pagination());
    Pagination pagination = new Pagination();
    actualAssigneeCandidates.setPagination(pagination);
    actualAssigneeCandidates.setUsers(new ArrayList<>());
    ArrayList<AssigneeCandidate> users = new ArrayList<>();
    AssigneeCandidates actualUsersResult = actualAssigneeCandidates.users(users);
    String actualToStringResult = actualAssigneeCandidates.toString();
    Pagination actualPagination = actualAssigneeCandidates.getPagination();
    List<AssigneeCandidate> actualUsers = actualAssigneeCandidates.getUsers();

    // Assert
    assertEquals(
        "class AssigneeCandidates {\n" + "    users: []\n" + "    pagination: class Pagination {\n"
            + "        cursors: null\n" + "        previous: null\n" + "        next: null\n" + "    }\n" + "}",
        actualToStringResult);
    assertTrue(actualUsers.isEmpty());
    assertSame(actualAssigneeCandidates, actualPaginationResult);
    assertSame(actualAssigneeCandidates, actualUsersResult);
    assertSame(pagination, actualPagination);
    assertSame(users, actualUsers);
  }
}
