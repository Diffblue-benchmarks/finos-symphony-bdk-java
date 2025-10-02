package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.AdminStreamFilter.OriginEnum;
import com.symphony.bdk.gen.api.model.AdminStreamFilter.PrivacyEnum;
import com.symphony.bdk.gen.api.model.AdminStreamFilter.ScopeEnum;
import com.symphony.bdk.gen.api.model.AdminStreamFilter.StatusEnum;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AdminStreamFilterDiffblueTest {
  /**
   * Test {@link AdminStreamFilter#addStreamTypesItem(AdminStreamTypeEnum)}.
   *
   * <ul>
   *   <li>Given {@link AdminStreamFilter} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamFilter#addStreamTypesItem(AdminStreamTypeEnum)}
   */
  @Test
  @DisplayName(
      "Test addStreamTypesItem(AdminStreamTypeEnum); given AdminStreamFilter (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AdminStreamFilter AdminStreamFilter.addStreamTypesItem(AdminStreamTypeEnum)"})
  void testAddStreamTypesItem_givenAdminStreamFilter() {
    // Arrange
    AdminStreamFilter adminStreamFilter = new AdminStreamFilter();

    // Act
    AdminStreamFilter actualAddStreamTypesItemResult =
        adminStreamFilter.addStreamTypesItem(new AdminStreamTypeEnum());

    // Assert
    assertSame(adminStreamFilter, actualAddStreamTypesItemResult);
  }

  /**
   * Test {@link AdminStreamFilter#addStreamTypesItem(AdminStreamTypeEnum)}.
   *
   * <ul>
   *   <li>Given {@link AdminStreamFilter} (default constructor) streamTypes {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamFilter#addStreamTypesItem(AdminStreamTypeEnum)}
   */
  @Test
  @DisplayName(
      "Test addStreamTypesItem(AdminStreamTypeEnum); given AdminStreamFilter (default constructor) streamTypes ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AdminStreamFilter AdminStreamFilter.addStreamTypesItem(AdminStreamTypeEnum)"})
  void testAddStreamTypesItem_givenAdminStreamFilterStreamTypesArrayList() {
    // Arrange
    AdminStreamFilter adminStreamFilter = new AdminStreamFilter();
    adminStreamFilter.streamTypes(new ArrayList<>());

    // Act
    AdminStreamFilter actualAddStreamTypesItemResult =
        adminStreamFilter.addStreamTypesItem(new AdminStreamTypeEnum());

    // Assert
    assertSame(adminStreamFilter, actualAddStreamTypesItemResult);
  }

  /**
   * Test {@link AdminStreamFilter#equals(Object)}, and {@link AdminStreamFilter#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AdminStreamFilter#equals(Object)}
   *   <li>{@link AdminStreamFilter#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamFilter.equals(Object)",
    "int AdminStreamFilter.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AdminStreamFilter adminStreamFilter = new AdminStreamFilter();
    AdminStreamFilter adminStreamFilter2 = new AdminStreamFilter();

    // Act and Assert
    assertEquals(adminStreamFilter, adminStreamFilter2);
    assertEquals(adminStreamFilter.hashCode(), adminStreamFilter2.hashCode());
  }

  /**
   * Test {@link AdminStreamFilter#equals(Object)}, and {@link AdminStreamFilter#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AdminStreamFilter#equals(Object)}
   *   <li>{@link AdminStreamFilter#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamFilter.equals(Object)",
    "int AdminStreamFilter.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AdminStreamFilter adminStreamFilter = new AdminStreamFilter();

    // Act and Assert
    assertEquals(adminStreamFilter, adminStreamFilter);
    int expectedHashCodeResult = adminStreamFilter.hashCode();
    assertEquals(expectedHashCodeResult, adminStreamFilter.hashCode());
  }

  /**
   * Test {@link AdminStreamFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamFilter.equals(Object)",
    "int AdminStreamFilter.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    AdminStreamFilter adminStreamFilter = new AdminStreamFilter();
    adminStreamFilter.addStreamTypesItem(new AdminStreamTypeEnum());

    // Act and Assert
    assertNotEquals(adminStreamFilter, new AdminStreamFilter());
  }

  /**
   * Test {@link AdminStreamFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamFilter.equals(Object)",
    "int AdminStreamFilter.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    AdminStreamFilter adminStreamFilter = new AdminStreamFilter();
    adminStreamFilter.scope(ScopeEnum.INTERNAL);

    // Act and Assert
    assertNotEquals(adminStreamFilter, new AdminStreamFilter());
  }

  /**
   * Test {@link AdminStreamFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamFilter.equals(Object)",
    "int AdminStreamFilter.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    AdminStreamFilter adminStreamFilter = new AdminStreamFilter();
    adminStreamFilter.origin(OriginEnum.INTERNAL);

    // Act and Assert
    assertNotEquals(adminStreamFilter, new AdminStreamFilter());
  }

  /**
   * Test {@link AdminStreamFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamFilter.equals(Object)",
    "int AdminStreamFilter.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    AdminStreamFilter adminStreamFilter = new AdminStreamFilter();
    adminStreamFilter.status(StatusEnum.ACTIVE);

    // Act and Assert
    assertNotEquals(adminStreamFilter, new AdminStreamFilter());
  }

  /**
   * Test {@link AdminStreamFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamFilter.equals(Object)",
    "int AdminStreamFilter.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    AdminStreamFilter adminStreamFilter = new AdminStreamFilter();
    adminStreamFilter.privacy(PrivacyEnum.PUBLIC);

    // Act and Assert
    assertNotEquals(adminStreamFilter, new AdminStreamFilter());
  }

  /**
   * Test {@link AdminStreamFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamFilter.equals(Object)",
    "int AdminStreamFilter.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    AdminStreamFilter adminStreamFilter = new AdminStreamFilter();
    adminStreamFilter.startDate(1L);

    // Act and Assert
    assertNotEquals(adminStreamFilter, new AdminStreamFilter());
  }

  /**
   * Test {@link AdminStreamFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamFilter.equals(Object)",
    "int AdminStreamFilter.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    AdminStreamFilter adminStreamFilter = new AdminStreamFilter();
    adminStreamFilter.endDate(1L);

    // Act and Assert
    assertNotEquals(adminStreamFilter, new AdminStreamFilter());
  }

  /**
   * Test {@link AdminStreamFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamFilter.equals(Object)",
    "int AdminStreamFilter.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AdminStreamFilter(), null);
  }

  /**
   * Test {@link AdminStreamFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamFilter.equals(Object)",
    "int AdminStreamFilter.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AdminStreamFilter(), "Different type to AdminStreamFilter");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link AdminStreamFilter}
   *   <li>{@link AdminStreamFilter#endDate(Long)}
   *   <li>{@link AdminStreamFilter#origin(OriginEnum)}
   *   <li>{@link AdminStreamFilter#privacy(PrivacyEnum)}
   *   <li>{@link AdminStreamFilter#scope(ScopeEnum)}
   *   <li>{@link AdminStreamFilter#setEndDate(Long)}
   *   <li>{@link AdminStreamFilter#setOrigin(OriginEnum)}
   *   <li>{@link AdminStreamFilter#setPrivacy(PrivacyEnum)}
   *   <li>{@link AdminStreamFilter#setScope(ScopeEnum)}
   *   <li>{@link AdminStreamFilter#setStartDate(Long)}
   *   <li>{@link AdminStreamFilter#setStatus(StatusEnum)}
   *   <li>{@link AdminStreamFilter#setStreamTypes(List)}
   *   <li>{@link AdminStreamFilter#startDate(Long)}
   *   <li>{@link AdminStreamFilter#status(StatusEnum)}
   *   <li>{@link AdminStreamFilter#streamTypes(List)}
   *   <li>{@link AdminStreamFilter#toString()}
   *   <li>{@link AdminStreamFilter#getEndDate()}
   *   <li>{@link AdminStreamFilter#getOrigin()}
   *   <li>{@link AdminStreamFilter#getPrivacy()}
   *   <li>{@link AdminStreamFilter#getScope()}
   *   <li>{@link AdminStreamFilter#getStartDate()}
   *   <li>{@link AdminStreamFilter#getStatus()}
   *   <li>{@link AdminStreamFilter#getStreamTypes()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AdminStreamFilter.<init>()",
    "AdminStreamFilter AdminStreamFilter.endDate(Long)",
    "Long AdminStreamFilter.getEndDate()",
    "OriginEnum AdminStreamFilter.getOrigin()",
    "PrivacyEnum AdminStreamFilter.getPrivacy()",
    "ScopeEnum AdminStreamFilter.getScope()",
    "Long AdminStreamFilter.getStartDate()",
    "StatusEnum AdminStreamFilter.getStatus()",
    "List AdminStreamFilter.getStreamTypes()",
    "AdminStreamFilter AdminStreamFilter.origin(OriginEnum)",
    "AdminStreamFilter AdminStreamFilter.privacy(PrivacyEnum)",
    "AdminStreamFilter AdminStreamFilter.scope(ScopeEnum)",
    "void AdminStreamFilter.setEndDate(Long)",
    "void AdminStreamFilter.setOrigin(OriginEnum)",
    "void AdminStreamFilter.setPrivacy(PrivacyEnum)",
    "void AdminStreamFilter.setScope(ScopeEnum)",
    "void AdminStreamFilter.setStartDate(Long)",
    "void AdminStreamFilter.setStatus(StatusEnum)",
    "void AdminStreamFilter.setStreamTypes(List)",
    "AdminStreamFilter AdminStreamFilter.startDate(Long)",
    "AdminStreamFilter AdminStreamFilter.status(StatusEnum)",
    "AdminStreamFilter AdminStreamFilter.streamTypes(List)",
    "String AdminStreamFilter.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    AdminStreamFilter actualAdminStreamFilter = new AdminStreamFilter();
    AdminStreamFilter actualEndDateResult = actualAdminStreamFilter.endDate(1L);
    AdminStreamFilter actualOriginResult = actualAdminStreamFilter.origin(OriginEnum.INTERNAL);
    AdminStreamFilter actualPrivacyResult = actualAdminStreamFilter.privacy(PrivacyEnum.PUBLIC);
    AdminStreamFilter actualScopeResult = actualAdminStreamFilter.scope(ScopeEnum.INTERNAL);
    actualAdminStreamFilter.setEndDate(1L);
    actualAdminStreamFilter.setOrigin(OriginEnum.INTERNAL);
    actualAdminStreamFilter.setPrivacy(PrivacyEnum.PUBLIC);
    actualAdminStreamFilter.setScope(ScopeEnum.INTERNAL);
    actualAdminStreamFilter.setStartDate(1L);
    actualAdminStreamFilter.setStatus(StatusEnum.ACTIVE);
    actualAdminStreamFilter.setStreamTypes(new ArrayList<>());
    AdminStreamFilter actualStartDateResult = actualAdminStreamFilter.startDate(1L);
    AdminStreamFilter actualStatusResult = actualAdminStreamFilter.status(StatusEnum.ACTIVE);
    ArrayList<AdminStreamTypeEnum> streamTypes = new ArrayList<>();
    AdminStreamFilter actualStreamTypesResult = actualAdminStreamFilter.streamTypes(streamTypes);
    String actualToStringResult = actualAdminStreamFilter.toString();
    Long actualEndDate = actualAdminStreamFilter.getEndDate();
    OriginEnum actualOrigin = actualAdminStreamFilter.getOrigin();
    PrivacyEnum actualPrivacy = actualAdminStreamFilter.getPrivacy();
    ScopeEnum actualScope = actualAdminStreamFilter.getScope();
    Long actualStartDate = actualAdminStreamFilter.getStartDate();
    StatusEnum actualStatus = actualAdminStreamFilter.getStatus();
    List<AdminStreamTypeEnum> actualStreamTypes = actualAdminStreamFilter.getStreamTypes();

    // Assert
    assertEquals(
        "class AdminStreamFilter {\n"
            + "    streamTypes: []\n"
            + "    scope: INTERNAL\n"
            + "    origin: INTERNAL\n"
            + "    status: ACTIVE\n"
            + "    privacy: PUBLIC\n"
            + "    startDate: 1\n"
            + "    endDate: 1\n"
            + "}",
        actualToStringResult);
    assertEquals(1L, actualEndDate.longValue());
    assertEquals(1L, actualStartDate.longValue());
    assertEquals(OriginEnum.INTERNAL, actualOrigin);
    assertEquals(PrivacyEnum.PUBLIC, actualPrivacy);
    assertEquals(ScopeEnum.INTERNAL, actualScope);
    assertEquals(StatusEnum.ACTIVE, actualStatus);
    assertTrue(actualStreamTypes.isEmpty());
    assertSame(actualAdminStreamFilter, actualEndDateResult);
    assertSame(actualAdminStreamFilter, actualOriginResult);
    assertSame(actualAdminStreamFilter, actualPrivacyResult);
    assertSame(actualAdminStreamFilter, actualScopeResult);
    assertSame(actualAdminStreamFilter, actualStartDateResult);
    assertSame(actualAdminStreamFilter, actualStatusResult);
    assertSame(actualAdminStreamFilter, actualStreamTypesResult);
    assertSame(streamTypes, actualStreamTypes);
  }

  /**
   * Test OriginEnum {@link OriginEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link OriginEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test OriginEnum fromValue(String); when '42'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"OriginEnum OriginEnum.fromValue(String)"})
  void testOriginEnumFromValue_when42_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(OriginEnum.fromValue("42"));
  }

  /**
   * Test OriginEnum {@link OriginEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code INTERNAL}.
   *   <li>Then return {@code INTERNAL}.
   * </ul>
   *
   * <p>Method under test: {@link OriginEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test OriginEnum fromValue(String); when 'INTERNAL'; then return 'INTERNAL'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"OriginEnum OriginEnum.fromValue(String)"})
  void testOriginEnumFromValue_whenInternal_thenReturnInternal() {
    // Arrange, Act and Assert
    assertEquals(OriginEnum.INTERNAL, OriginEnum.fromValue("INTERNAL"));
  }

  /**
   * Test OriginEnum getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link OriginEnum#toString()}
   *   <li>{@link OriginEnum#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test OriginEnum getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OriginEnum.getValue()", "String OriginEnum.toString()"})
  void testOriginEnumGettersAndSetters() {
    // Arrange
    OriginEnum valueOfResult = OriginEnum.valueOf("INTERNAL");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("INTERNAL", valueOfResult.getValue());
    assertEquals("INTERNAL", actualToStringResult);
  }

  /**
   * Test PrivacyEnum {@link PrivacyEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link PrivacyEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test PrivacyEnum fromValue(String); when '42'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PrivacyEnum PrivacyEnum.fromValue(String)"})
  void testPrivacyEnumFromValue_when42_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(PrivacyEnum.fromValue("42"));
  }

  /**
   * Test PrivacyEnum {@link PrivacyEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code PUBLIC}.
   *   <li>Then return {@code PUBLIC}.
   * </ul>
   *
   * <p>Method under test: {@link PrivacyEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test PrivacyEnum fromValue(String); when 'PUBLIC'; then return 'PUBLIC'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PrivacyEnum PrivacyEnum.fromValue(String)"})
  void testPrivacyEnumFromValue_whenPublic_thenReturnPublic() {
    // Arrange, Act and Assert
    assertEquals(PrivacyEnum.PUBLIC, PrivacyEnum.fromValue("PUBLIC"));
  }

  /**
   * Test PrivacyEnum getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PrivacyEnum#toString()}
   *   <li>{@link PrivacyEnum#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test PrivacyEnum getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String PrivacyEnum.getValue()", "String PrivacyEnum.toString()"})
  void testPrivacyEnumGettersAndSetters() {
    // Arrange
    PrivacyEnum valueOfResult = PrivacyEnum.valueOf("PUBLIC");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("PUBLIC", valueOfResult.getValue());
    assertEquals("PUBLIC", actualToStringResult);
  }

  /**
   * Test ScopeEnum {@link ScopeEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ScopeEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test ScopeEnum fromValue(String); when '42'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ScopeEnum ScopeEnum.fromValue(String)"})
  void testScopeEnumFromValue_when42_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ScopeEnum.fromValue("42"));
  }

  /**
   * Test ScopeEnum {@link ScopeEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code INTERNAL}.
   *   <li>Then return {@code INTERNAL}.
   * </ul>
   *
   * <p>Method under test: {@link ScopeEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test ScopeEnum fromValue(String); when 'INTERNAL'; then return 'INTERNAL'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ScopeEnum ScopeEnum.fromValue(String)"})
  void testScopeEnumFromValue_whenInternal_thenReturnInternal() {
    // Arrange, Act and Assert
    assertEquals(ScopeEnum.INTERNAL, ScopeEnum.fromValue("INTERNAL"));
  }

  /**
   * Test ScopeEnum getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ScopeEnum#toString()}
   *   <li>{@link ScopeEnum#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test ScopeEnum getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ScopeEnum.getValue()", "String ScopeEnum.toString()"})
  void testScopeEnumGettersAndSetters() {
    // Arrange
    ScopeEnum valueOfResult = ScopeEnum.valueOf("INTERNAL");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("INTERNAL", valueOfResult.getValue());
    assertEquals("INTERNAL", actualToStringResult);
  }

  /**
   * Test StatusEnum {@link StatusEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link StatusEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test StatusEnum fromValue(String); when '42'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StatusEnum StatusEnum.fromValue(String)"})
  void testStatusEnumFromValue_when42_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(StatusEnum.fromValue("42"));
  }

  /**
   * Test StatusEnum {@link StatusEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code ACTIVE}.
   *   <li>Then return {@code ACTIVE}.
   * </ul>
   *
   * <p>Method under test: {@link StatusEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test StatusEnum fromValue(String); when 'ACTIVE'; then return 'ACTIVE'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StatusEnum StatusEnum.fromValue(String)"})
  void testStatusEnumFromValue_whenActive_thenReturnActive() {
    // Arrange, Act and Assert
    assertEquals(StatusEnum.ACTIVE, StatusEnum.fromValue("ACTIVE"));
  }

  /**
   * Test StatusEnum getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link StatusEnum#toString()}
   *   <li>{@link StatusEnum#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test StatusEnum getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String StatusEnum.getValue()", "String StatusEnum.toString()"})
  void testStatusEnumGettersAndSetters() {
    // Arrange
    StatusEnum valueOfResult = StatusEnum.valueOf("ACTIVE");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("ACTIVE", valueOfResult.getValue());
    assertEquals("ACTIVE", actualToStringResult);
  }
}
