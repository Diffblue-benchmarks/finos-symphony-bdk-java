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

class GroupInteractionTransferDiffblueTest {
  /**
   * Test {@link GroupInteractionTransfer#addRestrictedTenantsListItem(Integer)}.
   *
   * <p>Method under test: {@link GroupInteractionTransfer#addRestrictedTenantsListItem(Integer)}
   */
  @Test
  @DisplayName("Test addRestrictedTenantsListItem(Integer)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "GroupInteractionTransfer GroupInteractionTransfer.addRestrictedTenantsListItem(Integer)"
  })
  void testAddRestrictedTenantsListItem() {
    // Arrange
    GroupInteractionTransfer groupInteractionTransfer = new GroupInteractionTransfer();
    groupInteractionTransfer.restrictedTenantsList(new ArrayList<>());

    // Act
    GroupInteractionTransfer actualAddRestrictedTenantsListItemResult =
        groupInteractionTransfer.addRestrictedTenantsListItem(2);

    // Assert
    assertSame(groupInteractionTransfer, actualAddRestrictedTenantsListItemResult);
  }

  /**
   * Test {@link GroupInteractionTransfer#addRestrictedTenantsListItem(Integer)}.
   *
   * <ul>
   *   <li>Given {@link GroupInteractionTransfer} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link GroupInteractionTransfer#addRestrictedTenantsListItem(Integer)}
   */
  @Test
  @DisplayName(
      "Test addRestrictedTenantsListItem(Integer); given GroupInteractionTransfer (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "GroupInteractionTransfer GroupInteractionTransfer.addRestrictedTenantsListItem(Integer)"
  })
  void testAddRestrictedTenantsListItem_givenGroupInteractionTransfer() {
    // Arrange
    GroupInteractionTransfer groupInteractionTransfer = new GroupInteractionTransfer();

    // Act
    GroupInteractionTransfer actualAddRestrictedTenantsListItemResult =
        groupInteractionTransfer.addRestrictedTenantsListItem(2);

    // Assert
    assertSame(groupInteractionTransfer, actualAddRestrictedTenantsListItemResult);
  }

  /**
   * Test {@link GroupInteractionTransfer#addRestrictedUsersListItem(Long)}.
   *
   * <p>Method under test: {@link GroupInteractionTransfer#addRestrictedUsersListItem(Long)}
   */
  @Test
  @DisplayName("Test addRestrictedUsersListItem(Long)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "GroupInteractionTransfer GroupInteractionTransfer.addRestrictedUsersListItem(Long)"
  })
  void testAddRestrictedUsersListItem() {
    // Arrange
    GroupInteractionTransfer groupInteractionTransfer = new GroupInteractionTransfer();
    groupInteractionTransfer.restrictedUsersList(new ArrayList<>());

    // Act
    GroupInteractionTransfer actualAddRestrictedUsersListItemResult =
        groupInteractionTransfer.addRestrictedUsersListItem(1L);

    // Assert
    assertSame(groupInteractionTransfer, actualAddRestrictedUsersListItemResult);
  }

  /**
   * Test {@link GroupInteractionTransfer#addRestrictedUsersListItem(Long)}.
   *
   * <ul>
   *   <li>Given {@link GroupInteractionTransfer} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link GroupInteractionTransfer#addRestrictedUsersListItem(Long)}
   */
  @Test
  @DisplayName(
      "Test addRestrictedUsersListItem(Long); given GroupInteractionTransfer (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "GroupInteractionTransfer GroupInteractionTransfer.addRestrictedUsersListItem(Long)"
  })
  void testAddRestrictedUsersListItem_givenGroupInteractionTransfer() {
    // Arrange
    GroupInteractionTransfer groupInteractionTransfer = new GroupInteractionTransfer();

    // Act
    GroupInteractionTransfer actualAddRestrictedUsersListItemResult =
        groupInteractionTransfer.addRestrictedUsersListItem(1L);

    // Assert
    assertSame(groupInteractionTransfer, actualAddRestrictedUsersListItemResult);
  }

  /**
   * Test {@link GroupInteractionTransfer#equals(Object)}, and {@link
   * GroupInteractionTransfer#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link GroupInteractionTransfer#equals(Object)}
   *   <li>{@link GroupInteractionTransfer#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GroupInteractionTransfer.equals(Object)",
    "int GroupInteractionTransfer.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    GroupInteractionTransfer groupInteractionTransfer = new GroupInteractionTransfer();
    GroupInteractionTransfer groupInteractionTransfer2 = new GroupInteractionTransfer();

    // Act and Assert
    assertEquals(groupInteractionTransfer, groupInteractionTransfer2);
    assertEquals(groupInteractionTransfer.hashCode(), groupInteractionTransfer2.hashCode());
  }

  /**
   * Test {@link GroupInteractionTransfer#equals(Object)}, and {@link
   * GroupInteractionTransfer#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link GroupInteractionTransfer#equals(Object)}
   *   <li>{@link GroupInteractionTransfer#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GroupInteractionTransfer.equals(Object)",
    "int GroupInteractionTransfer.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    GroupInteractionTransfer groupInteractionTransfer = new GroupInteractionTransfer();

    // Act and Assert
    assertEquals(groupInteractionTransfer, groupInteractionTransfer);
    int expectedHashCodeResult = groupInteractionTransfer.hashCode();
    assertEquals(expectedHashCodeResult, groupInteractionTransfer.hashCode());
  }

  /**
   * Test {@link GroupInteractionTransfer#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GroupInteractionTransfer#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GroupInteractionTransfer.equals(Object)",
    "int GroupInteractionTransfer.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    GroupInteractionTransfer groupInteractionTransfer = new GroupInteractionTransfer();
    groupInteractionTransfer.addRestrictedTenantsListItem(2);

    // Act and Assert
    assertNotEquals(groupInteractionTransfer, new GroupInteractionTransfer());
  }

  /**
   * Test {@link GroupInteractionTransfer#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GroupInteractionTransfer#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GroupInteractionTransfer.equals(Object)",
    "int GroupInteractionTransfer.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    GroupInteractionTransfer groupInteractionTransfer = new GroupInteractionTransfer();
    groupInteractionTransfer.addRestrictedUsersListItem(1L);

    // Act and Assert
    assertNotEquals(groupInteractionTransfer, new GroupInteractionTransfer());
  }

  /**
   * Test {@link GroupInteractionTransfer#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GroupInteractionTransfer#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GroupInteractionTransfer.equals(Object)",
    "int GroupInteractionTransfer.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new GroupInteractionTransfer(), null);
  }

  /**
   * Test {@link GroupInteractionTransfer#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GroupInteractionTransfer#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GroupInteractionTransfer.equals(Object)",
    "int GroupInteractionTransfer.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new GroupInteractionTransfer(), "Different type to GroupInteractionTransfer");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link GroupInteractionTransfer}
   *   <li>{@link GroupInteractionTransfer#restrictedTenantsList(List)}
   *   <li>{@link GroupInteractionTransfer#restrictedUsersList(List)}
   *   <li>{@link GroupInteractionTransfer#setRestrictedTenantsList(List)}
   *   <li>{@link GroupInteractionTransfer#setRestrictedUsersList(List)}
   *   <li>{@link GroupInteractionTransfer#toString()}
   *   <li>{@link GroupInteractionTransfer#getRestrictedTenantsList()}
   *   <li>{@link GroupInteractionTransfer#getRestrictedUsersList()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void GroupInteractionTransfer.<init>()",
    "List GroupInteractionTransfer.getRestrictedTenantsList()",
    "List GroupInteractionTransfer.getRestrictedUsersList()",
    "GroupInteractionTransfer GroupInteractionTransfer.restrictedTenantsList(List)",
    "GroupInteractionTransfer GroupInteractionTransfer.restrictedUsersList(List)",
    "void GroupInteractionTransfer.setRestrictedTenantsList(List)",
    "void GroupInteractionTransfer.setRestrictedUsersList(List)",
    "String GroupInteractionTransfer.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    GroupInteractionTransfer actualGroupInteractionTransfer = new GroupInteractionTransfer();
    GroupInteractionTransfer actualRestrictedTenantsListResult =
        actualGroupInteractionTransfer.restrictedTenantsList(new ArrayList<>());
    GroupInteractionTransfer actualRestrictedUsersListResult =
        actualGroupInteractionTransfer.restrictedUsersList(new ArrayList<>());
    ArrayList<Integer> restrictedTenantsList = new ArrayList<>();
    actualGroupInteractionTransfer.setRestrictedTenantsList(restrictedTenantsList);
    ArrayList<Long> restrictedUsersList = new ArrayList<>();
    actualGroupInteractionTransfer.setRestrictedUsersList(restrictedUsersList);
    String actualToStringResult = actualGroupInteractionTransfer.toString();
    List<Integer> actualRestrictedTenantsList =
        actualGroupInteractionTransfer.getRestrictedTenantsList();
    List<Long> actualRestrictedUsersList = actualGroupInteractionTransfer.getRestrictedUsersList();

    // Assert
    assertEquals(
        "class GroupInteractionTransfer {\n    restrictedTenantsList: []\n    restrictedUsersList: []\n}",
        actualToStringResult);
    assertTrue(actualRestrictedTenantsList.isEmpty());
    assertTrue(actualRestrictedUsersList.isEmpty());
    assertSame(actualGroupInteractionTransfer, actualRestrictedTenantsListResult);
    assertSame(actualGroupInteractionTransfer, actualRestrictedUsersListResult);
    assertSame(restrictedTenantsList, actualRestrictedTenantsList);
    assertSame(restrictedUsersList, actualRestrictedUsersList);
  }
}
