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

class V3DLPFileExtensionConfigDiffblueTest {
  /**
   * Test {@link V3DLPFileExtensionConfig#addAllowListsItem(String)}.
   *
   * <p>Method under test: {@link V3DLPFileExtensionConfig#addAllowListsItem(String)}
   */
  @Test
  @DisplayName("Test addAllowListsItem(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V3DLPFileExtensionConfig V3DLPFileExtensionConfig.addAllowListsItem(String)"})
  void testAddAllowListsItem() {
    // Arrange
    V3DLPFileExtensionConfig v3dlpFileExtensionConfig = new V3DLPFileExtensionConfig();

    // Act
    V3DLPFileExtensionConfig actualAddAllowListsItemResult =
        v3dlpFileExtensionConfig.addAllowListsItem("Allow Lists Item");

    // Assert
    assertSame(v3dlpFileExtensionConfig, actualAddAllowListsItemResult);
  }

  /**
   * Test {@link V3DLPFileExtensionConfig#addBlockListsItem(String)}.
   *
   * <p>Method under test: {@link V3DLPFileExtensionConfig#addBlockListsItem(String)}
   */
  @Test
  @DisplayName("Test addBlockListsItem(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V3DLPFileExtensionConfig V3DLPFileExtensionConfig.addBlockListsItem(String)"})
  void testAddBlockListsItem() {
    // Arrange
    V3DLPFileExtensionConfig v3dlpFileExtensionConfig = new V3DLPFileExtensionConfig();

    // Act
    V3DLPFileExtensionConfig actualAddBlockListsItemResult =
        v3dlpFileExtensionConfig.addBlockListsItem("Block Lists Item");

    // Assert
    assertSame(v3dlpFileExtensionConfig, actualAddBlockListsItemResult);
  }

  /**
   * Test {@link V3DLPFileExtensionConfig#equals(Object)}, and {@link
   * V3DLPFileExtensionConfig#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3DLPFileExtensionConfig#equals(Object)}
   *   <li>{@link V3DLPFileExtensionConfig#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPFileExtensionConfig.equals(Object)",
    "int V3DLPFileExtensionConfig.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V3DLPFileExtensionConfig v3dlpFileExtensionConfig = new V3DLPFileExtensionConfig();
    V3DLPFileExtensionConfig v3dlpFileExtensionConfig2 = new V3DLPFileExtensionConfig();

    // Act and Assert
    assertEquals(v3dlpFileExtensionConfig, v3dlpFileExtensionConfig2);
    assertEquals(v3dlpFileExtensionConfig.hashCode(), v3dlpFileExtensionConfig2.hashCode());
  }

  /**
   * Test {@link V3DLPFileExtensionConfig#equals(Object)}, and {@link
   * V3DLPFileExtensionConfig#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3DLPFileExtensionConfig#equals(Object)}
   *   <li>{@link V3DLPFileExtensionConfig#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPFileExtensionConfig.equals(Object)",
    "int V3DLPFileExtensionConfig.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V3DLPFileExtensionConfig v3dlpFileExtensionConfig = new V3DLPFileExtensionConfig();

    // Act and Assert
    assertEquals(v3dlpFileExtensionConfig, v3dlpFileExtensionConfig);
    int expectedHashCodeResult = v3dlpFileExtensionConfig.hashCode();
    assertEquals(expectedHashCodeResult, v3dlpFileExtensionConfig.hashCode());
  }

  /**
   * Test {@link V3DLPFileExtensionConfig#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPFileExtensionConfig#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPFileExtensionConfig.equals(Object)",
    "int V3DLPFileExtensionConfig.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V3DLPFileExtensionConfig v3dlpFileExtensionConfig = new V3DLPFileExtensionConfig();
    v3dlpFileExtensionConfig.addAllowListsItem("Allow Lists Item");

    // Act and Assert
    assertNotEquals(v3dlpFileExtensionConfig, new V3DLPFileExtensionConfig());
  }

  /**
   * Test {@link V3DLPFileExtensionConfig#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPFileExtensionConfig#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPFileExtensionConfig.equals(Object)",
    "int V3DLPFileExtensionConfig.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V3DLPFileExtensionConfig v3dlpFileExtensionConfig = new V3DLPFileExtensionConfig();
    v3dlpFileExtensionConfig.addBlockListsItem("Block Lists Item");

    // Act and Assert
    assertNotEquals(v3dlpFileExtensionConfig, new V3DLPFileExtensionConfig());
  }

  /**
   * Test {@link V3DLPFileExtensionConfig#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPFileExtensionConfig#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPFileExtensionConfig.equals(Object)",
    "int V3DLPFileExtensionConfig.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPFileExtensionConfig(), null);
  }

  /**
   * Test {@link V3DLPFileExtensionConfig#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPFileExtensionConfig#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPFileExtensionConfig.equals(Object)",
    "int V3DLPFileExtensionConfig.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPFileExtensionConfig(), "Different type to V3DLPFileExtensionConfig");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V3DLPFileExtensionConfig}
   *   <li>{@link V3DLPFileExtensionConfig#allowLists(List)}
   *   <li>{@link V3DLPFileExtensionConfig#blockLists(List)}
   *   <li>{@link V3DLPFileExtensionConfig#setAllowLists(List)}
   *   <li>{@link V3DLPFileExtensionConfig#setBlockLists(List)}
   *   <li>{@link V3DLPFileExtensionConfig#toString()}
   *   <li>{@link V3DLPFileExtensionConfig#getAllowLists()}
   *   <li>{@link V3DLPFileExtensionConfig#getBlockLists()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V3DLPFileExtensionConfig.<init>()",
    "V3DLPFileExtensionConfig V3DLPFileExtensionConfig.allowLists(List)",
    "V3DLPFileExtensionConfig V3DLPFileExtensionConfig.blockLists(List)",
    "List V3DLPFileExtensionConfig.getAllowLists()",
    "List V3DLPFileExtensionConfig.getBlockLists()",
    "void V3DLPFileExtensionConfig.setAllowLists(List)",
    "void V3DLPFileExtensionConfig.setBlockLists(List)",
    "String V3DLPFileExtensionConfig.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V3DLPFileExtensionConfig actualV3dlpFileExtensionConfig = new V3DLPFileExtensionConfig();
    V3DLPFileExtensionConfig actualAllowListsResult =
        actualV3dlpFileExtensionConfig.allowLists(new ArrayList<>());
    V3DLPFileExtensionConfig actualBlockListsResult =
        actualV3dlpFileExtensionConfig.blockLists(new ArrayList<>());
    ArrayList<String> allowLists = new ArrayList<>();
    actualV3dlpFileExtensionConfig.setAllowLists(allowLists);
    ArrayList<String> blockLists = new ArrayList<>();
    actualV3dlpFileExtensionConfig.setBlockLists(blockLists);
    String actualToStringResult = actualV3dlpFileExtensionConfig.toString();
    List<String> actualAllowLists = actualV3dlpFileExtensionConfig.getAllowLists();
    List<String> actualBlockLists = actualV3dlpFileExtensionConfig.getBlockLists();

    // Assert
    assertEquals(
        "class V3DLPFileExtensionConfig {\n    allowLists: []\n    blockLists: []\n}",
        actualToStringResult);
    assertTrue(actualAllowLists.isEmpty());
    assertTrue(actualBlockLists.isEmpty());
    assertSame(actualV3dlpFileExtensionConfig, actualAllowListsResult);
    assertSame(actualV3dlpFileExtensionConfig, actualBlockListsResult);
    assertSame(allowLists, actualAllowLists);
    assertSame(blockLists, actualBlockLists);
  }
}
