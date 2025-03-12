package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class GroupRoleScopeDiffblueTest {
  /**
   * Test {@link GroupRoleScope#equals(Object)}, and {@link GroupRoleScope#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link GroupRoleScope#equals(Object)}
   *   <li>{@link GroupRoleScope#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean GroupRoleScope.equals(Object)", "int GroupRoleScope.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    GroupRoleScope groupRoleScope = new GroupRoleScope();
    GroupRoleScope groupRoleScope2 = new GroupRoleScope();

    // Act and Assert
    assertEquals(groupRoleScope, groupRoleScope2);
    int expectedHashCodeResult = groupRoleScope.hashCode();
    assertEquals(expectedHashCodeResult, groupRoleScope2.hashCode());
  }

  /**
   * Test {@link GroupRoleScope#equals(Object)}, and {@link GroupRoleScope#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link GroupRoleScope#equals(Object)}
   *   <li>{@link GroupRoleScope#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean GroupRoleScope.equals(Object)", "int GroupRoleScope.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    GroupRoleScope groupRoleScope = new GroupRoleScope();

    // Act and Assert
    assertEquals(groupRoleScope, groupRoleScope);
    int expectedHashCodeResult = groupRoleScope.hashCode();
    assertEquals(expectedHashCodeResult, groupRoleScope.hashCode());
  }

  /**
   * Test {@link GroupRoleScope#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupRoleScope#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean GroupRoleScope.equals(Object)", "int GroupRoleScope.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new GroupRoleScope(), 1);
  }

  /**
   * Test {@link GroupRoleScope#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupRoleScope#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean GroupRoleScope.equals(Object)", "int GroupRoleScope.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    GroupRoleScope groupRoleScope = new GroupRoleScope();
    groupRoleScope.id("42");

    // Act and Assert
    assertNotEquals(groupRoleScope, new GroupRoleScope());
  }

  /**
   * Test {@link GroupRoleScope#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupRoleScope#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean GroupRoleScope.equals(Object)", "int GroupRoleScope.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    GroupRoleScope groupRoleScope = new GroupRoleScope();
    groupRoleScope.name("Name");

    // Act and Assert
    assertNotEquals(groupRoleScope, new GroupRoleScope());
  }

  /**
   * Test {@link GroupRoleScope#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupRoleScope#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean GroupRoleScope.equals(Object)", "int GroupRoleScope.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    GroupRoleScope groupRoleScope = new GroupRoleScope();
    groupRoleScope.area("Area");

    // Act and Assert
    assertNotEquals(groupRoleScope, new GroupRoleScope());
  }

  /**
   * Test {@link GroupRoleScope#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupRoleScope#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean GroupRoleScope.equals(Object)", "int GroupRoleScope.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    GroupRoleScope groupRoleScope = new GroupRoleScope();
    groupRoleScope.type("Type");

    // Act and Assert
    assertNotEquals(groupRoleScope, new GroupRoleScope());
  }

  /**
   * Test {@link GroupRoleScope#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupRoleScope#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean GroupRoleScope.equals(Object)", "int GroupRoleScope.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    GroupRoleScope groupRoleScope = new GroupRoleScope();
    groupRoleScope.active(true);

    // Act and Assert
    assertNotEquals(groupRoleScope, new GroupRoleScope());
  }

  /**
   * Test {@link GroupRoleScope#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupRoleScope#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean GroupRoleScope.equals(Object)", "int GroupRoleScope.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new GroupRoleScope(), null);
  }

  /**
   * Test {@link GroupRoleScope#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupRoleScope#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean GroupRoleScope.equals(Object)", "int GroupRoleScope.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new GroupRoleScope(), "Different type to GroupRoleScope");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link GroupRoleScope}
   *   <li>{@link GroupRoleScope#active(Boolean)}
   *   <li>{@link GroupRoleScope#area(String)}
   *   <li>{@link GroupRoleScope#id(String)}
   *   <li>{@link GroupRoleScope#name(String)}
   *   <li>{@link GroupRoleScope#setActive(Boolean)}
   *   <li>{@link GroupRoleScope#setArea(String)}
   *   <li>{@link GroupRoleScope#setId(String)}
   *   <li>{@link GroupRoleScope#setName(String)}
   *   <li>{@link GroupRoleScope#setType(String)}
   *   <li>{@link GroupRoleScope#type(String)}
   *   <li>{@link GroupRoleScope#toString()}
   *   <li>{@link GroupRoleScope#getActive()}
   *   <li>{@link GroupRoleScope#getArea()}
   *   <li>{@link GroupRoleScope#getId()}
   *   <li>{@link GroupRoleScope#getName()}
   *   <li>{@link GroupRoleScope#getType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void GroupRoleScope.<init>()", "GroupRoleScope GroupRoleScope.active(Boolean)",
      "GroupRoleScope GroupRoleScope.area(String)", "Boolean GroupRoleScope.getActive()",
      "String GroupRoleScope.getArea()", "String GroupRoleScope.getId()", "String GroupRoleScope.getName()",
      "String GroupRoleScope.getType()", "GroupRoleScope GroupRoleScope.id(String)",
      "GroupRoleScope GroupRoleScope.name(String)", "void GroupRoleScope.setActive(Boolean)",
      "void GroupRoleScope.setArea(String)", "void GroupRoleScope.setId(String)", "void GroupRoleScope.setName(String)",
      "void GroupRoleScope.setType(String)", "String GroupRoleScope.toString()",
      "GroupRoleScope GroupRoleScope.type(String)"})
  void testGettersAndSetters() {
    // Arrange and Act
    GroupRoleScope actualGroupRoleScope = new GroupRoleScope();
    GroupRoleScope actualActiveResult = actualGroupRoleScope.active(true);
    GroupRoleScope actualAreaResult = actualGroupRoleScope.area("Area");
    GroupRoleScope actualIdResult = actualGroupRoleScope.id("42");
    GroupRoleScope actualNameResult = actualGroupRoleScope.name("Name");
    actualGroupRoleScope.setActive(true);
    actualGroupRoleScope.setArea("Area");
    actualGroupRoleScope.setId("42");
    actualGroupRoleScope.setName("Name");
    actualGroupRoleScope.setType("Type");
    GroupRoleScope actualTypeResult = actualGroupRoleScope.type("Type");
    String actualToStringResult = actualGroupRoleScope.toString();
    Boolean actualActive = actualGroupRoleScope.getActive();
    String actualArea = actualGroupRoleScope.getArea();
    String actualId = actualGroupRoleScope.getId();
    String actualName = actualGroupRoleScope.getName();

    // Assert
    assertEquals("42", actualId);
    assertEquals("Area", actualArea);
    assertEquals("Name", actualName);
    assertEquals("Type", actualGroupRoleScope.getType());
    assertEquals(
        "class GroupRoleScope {\n    id: 42\n    name: Name\n    area: Area\n    type: Type\n    active: true\n}",
        actualToStringResult);
    assertTrue(actualActive);
    assertSame(actualGroupRoleScope, actualActiveResult);
    assertSame(actualGroupRoleScope, actualAreaResult);
    assertSame(actualGroupRoleScope, actualIdResult);
    assertSame(actualGroupRoleScope, actualNameResult);
    assertSame(actualGroupRoleScope, actualTypeResult);
  }
}
