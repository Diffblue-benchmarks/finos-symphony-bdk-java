package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RoleDiffblueTest {
  /**
   * Test {@link Role#equals(Object)}, and {@link Role#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Role#equals(Object)}
   *   <li>{@link Role#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Role.equals(Object)", "int Role.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Role role = new Role();
    Role role2 = new Role();

    // Act and Assert
    assertEquals(role, role2);
    int expectedHashCodeResult = role.hashCode();
    assertEquals(expectedHashCodeResult, role2.hashCode());
  }

  /**
   * Test {@link Role#equals(Object)}, and {@link Role#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Role#equals(Object)}
   *   <li>{@link Role#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Role.equals(Object)", "int Role.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Role role = new Role();

    // Act and Assert
    assertEquals(role, role);
    int expectedHashCodeResult = role.hashCode();
    assertEquals(expectedHashCodeResult, role.hashCode());
  }

  /**
   * Test {@link Role#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Role#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Role.equals(Object)", "int Role.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Role(), 1);
  }

  /**
   * Test {@link Role#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Role#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Role.equals(Object)", "int Role.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Role role = new Role();
    role.id(1L);

    // Act and Assert
    assertNotEquals(role, new Role());
  }

  /**
   * Test {@link Role#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Role#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Role.equals(Object)", "int Role.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Role role = new Role();
    role.name("Name");

    // Act and Assert
    assertNotEquals(role, new Role());
  }

  /**
   * Test {@link Role#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Role#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Role.equals(Object)", "int Role.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    Role role = new Role();
    role.description("The characteristics of someone or something");

    // Act and Assert
    assertNotEquals(role, new Role());
  }

  /**
   * Test {@link Role#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Role#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Role.equals(Object)", "int Role.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Role(), null);
  }

  /**
   * Test {@link Role#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Role#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Role.equals(Object)", "int Role.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Role(), "Different type to Role");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link Role}
   *   <li>{@link Role#description(String)}
   *   <li>{@link Role#id(Long)}
   *   <li>{@link Role#name(String)}
   *   <li>{@link Role#setDescription(String)}
   *   <li>{@link Role#setId(Long)}
   *   <li>{@link Role#setName(String)}
   *   <li>{@link Role#toString()}
   *   <li>{@link Role#getDescription()}
   *   <li>{@link Role#getId()}
   *   <li>{@link Role#getName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Role.<init>()",
    "Role Role.description(String)",
    "String Role.getDescription()",
    "Long Role.getId()",
    "String Role.getName()",
    "Role Role.id(Long)",
    "Role Role.name(String)",
    "void Role.setDescription(String)",
    "void Role.setId(Long)",
    "void Role.setName(String)",
    "String Role.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    Role actualRole = new Role();
    Role actualDescriptionResult =
        actualRole.description("The characteristics of someone or something");
    Role actualIdResult = actualRole.id(1L);
    Role actualNameResult = actualRole.name("Name");
    actualRole.setDescription("The characteristics of someone or something");
    actualRole.setId(1L);
    actualRole.setName("Name");
    String actualToStringResult = actualRole.toString();
    String actualDescription = actualRole.getDescription();
    Long actualId = actualRole.getId();

    // Assert
    assertEquals("Name", actualRole.getName());
    assertEquals("The characteristics of someone or something", actualDescription);
    assertEquals(
        "class Role {\n    id: 1\n    name: Name\n    description: The characteristics of someone or something\n}",
        actualToStringResult);
    assertEquals(1L, actualId.longValue());
    assertSame(actualRole, actualDescriptionResult);
    assertSame(actualRole, actualIdResult);
    assertSame(actualRole, actualNameResult);
  }
}
