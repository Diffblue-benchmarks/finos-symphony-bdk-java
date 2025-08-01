package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V3HealthDiffblueTest {
  /**
   * Test {@link V3Health#putServicesItem(String, V3HealthComponent)}.
   *
   * <ul>
   *   <li>Given {@link V3Health} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link V3Health#putServicesItem(String, V3HealthComponent)}
   */
  @Test
  @DisplayName(
      "Test putServicesItem(String, V3HealthComponent); given V3Health (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V3Health V3Health.putServicesItem(String, V3HealthComponent)"})
  void testPutServicesItem_givenV3Health() {
    // Arrange
    V3Health v3Health = new V3Health();

    // Act and Assert
    assertSame(v3Health, v3Health.putServicesItem("Key", new V3HealthComponent()));
  }

  /**
   * Test {@link V3Health#putServicesItem(String, V3HealthComponent)}.
   *
   * <ul>
   *   <li>Given {@link V3Health} (default constructor) services {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link V3Health#putServicesItem(String, V3HealthComponent)}
   */
  @Test
  @DisplayName(
      "Test putServicesItem(String, V3HealthComponent); given V3Health (default constructor) services HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V3Health V3Health.putServicesItem(String, V3HealthComponent)"})
  void testPutServicesItem_givenV3HealthServicesHashMap() {
    // Arrange
    V3Health v3Health = new V3Health();
    v3Health.services(new HashMap<>());

    // Act and Assert
    assertSame(v3Health, v3Health.putServicesItem("Key", new V3HealthComponent()));
  }

  /**
   * Test {@link V3Health#putUsersItem(String, V3HealthComponent)}.
   *
   * <ul>
   *   <li>Given {@link V3Health} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link V3Health#putUsersItem(String, V3HealthComponent)}
   */
  @Test
  @DisplayName("Test putUsersItem(String, V3HealthComponent); given V3Health (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V3Health V3Health.putUsersItem(String, V3HealthComponent)"})
  void testPutUsersItem_givenV3Health() {
    // Arrange
    V3Health v3Health = new V3Health();

    // Act and Assert
    assertSame(v3Health, v3Health.putUsersItem("Key", new V3HealthComponent()));
  }

  /**
   * Test {@link V3Health#putUsersItem(String, V3HealthComponent)}.
   *
   * <ul>
   *   <li>Given {@link V3Health} (default constructor) users {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link V3Health#putUsersItem(String, V3HealthComponent)}
   */
  @Test
  @DisplayName(
      "Test putUsersItem(String, V3HealthComponent); given V3Health (default constructor) users HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V3Health V3Health.putUsersItem(String, V3HealthComponent)"})
  void testPutUsersItem_givenV3HealthUsersHashMap() {
    // Arrange
    V3Health v3Health = new V3Health();
    v3Health.users(new HashMap<>());

    // Act and Assert
    assertSame(v3Health, v3Health.putUsersItem("Key", new V3HealthComponent()));
  }

  /**
   * Test {@link V3Health#equals(Object)}, and {@link V3Health#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3Health#equals(Object)}
   *   <li>{@link V3Health#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3Health.equals(Object)", "int V3Health.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V3Health v3Health = new V3Health();
    V3Health v3Health2 = new V3Health();

    // Act and Assert
    assertEquals(v3Health, v3Health2);
    int expectedHashCodeResult = v3Health.hashCode();
    assertEquals(expectedHashCodeResult, v3Health2.hashCode());
  }

  /**
   * Test {@link V3Health#equals(Object)}, and {@link V3Health#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3Health#equals(Object)}
   *   <li>{@link V3Health#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3Health.equals(Object)", "int V3Health.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V3Health v3Health = new V3Health();

    // Act and Assert
    assertEquals(v3Health, v3Health);
    int expectedHashCodeResult = v3Health.hashCode();
    assertEquals(expectedHashCodeResult, v3Health.hashCode());
  }

  /**
   * Test {@link V3Health#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3Health#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3Health.equals(Object)", "int V3Health.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V3Health v3Health = new V3Health();
    v3Health.putServicesItem("Key", new V3HealthComponent());

    // Act and Assert
    assertNotEquals(v3Health, new V3Health());
  }

  /**
   * Test {@link V3Health#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3Health#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3Health.equals(Object)", "int V3Health.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V3Health v3Health = new V3Health();
    v3Health.putUsersItem("Key", new V3HealthComponent());

    // Act and Assert
    assertNotEquals(v3Health, new V3Health());
  }

  /**
   * Test {@link V3Health#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3Health#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3Health.equals(Object)", "int V3Health.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V3Health v3Health = new V3Health();
    v3Health.status(V3HealthStatus.UP);
    v3Health.putUsersItem("Key", new V3HealthComponent());

    // Act and Assert
    assertNotEquals(v3Health, new V3Health());
  }

  /**
   * Test {@link V3Health#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3Health#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3Health.equals(Object)", "int V3Health.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V3Health v3Health = new V3Health();
    v3Health.version("1.0.2");

    // Act and Assert
    assertNotEquals(v3Health, new V3Health());
  }

  /**
   * Test {@link V3Health#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3Health#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3Health.equals(Object)", "int V3Health.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3Health(), null);
  }

  /**
   * Test {@link V3Health#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3Health#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3Health.equals(Object)", "int V3Health.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3Health(), "Different type to V3Health");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V3Health}
   *   <li>{@link V3Health#services(Map)}
   *   <li>{@link V3Health#setServices(Map)}
   *   <li>{@link V3Health#setStatus(V3HealthStatus)}
   *   <li>{@link V3Health#setUsers(Map)}
   *   <li>{@link V3Health#setVersion(String)}
   *   <li>{@link V3Health#status(V3HealthStatus)}
   *   <li>{@link V3Health#users(Map)}
   *   <li>{@link V3Health#version(String)}
   *   <li>{@link V3Health#toString()}
   *   <li>{@link V3Health#getServices()}
   *   <li>{@link V3Health#getStatus()}
   *   <li>{@link V3Health#getUsers()}
   *   <li>{@link V3Health#getVersion()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V3Health.<init>()",
    "Map V3Health.getServices()",
    "V3HealthStatus V3Health.getStatus()",
    "Map V3Health.getUsers()",
    "String V3Health.getVersion()",
    "V3Health V3Health.services(Map)",
    "void V3Health.setServices(Map)",
    "void V3Health.setStatus(V3HealthStatus)",
    "void V3Health.setUsers(Map)",
    "void V3Health.setVersion(String)",
    "V3Health V3Health.status(V3HealthStatus)",
    "String V3Health.toString()",
    "V3Health V3Health.users(Map)",
    "V3Health V3Health.version(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V3Health actualV3Health = new V3Health();
    V3Health actualServicesResult = actualV3Health.services(new HashMap<>());
    HashMap<String, V3HealthComponent> services = new HashMap<>();
    actualV3Health.setServices(services);
    actualV3Health.setStatus(V3HealthStatus.UP);
    actualV3Health.setUsers(new HashMap<>());
    actualV3Health.setVersion("1.0.2");
    V3Health actualStatusResult = actualV3Health.status(V3HealthStatus.UP);
    HashMap<String, V3HealthComponent> users = new HashMap<>();
    V3Health actualUsersResult = actualV3Health.users(users);
    V3Health actualVersionResult = actualV3Health.version("1.0.2");
    String actualToStringResult = actualV3Health.toString();
    Map<String, V3HealthComponent> actualServices = actualV3Health.getServices();
    V3HealthStatus actualStatus = actualV3Health.getStatus();
    Map<String, V3HealthComponent> actualUsers = actualV3Health.getUsers();

    // Assert
    assertEquals("1.0.2", actualV3Health.getVersion());
    assertEquals(
        "class V3Health {\n    services: {}\n    status: UP\n    users: {}\n    version: 1.0.2\n}",
        actualToStringResult);
    assertEquals(V3HealthStatus.UP, actualStatus);
    assertTrue(actualServices.isEmpty());
    assertTrue(actualUsers.isEmpty());
    assertSame(actualV3Health, actualServicesResult);
    assertSame(actualV3Health, actualStatusResult);
    assertSame(actualV3Health, actualUsersResult);
    assertSame(actualV3Health, actualVersionResult);
    assertSame(services, actualServices);
    assertSame(users, actualUsers);
  }
}
