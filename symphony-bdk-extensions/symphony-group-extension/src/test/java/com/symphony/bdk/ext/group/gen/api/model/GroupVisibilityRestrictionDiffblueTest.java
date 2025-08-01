package com.symphony.bdk.ext.group.gen.api.model;

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

class GroupVisibilityRestrictionDiffblueTest {
  /**
   * Test {@link GroupVisibilityRestriction#addRestrictedTenantsListItem(Integer)}.
   *
   * <p>Method under test: {@link GroupVisibilityRestriction#addRestrictedTenantsListItem(Integer)}
   */
  @Test
  @DisplayName("Test addRestrictedTenantsListItem(Integer)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "GroupVisibilityRestriction GroupVisibilityRestriction.addRestrictedTenantsListItem(Integer)"
  })
  void testAddRestrictedTenantsListItem() {
    // Arrange
    GroupVisibilityRestriction groupVisibilityRestriction = new GroupVisibilityRestriction();
    groupVisibilityRestriction.restrictedTenantsList(new ArrayList<>());

    // Act and Assert
    assertSame(
        groupVisibilityRestriction, groupVisibilityRestriction.addRestrictedTenantsListItem(2));
  }

  /**
   * Test {@link GroupVisibilityRestriction#addRestrictedTenantsListItem(Integer)}.
   *
   * <ul>
   *   <li>Given {@link GroupVisibilityRestriction} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link GroupVisibilityRestriction#addRestrictedTenantsListItem(Integer)}
   */
  @Test
  @DisplayName(
      "Test addRestrictedTenantsListItem(Integer); given GroupVisibilityRestriction (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "GroupVisibilityRestriction GroupVisibilityRestriction.addRestrictedTenantsListItem(Integer)"
  })
  void testAddRestrictedTenantsListItem_givenGroupVisibilityRestriction() {
    // Arrange
    GroupVisibilityRestriction groupVisibilityRestriction = new GroupVisibilityRestriction();

    // Act and Assert
    assertSame(
        groupVisibilityRestriction, groupVisibilityRestriction.addRestrictedTenantsListItem(2));
  }

  /**
   * Test {@link GroupVisibilityRestriction#addRestrictedUsersListItem(Long)}.
   *
   * <p>Method under test: {@link GroupVisibilityRestriction#addRestrictedUsersListItem(Long)}
   */
  @Test
  @DisplayName("Test addRestrictedUsersListItem(Long)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "GroupVisibilityRestriction GroupVisibilityRestriction.addRestrictedUsersListItem(Long)"
  })
  void testAddRestrictedUsersListItem() {
    // Arrange
    GroupVisibilityRestriction groupVisibilityRestriction = new GroupVisibilityRestriction();
    groupVisibilityRestriction.restrictedUsersList(new ArrayList<>());

    // Act and Assert
    assertSame(
        groupVisibilityRestriction, groupVisibilityRestriction.addRestrictedUsersListItem(1L));
  }

  /**
   * Test {@link GroupVisibilityRestriction#addRestrictedUsersListItem(Long)}.
   *
   * <ul>
   *   <li>Given {@link GroupVisibilityRestriction} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link GroupVisibilityRestriction#addRestrictedUsersListItem(Long)}
   */
  @Test
  @DisplayName(
      "Test addRestrictedUsersListItem(Long); given GroupVisibilityRestriction (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "GroupVisibilityRestriction GroupVisibilityRestriction.addRestrictedUsersListItem(Long)"
  })
  void testAddRestrictedUsersListItem_givenGroupVisibilityRestriction() {
    // Arrange
    GroupVisibilityRestriction groupVisibilityRestriction = new GroupVisibilityRestriction();

    // Act and Assert
    assertSame(
        groupVisibilityRestriction, groupVisibilityRestriction.addRestrictedUsersListItem(1L));
  }

  /**
   * Test {@link GroupVisibilityRestriction#equals(Object)}, and {@link
   * GroupVisibilityRestriction#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link GroupVisibilityRestriction#equals(Object)}
   *   <li>{@link GroupVisibilityRestriction#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GroupVisibilityRestriction.equals(Object)",
    "int GroupVisibilityRestriction.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    GroupVisibilityRestriction groupVisibilityRestriction = new GroupVisibilityRestriction();
    GroupVisibilityRestriction groupVisibilityRestriction2 = new GroupVisibilityRestriction();

    // Act and Assert
    assertEquals(groupVisibilityRestriction, groupVisibilityRestriction2);
    int expectedHashCodeResult = groupVisibilityRestriction.hashCode();
    assertEquals(expectedHashCodeResult, groupVisibilityRestriction2.hashCode());
  }

  /**
   * Test {@link GroupVisibilityRestriction#equals(Object)}, and {@link
   * GroupVisibilityRestriction#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link GroupVisibilityRestriction#equals(Object)}
   *   <li>{@link GroupVisibilityRestriction#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GroupVisibilityRestriction.equals(Object)",
    "int GroupVisibilityRestriction.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    GroupVisibilityRestriction groupVisibilityRestriction = new GroupVisibilityRestriction();

    // Act and Assert
    assertEquals(groupVisibilityRestriction, groupVisibilityRestriction);
    int expectedHashCodeResult = groupVisibilityRestriction.hashCode();
    assertEquals(expectedHashCodeResult, groupVisibilityRestriction.hashCode());
  }

  /**
   * Test {@link GroupVisibilityRestriction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GroupVisibilityRestriction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GroupVisibilityRestriction.equals(Object)",
    "int GroupVisibilityRestriction.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    GroupVisibilityRestriction groupVisibilityRestriction = new GroupVisibilityRestriction();
    groupVisibilityRestriction.addRestrictedTenantsListItem(2);

    // Act and Assert
    assertNotEquals(groupVisibilityRestriction, new GroupVisibilityRestriction());
  }

  /**
   * Test {@link GroupVisibilityRestriction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GroupVisibilityRestriction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GroupVisibilityRestriction.equals(Object)",
    "int GroupVisibilityRestriction.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    GroupVisibilityRestriction groupVisibilityRestriction = new GroupVisibilityRestriction();
    groupVisibilityRestriction.addRestrictedUsersListItem(1L);

    // Act and Assert
    assertNotEquals(groupVisibilityRestriction, new GroupVisibilityRestriction());
  }

  /**
   * Test {@link GroupVisibilityRestriction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GroupVisibilityRestriction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GroupVisibilityRestriction.equals(Object)",
    "int GroupVisibilityRestriction.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new GroupVisibilityRestriction(), null);
  }

  /**
   * Test {@link GroupVisibilityRestriction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GroupVisibilityRestriction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GroupVisibilityRestriction.equals(Object)",
    "int GroupVisibilityRestriction.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new GroupVisibilityRestriction(), "Different type to GroupVisibilityRestriction");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link GroupVisibilityRestriction}
   *   <li>{@link GroupVisibilityRestriction#restrictedTenantsList(List)}
   *   <li>{@link GroupVisibilityRestriction#restrictedUsersList(List)}
   *   <li>{@link GroupVisibilityRestriction#setRestrictedTenantsList(List)}
   *   <li>{@link GroupVisibilityRestriction#setRestrictedUsersList(List)}
   *   <li>{@link GroupVisibilityRestriction#toString()}
   *   <li>{@link GroupVisibilityRestriction#getRestrictedTenantsList()}
   *   <li>{@link GroupVisibilityRestriction#getRestrictedUsersList()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void GroupVisibilityRestriction.<init>()",
    "List GroupVisibilityRestriction.getRestrictedTenantsList()",
    "List GroupVisibilityRestriction.getRestrictedUsersList()",
    "GroupVisibilityRestriction GroupVisibilityRestriction.restrictedTenantsList(List)",
    "GroupVisibilityRestriction GroupVisibilityRestriction.restrictedUsersList(List)",
    "void GroupVisibilityRestriction.setRestrictedTenantsList(List)",
    "void GroupVisibilityRestriction.setRestrictedUsersList(List)",
    "String GroupVisibilityRestriction.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    GroupVisibilityRestriction actualGroupVisibilityRestriction = new GroupVisibilityRestriction();
    GroupVisibilityRestriction actualRestrictedTenantsListResult =
        actualGroupVisibilityRestriction.restrictedTenantsList(new ArrayList<>());
    GroupVisibilityRestriction actualRestrictedUsersListResult =
        actualGroupVisibilityRestriction.restrictedUsersList(new ArrayList<>());
    ArrayList<Integer> restrictedTenantsList = new ArrayList<>();
    actualGroupVisibilityRestriction.setRestrictedTenantsList(restrictedTenantsList);
    ArrayList<Long> restrictedUsersList = new ArrayList<>();
    actualGroupVisibilityRestriction.setRestrictedUsersList(restrictedUsersList);
    String actualToStringResult = actualGroupVisibilityRestriction.toString();
    List<Integer> actualRestrictedTenantsList =
        actualGroupVisibilityRestriction.getRestrictedTenantsList();
    List<Long> actualRestrictedUsersList =
        actualGroupVisibilityRestriction.getRestrictedUsersList();

    // Assert
    assertEquals(
        "class GroupVisibilityRestriction {\n    restrictedTenantsList: []\n    restrictedUsersList: []\n}",
        actualToStringResult);
    assertTrue(actualRestrictedTenantsList.isEmpty());
    assertTrue(actualRestrictedUsersList.isEmpty());
    assertSame(actualGroupVisibilityRestriction, actualRestrictedTenantsListResult);
    assertSame(actualGroupVisibilityRestriction, actualRestrictedUsersListResult);
    assertSame(restrictedTenantsList, actualRestrictedTenantsList);
    assertSame(restrictedUsersList, actualRestrictedUsersList);
  }
}
