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

class GroupImplicitConnectionDiffblueTest {
  /**
   * Test {@link GroupImplicitConnection#addConnectedTenantsListItem(Integer)}.
   *
   * <p>Method under test: {@link GroupImplicitConnection#addConnectedTenantsListItem(Integer)}
   */
  @Test
  @DisplayName("Test addConnectedTenantsListItem(Integer)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "GroupImplicitConnection GroupImplicitConnection.addConnectedTenantsListItem(Integer)"
  })
  void testAddConnectedTenantsListItem() {
    // Arrange
    GroupImplicitConnection groupImplicitConnection = new GroupImplicitConnection();
    groupImplicitConnection.connectedTenantsList(new ArrayList<>());

    // Act
    GroupImplicitConnection actualAddConnectedTenantsListItemResult =
        groupImplicitConnection.addConnectedTenantsListItem(2);

    // Assert
    assertSame(groupImplicitConnection, actualAddConnectedTenantsListItemResult);
  }

  /**
   * Test {@link GroupImplicitConnection#addConnectedTenantsListItem(Integer)}.
   *
   * <ul>
   *   <li>Given {@link GroupImplicitConnection} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link GroupImplicitConnection#addConnectedTenantsListItem(Integer)}
   */
  @Test
  @DisplayName(
      "Test addConnectedTenantsListItem(Integer); given GroupImplicitConnection (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "GroupImplicitConnection GroupImplicitConnection.addConnectedTenantsListItem(Integer)"
  })
  void testAddConnectedTenantsListItem_givenGroupImplicitConnection() {
    // Arrange
    GroupImplicitConnection groupImplicitConnection = new GroupImplicitConnection();

    // Act
    GroupImplicitConnection actualAddConnectedTenantsListItemResult =
        groupImplicitConnection.addConnectedTenantsListItem(2);

    // Assert
    assertSame(groupImplicitConnection, actualAddConnectedTenantsListItemResult);
  }

  /**
   * Test {@link GroupImplicitConnection#addConnectedUsersListItem(Long)}.
   *
   * <p>Method under test: {@link GroupImplicitConnection#addConnectedUsersListItem(Long)}
   */
  @Test
  @DisplayName("Test addConnectedUsersListItem(Long)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "GroupImplicitConnection GroupImplicitConnection.addConnectedUsersListItem(Long)"
  })
  void testAddConnectedUsersListItem() {
    // Arrange
    GroupImplicitConnection groupImplicitConnection = new GroupImplicitConnection();
    groupImplicitConnection.connectedUsersList(new ArrayList<>());

    // Act
    GroupImplicitConnection actualAddConnectedUsersListItemResult =
        groupImplicitConnection.addConnectedUsersListItem(1L);

    // Assert
    assertSame(groupImplicitConnection, actualAddConnectedUsersListItemResult);
  }

  /**
   * Test {@link GroupImplicitConnection#addConnectedUsersListItem(Long)}.
   *
   * <ul>
   *   <li>Given {@link GroupImplicitConnection} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link GroupImplicitConnection#addConnectedUsersListItem(Long)}
   */
  @Test
  @DisplayName(
      "Test addConnectedUsersListItem(Long); given GroupImplicitConnection (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "GroupImplicitConnection GroupImplicitConnection.addConnectedUsersListItem(Long)"
  })
  void testAddConnectedUsersListItem_givenGroupImplicitConnection() {
    // Arrange
    GroupImplicitConnection groupImplicitConnection = new GroupImplicitConnection();

    // Act
    GroupImplicitConnection actualAddConnectedUsersListItemResult =
        groupImplicitConnection.addConnectedUsersListItem(1L);

    // Assert
    assertSame(groupImplicitConnection, actualAddConnectedUsersListItemResult);
  }

  /**
   * Test {@link GroupImplicitConnection#equals(Object)}, and {@link
   * GroupImplicitConnection#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link GroupImplicitConnection#equals(Object)}
   *   <li>{@link GroupImplicitConnection#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GroupImplicitConnection.equals(Object)",
    "int GroupImplicitConnection.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    GroupImplicitConnection groupImplicitConnection = new GroupImplicitConnection();
    GroupImplicitConnection groupImplicitConnection2 = new GroupImplicitConnection();

    // Act and Assert
    assertEquals(groupImplicitConnection, groupImplicitConnection2);
    assertEquals(groupImplicitConnection.hashCode(), groupImplicitConnection2.hashCode());
  }

  /**
   * Test {@link GroupImplicitConnection#equals(Object)}, and {@link
   * GroupImplicitConnection#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link GroupImplicitConnection#equals(Object)}
   *   <li>{@link GroupImplicitConnection#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GroupImplicitConnection.equals(Object)",
    "int GroupImplicitConnection.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    GroupImplicitConnection groupImplicitConnection = new GroupImplicitConnection();

    // Act and Assert
    assertEquals(groupImplicitConnection, groupImplicitConnection);
    int expectedHashCodeResult = groupImplicitConnection.hashCode();
    assertEquals(expectedHashCodeResult, groupImplicitConnection.hashCode());
  }

  /**
   * Test {@link GroupImplicitConnection#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GroupImplicitConnection#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GroupImplicitConnection.equals(Object)",
    "int GroupImplicitConnection.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    GroupImplicitConnection groupImplicitConnection = new GroupImplicitConnection();
    groupImplicitConnection.addConnectedTenantsListItem(2);

    // Act and Assert
    assertNotEquals(groupImplicitConnection, new GroupImplicitConnection());
  }

  /**
   * Test {@link GroupImplicitConnection#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GroupImplicitConnection#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GroupImplicitConnection.equals(Object)",
    "int GroupImplicitConnection.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    GroupImplicitConnection groupImplicitConnection = new GroupImplicitConnection();
    groupImplicitConnection.addConnectedUsersListItem(1L);

    // Act and Assert
    assertNotEquals(groupImplicitConnection, new GroupImplicitConnection());
  }

  /**
   * Test {@link GroupImplicitConnection#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GroupImplicitConnection#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GroupImplicitConnection.equals(Object)",
    "int GroupImplicitConnection.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new GroupImplicitConnection(), null);
  }

  /**
   * Test {@link GroupImplicitConnection#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GroupImplicitConnection#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GroupImplicitConnection.equals(Object)",
    "int GroupImplicitConnection.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new GroupImplicitConnection(), "Different type to GroupImplicitConnection");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link GroupImplicitConnection}
   *   <li>{@link GroupImplicitConnection#connectedTenantsList(List)}
   *   <li>{@link GroupImplicitConnection#connectedUsersList(List)}
   *   <li>{@link GroupImplicitConnection#setConnectedTenantsList(List)}
   *   <li>{@link GroupImplicitConnection#setConnectedUsersList(List)}
   *   <li>{@link GroupImplicitConnection#toString()}
   *   <li>{@link GroupImplicitConnection#getConnectedTenantsList()}
   *   <li>{@link GroupImplicitConnection#getConnectedUsersList()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void GroupImplicitConnection.<init>()",
    "GroupImplicitConnection GroupImplicitConnection.connectedTenantsList(List)",
    "GroupImplicitConnection GroupImplicitConnection.connectedUsersList(List)",
    "List GroupImplicitConnection.getConnectedTenantsList()",
    "List GroupImplicitConnection.getConnectedUsersList()",
    "void GroupImplicitConnection.setConnectedTenantsList(List)",
    "void GroupImplicitConnection.setConnectedUsersList(List)",
    "String GroupImplicitConnection.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    GroupImplicitConnection actualGroupImplicitConnection = new GroupImplicitConnection();
    GroupImplicitConnection actualConnectedTenantsListResult =
        actualGroupImplicitConnection.connectedTenantsList(new ArrayList<>());
    GroupImplicitConnection actualConnectedUsersListResult =
        actualGroupImplicitConnection.connectedUsersList(new ArrayList<>());
    ArrayList<Integer> connectedTenantsList = new ArrayList<>();
    actualGroupImplicitConnection.setConnectedTenantsList(connectedTenantsList);
    ArrayList<Long> connectedUsersList = new ArrayList<>();
    actualGroupImplicitConnection.setConnectedUsersList(connectedUsersList);
    String actualToStringResult = actualGroupImplicitConnection.toString();
    List<Integer> actualConnectedTenantsList =
        actualGroupImplicitConnection.getConnectedTenantsList();
    List<Long> actualConnectedUsersList = actualGroupImplicitConnection.getConnectedUsersList();

    // Assert
    assertEquals(
        "class GroupImplicitConnection {\n    connectedTenantsList: []\n    connectedUsersList: []\n}",
        actualToStringResult);
    assertTrue(actualConnectedTenantsList.isEmpty());
    assertTrue(actualConnectedUsersList.isEmpty());
    assertSame(actualGroupImplicitConnection, actualConnectedTenantsListResult);
    assertSame(actualGroupImplicitConnection, actualConnectedUsersListResult);
    assertSame(connectedTenantsList, actualConnectedTenantsList);
    assertSame(connectedUsersList, actualConnectedUsersList);
  }
}
