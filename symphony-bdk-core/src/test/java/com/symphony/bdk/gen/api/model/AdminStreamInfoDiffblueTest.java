package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AdminStreamInfoDiffblueTest {
  /**
   * Test {@link AdminStreamInfo#equals(Object)}, and {@link AdminStreamInfo#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AdminStreamInfo#equals(Object)}
   *   <li>{@link AdminStreamInfo#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdminStreamInfo.equals(Object)", "int AdminStreamInfo.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AdminStreamInfo adminStreamInfo = new AdminStreamInfo();
    AdminStreamInfo adminStreamInfo2 = new AdminStreamInfo();

    // Act and Assert
    assertEquals(adminStreamInfo, adminStreamInfo2);
    assertEquals(adminStreamInfo.hashCode(), adminStreamInfo2.hashCode());
  }

  /**
   * Test {@link AdminStreamInfo#equals(Object)}, and {@link AdminStreamInfo#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AdminStreamInfo#equals(Object)}
   *   <li>{@link AdminStreamInfo#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdminStreamInfo.equals(Object)", "int AdminStreamInfo.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AdminStreamInfo adminStreamInfo = new AdminStreamInfo();

    // Act and Assert
    assertEquals(adminStreamInfo, adminStreamInfo);
    int expectedHashCodeResult = adminStreamInfo.hashCode();
    assertEquals(expectedHashCodeResult, adminStreamInfo.hashCode());
  }

  /**
   * Test {@link AdminStreamInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdminStreamInfo.equals(Object)", "int AdminStreamInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AdminStreamInfo(), 1);
  }

  /**
   * Test {@link AdminStreamInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdminStreamInfo.equals(Object)", "int AdminStreamInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    AdminStreamInfo adminStreamInfo = new AdminStreamInfo();
    adminStreamInfo.id("42");

    // Act and Assert
    assertNotEquals(adminStreamInfo, new AdminStreamInfo());
  }

  /**
   * Test {@link AdminStreamInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdminStreamInfo.equals(Object)", "int AdminStreamInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    AdminStreamInfo adminStreamInfo = new AdminStreamInfo();
    adminStreamInfo.setIsExternal(true);

    // Act and Assert
    assertNotEquals(adminStreamInfo, new AdminStreamInfo());
  }

  /**
   * Test {@link AdminStreamInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdminStreamInfo.equals(Object)", "int AdminStreamInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    AdminStreamInfo adminStreamInfo = new AdminStreamInfo();
    adminStreamInfo.setIsActive(true);

    // Act and Assert
    assertNotEquals(adminStreamInfo, new AdminStreamInfo());
  }

  /**
   * Test {@link AdminStreamInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdminStreamInfo.equals(Object)", "int AdminStreamInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    AdminStreamInfo adminStreamInfo = new AdminStreamInfo();
    adminStreamInfo.setIsPublic(true);

    // Act and Assert
    assertNotEquals(adminStreamInfo, new AdminStreamInfo());
  }

  /**
   * Test {@link AdminStreamInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdminStreamInfo.equals(Object)", "int AdminStreamInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    AdminStreamInfo adminStreamInfo = new AdminStreamInfo();
    adminStreamInfo.type("Type");

    // Act and Assert
    assertNotEquals(adminStreamInfo, new AdminStreamInfo());
  }

  /**
   * Test {@link AdminStreamInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdminStreamInfo.equals(Object)", "int AdminStreamInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    AdminStreamInfo adminStreamInfo = new AdminStreamInfo();
    adminStreamInfo.attributes(new AdminStreamAttributes());

    // Act and Assert
    assertNotEquals(adminStreamInfo, new AdminStreamInfo());
  }

  /**
   * Test {@link AdminStreamInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdminStreamInfo.equals(Object)", "int AdminStreamInfo.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AdminStreamInfo(), null);
  }

  /**
   * Test {@link AdminStreamInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdminStreamInfo.equals(Object)", "int AdminStreamInfo.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AdminStreamInfo(), "Different type to AdminStreamInfo");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link AdminStreamInfo}
   *   <li>{@link AdminStreamInfo#attributes(AdminStreamAttributes)}
   *   <li>{@link AdminStreamInfo#id(String)}
   *   <li>{@link AdminStreamInfo#setAttributes(AdminStreamAttributes)}
   *   <li>{@link AdminStreamInfo#setId(String)}
   *   <li>{@link AdminStreamInfo#setIsActive(Boolean)}
   *   <li>{@link AdminStreamInfo#setIsExternal(Boolean)}
   *   <li>{@link AdminStreamInfo#setIsPublic(Boolean)}
   *   <li>{@link AdminStreamInfo#setType(String)}
   *   <li>{@link AdminStreamInfo#type(String)}
   *   <li>{@link AdminStreamInfo#isActive(Boolean)}
   *   <li>{@link AdminStreamInfo#isExternal(Boolean)}
   *   <li>{@link AdminStreamInfo#isPublic(Boolean)}
   *   <li>{@link AdminStreamInfo#toString()}
   *   <li>{@link AdminStreamInfo#getAttributes()}
   *   <li>{@link AdminStreamInfo#getId()}
   *   <li>{@link AdminStreamInfo#getIsActive()}
   *   <li>{@link AdminStreamInfo#getIsExternal()}
   *   <li>{@link AdminStreamInfo#getIsPublic()}
   *   <li>{@link AdminStreamInfo#getType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AdminStreamInfo.<init>()",
    "AdminStreamInfo AdminStreamInfo.attributes(AdminStreamAttributes)",
    "AdminStreamAttributes AdminStreamInfo.getAttributes()",
    "String AdminStreamInfo.getId()",
    "Boolean AdminStreamInfo.getIsActive()",
    "Boolean AdminStreamInfo.getIsExternal()",
    "Boolean AdminStreamInfo.getIsPublic()",
    "String AdminStreamInfo.getType()",
    "AdminStreamInfo AdminStreamInfo.id(String)",
    "AdminStreamInfo AdminStreamInfo.isActive(Boolean)",
    "AdminStreamInfo AdminStreamInfo.isExternal(Boolean)",
    "AdminStreamInfo AdminStreamInfo.isPublic(Boolean)",
    "void AdminStreamInfo.setAttributes(AdminStreamAttributes)",
    "void AdminStreamInfo.setId(String)",
    "void AdminStreamInfo.setIsActive(Boolean)",
    "void AdminStreamInfo.setIsExternal(Boolean)",
    "void AdminStreamInfo.setIsPublic(Boolean)",
    "void AdminStreamInfo.setType(String)",
    "String AdminStreamInfo.toString()",
    "AdminStreamInfo AdminStreamInfo.type(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    AdminStreamInfo actualAdminStreamInfo = new AdminStreamInfo();
    AdminStreamInfo actualAttributesResult =
        actualAdminStreamInfo.attributes(new AdminStreamAttributes());
    AdminStreamInfo actualIdResult = actualAdminStreamInfo.id("42");
    AdminStreamAttributes attributes = new AdminStreamAttributes();
    actualAdminStreamInfo.setAttributes(attributes);
    actualAdminStreamInfo.setId("42");
    actualAdminStreamInfo.setIsActive(true);
    actualAdminStreamInfo.setIsExternal(true);
    actualAdminStreamInfo.setIsPublic(true);
    actualAdminStreamInfo.setType("Type");
    AdminStreamInfo actualTypeResult = actualAdminStreamInfo.type("Type");
    AdminStreamInfo actualIsActiveResult = actualAdminStreamInfo.isActive(true);
    AdminStreamInfo actualIsExternalResult = actualAdminStreamInfo.isExternal(true);
    AdminStreamInfo actualIsPublicResult = actualAdminStreamInfo.isPublic(true);
    String actualToStringResult = actualAdminStreamInfo.toString();
    AdminStreamAttributes actualAttributes = actualAdminStreamInfo.getAttributes();
    String actualId = actualAdminStreamInfo.getId();
    Boolean actualIsActive = actualAdminStreamInfo.getIsActive();
    Boolean actualIsExternal = actualAdminStreamInfo.getIsExternal();
    Boolean actualIsPublic = actualAdminStreamInfo.getIsPublic();

    // Assert
    assertEquals("42", actualId);
    assertEquals("Type", actualAdminStreamInfo.getType());
    assertEquals(
        "class AdminStreamInfo {\n"
            + "    id: 42\n"
            + "    isExternal: true\n"
            + "    isActive: true\n"
            + "    isPublic: true\n"
            + "    type: Type\n"
            + "    attributes: class AdminStreamAttributes {\n"
            + "        roomName: null\n"
            + "        roomDescription: null\n"
            + "        members: null\n"
            + "        createdByUserId: null\n"
            + "        createdDate: null\n"
            + "        lastModifiedDate: null\n"
            + "        originCompany: null\n"
            + "        originCompanyId: null\n"
            + "        membersCount: null\n"
            + "    }\n"
            + "}",
        actualToStringResult);
    assertTrue(actualIsActive);
    assertTrue(actualIsExternal);
    assertTrue(actualIsPublic);
    assertSame(attributes, actualAttributes);
    assertSame(actualAdminStreamInfo, actualAttributesResult);
    assertSame(actualAdminStreamInfo, actualIdResult);
    assertSame(actualAdminStreamInfo, actualIsActiveResult);
    assertSame(actualAdminStreamInfo, actualIsExternalResult);
    assertSame(actualAdminStreamInfo, actualIsPublicResult);
    assertSame(actualAdminStreamInfo, actualTypeResult);
  }
}
