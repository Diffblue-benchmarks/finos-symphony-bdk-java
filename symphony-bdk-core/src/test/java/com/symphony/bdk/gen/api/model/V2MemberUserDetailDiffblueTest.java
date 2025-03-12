package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V2MemberUserDetailDiffblueTest {
  /**
   * Test {@link V2MemberUserDetail#equals(Object)}, and {@link V2MemberUserDetail#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V2MemberUserDetail#equals(Object)}
   *   <li>{@link V2MemberUserDetail#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2MemberUserDetail.equals(Object)", "int V2MemberUserDetail.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2MemberUserDetail v2MemberUserDetail = new V2MemberUserDetail();
    V2MemberUserDetail v2MemberUserDetail2 = new V2MemberUserDetail();

    // Act and Assert
    assertEquals(v2MemberUserDetail, v2MemberUserDetail2);
    int expectedHashCodeResult = v2MemberUserDetail.hashCode();
    assertEquals(expectedHashCodeResult, v2MemberUserDetail2.hashCode());
  }

  /**
   * Test {@link V2MemberUserDetail#equals(Object)}, and {@link V2MemberUserDetail#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V2MemberUserDetail#equals(Object)}
   *   <li>{@link V2MemberUserDetail#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2MemberUserDetail.equals(Object)", "int V2MemberUserDetail.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2MemberUserDetail v2MemberUserDetail = new V2MemberUserDetail();

    // Act and Assert
    assertEquals(v2MemberUserDetail, v2MemberUserDetail);
    int expectedHashCodeResult = v2MemberUserDetail.hashCode();
    assertEquals(expectedHashCodeResult, v2MemberUserDetail.hashCode());
  }

  /**
   * Test {@link V2MemberUserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2MemberUserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2MemberUserDetail.equals(Object)", "int V2MemberUserDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2MemberUserDetail(), 1);
  }

  /**
   * Test {@link V2MemberUserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2MemberUserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2MemberUserDetail.equals(Object)", "int V2MemberUserDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V2MemberUserDetail v2MemberUserDetail = new V2MemberUserDetail();
    v2MemberUserDetail.userId(1L);

    // Act and Assert
    assertNotEquals(v2MemberUserDetail, new V2MemberUserDetail());
  }

  /**
   * Test {@link V2MemberUserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2MemberUserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2MemberUserDetail.equals(Object)", "int V2MemberUserDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V2MemberUserDetail v2MemberUserDetail = new V2MemberUserDetail();
    v2MemberUserDetail.email("jane.doe@example.org");

    // Act and Assert
    assertNotEquals(v2MemberUserDetail, new V2MemberUserDetail());
  }

  /**
   * Test {@link V2MemberUserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2MemberUserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2MemberUserDetail.equals(Object)", "int V2MemberUserDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V2MemberUserDetail v2MemberUserDetail = new V2MemberUserDetail();
    v2MemberUserDetail.firstName("Jane");

    // Act and Assert
    assertNotEquals(v2MemberUserDetail, new V2MemberUserDetail());
  }

  /**
   * Test {@link V2MemberUserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2MemberUserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2MemberUserDetail.equals(Object)", "int V2MemberUserDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V2MemberUserDetail v2MemberUserDetail = new V2MemberUserDetail();
    v2MemberUserDetail.lastName("Doe");

    // Act and Assert
    assertNotEquals(v2MemberUserDetail, new V2MemberUserDetail());
  }

  /**
   * Test {@link V2MemberUserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2MemberUserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2MemberUserDetail.equals(Object)", "int V2MemberUserDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    V2MemberUserDetail v2MemberUserDetail = new V2MemberUserDetail();
    v2MemberUserDetail.displayName("Display Name");

    // Act and Assert
    assertNotEquals(v2MemberUserDetail, new V2MemberUserDetail());
  }

  /**
   * Test {@link V2MemberUserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2MemberUserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2MemberUserDetail.equals(Object)", "int V2MemberUserDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    V2MemberUserDetail v2MemberUserDetail = new V2MemberUserDetail();
    v2MemberUserDetail.company("Company");

    // Act and Assert
    assertNotEquals(v2MemberUserDetail, new V2MemberUserDetail());
  }

  /**
   * Test {@link V2MemberUserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2MemberUserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2MemberUserDetail.equals(Object)", "int V2MemberUserDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    V2MemberUserDetail v2MemberUserDetail = new V2MemberUserDetail();
    v2MemberUserDetail.companyId(1);

    // Act and Assert
    assertNotEquals(v2MemberUserDetail, new V2MemberUserDetail());
  }

  /**
   * Test {@link V2MemberUserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2MemberUserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2MemberUserDetail.equals(Object)", "int V2MemberUserDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    V2MemberUserDetail v2MemberUserDetail = new V2MemberUserDetail();
    v2MemberUserDetail.setIsExternal(true);

    // Act and Assert
    assertNotEquals(v2MemberUserDetail, new V2MemberUserDetail());
  }

  /**
   * Test {@link V2MemberUserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2MemberUserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2MemberUserDetail.equals(Object)", "int V2MemberUserDetail.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2MemberUserDetail(), null);
  }

  /**
   * Test {@link V2MemberUserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2MemberUserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2MemberUserDetail.equals(Object)", "int V2MemberUserDetail.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2MemberUserDetail(), "Different type to V2MemberUserDetail");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V2MemberUserDetail}
   *   <li>{@link V2MemberUserDetail#company(String)}
   *   <li>{@link V2MemberUserDetail#companyId(Integer)}
   *   <li>{@link V2MemberUserDetail#displayName(String)}
   *   <li>{@link V2MemberUserDetail#email(String)}
   *   <li>{@link V2MemberUserDetail#firstName(String)}
   *   <li>{@link V2MemberUserDetail#lastName(String)}
   *   <li>{@link V2MemberUserDetail#setCompany(String)}
   *   <li>{@link V2MemberUserDetail#setCompanyId(Integer)}
   *   <li>{@link V2MemberUserDetail#setDisplayName(String)}
   *   <li>{@link V2MemberUserDetail#setEmail(String)}
   *   <li>{@link V2MemberUserDetail#setFirstName(String)}
   *   <li>{@link V2MemberUserDetail#setIsExternal(Boolean)}
   *   <li>{@link V2MemberUserDetail#setLastName(String)}
   *   <li>{@link V2MemberUserDetail#setUserId(Long)}
   *   <li>{@link V2MemberUserDetail#userId(Long)}
   *   <li>{@link V2MemberUserDetail#isExternal(Boolean)}
   *   <li>{@link V2MemberUserDetail#toString()}
   *   <li>{@link V2MemberUserDetail#getCompany()}
   *   <li>{@link V2MemberUserDetail#getCompanyId()}
   *   <li>{@link V2MemberUserDetail#getDisplayName()}
   *   <li>{@link V2MemberUserDetail#getEmail()}
   *   <li>{@link V2MemberUserDetail#getFirstName()}
   *   <li>{@link V2MemberUserDetail#getIsExternal()}
   *   <li>{@link V2MemberUserDetail#getLastName()}
   *   <li>{@link V2MemberUserDetail#getUserId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V2MemberUserDetail.<init>()", "V2MemberUserDetail V2MemberUserDetail.company(String)",
      "V2MemberUserDetail V2MemberUserDetail.companyId(Integer)",
      "V2MemberUserDetail V2MemberUserDetail.displayName(String)",
      "V2MemberUserDetail V2MemberUserDetail.email(String)", "V2MemberUserDetail V2MemberUserDetail.firstName(String)",
      "String V2MemberUserDetail.getCompany()", "Integer V2MemberUserDetail.getCompanyId()",
      "String V2MemberUserDetail.getDisplayName()", "String V2MemberUserDetail.getEmail()",
      "String V2MemberUserDetail.getFirstName()", "Boolean V2MemberUserDetail.getIsExternal()",
      "String V2MemberUserDetail.getLastName()", "Long V2MemberUserDetail.getUserId()",
      "V2MemberUserDetail V2MemberUserDetail.isExternal(Boolean)",
      "V2MemberUserDetail V2MemberUserDetail.lastName(String)", "void V2MemberUserDetail.setCompany(String)",
      "void V2MemberUserDetail.setCompanyId(Integer)", "void V2MemberUserDetail.setDisplayName(String)",
      "void V2MemberUserDetail.setEmail(String)", "void V2MemberUserDetail.setFirstName(String)",
      "void V2MemberUserDetail.setIsExternal(Boolean)", "void V2MemberUserDetail.setLastName(String)",
      "void V2MemberUserDetail.setUserId(Long)", "String V2MemberUserDetail.toString()",
      "V2MemberUserDetail V2MemberUserDetail.userId(Long)"})
  void testGettersAndSetters() {
    // Arrange and Act
    V2MemberUserDetail actualV2MemberUserDetail = new V2MemberUserDetail();
    V2MemberUserDetail actualCompanyResult = actualV2MemberUserDetail.company("Company");
    V2MemberUserDetail actualCompanyIdResult = actualV2MemberUserDetail.companyId(1);
    V2MemberUserDetail actualDisplayNameResult = actualV2MemberUserDetail.displayName("Display Name");
    V2MemberUserDetail actualEmailResult = actualV2MemberUserDetail.email("jane.doe@example.org");
    V2MemberUserDetail actualFirstNameResult = actualV2MemberUserDetail.firstName("Jane");
    V2MemberUserDetail actualLastNameResult = actualV2MemberUserDetail.lastName("Doe");
    actualV2MemberUserDetail.setCompany("Company");
    actualV2MemberUserDetail.setCompanyId(1);
    actualV2MemberUserDetail.setDisplayName("Display Name");
    actualV2MemberUserDetail.setEmail("jane.doe@example.org");
    actualV2MemberUserDetail.setFirstName("Jane");
    actualV2MemberUserDetail.setIsExternal(true);
    actualV2MemberUserDetail.setLastName("Doe");
    actualV2MemberUserDetail.setUserId(1L);
    V2MemberUserDetail actualUserIdResult = actualV2MemberUserDetail.userId(1L);
    V2MemberUserDetail actualIsExternalResult = actualV2MemberUserDetail.isExternal(true);
    String actualToStringResult = actualV2MemberUserDetail.toString();
    String actualCompany = actualV2MemberUserDetail.getCompany();
    Integer actualCompanyId = actualV2MemberUserDetail.getCompanyId();
    String actualDisplayName = actualV2MemberUserDetail.getDisplayName();
    String actualEmail = actualV2MemberUserDetail.getEmail();
    String actualFirstName = actualV2MemberUserDetail.getFirstName();
    Boolean actualIsExternal = actualV2MemberUserDetail.getIsExternal();
    String actualLastName = actualV2MemberUserDetail.getLastName();
    Long actualUserId = actualV2MemberUserDetail.getUserId();

    // Assert
    assertEquals("Company", actualCompany);
    assertEquals("Display Name", actualDisplayName);
    assertEquals("Doe", actualLastName);
    assertEquals("Jane", actualFirstName);
    assertEquals("class V2MemberUserDetail {\n" + "    userId: 1\n" + "    email: jane.doe@example.org\n"
        + "    firstName: Jane\n" + "    lastName: Doe\n" + "    displayName: Display Name\n" + "    company: Company\n"
        + "    companyId: 1\n" + "    isExternal: true\n" + "}", actualToStringResult);
    assertEquals("jane.doe@example.org", actualEmail);
    assertEquals(1, actualCompanyId.intValue());
    assertEquals(1L, actualUserId.longValue());
    assertTrue(actualIsExternal);
    assertSame(actualV2MemberUserDetail, actualCompanyResult);
    assertSame(actualV2MemberUserDetail, actualCompanyIdResult);
    assertSame(actualV2MemberUserDetail, actualDisplayNameResult);
    assertSame(actualV2MemberUserDetail, actualEmailResult);
    assertSame(actualV2MemberUserDetail, actualFirstNameResult);
    assertSame(actualV2MemberUserDetail, actualIsExternalResult);
    assertSame(actualV2MemberUserDetail, actualLastNameResult);
    assertSame(actualV2MemberUserDetail, actualUserIdResult);
  }
}
