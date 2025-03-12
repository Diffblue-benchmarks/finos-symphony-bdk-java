package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CompanyCertInfoDiffblueTest {
  /**
   * Test {@link CompanyCertInfo#equals(Object)}, and {@link CompanyCertInfo#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link CompanyCertInfo#equals(Object)}
   *   <li>{@link CompanyCertInfo#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompanyCertInfo.equals(Object)", "int CompanyCertInfo.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CompanyCertInfo companyCertInfo = new CompanyCertInfo();
    CompanyCertInfo companyCertInfo2 = new CompanyCertInfo();

    // Act and Assert
    assertEquals(companyCertInfo, companyCertInfo2);
    int expectedHashCodeResult = companyCertInfo.hashCode();
    assertEquals(expectedHashCodeResult, companyCertInfo2.hashCode());
  }

  /**
   * Test {@link CompanyCertInfo#equals(Object)}, and {@link CompanyCertInfo#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link CompanyCertInfo#equals(Object)}
   *   <li>{@link CompanyCertInfo#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompanyCertInfo.equals(Object)", "int CompanyCertInfo.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CompanyCertInfo companyCertInfo = new CompanyCertInfo();

    // Act and Assert
    assertEquals(companyCertInfo, companyCertInfo);
    int expectedHashCodeResult = companyCertInfo.hashCode();
    assertEquals(expectedHashCodeResult, companyCertInfo.hashCode());
  }

  /**
   * Test {@link CompanyCertInfo#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompanyCertInfo.equals(Object)", "int CompanyCertInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CompanyCertInfo(), 1);
  }

  /**
   * Test {@link CompanyCertInfo#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompanyCertInfo.equals(Object)", "int CompanyCertInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    CompanyCertInfo companyCertInfo = new CompanyCertInfo();
    companyCertInfo.fingerPrint("b6:03:0e:39:97:9e:d0:e7:24:ce:a3:77:3e:01:42:09");

    // Act and Assert
    assertNotEquals(companyCertInfo, new CompanyCertInfo());
  }

  /**
   * Test {@link CompanyCertInfo#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompanyCertInfo.equals(Object)", "int CompanyCertInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    CompanyCertInfo companyCertInfo = new CompanyCertInfo();
    companyCertInfo.setIssuerFingerPrint("b6:03:0e:39:97:9e:d0:e7:24:ce:a3:77:3e:01:42:09");

    // Act and Assert
    assertNotEquals(companyCertInfo, new CompanyCertInfo());
  }

  /**
   * Test {@link CompanyCertInfo#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompanyCertInfo.equals(Object)", "int CompanyCertInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    CompanyCertInfo companyCertInfo = new CompanyCertInfo();
    companyCertInfo.lastSeen(1L);

    // Act and Assert
    assertNotEquals(companyCertInfo, new CompanyCertInfo());
  }

  /**
   * Test {@link CompanyCertInfo#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompanyCertInfo.equals(Object)", "int CompanyCertInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    CompanyCertInfo companyCertInfo = new CompanyCertInfo();
    companyCertInfo.updatedAt(1L);

    // Act and Assert
    assertNotEquals(companyCertInfo, new CompanyCertInfo());
  }

  /**
   * Test {@link CompanyCertInfo#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompanyCertInfo.equals(Object)", "int CompanyCertInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    CompanyCertInfo companyCertInfo = new CompanyCertInfo();
    companyCertInfo.updatedBy(1L);

    // Act and Assert
    assertNotEquals(companyCertInfo, new CompanyCertInfo());
  }

  /**
   * Test {@link CompanyCertInfo#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompanyCertInfo.equals(Object)", "int CompanyCertInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    CompanyCertInfo companyCertInfo = new CompanyCertInfo();
    companyCertInfo.commonName("Common Name");

    // Act and Assert
    assertNotEquals(companyCertInfo, new CompanyCertInfo());
  }

  /**
   * Test {@link CompanyCertInfo#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompanyCertInfo.equals(Object)", "int CompanyCertInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    CompanyCertInfo companyCertInfo = new CompanyCertInfo();
    companyCertInfo.expiryDate(1L);

    // Act and Assert
    assertNotEquals(companyCertInfo, new CompanyCertInfo());
  }

  /**
   * Test {@link CompanyCertInfo#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompanyCertInfo.equals(Object)", "int CompanyCertInfo.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CompanyCertInfo(), null);
  }

  /**
   * Test {@link CompanyCertInfo#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompanyCertInfo.equals(Object)", "int CompanyCertInfo.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CompanyCertInfo(), "Different type to CompanyCertInfo");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link CompanyCertInfo}
   *   <li>{@link CompanyCertInfo#commonName(String)}
   *   <li>{@link CompanyCertInfo#expiryDate(Long)}
   *   <li>{@link CompanyCertInfo#fingerPrint(String)}
   *   <li>{@link CompanyCertInfo#lastSeen(Long)}
   *   <li>{@link CompanyCertInfo#setCommonName(String)}
   *   <li>{@link CompanyCertInfo#setExpiryDate(Long)}
   *   <li>{@link CompanyCertInfo#setFingerPrint(String)}
   *   <li>{@link CompanyCertInfo#setIssuerFingerPrint(String)}
   *   <li>{@link CompanyCertInfo#setLastSeen(Long)}
   *   <li>{@link CompanyCertInfo#setUpdatedAt(Long)}
   *   <li>{@link CompanyCertInfo#setUpdatedBy(Long)}
   *   <li>{@link CompanyCertInfo#updatedAt(Long)}
   *   <li>{@link CompanyCertInfo#updatedBy(Long)}
   *   <li>{@link CompanyCertInfo#issuerFingerPrint(String)}
   *   <li>{@link CompanyCertInfo#toString()}
   *   <li>{@link CompanyCertInfo#getCommonName()}
   *   <li>{@link CompanyCertInfo#getExpiryDate()}
   *   <li>{@link CompanyCertInfo#getFingerPrint()}
   *   <li>{@link CompanyCertInfo#getIssuerFingerPrint()}
   *   <li>{@link CompanyCertInfo#getLastSeen()}
   *   <li>{@link CompanyCertInfo#getUpdatedAt()}
   *   <li>{@link CompanyCertInfo#getUpdatedBy()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CompanyCertInfo.<init>()", "CompanyCertInfo CompanyCertInfo.commonName(String)",
      "CompanyCertInfo CompanyCertInfo.expiryDate(Long)", "CompanyCertInfo CompanyCertInfo.fingerPrint(String)",
      "String CompanyCertInfo.getCommonName()", "Long CompanyCertInfo.getExpiryDate()",
      "String CompanyCertInfo.getFingerPrint()", "String CompanyCertInfo.getIssuerFingerPrint()",
      "Long CompanyCertInfo.getLastSeen()", "Long CompanyCertInfo.getUpdatedAt()",
      "Long CompanyCertInfo.getUpdatedBy()", "CompanyCertInfo CompanyCertInfo.issuerFingerPrint(String)",
      "CompanyCertInfo CompanyCertInfo.lastSeen(Long)", "void CompanyCertInfo.setCommonName(String)",
      "void CompanyCertInfo.setExpiryDate(Long)", "void CompanyCertInfo.setFingerPrint(String)",
      "void CompanyCertInfo.setIssuerFingerPrint(String)", "void CompanyCertInfo.setLastSeen(Long)",
      "void CompanyCertInfo.setUpdatedAt(Long)", "void CompanyCertInfo.setUpdatedBy(Long)",
      "String CompanyCertInfo.toString()", "CompanyCertInfo CompanyCertInfo.updatedAt(Long)",
      "CompanyCertInfo CompanyCertInfo.updatedBy(Long)"})
  void testGettersAndSetters() {
    // Arrange and Act
    CompanyCertInfo actualCompanyCertInfo = new CompanyCertInfo();
    CompanyCertInfo actualCommonNameResult = actualCompanyCertInfo.commonName("Common Name");
    CompanyCertInfo actualExpiryDateResult = actualCompanyCertInfo.expiryDate(1L);
    CompanyCertInfo actualFingerPrintResult = actualCompanyCertInfo
        .fingerPrint("b6:03:0e:39:97:9e:d0:e7:24:ce:a3:77:3e:01:42:09");
    CompanyCertInfo actualLastSeenResult = actualCompanyCertInfo.lastSeen(1L);
    actualCompanyCertInfo.setCommonName("Common Name");
    actualCompanyCertInfo.setExpiryDate(1L);
    actualCompanyCertInfo.setFingerPrint("b6:03:0e:39:97:9e:d0:e7:24:ce:a3:77:3e:01:42:09");
    actualCompanyCertInfo.setIssuerFingerPrint("b6:03:0e:39:97:9e:d0:e7:24:ce:a3:77:3e:01:42:09");
    actualCompanyCertInfo.setLastSeen(1L);
    actualCompanyCertInfo.setUpdatedAt(1L);
    actualCompanyCertInfo.setUpdatedBy(1L);
    CompanyCertInfo actualUpdatedAtResult = actualCompanyCertInfo.updatedAt(1L);
    CompanyCertInfo actualUpdatedByResult = actualCompanyCertInfo.updatedBy(1L);
    CompanyCertInfo actualIssuerFingerPrintResult = actualCompanyCertInfo
        .issuerFingerPrint("b6:03:0e:39:97:9e:d0:e7:24:ce:a3:77:3e:01:42:09");
    String actualToStringResult = actualCompanyCertInfo.toString();
    String actualCommonName = actualCompanyCertInfo.getCommonName();
    Long actualExpiryDate = actualCompanyCertInfo.getExpiryDate();
    String actualFingerPrint = actualCompanyCertInfo.getFingerPrint();
    String actualIssuerFingerPrint = actualCompanyCertInfo.getIssuerFingerPrint();
    Long actualLastSeen = actualCompanyCertInfo.getLastSeen();
    Long actualUpdatedAt = actualCompanyCertInfo.getUpdatedAt();
    Long actualUpdatedBy = actualCompanyCertInfo.getUpdatedBy();

    // Assert
    assertEquals("Common Name", actualCommonName);
    assertEquals("b6:03:0e:39:97:9e:d0:e7:24:ce:a3:77:3e:01:42:09", actualFingerPrint);
    assertEquals("b6:03:0e:39:97:9e:d0:e7:24:ce:a3:77:3e:01:42:09", actualIssuerFingerPrint);
    assertEquals("class CompanyCertInfo {\n" + "    fingerPrint: b6:03:0e:39:97:9e:d0:e7:24:ce:a3:77:3e:01:42:09\n"
        + "    issuerFingerPrint: b6:03:0e:39:97:9e:d0:e7:24:ce:a3:77:3e:01:42:09\n" + "    lastSeen: 1\n"
        + "    updatedAt: 1\n" + "    updatedBy: 1\n" + "    commonName: Common Name\n" + "    expiryDate: 1\n" + "}",
        actualToStringResult);
    assertEquals(1L, actualExpiryDate.longValue());
    assertEquals(1L, actualLastSeen.longValue());
    assertEquals(1L, actualUpdatedAt.longValue());
    assertEquals(1L, actualUpdatedBy.longValue());
    assertSame(actualCompanyCertInfo, actualCommonNameResult);
    assertSame(actualCompanyCertInfo, actualExpiryDateResult);
    assertSame(actualCompanyCertInfo, actualFingerPrintResult);
    assertSame(actualCompanyCertInfo, actualIssuerFingerPrintResult);
    assertSame(actualCompanyCertInfo, actualLastSeenResult);
    assertSame(actualCompanyCertInfo, actualUpdatedAtResult);
    assertSame(actualCompanyCertInfo, actualUpdatedByResult);
  }
}
