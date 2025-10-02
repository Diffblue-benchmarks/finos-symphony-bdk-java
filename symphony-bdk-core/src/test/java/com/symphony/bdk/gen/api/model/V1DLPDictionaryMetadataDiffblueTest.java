package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V1DLPDictionaryMetadataDiffblueTest {
  /**
   * Test {@link V1DLPDictionaryMetadata#equals(Object)}, and {@link
   * V1DLPDictionaryMetadata#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V1DLPDictionaryMetadata#equals(Object)}
   *   <li>{@link V1DLPDictionaryMetadata#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPDictionaryMetadata.equals(Object)",
    "int V1DLPDictionaryMetadata.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V1DLPDictionaryMetadata v1dlpDictionaryMetadata = new V1DLPDictionaryMetadata();
    V1DLPDictionaryMetadata v1dlpDictionaryMetadata2 = new V1DLPDictionaryMetadata();

    // Act and Assert
    assertEquals(v1dlpDictionaryMetadata, v1dlpDictionaryMetadata2);
    assertEquals(v1dlpDictionaryMetadata.hashCode(), v1dlpDictionaryMetadata2.hashCode());
  }

  /**
   * Test {@link V1DLPDictionaryMetadata#equals(Object)}, and {@link
   * V1DLPDictionaryMetadata#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V1DLPDictionaryMetadata#equals(Object)}
   *   <li>{@link V1DLPDictionaryMetadata#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPDictionaryMetadata.equals(Object)",
    "int V1DLPDictionaryMetadata.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V1DLPDictionaryMetadata v1dlpDictionaryMetadata = new V1DLPDictionaryMetadata();

    // Act and Assert
    assertEquals(v1dlpDictionaryMetadata, v1dlpDictionaryMetadata);
    int expectedHashCodeResult = v1dlpDictionaryMetadata.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpDictionaryMetadata.hashCode());
  }

  /**
   * Test {@link V1DLPDictionaryMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPDictionaryMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPDictionaryMetadata.equals(Object)",
    "int V1DLPDictionaryMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPDictionaryMetadata(), 1);
  }

  /**
   * Test {@link V1DLPDictionaryMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPDictionaryMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPDictionaryMetadata.equals(Object)",
    "int V1DLPDictionaryMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V1DLPDictionaryMetadata v1dlpDictionaryMetadata = new V1DLPDictionaryMetadata();
    v1dlpDictionaryMetadata.creationDate(1L);

    // Act and Assert
    assertNotEquals(v1dlpDictionaryMetadata, new V1DLPDictionaryMetadata());
  }

  /**
   * Test {@link V1DLPDictionaryMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPDictionaryMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPDictionaryMetadata.equals(Object)",
    "int V1DLPDictionaryMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V1DLPDictionaryMetadata v1dlpDictionaryMetadata = new V1DLPDictionaryMetadata();
    v1dlpDictionaryMetadata.creatorId("42");

    // Act and Assert
    assertNotEquals(v1dlpDictionaryMetadata, new V1DLPDictionaryMetadata());
  }

  /**
   * Test {@link V1DLPDictionaryMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPDictionaryMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPDictionaryMetadata.equals(Object)",
    "int V1DLPDictionaryMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V1DLPDictionaryMetadata v1dlpDictionaryMetadata = new V1DLPDictionaryMetadata();
    v1dlpDictionaryMetadata.dictRef(new V1DLPDictionaryRef());

    // Act and Assert
    assertNotEquals(v1dlpDictionaryMetadata, new V1DLPDictionaryMetadata());
  }

  /**
   * Test {@link V1DLPDictionaryMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPDictionaryMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPDictionaryMetadata.equals(Object)",
    "int V1DLPDictionaryMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V1DLPDictionaryMetadata v1dlpDictionaryMetadata = new V1DLPDictionaryMetadata();
    v1dlpDictionaryMetadata.lastUpdatedDate(1L);

    // Act and Assert
    assertNotEquals(v1dlpDictionaryMetadata, new V1DLPDictionaryMetadata());
  }

  /**
   * Test {@link V1DLPDictionaryMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPDictionaryMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPDictionaryMetadata.equals(Object)",
    "int V1DLPDictionaryMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    V1DLPDictionaryMetadata v1dlpDictionaryMetadata = new V1DLPDictionaryMetadata();
    v1dlpDictionaryMetadata.type("Type");

    // Act and Assert
    assertNotEquals(v1dlpDictionaryMetadata, new V1DLPDictionaryMetadata());
  }

  /**
   * Test {@link V1DLPDictionaryMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPDictionaryMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPDictionaryMetadata.equals(Object)",
    "int V1DLPDictionaryMetadata.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPDictionaryMetadata(), null);
  }

  /**
   * Test {@link V1DLPDictionaryMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPDictionaryMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPDictionaryMetadata.equals(Object)",
    "int V1DLPDictionaryMetadata.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPDictionaryMetadata(), "Different type to V1DLPDictionaryMetadata");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V1DLPDictionaryMetadata}
   *   <li>{@link V1DLPDictionaryMetadata#creationDate(Long)}
   *   <li>{@link V1DLPDictionaryMetadata#creatorId(String)}
   *   <li>{@link V1DLPDictionaryMetadata#dictRef(V1DLPDictionaryRef)}
   *   <li>{@link V1DLPDictionaryMetadata#lastUpdatedDate(Long)}
   *   <li>{@link V1DLPDictionaryMetadata#setCreationDate(Long)}
   *   <li>{@link V1DLPDictionaryMetadata#setCreatorId(String)}
   *   <li>{@link V1DLPDictionaryMetadata#setDictRef(V1DLPDictionaryRef)}
   *   <li>{@link V1DLPDictionaryMetadata#setLastUpdatedDate(Long)}
   *   <li>{@link V1DLPDictionaryMetadata#setType(String)}
   *   <li>{@link V1DLPDictionaryMetadata#type(String)}
   *   <li>{@link V1DLPDictionaryMetadata#toString()}
   *   <li>{@link V1DLPDictionaryMetadata#getCreationDate()}
   *   <li>{@link V1DLPDictionaryMetadata#getCreatorId()}
   *   <li>{@link V1DLPDictionaryMetadata#getDictRef()}
   *   <li>{@link V1DLPDictionaryMetadata#getLastUpdatedDate()}
   *   <li>{@link V1DLPDictionaryMetadata#getType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V1DLPDictionaryMetadata.<init>()",
    "V1DLPDictionaryMetadata V1DLPDictionaryMetadata.creationDate(Long)",
    "V1DLPDictionaryMetadata V1DLPDictionaryMetadata.creatorId(String)",
    "V1DLPDictionaryMetadata V1DLPDictionaryMetadata.dictRef(V1DLPDictionaryRef)",
    "Long V1DLPDictionaryMetadata.getCreationDate()",
    "String V1DLPDictionaryMetadata.getCreatorId()",
    "V1DLPDictionaryRef V1DLPDictionaryMetadata.getDictRef()",
    "Long V1DLPDictionaryMetadata.getLastUpdatedDate()",
    "String V1DLPDictionaryMetadata.getType()",
    "V1DLPDictionaryMetadata V1DLPDictionaryMetadata.lastUpdatedDate(Long)",
    "void V1DLPDictionaryMetadata.setCreationDate(Long)",
    "void V1DLPDictionaryMetadata.setCreatorId(String)",
    "void V1DLPDictionaryMetadata.setDictRef(V1DLPDictionaryRef)",
    "void V1DLPDictionaryMetadata.setLastUpdatedDate(Long)",
    "void V1DLPDictionaryMetadata.setType(String)",
    "String V1DLPDictionaryMetadata.toString()",
    "V1DLPDictionaryMetadata V1DLPDictionaryMetadata.type(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V1DLPDictionaryMetadata actualV1dlpDictionaryMetadata = new V1DLPDictionaryMetadata();
    V1DLPDictionaryMetadata actualCreationDateResult =
        actualV1dlpDictionaryMetadata.creationDate(1L);
    V1DLPDictionaryMetadata actualCreatorIdResult = actualV1dlpDictionaryMetadata.creatorId("42");
    V1DLPDictionaryMetadata actualDictRefResult =
        actualV1dlpDictionaryMetadata.dictRef(new V1DLPDictionaryRef());
    V1DLPDictionaryMetadata actualLastUpdatedDateResult =
        actualV1dlpDictionaryMetadata.lastUpdatedDate(1L);
    actualV1dlpDictionaryMetadata.setCreationDate(1L);
    actualV1dlpDictionaryMetadata.setCreatorId("42");
    V1DLPDictionaryRef dictRef = new V1DLPDictionaryRef();
    actualV1dlpDictionaryMetadata.setDictRef(dictRef);
    actualV1dlpDictionaryMetadata.setLastUpdatedDate(1L);
    actualV1dlpDictionaryMetadata.setType("Type");
    V1DLPDictionaryMetadata actualTypeResult = actualV1dlpDictionaryMetadata.type("Type");
    String actualToStringResult = actualV1dlpDictionaryMetadata.toString();
    Long actualCreationDate = actualV1dlpDictionaryMetadata.getCreationDate();
    String actualCreatorId = actualV1dlpDictionaryMetadata.getCreatorId();
    V1DLPDictionaryRef actualDictRef = actualV1dlpDictionaryMetadata.getDictRef();
    Long actualLastUpdatedDate = actualV1dlpDictionaryMetadata.getLastUpdatedDate();

    // Assert
    assertEquals("42", actualCreatorId);
    assertEquals("Type", actualV1dlpDictionaryMetadata.getType());
    assertEquals(
        "class V1DLPDictionaryMetadata {\n"
            + "    creationDate: 1\n"
            + "    creatorId: 42\n"
            + "    dictRef: class V1DLPDictionaryRef {\n"
            + "        dictId: null\n"
            + "        name: null\n"
            + "        version: null\n"
            + "    }\n"
            + "    lastUpdatedDate: 1\n"
            + "    type: Type\n"
            + "}",
        actualToStringResult);
    assertEquals(1L, actualCreationDate.longValue());
    assertEquals(1L, actualLastUpdatedDate.longValue());
    assertSame(actualV1dlpDictionaryMetadata, actualCreationDateResult);
    assertSame(actualV1dlpDictionaryMetadata, actualCreatorIdResult);
    assertSame(actualV1dlpDictionaryMetadata, actualDictRefResult);
    assertSame(actualV1dlpDictionaryMetadata, actualLastUpdatedDateResult);
    assertSame(actualV1dlpDictionaryMetadata, actualTypeResult);
    assertSame(dictRef, actualDictRef);
  }
}
