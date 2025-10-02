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

class GroupDiffblueTest {
  /**
   * Test {@link Group#addPoliciesItem(String)}.
   *
   * <ul>
   *   <li>Given {@link Group} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link Group#addPoliciesItem(String)}
   */
  @Test
  @DisplayName("Test addPoliciesItem(String); given Group (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Group Group.addPoliciesItem(String)"})
  void testAddPoliciesItem_givenGroup() {
    // Arrange
    Group group = new Group();

    // Act
    Group actualAddPoliciesItemResult = group.addPoliciesItem("Policies Item");

    // Assert
    assertSame(group, actualAddPoliciesItemResult);
  }

  /**
   * Test {@link Group#addPoliciesItem(String)}.
   *
   * <ul>
   *   <li>Given {@link Group} (default constructor) policies {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link Group#addPoliciesItem(String)}
   */
  @Test
  @DisplayName(
      "Test addPoliciesItem(String); given Group (default constructor) policies ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Group Group.addPoliciesItem(String)"})
  void testAddPoliciesItem_givenGroupPoliciesArrayList() {
    // Arrange
    Group group = new Group();
    group.policies(new ArrayList<>());

    // Act
    Group actualAddPoliciesItemResult = group.addPoliciesItem("Policies Item");

    // Assert
    assertSame(group, actualAddPoliciesItemResult);
  }

  /**
   * Test {@link Group#equals(Object)}, and {@link Group#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Group#equals(Object)}
   *   <li>{@link Group#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Group.equals(Object)", "int Group.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Group group = new Group();
    Group group2 = new Group();

    // Act and Assert
    assertEquals(group, group2);
    assertEquals(group.hashCode(), group2.hashCode());
  }

  /**
   * Test {@link Group#equals(Object)}, and {@link Group#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Group#equals(Object)}
   *   <li>{@link Group#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Group.equals(Object)", "int Group.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Group group = new Group();

    // Act and Assert
    assertEquals(group, group);
    int expectedHashCodeResult = group.hashCode();
    assertEquals(expectedHashCodeResult, group.hashCode());
  }

  /**
   * Test {@link Group#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Group#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Group.equals(Object)", "int Group.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Group group = new Group();
    group.addPoliciesItem("Policies Item");

    // Act and Assert
    assertNotEquals(group, new Group());
  }

  /**
   * Test {@link Group#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Group#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Group.equals(Object)", "int Group.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Group group = new Group();
    group.id("42");
    group.addPoliciesItem("Policies Item");

    // Act and Assert
    assertNotEquals(group, new Group());
  }

  /**
   * Test {@link Group#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Group#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Group.equals(Object)", "int Group.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Group group = new Group();
    group.name("Name");
    group.addPoliciesItem("Policies Item");

    // Act and Assert
    assertNotEquals(group, new Group());
  }

  /**
   * Test {@link Group#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Group#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Group.equals(Object)", "int Group.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    Group group = new Group();
    group.active(true);
    group.addPoliciesItem("Policies Item");

    // Act and Assert
    assertNotEquals(group, new Group());
  }

  /**
   * Test {@link Group#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Group#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Group.equals(Object)", "int Group.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    Group group = new Group();
    group.memberCount(3);
    group.addPoliciesItem("Policies Item");

    // Act and Assert
    assertNotEquals(group, new Group());
  }

  /**
   * Test {@link Group#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Group#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Group.equals(Object)", "int Group.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    Group group = new Group();
    group.createdDate(1L);

    // Act and Assert
    assertNotEquals(group, new Group());
  }

  /**
   * Test {@link Group#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Group#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Group.equals(Object)", "int Group.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    Group group = new Group();
    group.modifiedDate(1L);

    // Act and Assert
    assertNotEquals(group, new Group());
  }

  /**
   * Test {@link Group#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Group#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Group.equals(Object)", "int Group.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Group(), null);
  }

  /**
   * Test {@link Group#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Group#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Group.equals(Object)", "int Group.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Group(), "Different type to Group");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link Group}
   *   <li>{@link Group#active(Boolean)}
   *   <li>{@link Group#createdDate(Long)}
   *   <li>{@link Group#id(String)}
   *   <li>{@link Group#memberCount(Integer)}
   *   <li>{@link Group#modifiedDate(Long)}
   *   <li>{@link Group#name(String)}
   *   <li>{@link Group#policies(List)}
   *   <li>{@link Group#setActive(Boolean)}
   *   <li>{@link Group#setCreatedDate(Long)}
   *   <li>{@link Group#setId(String)}
   *   <li>{@link Group#setMemberCount(Integer)}
   *   <li>{@link Group#setModifiedDate(Long)}
   *   <li>{@link Group#setName(String)}
   *   <li>{@link Group#setPolicies(List)}
   *   <li>{@link Group#toString()}
   *   <li>{@link Group#getActive()}
   *   <li>{@link Group#getCreatedDate()}
   *   <li>{@link Group#getId()}
   *   <li>{@link Group#getMemberCount()}
   *   <li>{@link Group#getModifiedDate()}
   *   <li>{@link Group#getName()}
   *   <li>{@link Group#getPolicies()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Group.<init>()",
    "Group Group.active(Boolean)",
    "Group Group.createdDate(Long)",
    "Boolean Group.getActive()",
    "Long Group.getCreatedDate()",
    "String Group.getId()",
    "Integer Group.getMemberCount()",
    "Long Group.getModifiedDate()",
    "String Group.getName()",
    "List Group.getPolicies()",
    "Group Group.id(String)",
    "Group Group.memberCount(Integer)",
    "Group Group.modifiedDate(Long)",
    "Group Group.name(String)",
    "Group Group.policies(List)",
    "void Group.setActive(Boolean)",
    "void Group.setCreatedDate(Long)",
    "void Group.setId(String)",
    "void Group.setMemberCount(Integer)",
    "void Group.setModifiedDate(Long)",
    "void Group.setName(String)",
    "void Group.setPolicies(List)",
    "String Group.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    Group actualGroup = new Group();
    Group actualActiveResult = actualGroup.active(true);
    Group actualCreatedDateResult = actualGroup.createdDate(1L);
    Group actualIdResult = actualGroup.id("42");
    Group actualMemberCountResult = actualGroup.memberCount(3);
    Group actualModifiedDateResult = actualGroup.modifiedDate(1L);
    Group actualNameResult = actualGroup.name("Name");
    Group actualPoliciesResult = actualGroup.policies(new ArrayList<>());
    actualGroup.setActive(true);
    actualGroup.setCreatedDate(1L);
    actualGroup.setId("42");
    actualGroup.setMemberCount(3);
    actualGroup.setModifiedDate(1L);
    actualGroup.setName("Name");
    ArrayList<String> policies = new ArrayList<>();
    actualGroup.setPolicies(policies);
    String actualToStringResult = actualGroup.toString();
    Boolean actualActive = actualGroup.getActive();
    Long actualCreatedDate = actualGroup.getCreatedDate();
    String actualId = actualGroup.getId();
    Integer actualMemberCount = actualGroup.getMemberCount();
    Long actualModifiedDate = actualGroup.getModifiedDate();
    String actualName = actualGroup.getName();
    List<String> actualPolicies = actualGroup.getPolicies();

    // Assert
    assertEquals("42", actualId);
    assertEquals("Name", actualName);
    assertEquals(
        "class Group {\n"
            + "    id: 42\n"
            + "    name: Name\n"
            + "    active: true\n"
            + "    memberCount: 3\n"
            + "    policies: []\n"
            + "    createdDate: 1\n"
            + "    modifiedDate: 1\n"
            + "}",
        actualToStringResult);
    assertEquals(1L, actualCreatedDate.longValue());
    assertEquals(1L, actualModifiedDate.longValue());
    assertEquals(3, actualMemberCount.intValue());
    assertTrue(actualActive);
    assertTrue(actualPolicies.isEmpty());
    assertSame(actualGroup, actualActiveResult);
    assertSame(actualGroup, actualCreatedDateResult);
    assertSame(actualGroup, actualIdResult);
    assertSame(actualGroup, actualMemberCountResult);
    assertSame(actualGroup, actualModifiedDateResult);
    assertSame(actualGroup, actualNameResult);
    assertSame(actualGroup, actualPoliciesResult);
    assertSame(policies, actualPolicies);
  }
}
