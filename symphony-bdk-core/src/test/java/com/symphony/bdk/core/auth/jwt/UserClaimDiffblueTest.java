package com.symphony.bdk.core.auth.jwt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserClaimDiffblueTest {
  /**
   * Test {@link UserClaim#equals(Object)}, and {@link UserClaim#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserClaim#equals(Object)}
   *   <li>{@link UserClaim#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserClaim.equals(Object)", "int UserClaim.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserClaim userClaim = new UserClaim();
    userClaim.setAvatarSmallUrl("https://example.org/example");
    userClaim.setAvatarUrl("https://example.org/example");
    userClaim.setCompany("Company");
    userClaim.setCompanyId("42");
    userClaim.setDisplayName("Display Name");
    userClaim.setEmailAddress("42 Main St");
    userClaim.setFirstName("Jane");
    userClaim.setId(1L);
    userClaim.setLastName("Doe");
    userClaim.setLocation("Location");
    userClaim.setTitle("Dr");
    userClaim.setUsername("janedoe");

    UserClaim userClaim2 = new UserClaim();
    userClaim2.setAvatarSmallUrl("https://example.org/example");
    userClaim2.setAvatarUrl("https://example.org/example");
    userClaim2.setCompany("Company");
    userClaim2.setCompanyId("42");
    userClaim2.setDisplayName("Display Name");
    userClaim2.setEmailAddress("42 Main St");
    userClaim2.setFirstName("Jane");
    userClaim2.setId(1L);
    userClaim2.setLastName("Doe");
    userClaim2.setLocation("Location");
    userClaim2.setTitle("Dr");
    userClaim2.setUsername("janedoe");

    // Act and Assert
    assertEquals(userClaim, userClaim2);
    int expectedHashCodeResult = userClaim.hashCode();
    assertEquals(expectedHashCodeResult, userClaim2.hashCode());
  }

  /**
   * Test {@link UserClaim#equals(Object)}, and {@link UserClaim#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserClaim#equals(Object)}
   *   <li>{@link UserClaim#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserClaim.equals(Object)", "int UserClaim.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserClaim userClaim = new UserClaim();
    userClaim.setAvatarSmallUrl("https://example.org/example");
    userClaim.setAvatarUrl("https://example.org/example");
    userClaim.setCompany("Company");
    userClaim.setCompanyId("42");
    userClaim.setDisplayName("Display Name");
    userClaim.setEmailAddress("42 Main St");
    userClaim.setFirstName("Jane");
    userClaim.setId(1L);
    userClaim.setLastName("Doe");
    userClaim.setLocation("Location");
    userClaim.setTitle("Dr");
    userClaim.setUsername("janedoe");

    // Act and Assert
    assertEquals(userClaim, userClaim);
    int expectedHashCodeResult = userClaim.hashCode();
    assertEquals(expectedHashCodeResult, userClaim.hashCode());
  }

  /**
   * Test {@link UserClaim#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserClaim#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserClaim.equals(Object)", "int UserClaim.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    UserClaim userClaim = new UserClaim();
    userClaim.setAvatarSmallUrl("42 Main St");
    userClaim.setAvatarUrl("https://example.org/example");
    userClaim.setCompany("Company");
    userClaim.setCompanyId("42");
    userClaim.setDisplayName("Display Name");
    userClaim.setEmailAddress("42 Main St");
    userClaim.setFirstName("Jane");
    userClaim.setId(1L);
    userClaim.setLastName("Doe");
    userClaim.setLocation("Location");
    userClaim.setTitle("Dr");
    userClaim.setUsername("janedoe");

    UserClaim userClaim2 = new UserClaim();
    userClaim2.setAvatarSmallUrl("https://example.org/example");
    userClaim2.setAvatarUrl("https://example.org/example");
    userClaim2.setCompany("Company");
    userClaim2.setCompanyId("42");
    userClaim2.setDisplayName("Display Name");
    userClaim2.setEmailAddress("42 Main St");
    userClaim2.setFirstName("Jane");
    userClaim2.setId(1L);
    userClaim2.setLastName("Doe");
    userClaim2.setLocation("Location");
    userClaim2.setTitle("Dr");
    userClaim2.setUsername("janedoe");

    // Act and Assert
    assertNotEquals(userClaim, userClaim2);
  }

  /**
   * Test {@link UserClaim#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserClaim#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserClaim.equals(Object)", "int UserClaim.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserClaim userClaim = new UserClaim();
    userClaim.setAvatarSmallUrl(null);
    userClaim.setAvatarUrl("https://example.org/example");
    userClaim.setCompany("Company");
    userClaim.setCompanyId("42");
    userClaim.setDisplayName("Display Name");
    userClaim.setEmailAddress("42 Main St");
    userClaim.setFirstName("Jane");
    userClaim.setId(1L);
    userClaim.setLastName("Doe");
    userClaim.setLocation("Location");
    userClaim.setTitle("Dr");
    userClaim.setUsername("janedoe");

    UserClaim userClaim2 = new UserClaim();
    userClaim2.setAvatarSmallUrl("https://example.org/example");
    userClaim2.setAvatarUrl("https://example.org/example");
    userClaim2.setCompany("Company");
    userClaim2.setCompanyId("42");
    userClaim2.setDisplayName("Display Name");
    userClaim2.setEmailAddress("42 Main St");
    userClaim2.setFirstName("Jane");
    userClaim2.setId(1L);
    userClaim2.setLastName("Doe");
    userClaim2.setLocation("Location");
    userClaim2.setTitle("Dr");
    userClaim2.setUsername("janedoe");

    // Act and Assert
    assertNotEquals(userClaim, userClaim2);
  }

  /**
   * Test {@link UserClaim#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserClaim#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserClaim.equals(Object)", "int UserClaim.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UserClaim userClaim = new UserClaim();
    userClaim.setAvatarSmallUrl("https://example.org/example");
    userClaim.setAvatarUrl("42 Main St");
    userClaim.setCompany("Company");
    userClaim.setCompanyId("42");
    userClaim.setDisplayName("Display Name");
    userClaim.setEmailAddress("42 Main St");
    userClaim.setFirstName("Jane");
    userClaim.setId(1L);
    userClaim.setLastName("Doe");
    userClaim.setLocation("Location");
    userClaim.setTitle("Dr");
    userClaim.setUsername("janedoe");

    UserClaim userClaim2 = new UserClaim();
    userClaim2.setAvatarSmallUrl("https://example.org/example");
    userClaim2.setAvatarUrl("https://example.org/example");
    userClaim2.setCompany("Company");
    userClaim2.setCompanyId("42");
    userClaim2.setDisplayName("Display Name");
    userClaim2.setEmailAddress("42 Main St");
    userClaim2.setFirstName("Jane");
    userClaim2.setId(1L);
    userClaim2.setLastName("Doe");
    userClaim2.setLocation("Location");
    userClaim2.setTitle("Dr");
    userClaim2.setUsername("janedoe");

    // Act and Assert
    assertNotEquals(userClaim, userClaim2);
  }

  /**
   * Test {@link UserClaim#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserClaim#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserClaim.equals(Object)", "int UserClaim.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    UserClaim userClaim = new UserClaim();
    userClaim.setAvatarSmallUrl("https://example.org/example");
    userClaim.setAvatarUrl(null);
    userClaim.setCompany("Company");
    userClaim.setCompanyId("42");
    userClaim.setDisplayName("Display Name");
    userClaim.setEmailAddress("42 Main St");
    userClaim.setFirstName("Jane");
    userClaim.setId(1L);
    userClaim.setLastName("Doe");
    userClaim.setLocation("Location");
    userClaim.setTitle("Dr");
    userClaim.setUsername("janedoe");

    UserClaim userClaim2 = new UserClaim();
    userClaim2.setAvatarSmallUrl("https://example.org/example");
    userClaim2.setAvatarUrl("https://example.org/example");
    userClaim2.setCompany("Company");
    userClaim2.setCompanyId("42");
    userClaim2.setDisplayName("Display Name");
    userClaim2.setEmailAddress("42 Main St");
    userClaim2.setFirstName("Jane");
    userClaim2.setId(1L);
    userClaim2.setLastName("Doe");
    userClaim2.setLocation("Location");
    userClaim2.setTitle("Dr");
    userClaim2.setUsername("janedoe");

    // Act and Assert
    assertNotEquals(userClaim, userClaim2);
  }

  /**
   * Test {@link UserClaim#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserClaim#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserClaim.equals(Object)", "int UserClaim.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    UserClaim userClaim = new UserClaim();
    userClaim.setAvatarSmallUrl("https://example.org/example");
    userClaim.setAvatarUrl("https://example.org/example");
    userClaim.setCompany("42 Main St");
    userClaim.setCompanyId("42");
    userClaim.setDisplayName("Display Name");
    userClaim.setEmailAddress("42 Main St");
    userClaim.setFirstName("Jane");
    userClaim.setId(1L);
    userClaim.setLastName("Doe");
    userClaim.setLocation("Location");
    userClaim.setTitle("Dr");
    userClaim.setUsername("janedoe");

    UserClaim userClaim2 = new UserClaim();
    userClaim2.setAvatarSmallUrl("https://example.org/example");
    userClaim2.setAvatarUrl("https://example.org/example");
    userClaim2.setCompany("Company");
    userClaim2.setCompanyId("42");
    userClaim2.setDisplayName("Display Name");
    userClaim2.setEmailAddress("42 Main St");
    userClaim2.setFirstName("Jane");
    userClaim2.setId(1L);
    userClaim2.setLastName("Doe");
    userClaim2.setLocation("Location");
    userClaim2.setTitle("Dr");
    userClaim2.setUsername("janedoe");

    // Act and Assert
    assertNotEquals(userClaim, userClaim2);
  }

  /**
   * Test {@link UserClaim#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserClaim#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserClaim.equals(Object)", "int UserClaim.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    UserClaim userClaim = new UserClaim();
    userClaim.setAvatarSmallUrl("https://example.org/example");
    userClaim.setAvatarUrl("https://example.org/example");
    userClaim.setCompany(null);
    userClaim.setCompanyId("42");
    userClaim.setDisplayName("Display Name");
    userClaim.setEmailAddress("42 Main St");
    userClaim.setFirstName("Jane");
    userClaim.setId(1L);
    userClaim.setLastName("Doe");
    userClaim.setLocation("Location");
    userClaim.setTitle("Dr");
    userClaim.setUsername("janedoe");

    UserClaim userClaim2 = new UserClaim();
    userClaim2.setAvatarSmallUrl("https://example.org/example");
    userClaim2.setAvatarUrl("https://example.org/example");
    userClaim2.setCompany("Company");
    userClaim2.setCompanyId("42");
    userClaim2.setDisplayName("Display Name");
    userClaim2.setEmailAddress("42 Main St");
    userClaim2.setFirstName("Jane");
    userClaim2.setId(1L);
    userClaim2.setLastName("Doe");
    userClaim2.setLocation("Location");
    userClaim2.setTitle("Dr");
    userClaim2.setUsername("janedoe");

    // Act and Assert
    assertNotEquals(userClaim, userClaim2);
  }

  /**
   * Test {@link UserClaim#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserClaim#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserClaim.equals(Object)", "int UserClaim.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    UserClaim userClaim = new UserClaim();
    userClaim.setAvatarSmallUrl("https://example.org/example");
    userClaim.setAvatarUrl("https://example.org/example");
    userClaim.setCompany("Company");
    userClaim.setCompanyId("42 Main St");
    userClaim.setDisplayName("Display Name");
    userClaim.setEmailAddress("42 Main St");
    userClaim.setFirstName("Jane");
    userClaim.setId(1L);
    userClaim.setLastName("Doe");
    userClaim.setLocation("Location");
    userClaim.setTitle("Dr");
    userClaim.setUsername("janedoe");

    UserClaim userClaim2 = new UserClaim();
    userClaim2.setAvatarSmallUrl("https://example.org/example");
    userClaim2.setAvatarUrl("https://example.org/example");
    userClaim2.setCompany("Company");
    userClaim2.setCompanyId("42");
    userClaim2.setDisplayName("Display Name");
    userClaim2.setEmailAddress("42 Main St");
    userClaim2.setFirstName("Jane");
    userClaim2.setId(1L);
    userClaim2.setLastName("Doe");
    userClaim2.setLocation("Location");
    userClaim2.setTitle("Dr");
    userClaim2.setUsername("janedoe");

    // Act and Assert
    assertNotEquals(userClaim, userClaim2);
  }

  /**
   * Test {@link UserClaim#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserClaim#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserClaim.equals(Object)", "int UserClaim.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    UserClaim userClaim = new UserClaim();
    userClaim.setAvatarSmallUrl("https://example.org/example");
    userClaim.setAvatarUrl("https://example.org/example");
    userClaim.setCompany("Company");
    userClaim.setCompanyId(null);
    userClaim.setDisplayName("Display Name");
    userClaim.setEmailAddress("42 Main St");
    userClaim.setFirstName("Jane");
    userClaim.setId(1L);
    userClaim.setLastName("Doe");
    userClaim.setLocation("Location");
    userClaim.setTitle("Dr");
    userClaim.setUsername("janedoe");

    UserClaim userClaim2 = new UserClaim();
    userClaim2.setAvatarSmallUrl("https://example.org/example");
    userClaim2.setAvatarUrl("https://example.org/example");
    userClaim2.setCompany("Company");
    userClaim2.setCompanyId("42");
    userClaim2.setDisplayName("Display Name");
    userClaim2.setEmailAddress("42 Main St");
    userClaim2.setFirstName("Jane");
    userClaim2.setId(1L);
    userClaim2.setLastName("Doe");
    userClaim2.setLocation("Location");
    userClaim2.setTitle("Dr");
    userClaim2.setUsername("janedoe");

    // Act and Assert
    assertNotEquals(userClaim, userClaim2);
  }

  /**
   * Test {@link UserClaim#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserClaim#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserClaim.equals(Object)", "int UserClaim.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    UserClaim userClaim = new UserClaim();
    userClaim.setAvatarSmallUrl("https://example.org/example");
    userClaim.setAvatarUrl("https://example.org/example");
    userClaim.setCompany("Company");
    userClaim.setCompanyId("42");
    userClaim.setDisplayName("42 Main St");
    userClaim.setEmailAddress("42 Main St");
    userClaim.setFirstName("Jane");
    userClaim.setId(1L);
    userClaim.setLastName("Doe");
    userClaim.setLocation("Location");
    userClaim.setTitle("Dr");
    userClaim.setUsername("janedoe");

    UserClaim userClaim2 = new UserClaim();
    userClaim2.setAvatarSmallUrl("https://example.org/example");
    userClaim2.setAvatarUrl("https://example.org/example");
    userClaim2.setCompany("Company");
    userClaim2.setCompanyId("42");
    userClaim2.setDisplayName("Display Name");
    userClaim2.setEmailAddress("42 Main St");
    userClaim2.setFirstName("Jane");
    userClaim2.setId(1L);
    userClaim2.setLastName("Doe");
    userClaim2.setLocation("Location");
    userClaim2.setTitle("Dr");
    userClaim2.setUsername("janedoe");

    // Act and Assert
    assertNotEquals(userClaim, userClaim2);
  }

  /**
   * Test {@link UserClaim#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserClaim#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserClaim.equals(Object)", "int UserClaim.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual10() {
    // Arrange
    UserClaim userClaim = new UserClaim();
    userClaim.setAvatarSmallUrl("https://example.org/example");
    userClaim.setAvatarUrl("https://example.org/example");
    userClaim.setCompany("Company");
    userClaim.setCompanyId("42");
    userClaim.setDisplayName(null);
    userClaim.setEmailAddress("42 Main St");
    userClaim.setFirstName("Jane");
    userClaim.setId(1L);
    userClaim.setLastName("Doe");
    userClaim.setLocation("Location");
    userClaim.setTitle("Dr");
    userClaim.setUsername("janedoe");

    UserClaim userClaim2 = new UserClaim();
    userClaim2.setAvatarSmallUrl("https://example.org/example");
    userClaim2.setAvatarUrl("https://example.org/example");
    userClaim2.setCompany("Company");
    userClaim2.setCompanyId("42");
    userClaim2.setDisplayName("Display Name");
    userClaim2.setEmailAddress("42 Main St");
    userClaim2.setFirstName("Jane");
    userClaim2.setId(1L);
    userClaim2.setLastName("Doe");
    userClaim2.setLocation("Location");
    userClaim2.setTitle("Dr");
    userClaim2.setUsername("janedoe");

    // Act and Assert
    assertNotEquals(userClaim, userClaim2);
  }

  /**
   * Test {@link UserClaim#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserClaim#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserClaim.equals(Object)", "int UserClaim.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual11() {
    // Arrange
    UserClaim userClaim = new UserClaim();
    userClaim.setAvatarSmallUrl("https://example.org/example");
    userClaim.setAvatarUrl("https://example.org/example");
    userClaim.setCompany("Company");
    userClaim.setCompanyId("42");
    userClaim.setDisplayName("Display Name");
    userClaim.setEmailAddress("17 High St");
    userClaim.setFirstName("Jane");
    userClaim.setId(1L);
    userClaim.setLastName("Doe");
    userClaim.setLocation("Location");
    userClaim.setTitle("Dr");
    userClaim.setUsername("janedoe");

    UserClaim userClaim2 = new UserClaim();
    userClaim2.setAvatarSmallUrl("https://example.org/example");
    userClaim2.setAvatarUrl("https://example.org/example");
    userClaim2.setCompany("Company");
    userClaim2.setCompanyId("42");
    userClaim2.setDisplayName("Display Name");
    userClaim2.setEmailAddress("42 Main St");
    userClaim2.setFirstName("Jane");
    userClaim2.setId(1L);
    userClaim2.setLastName("Doe");
    userClaim2.setLocation("Location");
    userClaim2.setTitle("Dr");
    userClaim2.setUsername("janedoe");

    // Act and Assert
    assertNotEquals(userClaim, userClaim2);
  }

  /**
   * Test {@link UserClaim#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserClaim#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserClaim.equals(Object)", "int UserClaim.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual12() {
    // Arrange
    UserClaim userClaim = new UserClaim();
    userClaim.setAvatarSmallUrl("https://example.org/example");
    userClaim.setAvatarUrl("https://example.org/example");
    userClaim.setCompany("Company");
    userClaim.setCompanyId("42");
    userClaim.setDisplayName("Display Name");
    userClaim.setEmailAddress(null);
    userClaim.setFirstName("Jane");
    userClaim.setId(1L);
    userClaim.setLastName("Doe");
    userClaim.setLocation("Location");
    userClaim.setTitle("Dr");
    userClaim.setUsername("janedoe");

    UserClaim userClaim2 = new UserClaim();
    userClaim2.setAvatarSmallUrl("https://example.org/example");
    userClaim2.setAvatarUrl("https://example.org/example");
    userClaim2.setCompany("Company");
    userClaim2.setCompanyId("42");
    userClaim2.setDisplayName("Display Name");
    userClaim2.setEmailAddress("42 Main St");
    userClaim2.setFirstName("Jane");
    userClaim2.setId(1L);
    userClaim2.setLastName("Doe");
    userClaim2.setLocation("Location");
    userClaim2.setTitle("Dr");
    userClaim2.setUsername("janedoe");

    // Act and Assert
    assertNotEquals(userClaim, userClaim2);
  }

  /**
   * Test {@link UserClaim#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserClaim#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserClaim.equals(Object)", "int UserClaim.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual13() {
    // Arrange
    UserClaim userClaim = new UserClaim();
    userClaim.setAvatarSmallUrl("https://example.org/example");
    userClaim.setAvatarUrl("https://example.org/example");
    userClaim.setCompany("Company");
    userClaim.setCompanyId("42");
    userClaim.setDisplayName("Display Name");
    userClaim.setEmailAddress("42 Main St");
    userClaim.setFirstName("John");
    userClaim.setId(1L);
    userClaim.setLastName("Doe");
    userClaim.setLocation("Location");
    userClaim.setTitle("Dr");
    userClaim.setUsername("janedoe");

    UserClaim userClaim2 = new UserClaim();
    userClaim2.setAvatarSmallUrl("https://example.org/example");
    userClaim2.setAvatarUrl("https://example.org/example");
    userClaim2.setCompany("Company");
    userClaim2.setCompanyId("42");
    userClaim2.setDisplayName("Display Name");
    userClaim2.setEmailAddress("42 Main St");
    userClaim2.setFirstName("Jane");
    userClaim2.setId(1L);
    userClaim2.setLastName("Doe");
    userClaim2.setLocation("Location");
    userClaim2.setTitle("Dr");
    userClaim2.setUsername("janedoe");

    // Act and Assert
    assertNotEquals(userClaim, userClaim2);
  }

  /**
   * Test {@link UserClaim#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserClaim#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserClaim.equals(Object)", "int UserClaim.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual14() {
    // Arrange
    UserClaim userClaim = new UserClaim();
    userClaim.setAvatarSmallUrl("https://example.org/example");
    userClaim.setAvatarUrl("https://example.org/example");
    userClaim.setCompany("Company");
    userClaim.setCompanyId("42");
    userClaim.setDisplayName("Display Name");
    userClaim.setEmailAddress("42 Main St");
    userClaim.setFirstName(null);
    userClaim.setId(1L);
    userClaim.setLastName("Doe");
    userClaim.setLocation("Location");
    userClaim.setTitle("Dr");
    userClaim.setUsername("janedoe");

    UserClaim userClaim2 = new UserClaim();
    userClaim2.setAvatarSmallUrl("https://example.org/example");
    userClaim2.setAvatarUrl("https://example.org/example");
    userClaim2.setCompany("Company");
    userClaim2.setCompanyId("42");
    userClaim2.setDisplayName("Display Name");
    userClaim2.setEmailAddress("42 Main St");
    userClaim2.setFirstName("Jane");
    userClaim2.setId(1L);
    userClaim2.setLastName("Doe");
    userClaim2.setLocation("Location");
    userClaim2.setTitle("Dr");
    userClaim2.setUsername("janedoe");

    // Act and Assert
    assertNotEquals(userClaim, userClaim2);
  }

  /**
   * Test {@link UserClaim#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserClaim#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserClaim.equals(Object)", "int UserClaim.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual15() {
    // Arrange
    UserClaim userClaim = new UserClaim();
    userClaim.setAvatarSmallUrl("https://example.org/example");
    userClaim.setAvatarUrl("https://example.org/example");
    userClaim.setCompany("Company");
    userClaim.setCompanyId("42");
    userClaim.setDisplayName("Display Name");
    userClaim.setEmailAddress("42 Main St");
    userClaim.setFirstName("Jane");
    userClaim.setId(2L);
    userClaim.setLastName("Doe");
    userClaim.setLocation("Location");
    userClaim.setTitle("Dr");
    userClaim.setUsername("janedoe");

    UserClaim userClaim2 = new UserClaim();
    userClaim2.setAvatarSmallUrl("https://example.org/example");
    userClaim2.setAvatarUrl("https://example.org/example");
    userClaim2.setCompany("Company");
    userClaim2.setCompanyId("42");
    userClaim2.setDisplayName("Display Name");
    userClaim2.setEmailAddress("42 Main St");
    userClaim2.setFirstName("Jane");
    userClaim2.setId(1L);
    userClaim2.setLastName("Doe");
    userClaim2.setLocation("Location");
    userClaim2.setTitle("Dr");
    userClaim2.setUsername("janedoe");

    // Act and Assert
    assertNotEquals(userClaim, userClaim2);
  }

  /**
   * Test {@link UserClaim#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserClaim#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserClaim.equals(Object)", "int UserClaim.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual16() {
    // Arrange
    UserClaim userClaim = new UserClaim();
    userClaim.setAvatarSmallUrl("https://example.org/example");
    userClaim.setAvatarUrl("https://example.org/example");
    userClaim.setCompany("Company");
    userClaim.setCompanyId("42");
    userClaim.setDisplayName("Display Name");
    userClaim.setEmailAddress("42 Main St");
    userClaim.setFirstName("Jane");
    userClaim.setId(null);
    userClaim.setLastName("Doe");
    userClaim.setLocation("Location");
    userClaim.setTitle("Dr");
    userClaim.setUsername("janedoe");

    UserClaim userClaim2 = new UserClaim();
    userClaim2.setAvatarSmallUrl("https://example.org/example");
    userClaim2.setAvatarUrl("https://example.org/example");
    userClaim2.setCompany("Company");
    userClaim2.setCompanyId("42");
    userClaim2.setDisplayName("Display Name");
    userClaim2.setEmailAddress("42 Main St");
    userClaim2.setFirstName("Jane");
    userClaim2.setId(1L);
    userClaim2.setLastName("Doe");
    userClaim2.setLocation("Location");
    userClaim2.setTitle("Dr");
    userClaim2.setUsername("janedoe");

    // Act and Assert
    assertNotEquals(userClaim, userClaim2);
  }

  /**
   * Test {@link UserClaim#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserClaim#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserClaim.equals(Object)", "int UserClaim.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual17() {
    // Arrange
    UserClaim userClaim = new UserClaim();
    userClaim.setAvatarSmallUrl("https://example.org/example");
    userClaim.setAvatarUrl("https://example.org/example");
    userClaim.setCompany("Company");
    userClaim.setCompanyId("42");
    userClaim.setDisplayName("Display Name");
    userClaim.setEmailAddress("42 Main St");
    userClaim.setFirstName("Jane");
    userClaim.setId(1L);
    userClaim.setLastName("Smith");
    userClaim.setLocation("Location");
    userClaim.setTitle("Dr");
    userClaim.setUsername("janedoe");

    UserClaim userClaim2 = new UserClaim();
    userClaim2.setAvatarSmallUrl("https://example.org/example");
    userClaim2.setAvatarUrl("https://example.org/example");
    userClaim2.setCompany("Company");
    userClaim2.setCompanyId("42");
    userClaim2.setDisplayName("Display Name");
    userClaim2.setEmailAddress("42 Main St");
    userClaim2.setFirstName("Jane");
    userClaim2.setId(1L);
    userClaim2.setLastName("Doe");
    userClaim2.setLocation("Location");
    userClaim2.setTitle("Dr");
    userClaim2.setUsername("janedoe");

    // Act and Assert
    assertNotEquals(userClaim, userClaim2);
  }

  /**
   * Test {@link UserClaim#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserClaim#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserClaim.equals(Object)", "int UserClaim.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual18() {
    // Arrange
    UserClaim userClaim = new UserClaim();
    userClaim.setAvatarSmallUrl("https://example.org/example");
    userClaim.setAvatarUrl("https://example.org/example");
    userClaim.setCompany("Company");
    userClaim.setCompanyId("42");
    userClaim.setDisplayName("Display Name");
    userClaim.setEmailAddress("42 Main St");
    userClaim.setFirstName("Jane");
    userClaim.setId(1L);
    userClaim.setLastName(null);
    userClaim.setLocation("Location");
    userClaim.setTitle("Dr");
    userClaim.setUsername("janedoe");

    UserClaim userClaim2 = new UserClaim();
    userClaim2.setAvatarSmallUrl("https://example.org/example");
    userClaim2.setAvatarUrl("https://example.org/example");
    userClaim2.setCompany("Company");
    userClaim2.setCompanyId("42");
    userClaim2.setDisplayName("Display Name");
    userClaim2.setEmailAddress("42 Main St");
    userClaim2.setFirstName("Jane");
    userClaim2.setId(1L);
    userClaim2.setLastName("Doe");
    userClaim2.setLocation("Location");
    userClaim2.setTitle("Dr");
    userClaim2.setUsername("janedoe");

    // Act and Assert
    assertNotEquals(userClaim, userClaim2);
  }

  /**
   * Test {@link UserClaim#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserClaim#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserClaim.equals(Object)", "int UserClaim.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual19() {
    // Arrange
    UserClaim userClaim = new UserClaim();
    userClaim.setAvatarSmallUrl("https://example.org/example");
    userClaim.setAvatarUrl("https://example.org/example");
    userClaim.setCompany("Company");
    userClaim.setCompanyId("42");
    userClaim.setDisplayName("Display Name");
    userClaim.setEmailAddress("42 Main St");
    userClaim.setFirstName("Jane");
    userClaim.setId(1L);
    userClaim.setLastName("Doe");
    userClaim.setLocation("42 Main St");
    userClaim.setTitle("Dr");
    userClaim.setUsername("janedoe");

    UserClaim userClaim2 = new UserClaim();
    userClaim2.setAvatarSmallUrl("https://example.org/example");
    userClaim2.setAvatarUrl("https://example.org/example");
    userClaim2.setCompany("Company");
    userClaim2.setCompanyId("42");
    userClaim2.setDisplayName("Display Name");
    userClaim2.setEmailAddress("42 Main St");
    userClaim2.setFirstName("Jane");
    userClaim2.setId(1L);
    userClaim2.setLastName("Doe");
    userClaim2.setLocation("Location");
    userClaim2.setTitle("Dr");
    userClaim2.setUsername("janedoe");

    // Act and Assert
    assertNotEquals(userClaim, userClaim2);
  }

  /**
   * Test {@link UserClaim#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserClaim#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserClaim.equals(Object)", "int UserClaim.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual20() {
    // Arrange
    UserClaim userClaim = new UserClaim();
    userClaim.setAvatarSmallUrl("https://example.org/example");
    userClaim.setAvatarUrl("https://example.org/example");
    userClaim.setCompany("Company");
    userClaim.setCompanyId("42");
    userClaim.setDisplayName("Display Name");
    userClaim.setEmailAddress("42 Main St");
    userClaim.setFirstName("Jane");
    userClaim.setId(1L);
    userClaim.setLastName("Doe");
    userClaim.setLocation(null);
    userClaim.setTitle("Dr");
    userClaim.setUsername("janedoe");

    UserClaim userClaim2 = new UserClaim();
    userClaim2.setAvatarSmallUrl("https://example.org/example");
    userClaim2.setAvatarUrl("https://example.org/example");
    userClaim2.setCompany("Company");
    userClaim2.setCompanyId("42");
    userClaim2.setDisplayName("Display Name");
    userClaim2.setEmailAddress("42 Main St");
    userClaim2.setFirstName("Jane");
    userClaim2.setId(1L);
    userClaim2.setLastName("Doe");
    userClaim2.setLocation("Location");
    userClaim2.setTitle("Dr");
    userClaim2.setUsername("janedoe");

    // Act and Assert
    assertNotEquals(userClaim, userClaim2);
  }

  /**
   * Test {@link UserClaim#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserClaim#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserClaim.equals(Object)", "int UserClaim.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual21() {
    // Arrange
    UserClaim userClaim = new UserClaim();
    userClaim.setAvatarSmallUrl("https://example.org/example");
    userClaim.setAvatarUrl("https://example.org/example");
    userClaim.setCompany("Company");
    userClaim.setCompanyId("42");
    userClaim.setDisplayName("Display Name");
    userClaim.setEmailAddress("42 Main St");
    userClaim.setFirstName("Jane");
    userClaim.setId(1L);
    userClaim.setLastName("Doe");
    userClaim.setLocation("Location");
    userClaim.setTitle("Mr");
    userClaim.setUsername("janedoe");

    UserClaim userClaim2 = new UserClaim();
    userClaim2.setAvatarSmallUrl("https://example.org/example");
    userClaim2.setAvatarUrl("https://example.org/example");
    userClaim2.setCompany("Company");
    userClaim2.setCompanyId("42");
    userClaim2.setDisplayName("Display Name");
    userClaim2.setEmailAddress("42 Main St");
    userClaim2.setFirstName("Jane");
    userClaim2.setId(1L);
    userClaim2.setLastName("Doe");
    userClaim2.setLocation("Location");
    userClaim2.setTitle("Dr");
    userClaim2.setUsername("janedoe");

    // Act and Assert
    assertNotEquals(userClaim, userClaim2);
  }

  /**
   * Test {@link UserClaim#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserClaim#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserClaim.equals(Object)", "int UserClaim.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual22() {
    // Arrange
    UserClaim userClaim = new UserClaim();
    userClaim.setAvatarSmallUrl("https://example.org/example");
    userClaim.setAvatarUrl("https://example.org/example");
    userClaim.setCompany("Company");
    userClaim.setCompanyId("42");
    userClaim.setDisplayName("Display Name");
    userClaim.setEmailAddress("42 Main St");
    userClaim.setFirstName("Jane");
    userClaim.setId(1L);
    userClaim.setLastName("Doe");
    userClaim.setLocation("Location");
    userClaim.setTitle(null);
    userClaim.setUsername("janedoe");

    UserClaim userClaim2 = new UserClaim();
    userClaim2.setAvatarSmallUrl("https://example.org/example");
    userClaim2.setAvatarUrl("https://example.org/example");
    userClaim2.setCompany("Company");
    userClaim2.setCompanyId("42");
    userClaim2.setDisplayName("Display Name");
    userClaim2.setEmailAddress("42 Main St");
    userClaim2.setFirstName("Jane");
    userClaim2.setId(1L);
    userClaim2.setLastName("Doe");
    userClaim2.setLocation("Location");
    userClaim2.setTitle("Dr");
    userClaim2.setUsername("janedoe");

    // Act and Assert
    assertNotEquals(userClaim, userClaim2);
  }

  /**
   * Test {@link UserClaim#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserClaim#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserClaim.equals(Object)", "int UserClaim.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual23() {
    // Arrange
    UserClaim userClaim = new UserClaim();
    userClaim.setAvatarSmallUrl("https://example.org/example");
    userClaim.setAvatarUrl("https://example.org/example");
    userClaim.setCompany("Company");
    userClaim.setCompanyId("42");
    userClaim.setDisplayName("Display Name");
    userClaim.setEmailAddress("42 Main St");
    userClaim.setFirstName("Jane");
    userClaim.setId(1L);
    userClaim.setLastName("Doe");
    userClaim.setLocation("Location");
    userClaim.setTitle("Dr");
    userClaim.setUsername("42 Main St");

    UserClaim userClaim2 = new UserClaim();
    userClaim2.setAvatarSmallUrl("https://example.org/example");
    userClaim2.setAvatarUrl("https://example.org/example");
    userClaim2.setCompany("Company");
    userClaim2.setCompanyId("42");
    userClaim2.setDisplayName("Display Name");
    userClaim2.setEmailAddress("42 Main St");
    userClaim2.setFirstName("Jane");
    userClaim2.setId(1L);
    userClaim2.setLastName("Doe");
    userClaim2.setLocation("Location");
    userClaim2.setTitle("Dr");
    userClaim2.setUsername("janedoe");

    // Act and Assert
    assertNotEquals(userClaim, userClaim2);
  }

  /**
   * Test {@link UserClaim#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserClaim#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserClaim.equals(Object)", "int UserClaim.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual24() {
    // Arrange
    UserClaim userClaim = new UserClaim();
    userClaim.setAvatarSmallUrl("https://example.org/example");
    userClaim.setAvatarUrl("https://example.org/example");
    userClaim.setCompany("Company");
    userClaim.setCompanyId("42");
    userClaim.setDisplayName("Display Name");
    userClaim.setEmailAddress("42 Main St");
    userClaim.setFirstName("Jane");
    userClaim.setId(1L);
    userClaim.setLastName("Doe");
    userClaim.setLocation("Location");
    userClaim.setTitle("Dr");
    userClaim.setUsername(null);

    UserClaim userClaim2 = new UserClaim();
    userClaim2.setAvatarSmallUrl("https://example.org/example");
    userClaim2.setAvatarUrl("https://example.org/example");
    userClaim2.setCompany("Company");
    userClaim2.setCompanyId("42");
    userClaim2.setDisplayName("Display Name");
    userClaim2.setEmailAddress("42 Main St");
    userClaim2.setFirstName("Jane");
    userClaim2.setId(1L);
    userClaim2.setLastName("Doe");
    userClaim2.setLocation("Location");
    userClaim2.setTitle("Dr");
    userClaim2.setUsername("janedoe");

    // Act and Assert
    assertNotEquals(userClaim, userClaim2);
  }

  /**
   * Test {@link UserClaim#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserClaim#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserClaim.equals(Object)", "int UserClaim.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    UserClaim userClaim = new UserClaim();
    userClaim.setAvatarSmallUrl("https://example.org/example");
    userClaim.setAvatarUrl("https://example.org/example");
    userClaim.setCompany("Company");
    userClaim.setCompanyId("42");
    userClaim.setDisplayName("Display Name");
    userClaim.setEmailAddress("42 Main St");
    userClaim.setFirstName("Jane");
    userClaim.setId(1L);
    userClaim.setLastName("Doe");
    userClaim.setLocation("Location");
    userClaim.setTitle("Dr");
    userClaim.setUsername("janedoe");

    // Act and Assert
    assertNotEquals(userClaim, null);
  }

  /**
   * Test {@link UserClaim#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserClaim#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserClaim.equals(Object)", "int UserClaim.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    UserClaim userClaim = new UserClaim();
    userClaim.setAvatarSmallUrl("https://example.org/example");
    userClaim.setAvatarUrl("https://example.org/example");
    userClaim.setCompany("Company");
    userClaim.setCompanyId("42");
    userClaim.setDisplayName("Display Name");
    userClaim.setEmailAddress("42 Main St");
    userClaim.setFirstName("Jane");
    userClaim.setId(1L);
    userClaim.setLastName("Doe");
    userClaim.setLocation("Location");
    userClaim.setTitle("Dr");
    userClaim.setUsername("janedoe");

    // Act and Assert
    assertNotEquals(userClaim, "Different type to UserClaim");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link UserClaim}
   *   <li>{@link UserClaim#setAvatarSmallUrl(String)}
   *   <li>{@link UserClaim#setAvatarUrl(String)}
   *   <li>{@link UserClaim#setCompany(String)}
   *   <li>{@link UserClaim#setCompanyId(String)}
   *   <li>{@link UserClaim#setDisplayName(String)}
   *   <li>{@link UserClaim#setEmailAddress(String)}
   *   <li>{@link UserClaim#setFirstName(String)}
   *   <li>{@link UserClaim#setId(Long)}
   *   <li>{@link UserClaim#setLastName(String)}
   *   <li>{@link UserClaim#setLocation(String)}
   *   <li>{@link UserClaim#setTitle(String)}
   *   <li>{@link UserClaim#setUsername(String)}
   *   <li>{@link UserClaim#toString()}
   *   <li>{@link UserClaim#getAvatarSmallUrl()}
   *   <li>{@link UserClaim#getAvatarUrl()}
   *   <li>{@link UserClaim#getCompany()}
   *   <li>{@link UserClaim#getCompanyId()}
   *   <li>{@link UserClaim#getDisplayName()}
   *   <li>{@link UserClaim#getEmailAddress()}
   *   <li>{@link UserClaim#getFirstName()}
   *   <li>{@link UserClaim#getId()}
   *   <li>{@link UserClaim#getLastName()}
   *   <li>{@link UserClaim#getLocation()}
   *   <li>{@link UserClaim#getTitle()}
   *   <li>{@link UserClaim#getUsername()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void UserClaim.<init>()", "String UserClaim.getAvatarSmallUrl()",
      "String UserClaim.getAvatarUrl()", "String UserClaim.getCompany()", "String UserClaim.getCompanyId()",
      "String UserClaim.getDisplayName()", "String UserClaim.getEmailAddress()", "String UserClaim.getFirstName()",
      "Long UserClaim.getId()", "String UserClaim.getLastName()", "String UserClaim.getLocation()",
      "String UserClaim.getTitle()", "String UserClaim.getUsername()", "void UserClaim.setAvatarSmallUrl(String)",
      "void UserClaim.setAvatarUrl(String)", "void UserClaim.setCompany(String)", "void UserClaim.setCompanyId(String)",
      "void UserClaim.setDisplayName(String)", "void UserClaim.setEmailAddress(String)",
      "void UserClaim.setFirstName(String)", "void UserClaim.setId(Long)", "void UserClaim.setLastName(String)",
      "void UserClaim.setLocation(String)", "void UserClaim.setTitle(String)", "void UserClaim.setUsername(String)",
      "String UserClaim.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    UserClaim actualUserClaim = new UserClaim();
    actualUserClaim.setAvatarSmallUrl("https://example.org/example");
    actualUserClaim.setAvatarUrl("https://example.org/example");
    actualUserClaim.setCompany("Company");
    actualUserClaim.setCompanyId("42");
    actualUserClaim.setDisplayName("Display Name");
    actualUserClaim.setEmailAddress("42 Main St");
    actualUserClaim.setFirstName("Jane");
    actualUserClaim.setId(1L);
    actualUserClaim.setLastName("Doe");
    actualUserClaim.setLocation("Location");
    actualUserClaim.setTitle("Dr");
    actualUserClaim.setUsername("janedoe");
    String actualToStringResult = actualUserClaim.toString();
    String actualAvatarSmallUrl = actualUserClaim.getAvatarSmallUrl();
    String actualAvatarUrl = actualUserClaim.getAvatarUrl();
    String actualCompany = actualUserClaim.getCompany();
    String actualCompanyId = actualUserClaim.getCompanyId();
    String actualDisplayName = actualUserClaim.getDisplayName();
    String actualEmailAddress = actualUserClaim.getEmailAddress();
    String actualFirstName = actualUserClaim.getFirstName();
    Long actualId = actualUserClaim.getId();
    String actualLastName = actualUserClaim.getLastName();
    String actualLocation = actualUserClaim.getLocation();
    String actualTitle = actualUserClaim.getTitle();

    // Assert
    assertEquals("42 Main St", actualEmailAddress);
    assertEquals("42", actualCompanyId);
    assertEquals("Company", actualCompany);
    assertEquals("Display Name", actualDisplayName);
    assertEquals("Doe", actualLastName);
    assertEquals("Dr", actualTitle);
    assertEquals("Jane", actualFirstName);
    assertEquals("Location", actualLocation);
    assertEquals(
        "UserClaim(id=1, emailAddress=42 Main St, username=janedoe, firstName=Jane, lastName=Doe, displayName=Display"
            + " Name, title=Dr, company=Company, companyId=42, location=Location, avatarUrl=https://example.org/example,"
            + " avatarSmallUrl=https://example.org/example)",
        actualToStringResult);
    assertEquals("https://example.org/example", actualAvatarSmallUrl);
    assertEquals("https://example.org/example", actualAvatarUrl);
    assertEquals("janedoe", actualUserClaim.getUsername());
    assertEquals(1L, actualId.longValue());
  }
}
