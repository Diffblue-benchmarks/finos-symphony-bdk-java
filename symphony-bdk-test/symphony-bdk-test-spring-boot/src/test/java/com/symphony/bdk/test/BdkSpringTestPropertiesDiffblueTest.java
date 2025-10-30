package com.symphony.bdk.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkSpringTestPropertiesDiffblueTest {
  /**
   * Test {@link BdkSpringTestProperties#equals(Object)}, and {@link BdkSpringTestProperties#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BdkSpringTestProperties#equals(Object)}
   *   <li>{@link BdkSpringTestProperties#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkSpringTestProperties.equals(Object)", "int BdkSpringTestProperties.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    BdkSpringTestProperties bdkSpringTestProperties = new BdkSpringTestProperties();
    bdkSpringTestProperties.setDisplayName("Display Name");
    bdkSpringTestProperties.setEmail("jane.doe@example.org");
    bdkSpringTestProperties.setId(1L);
    bdkSpringTestProperties.setUsername("janedoe");

    BdkSpringTestProperties bdkSpringTestProperties2 = new BdkSpringTestProperties();
    bdkSpringTestProperties2.setDisplayName("Display Name");
    bdkSpringTestProperties2.setEmail("jane.doe@example.org");
    bdkSpringTestProperties2.setId(1L);
    bdkSpringTestProperties2.setUsername("janedoe");

    // Act and Assert
    assertEquals(bdkSpringTestProperties, bdkSpringTestProperties2);
    int expectedHashCodeResult = bdkSpringTestProperties.hashCode();
    assertEquals(expectedHashCodeResult, bdkSpringTestProperties2.hashCode());
  }

  /**
   * Test {@link BdkSpringTestProperties#equals(Object)}, and {@link BdkSpringTestProperties#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BdkSpringTestProperties#equals(Object)}
   *   <li>{@link BdkSpringTestProperties#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkSpringTestProperties.equals(Object)", "int BdkSpringTestProperties.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    BdkSpringTestProperties bdkSpringTestProperties = new BdkSpringTestProperties();
    bdkSpringTestProperties.setDisplayName(null);
    bdkSpringTestProperties.setEmail("jane.doe@example.org");
    bdkSpringTestProperties.setId(1L);
    bdkSpringTestProperties.setUsername("janedoe");

    BdkSpringTestProperties bdkSpringTestProperties2 = new BdkSpringTestProperties();
    bdkSpringTestProperties2.setDisplayName(null);
    bdkSpringTestProperties2.setEmail("jane.doe@example.org");
    bdkSpringTestProperties2.setId(1L);
    bdkSpringTestProperties2.setUsername("janedoe");

    // Act and Assert
    assertEquals(bdkSpringTestProperties, bdkSpringTestProperties2);
    int expectedHashCodeResult = bdkSpringTestProperties.hashCode();
    assertEquals(expectedHashCodeResult, bdkSpringTestProperties2.hashCode());
  }

  /**
   * Test {@link BdkSpringTestProperties#equals(Object)}, and {@link BdkSpringTestProperties#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BdkSpringTestProperties#equals(Object)}
   *   <li>{@link BdkSpringTestProperties#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkSpringTestProperties.equals(Object)", "int BdkSpringTestProperties.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual3() {
    // Arrange
    BdkSpringTestProperties bdkSpringTestProperties = new BdkSpringTestProperties();
    bdkSpringTestProperties.setDisplayName("Display Name");
    bdkSpringTestProperties.setEmail(null);
    bdkSpringTestProperties.setId(1L);
    bdkSpringTestProperties.setUsername("janedoe");

    BdkSpringTestProperties bdkSpringTestProperties2 = new BdkSpringTestProperties();
    bdkSpringTestProperties2.setDisplayName("Display Name");
    bdkSpringTestProperties2.setEmail(null);
    bdkSpringTestProperties2.setId(1L);
    bdkSpringTestProperties2.setUsername("janedoe");

    // Act and Assert
    assertEquals(bdkSpringTestProperties, bdkSpringTestProperties2);
    int expectedHashCodeResult = bdkSpringTestProperties.hashCode();
    assertEquals(expectedHashCodeResult, bdkSpringTestProperties2.hashCode());
  }

  /**
   * Test {@link BdkSpringTestProperties#equals(Object)}, and {@link BdkSpringTestProperties#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BdkSpringTestProperties#equals(Object)}
   *   <li>{@link BdkSpringTestProperties#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkSpringTestProperties.equals(Object)", "int BdkSpringTestProperties.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual4() {
    // Arrange
    BdkSpringTestProperties bdkSpringTestProperties = new BdkSpringTestProperties();
    bdkSpringTestProperties.setDisplayName("Display Name");
    bdkSpringTestProperties.setEmail("jane.doe@example.org");
    bdkSpringTestProperties.setId(null);
    bdkSpringTestProperties.setUsername("janedoe");

    BdkSpringTestProperties bdkSpringTestProperties2 = new BdkSpringTestProperties();
    bdkSpringTestProperties2.setDisplayName("Display Name");
    bdkSpringTestProperties2.setEmail("jane.doe@example.org");
    bdkSpringTestProperties2.setId(null);
    bdkSpringTestProperties2.setUsername("janedoe");

    // Act and Assert
    assertEquals(bdkSpringTestProperties, bdkSpringTestProperties2);
    int expectedHashCodeResult = bdkSpringTestProperties.hashCode();
    assertEquals(expectedHashCodeResult, bdkSpringTestProperties2.hashCode());
  }

  /**
   * Test {@link BdkSpringTestProperties#equals(Object)}, and {@link BdkSpringTestProperties#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BdkSpringTestProperties#equals(Object)}
   *   <li>{@link BdkSpringTestProperties#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkSpringTestProperties.equals(Object)", "int BdkSpringTestProperties.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual5() {
    // Arrange
    BdkSpringTestProperties bdkSpringTestProperties = new BdkSpringTestProperties();
    bdkSpringTestProperties.setDisplayName("Display Name");
    bdkSpringTestProperties.setEmail("jane.doe@example.org");
    bdkSpringTestProperties.setId(1L);
    bdkSpringTestProperties.setUsername(null);

    BdkSpringTestProperties bdkSpringTestProperties2 = new BdkSpringTestProperties();
    bdkSpringTestProperties2.setDisplayName("Display Name");
    bdkSpringTestProperties2.setEmail("jane.doe@example.org");
    bdkSpringTestProperties2.setId(1L);
    bdkSpringTestProperties2.setUsername(null);

    // Act and Assert
    assertEquals(bdkSpringTestProperties, bdkSpringTestProperties2);
    int expectedHashCodeResult = bdkSpringTestProperties.hashCode();
    assertEquals(expectedHashCodeResult, bdkSpringTestProperties2.hashCode());
  }

  /**
   * Test {@link BdkSpringTestProperties#equals(Object)}, and {@link BdkSpringTestProperties#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BdkSpringTestProperties#equals(Object)}
   *   <li>{@link BdkSpringTestProperties#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkSpringTestProperties.equals(Object)", "int BdkSpringTestProperties.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    BdkSpringTestProperties bdkSpringTestProperties = new BdkSpringTestProperties();
    bdkSpringTestProperties.setDisplayName("Display Name");
    bdkSpringTestProperties.setEmail("jane.doe@example.org");
    bdkSpringTestProperties.setId(1L);
    bdkSpringTestProperties.setUsername("janedoe");

    // Act and Assert
    assertEquals(bdkSpringTestProperties, bdkSpringTestProperties);
    int expectedHashCodeResult = bdkSpringTestProperties.hashCode();
    assertEquals(expectedHashCodeResult, bdkSpringTestProperties.hashCode());
  }

  /**
   * Test {@link BdkSpringTestProperties#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkSpringTestProperties#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkSpringTestProperties.equals(Object)", "int BdkSpringTestProperties.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    BdkSpringTestProperties bdkSpringTestProperties = new BdkSpringTestProperties();
    bdkSpringTestProperties.setDisplayName("janedoe");
    bdkSpringTestProperties.setEmail("jane.doe@example.org");
    bdkSpringTestProperties.setId(1L);
    bdkSpringTestProperties.setUsername("janedoe");

    BdkSpringTestProperties bdkSpringTestProperties2 = new BdkSpringTestProperties();
    bdkSpringTestProperties2.setDisplayName("Display Name");
    bdkSpringTestProperties2.setEmail("jane.doe@example.org");
    bdkSpringTestProperties2.setId(1L);
    bdkSpringTestProperties2.setUsername("janedoe");

    // Act and Assert
    assertNotEquals(bdkSpringTestProperties, bdkSpringTestProperties2);
  }

  /**
   * Test {@link BdkSpringTestProperties#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkSpringTestProperties#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkSpringTestProperties.equals(Object)", "int BdkSpringTestProperties.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    BdkSpringTestProperties bdkSpringTestProperties = new BdkSpringTestProperties();
    bdkSpringTestProperties.setDisplayName(null);
    bdkSpringTestProperties.setEmail("jane.doe@example.org");
    bdkSpringTestProperties.setId(1L);
    bdkSpringTestProperties.setUsername("janedoe");

    BdkSpringTestProperties bdkSpringTestProperties2 = new BdkSpringTestProperties();
    bdkSpringTestProperties2.setDisplayName("Display Name");
    bdkSpringTestProperties2.setEmail("jane.doe@example.org");
    bdkSpringTestProperties2.setId(1L);
    bdkSpringTestProperties2.setUsername("janedoe");

    // Act and Assert
    assertNotEquals(bdkSpringTestProperties, bdkSpringTestProperties2);
  }

  /**
   * Test {@link BdkSpringTestProperties#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkSpringTestProperties#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkSpringTestProperties.equals(Object)", "int BdkSpringTestProperties.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    BdkSpringTestProperties bdkSpringTestProperties = new BdkSpringTestProperties();
    bdkSpringTestProperties.setDisplayName("Display Name");
    bdkSpringTestProperties.setEmail("john.smith@example.org");
    bdkSpringTestProperties.setId(1L);
    bdkSpringTestProperties.setUsername("janedoe");

    BdkSpringTestProperties bdkSpringTestProperties2 = new BdkSpringTestProperties();
    bdkSpringTestProperties2.setDisplayName("Display Name");
    bdkSpringTestProperties2.setEmail("jane.doe@example.org");
    bdkSpringTestProperties2.setId(1L);
    bdkSpringTestProperties2.setUsername("janedoe");

    // Act and Assert
    assertNotEquals(bdkSpringTestProperties, bdkSpringTestProperties2);
  }

  /**
   * Test {@link BdkSpringTestProperties#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkSpringTestProperties#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkSpringTestProperties.equals(Object)", "int BdkSpringTestProperties.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    BdkSpringTestProperties bdkSpringTestProperties = new BdkSpringTestProperties();
    bdkSpringTestProperties.setDisplayName("Display Name");
    bdkSpringTestProperties.setEmail(null);
    bdkSpringTestProperties.setId(1L);
    bdkSpringTestProperties.setUsername("janedoe");

    BdkSpringTestProperties bdkSpringTestProperties2 = new BdkSpringTestProperties();
    bdkSpringTestProperties2.setDisplayName("Display Name");
    bdkSpringTestProperties2.setEmail("jane.doe@example.org");
    bdkSpringTestProperties2.setId(1L);
    bdkSpringTestProperties2.setUsername("janedoe");

    // Act and Assert
    assertNotEquals(bdkSpringTestProperties, bdkSpringTestProperties2);
  }

  /**
   * Test {@link BdkSpringTestProperties#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkSpringTestProperties#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkSpringTestProperties.equals(Object)", "int BdkSpringTestProperties.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    BdkSpringTestProperties bdkSpringTestProperties = new BdkSpringTestProperties();
    bdkSpringTestProperties.setDisplayName("Display Name");
    bdkSpringTestProperties.setEmail("jane.doe@example.org");
    bdkSpringTestProperties.setId(2L);
    bdkSpringTestProperties.setUsername("janedoe");

    BdkSpringTestProperties bdkSpringTestProperties2 = new BdkSpringTestProperties();
    bdkSpringTestProperties2.setDisplayName("Display Name");
    bdkSpringTestProperties2.setEmail("jane.doe@example.org");
    bdkSpringTestProperties2.setId(1L);
    bdkSpringTestProperties2.setUsername("janedoe");

    // Act and Assert
    assertNotEquals(bdkSpringTestProperties, bdkSpringTestProperties2);
  }

  /**
   * Test {@link BdkSpringTestProperties#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkSpringTestProperties#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkSpringTestProperties.equals(Object)", "int BdkSpringTestProperties.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    BdkSpringTestProperties bdkSpringTestProperties = new BdkSpringTestProperties();
    bdkSpringTestProperties.setDisplayName("Display Name");
    bdkSpringTestProperties.setEmail("jane.doe@example.org");
    bdkSpringTestProperties.setId(null);
    bdkSpringTestProperties.setUsername("janedoe");

    BdkSpringTestProperties bdkSpringTestProperties2 = new BdkSpringTestProperties();
    bdkSpringTestProperties2.setDisplayName("Display Name");
    bdkSpringTestProperties2.setEmail("jane.doe@example.org");
    bdkSpringTestProperties2.setId(1L);
    bdkSpringTestProperties2.setUsername("janedoe");

    // Act and Assert
    assertNotEquals(bdkSpringTestProperties, bdkSpringTestProperties2);
  }

  /**
   * Test {@link BdkSpringTestProperties#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkSpringTestProperties#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkSpringTestProperties.equals(Object)", "int BdkSpringTestProperties.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    BdkSpringTestProperties bdkSpringTestProperties = new BdkSpringTestProperties();
    bdkSpringTestProperties.setDisplayName("Display Name");
    bdkSpringTestProperties.setEmail("jane.doe@example.org");
    bdkSpringTestProperties.setId(1L);
    bdkSpringTestProperties.setUsername("Display Name");

    BdkSpringTestProperties bdkSpringTestProperties2 = new BdkSpringTestProperties();
    bdkSpringTestProperties2.setDisplayName("Display Name");
    bdkSpringTestProperties2.setEmail("jane.doe@example.org");
    bdkSpringTestProperties2.setId(1L);
    bdkSpringTestProperties2.setUsername("janedoe");

    // Act and Assert
    assertNotEquals(bdkSpringTestProperties, bdkSpringTestProperties2);
  }

  /**
   * Test {@link BdkSpringTestProperties#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkSpringTestProperties#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkSpringTestProperties.equals(Object)", "int BdkSpringTestProperties.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    BdkSpringTestProperties bdkSpringTestProperties = new BdkSpringTestProperties();
    bdkSpringTestProperties.setDisplayName("Display Name");
    bdkSpringTestProperties.setEmail("jane.doe@example.org");
    bdkSpringTestProperties.setId(1L);
    bdkSpringTestProperties.setUsername(null);

    BdkSpringTestProperties bdkSpringTestProperties2 = new BdkSpringTestProperties();
    bdkSpringTestProperties2.setDisplayName("Display Name");
    bdkSpringTestProperties2.setEmail("jane.doe@example.org");
    bdkSpringTestProperties2.setId(1L);
    bdkSpringTestProperties2.setUsername("janedoe");

    // Act and Assert
    assertNotEquals(bdkSpringTestProperties, bdkSpringTestProperties2);
  }

  /**
   * Test {@link BdkSpringTestProperties#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkSpringTestProperties#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkSpringTestProperties.equals(Object)", "int BdkSpringTestProperties.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    BdkSpringTestProperties bdkSpringTestProperties = new BdkSpringTestProperties();
    bdkSpringTestProperties.setDisplayName("Display Name");
    bdkSpringTestProperties.setEmail("jane.doe@example.org");
    bdkSpringTestProperties.setId(1L);
    bdkSpringTestProperties.setUsername("janedoe");

    // Act and Assert
    assertNotEquals(bdkSpringTestProperties, null);
  }

  /**
   * Test {@link BdkSpringTestProperties#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkSpringTestProperties#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkSpringTestProperties.equals(Object)", "int BdkSpringTestProperties.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    BdkSpringTestProperties bdkSpringTestProperties = new BdkSpringTestProperties();
    bdkSpringTestProperties.setDisplayName("Display Name");
    bdkSpringTestProperties.setEmail("jane.doe@example.org");
    bdkSpringTestProperties.setId(1L);
    bdkSpringTestProperties.setUsername("janedoe");

    // Act and Assert
    assertNotEquals(bdkSpringTestProperties, "Different type to BdkSpringTestProperties");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link BdkSpringTestProperties}
   *   <li>{@link BdkSpringTestProperties#setDisplayName(String)}
   *   <li>{@link BdkSpringTestProperties#setEmail(String)}
   *   <li>{@link BdkSpringTestProperties#setId(Long)}
   *   <li>{@link BdkSpringTestProperties#setUsername(String)}
   *   <li>{@link BdkSpringTestProperties#toString()}
   *   <li>{@link BdkSpringTestProperties#getDisplayName()}
   *   <li>{@link BdkSpringTestProperties#getEmail()}
   *   <li>{@link BdkSpringTestProperties#getId()}
   *   <li>{@link BdkSpringTestProperties#getUsername()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BdkSpringTestProperties.<init>()", "String BdkSpringTestProperties.getDisplayName()",
      "String BdkSpringTestProperties.getEmail()", "Long BdkSpringTestProperties.getId()",
      "String BdkSpringTestProperties.getUsername()", "void BdkSpringTestProperties.setDisplayName(String)",
      "void BdkSpringTestProperties.setEmail(String)", "void BdkSpringTestProperties.setId(Long)",
      "void BdkSpringTestProperties.setUsername(String)", "String BdkSpringTestProperties.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    BdkSpringTestProperties actualBdkSpringTestProperties = new BdkSpringTestProperties();
    actualBdkSpringTestProperties.setDisplayName("Display Name");
    actualBdkSpringTestProperties.setEmail("jane.doe@example.org");
    actualBdkSpringTestProperties.setId(1L);
    actualBdkSpringTestProperties.setUsername("janedoe");
    String actualToStringResult = actualBdkSpringTestProperties.toString();
    String actualDisplayName = actualBdkSpringTestProperties.getDisplayName();
    String actualEmail = actualBdkSpringTestProperties.getEmail();
    Long actualId = actualBdkSpringTestProperties.getId();

    // Assert
    assertEquals(
        "BdkSpringTestProperties(id=1, username=janedoe, displayName=Display Name, email=jane.doe" + "@example.org)",
        actualToStringResult);
    assertEquals("Display Name", actualDisplayName);
    assertEquals("jane.doe@example.org", actualEmail);
    assertEquals("janedoe", actualBdkSpringTestProperties.getUsername());
    assertEquals(1L, actualId.longValue());
  }
}
