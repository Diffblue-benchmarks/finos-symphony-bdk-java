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

class CompanyCertDetailDiffblueTest {
  /**
   * Test {@link CompanyCertDetail#addCertInfoItem(CertInfoItem)}.
   *
   * <ul>
   *   <li>Given {@link CompanyCertDetail} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link CompanyCertDetail#addCertInfoItem(CertInfoItem)}
   */
  @Test
  @DisplayName("Test addCertInfoItem(CertInfoItem); given CompanyCertDetail (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CompanyCertDetail CompanyCertDetail.addCertInfoItem(CertInfoItem)"})
  void testAddCertInfoItem_givenCompanyCertDetail() {
    // Arrange
    CompanyCertDetail companyCertDetail = new CompanyCertDetail();

    // Act
    CompanyCertDetail actualAddCertInfoItemResult =
        companyCertDetail.addCertInfoItem(new CertInfoItem());

    // Assert
    assertSame(companyCertDetail, actualAddCertInfoItemResult);
  }

  /**
   * Test {@link CompanyCertDetail#addCertInfoItem(CertInfoItem)}.
   *
   * <ul>
   *   <li>Given {@link CompanyCertDetail} (default constructor) certInfo {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CompanyCertDetail#addCertInfoItem(CertInfoItem)}
   */
  @Test
  @DisplayName(
      "Test addCertInfoItem(CertInfoItem); given CompanyCertDetail (default constructor) certInfo ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CompanyCertDetail CompanyCertDetail.addCertInfoItem(CertInfoItem)"})
  void testAddCertInfoItem_givenCompanyCertDetailCertInfoArrayList() {
    // Arrange
    CompanyCertDetail companyCertDetail = new CompanyCertDetail();
    companyCertDetail.certInfo(new ArrayList<>());

    // Act
    CompanyCertDetail actualAddCertInfoItemResult =
        companyCertDetail.addCertInfoItem(new CertInfoItem());

    // Assert
    assertSame(companyCertDetail, actualAddCertInfoItemResult);
  }

  /**
   * Test {@link CompanyCertDetail#equals(Object)}, and {@link CompanyCertDetail#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CompanyCertDetail#equals(Object)}
   *   <li>{@link CompanyCertDetail#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CompanyCertDetail.equals(Object)",
    "int CompanyCertDetail.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CompanyCertDetail companyCertDetail = new CompanyCertDetail();
    CompanyCertDetail companyCertDetail2 = new CompanyCertDetail();

    // Act and Assert
    assertEquals(companyCertDetail, companyCertDetail2);
    assertEquals(companyCertDetail.hashCode(), companyCertDetail2.hashCode());
  }

  /**
   * Test {@link CompanyCertDetail#equals(Object)}, and {@link CompanyCertDetail#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CompanyCertDetail#equals(Object)}
   *   <li>{@link CompanyCertDetail#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CompanyCertDetail.equals(Object)",
    "int CompanyCertDetail.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CompanyCertDetail companyCertDetail = new CompanyCertDetail();

    // Act and Assert
    assertEquals(companyCertDetail, companyCertDetail);
    int expectedHashCodeResult = companyCertDetail.hashCode();
    assertEquals(expectedHashCodeResult, companyCertDetail.hashCode());
  }

  /**
   * Test {@link CompanyCertDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CompanyCertDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CompanyCertDetail.equals(Object)",
    "int CompanyCertDetail.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    CompanyCertDetail companyCertDetail = new CompanyCertDetail();
    companyCertDetail.addCertInfoItem(new CertInfoItem());

    // Act and Assert
    assertNotEquals(companyCertDetail, new CompanyCertDetail());
  }

  /**
   * Test {@link CompanyCertDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CompanyCertDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CompanyCertDetail.equals(Object)",
    "int CompanyCertDetail.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    CompanyCertDetail companyCertDetail = new CompanyCertDetail();
    companyCertDetail.companyCertAttributes(new CompanyCertAttributes());
    companyCertDetail.addCertInfoItem(new CertInfoItem());

    // Act and Assert
    assertNotEquals(companyCertDetail, new CompanyCertDetail());
  }

  /**
   * Test {@link CompanyCertDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CompanyCertDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CompanyCertDetail.equals(Object)",
    "int CompanyCertDetail.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    CompanyCertDetail companyCertDetail = new CompanyCertDetail();
    companyCertDetail.companyCertInfo(new CompanyCertInfo());
    companyCertDetail.addCertInfoItem(new CertInfoItem());

    // Act and Assert
    assertNotEquals(companyCertDetail, new CompanyCertDetail());
  }

  /**
   * Test {@link CompanyCertDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CompanyCertDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CompanyCertDetail.equals(Object)",
    "int CompanyCertDetail.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CompanyCertDetail(), null);
  }

  /**
   * Test {@link CompanyCertDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CompanyCertDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CompanyCertDetail.equals(Object)",
    "int CompanyCertDetail.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CompanyCertDetail(), "Different type to CompanyCertDetail");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link CompanyCertDetail}
   *   <li>{@link CompanyCertDetail#certInfo(List)}
   *   <li>{@link CompanyCertDetail#companyCertAttributes(CompanyCertAttributes)}
   *   <li>{@link CompanyCertDetail#companyCertInfo(CompanyCertInfo)}
   *   <li>{@link CompanyCertDetail#setCertInfo(List)}
   *   <li>{@link CompanyCertDetail#setCompanyCertAttributes(CompanyCertAttributes)}
   *   <li>{@link CompanyCertDetail#setCompanyCertInfo(CompanyCertInfo)}
   *   <li>{@link CompanyCertDetail#toString()}
   *   <li>{@link CompanyCertDetail#getCertInfo()}
   *   <li>{@link CompanyCertDetail#getCompanyCertAttributes()}
   *   <li>{@link CompanyCertDetail#getCompanyCertInfo()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void CompanyCertDetail.<init>()",
    "CompanyCertDetail CompanyCertDetail.certInfo(List)",
    "CompanyCertDetail CompanyCertDetail.companyCertAttributes(CompanyCertAttributes)",
    "CompanyCertDetail CompanyCertDetail.companyCertInfo(CompanyCertInfo)",
    "List CompanyCertDetail.getCertInfo()",
    "CompanyCertAttributes CompanyCertDetail.getCompanyCertAttributes()",
    "CompanyCertInfo CompanyCertDetail.getCompanyCertInfo()",
    "void CompanyCertDetail.setCertInfo(List)",
    "void CompanyCertDetail.setCompanyCertAttributes(CompanyCertAttributes)",
    "void CompanyCertDetail.setCompanyCertInfo(CompanyCertInfo)",
    "String CompanyCertDetail.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    CompanyCertDetail actualCompanyCertDetail = new CompanyCertDetail();
    CompanyCertDetail actualCertInfoResult = actualCompanyCertDetail.certInfo(new ArrayList<>());
    CompanyCertDetail actualCompanyCertAttributesResult =
        actualCompanyCertDetail.companyCertAttributes(new CompanyCertAttributes());
    CompanyCertDetail actualCompanyCertInfoResult =
        actualCompanyCertDetail.companyCertInfo(new CompanyCertInfo());
    ArrayList<CertInfoItem> certInfo = new ArrayList<>();
    actualCompanyCertDetail.setCertInfo(certInfo);
    CompanyCertAttributes companyCertAttributes = new CompanyCertAttributes();
    actualCompanyCertDetail.setCompanyCertAttributes(companyCertAttributes);
    CompanyCertInfo companyCertInfo = new CompanyCertInfo();
    actualCompanyCertDetail.setCompanyCertInfo(companyCertInfo);
    String actualToStringResult = actualCompanyCertDetail.toString();
    List<CertInfoItem> actualCertInfo = actualCompanyCertDetail.getCertInfo();
    CompanyCertAttributes actualCompanyCertAttributes =
        actualCompanyCertDetail.getCompanyCertAttributes();
    CompanyCertInfo actualCompanyCertInfo = actualCompanyCertDetail.getCompanyCertInfo();

    // Assert
    assertEquals(
        "class CompanyCertDetail {\n"
            + "    companyCertAttributes: class CompanyCertAttributes {\n"
            + "        name: null\n"
            + "        type: null\n"
            + "        status: null\n"
            + "    }\n"
            + "    companyCertInfo: class CompanyCertInfo {\n"
            + "        fingerPrint: null\n"
            + "        issuerFingerPrint: null\n"
            + "        lastSeen: null\n"
            + "        updatedAt: null\n"
            + "        updatedBy: null\n"
            + "        commonName: null\n"
            + "        expiryDate: null\n"
            + "    }\n"
            + "    certInfo: []\n"
            + "}",
        actualToStringResult);
    assertTrue(actualCertInfo.isEmpty());
    assertSame(companyCertAttributes, actualCompanyCertAttributes);
    assertSame(actualCompanyCertDetail, actualCertInfoResult);
    assertSame(actualCompanyCertDetail, actualCompanyCertAttributesResult);
    assertSame(actualCompanyCertDetail, actualCompanyCertInfoResult);
    assertSame(companyCertInfo, actualCompanyCertInfo);
    assertSame(certInfo, actualCertInfo);
  }
}
