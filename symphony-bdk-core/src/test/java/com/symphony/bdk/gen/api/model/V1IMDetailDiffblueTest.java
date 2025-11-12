package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V1IMDetailDiffblueTest {
  /**
   * Test {@link V1IMDetail#equals(Object)}, and {@link V1IMDetail#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V1IMDetail#equals(Object)}
   *   <li>{@link V1IMDetail#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1IMDetail.equals(Object)", "int V1IMDetail.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V1IMDetail v1imDetail = new V1IMDetail();
    V1IMDetail v1imDetail2 = new V1IMDetail();

    // Act and Assert
    assertEquals(v1imDetail, v1imDetail2);
    assertEquals(v1imDetail.hashCode(), v1imDetail2.hashCode());
  }

  /**
   * Test {@link V1IMDetail#equals(Object)}, and {@link V1IMDetail#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V1IMDetail#equals(Object)}
   *   <li>{@link V1IMDetail#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1IMDetail.equals(Object)", "int V1IMDetail.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V1IMDetail v1imDetail = new V1IMDetail();

    // Act and Assert
    assertEquals(v1imDetail, v1imDetail);
    int expectedHashCodeResult = v1imDetail.hashCode();
    assertEquals(expectedHashCodeResult, v1imDetail.hashCode());
  }

  /**
   * Test {@link V1IMDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1IMDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1IMDetail.equals(Object)", "int V1IMDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1IMDetail(), 1);
  }

  /**
   * Test {@link V1IMDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1IMDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1IMDetail.equals(Object)", "int V1IMDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V1IMDetail v1imDetail = new V1IMDetail();
    v1imDetail.v1IMAttributes(new V1IMAttributes());

    // Act and Assert
    assertNotEquals(v1imDetail, new V1IMDetail());
  }

  /**
   * Test {@link V1IMDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1IMDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1IMDetail.equals(Object)", "int V1IMDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V1IMDetail v1imDetail = new V1IMDetail();
    v1imDetail.imSystemInfo(new IMSystemInfo());

    // Act and Assert
    assertNotEquals(v1imDetail, new V1IMDetail());
  }

  /**
   * Test {@link V1IMDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1IMDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1IMDetail.equals(Object)", "int V1IMDetail.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1IMDetail(), null);
  }

  /**
   * Test {@link V1IMDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1IMDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1IMDetail.equals(Object)", "int V1IMDetail.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1IMDetail(), "Different type to V1IMDetail");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V1IMDetail}
   *   <li>{@link V1IMDetail#imSystemInfo(IMSystemInfo)}
   *   <li>{@link V1IMDetail#setImSystemInfo(IMSystemInfo)}
   *   <li>{@link V1IMDetail#setV1IMAttributes(V1IMAttributes)}
   *   <li>{@link V1IMDetail#v1IMAttributes(V1IMAttributes)}
   *   <li>{@link V1IMDetail#toString()}
   *   <li>{@link V1IMDetail#getImSystemInfo()}
   *   <li>{@link V1IMDetail#getV1IMAttributes()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V1IMDetail.<init>()",
    "IMSystemInfo V1IMDetail.getImSystemInfo()",
    "V1IMAttributes V1IMDetail.getV1IMAttributes()",
    "V1IMDetail V1IMDetail.imSystemInfo(IMSystemInfo)",
    "void V1IMDetail.setImSystemInfo(IMSystemInfo)",
    "void V1IMDetail.setV1IMAttributes(V1IMAttributes)",
    "String V1IMDetail.toString()",
    "V1IMDetail V1IMDetail.v1IMAttributes(V1IMAttributes)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V1IMDetail actualV1imDetail = new V1IMDetail();
    V1IMDetail actualImSystemInfoResult = actualV1imDetail.imSystemInfo(new IMSystemInfo());
    IMSystemInfo imSystemInfo = new IMSystemInfo();
    actualV1imDetail.setImSystemInfo(imSystemInfo);
    actualV1imDetail.setV1IMAttributes(new V1IMAttributes());
    V1IMAttributes v1IMAttributes = new V1IMAttributes();
    V1IMDetail actualV1IMAttributesResult = actualV1imDetail.v1IMAttributes(v1IMAttributes);
    String actualToStringResult = actualV1imDetail.toString();
    IMSystemInfo actualImSystemInfo = actualV1imDetail.getImSystemInfo();
    V1IMAttributes actualV1IMAttributes = actualV1imDetail.getV1IMAttributes();

    // Assert
    assertEquals(
        "class V1IMDetail {\n"
            + "    v1IMAttributes: class V1IMAttributes {\n"
            + "        pinnedMessageId: null\n"
            + "    }\n"
            + "    imSystemInfo: class IMSystemInfo {\n"
            + "        id: null\n"
            + "        creationDate: null\n"
            + "        active: null\n"
            + "    }\n"
            + "}",
        actualToStringResult);
    assertNull(actualV1IMAttributes.getPinnedMessageId());
    assertSame(imSystemInfo, actualImSystemInfo);
    assertSame(v1IMAttributes, actualV1IMAttributes);
    assertSame(actualV1imDetail, actualImSystemInfoResult);
    assertSame(actualV1imDetail, actualV1IMAttributesResult);
  }
}
