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

class V3DLPPoliciesCollectionResponseDiffblueTest {
  /**
   * Test {@link V3DLPPoliciesCollectionResponse#addPoliciesItem(V3DLPPolicy)}.
   *
   * <p>Method under test: {@link V3DLPPoliciesCollectionResponse#addPoliciesItem(V3DLPPolicy)}
   */
  @Test
  @DisplayName("Test addPoliciesItem(V3DLPPolicy)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "V3DLPPoliciesCollectionResponse V3DLPPoliciesCollectionResponse.addPoliciesItem(V3DLPPolicy)"
  })
  void testAddPoliciesItem() {
    // Arrange
    V3DLPPoliciesCollectionResponse v3dlpPoliciesCollectionResponse =
        new V3DLPPoliciesCollectionResponse();

    // Act and Assert
    assertSame(
        v3dlpPoliciesCollectionResponse,
        v3dlpPoliciesCollectionResponse.addPoliciesItem(new V3DLPPolicy()));
  }

  /**
   * Test {@link V3DLPPoliciesCollectionResponse#equals(Object)}, and {@link
   * V3DLPPoliciesCollectionResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3DLPPoliciesCollectionResponse#equals(Object)}
   *   <li>{@link V3DLPPoliciesCollectionResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPPoliciesCollectionResponse.equals(Object)",
    "int V3DLPPoliciesCollectionResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V3DLPPoliciesCollectionResponse v3dlpPoliciesCollectionResponse =
        new V3DLPPoliciesCollectionResponse();
    V3DLPPoliciesCollectionResponse v3dlpPoliciesCollectionResponse2 =
        new V3DLPPoliciesCollectionResponse();

    // Act and Assert
    assertEquals(v3dlpPoliciesCollectionResponse, v3dlpPoliciesCollectionResponse2);
    int expectedHashCodeResult = v3dlpPoliciesCollectionResponse.hashCode();
    assertEquals(expectedHashCodeResult, v3dlpPoliciesCollectionResponse2.hashCode());
  }

  /**
   * Test {@link V3DLPPoliciesCollectionResponse#equals(Object)}, and {@link
   * V3DLPPoliciesCollectionResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3DLPPoliciesCollectionResponse#equals(Object)}
   *   <li>{@link V3DLPPoliciesCollectionResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPPoliciesCollectionResponse.equals(Object)",
    "int V3DLPPoliciesCollectionResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V3DLPPoliciesCollectionResponse v3dlpPoliciesCollectionResponse =
        new V3DLPPoliciesCollectionResponse();

    // Act and Assert
    assertEquals(v3dlpPoliciesCollectionResponse, v3dlpPoliciesCollectionResponse);
    int expectedHashCodeResult = v3dlpPoliciesCollectionResponse.hashCode();
    assertEquals(expectedHashCodeResult, v3dlpPoliciesCollectionResponse.hashCode());
  }

  /**
   * Test {@link V3DLPPoliciesCollectionResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPPoliciesCollectionResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPPoliciesCollectionResponse.equals(Object)",
    "int V3DLPPoliciesCollectionResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V3DLPPoliciesCollectionResponse v3dlpPoliciesCollectionResponse =
        new V3DLPPoliciesCollectionResponse();
    v3dlpPoliciesCollectionResponse.addPoliciesItem(new V3DLPPolicy());

    // Act and Assert
    assertNotEquals(v3dlpPoliciesCollectionResponse, new V3DLPPoliciesCollectionResponse());
  }

  /**
   * Test {@link V3DLPPoliciesCollectionResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPPoliciesCollectionResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPPoliciesCollectionResponse.equals(Object)",
    "int V3DLPPoliciesCollectionResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V3DLPPoliciesCollectionResponse v3dlpPoliciesCollectionResponse =
        new V3DLPPoliciesCollectionResponse();
    v3dlpPoliciesCollectionResponse.page(1);

    // Act and Assert
    assertNotEquals(v3dlpPoliciesCollectionResponse, new V3DLPPoliciesCollectionResponse());
  }

  /**
   * Test {@link V3DLPPoliciesCollectionResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPPoliciesCollectionResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPPoliciesCollectionResponse.equals(Object)",
    "int V3DLPPoliciesCollectionResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V3DLPPoliciesCollectionResponse v3dlpPoliciesCollectionResponse =
        new V3DLPPoliciesCollectionResponse();
    v3dlpPoliciesCollectionResponse.size(3);

    // Act and Assert
    assertNotEquals(v3dlpPoliciesCollectionResponse, new V3DLPPoliciesCollectionResponse());
  }

  /**
   * Test {@link V3DLPPoliciesCollectionResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPPoliciesCollectionResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPPoliciesCollectionResponse.equals(Object)",
    "int V3DLPPoliciesCollectionResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V3DLPPoliciesCollectionResponse v3dlpPoliciesCollectionResponse =
        new V3DLPPoliciesCollectionResponse();
    v3dlpPoliciesCollectionResponse.pageCount(3);

    // Act and Assert
    assertNotEquals(v3dlpPoliciesCollectionResponse, new V3DLPPoliciesCollectionResponse());
  }

  /**
   * Test {@link V3DLPPoliciesCollectionResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPPoliciesCollectionResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPPoliciesCollectionResponse.equals(Object)",
    "int V3DLPPoliciesCollectionResponse.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPPoliciesCollectionResponse(), null);
  }

  /**
   * Test {@link V3DLPPoliciesCollectionResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPPoliciesCollectionResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPPoliciesCollectionResponse.equals(Object)",
    "int V3DLPPoliciesCollectionResponse.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new V3DLPPoliciesCollectionResponse(), "Different type to V3DLPPoliciesCollectionResponse");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V3DLPPoliciesCollectionResponse}
   *   <li>{@link V3DLPPoliciesCollectionResponse#page(Integer)}
   *   <li>{@link V3DLPPoliciesCollectionResponse#pageCount(Integer)}
   *   <li>{@link V3DLPPoliciesCollectionResponse#policies(List)}
   *   <li>{@link V3DLPPoliciesCollectionResponse#setPage(Integer)}
   *   <li>{@link V3DLPPoliciesCollectionResponse#setPageCount(Integer)}
   *   <li>{@link V3DLPPoliciesCollectionResponse#setPolicies(List)}
   *   <li>{@link V3DLPPoliciesCollectionResponse#setSize(Integer)}
   *   <li>{@link V3DLPPoliciesCollectionResponse#size(Integer)}
   *   <li>{@link V3DLPPoliciesCollectionResponse#toString()}
   *   <li>{@link V3DLPPoliciesCollectionResponse#getPage()}
   *   <li>{@link V3DLPPoliciesCollectionResponse#getPageCount()}
   *   <li>{@link V3DLPPoliciesCollectionResponse#getPolicies()}
   *   <li>{@link V3DLPPoliciesCollectionResponse#getSize()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V3DLPPoliciesCollectionResponse.<init>()",
    "Integer V3DLPPoliciesCollectionResponse.getPage()",
    "Integer V3DLPPoliciesCollectionResponse.getPageCount()",
    "List V3DLPPoliciesCollectionResponse.getPolicies()",
    "Integer V3DLPPoliciesCollectionResponse.getSize()",
    "V3DLPPoliciesCollectionResponse V3DLPPoliciesCollectionResponse.page(Integer)",
    "V3DLPPoliciesCollectionResponse V3DLPPoliciesCollectionResponse.pageCount(Integer)",
    "V3DLPPoliciesCollectionResponse V3DLPPoliciesCollectionResponse.policies(List)",
    "void V3DLPPoliciesCollectionResponse.setPage(Integer)",
    "void V3DLPPoliciesCollectionResponse.setPageCount(Integer)",
    "void V3DLPPoliciesCollectionResponse.setPolicies(List)",
    "void V3DLPPoliciesCollectionResponse.setSize(Integer)",
    "V3DLPPoliciesCollectionResponse V3DLPPoliciesCollectionResponse.size(Integer)",
    "String V3DLPPoliciesCollectionResponse.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V3DLPPoliciesCollectionResponse actualV3dlpPoliciesCollectionResponse =
        new V3DLPPoliciesCollectionResponse();
    V3DLPPoliciesCollectionResponse actualPageResult =
        actualV3dlpPoliciesCollectionResponse.page(1);
    V3DLPPoliciesCollectionResponse actualPageCountResult =
        actualV3dlpPoliciesCollectionResponse.pageCount(3);
    V3DLPPoliciesCollectionResponse actualPoliciesResult =
        actualV3dlpPoliciesCollectionResponse.policies(new ArrayList<>());
    actualV3dlpPoliciesCollectionResponse.setPage(1);
    actualV3dlpPoliciesCollectionResponse.setPageCount(3);
    ArrayList<V3DLPPolicy> policies = new ArrayList<>();
    actualV3dlpPoliciesCollectionResponse.setPolicies(policies);
    actualV3dlpPoliciesCollectionResponse.setSize(3);
    V3DLPPoliciesCollectionResponse actualSizeResult =
        actualV3dlpPoliciesCollectionResponse.size(3);
    String actualToStringResult = actualV3dlpPoliciesCollectionResponse.toString();
    Integer actualPage = actualV3dlpPoliciesCollectionResponse.getPage();
    Integer actualPageCount = actualV3dlpPoliciesCollectionResponse.getPageCount();
    List<V3DLPPolicy> actualPolicies = actualV3dlpPoliciesCollectionResponse.getPolicies();
    Integer actualSize = actualV3dlpPoliciesCollectionResponse.getSize();

    // Assert
    assertEquals(
        "class V3DLPPoliciesCollectionResponse {\n    policies: []\n    page: 1\n    size: 3\n    pageCount: 3\n}",
        actualToStringResult);
    assertEquals(1, actualPage.intValue());
    assertEquals(3, actualPageCount.intValue());
    assertEquals(3, actualSize.intValue());
    assertTrue(actualPolicies.isEmpty());
    assertSame(actualV3dlpPoliciesCollectionResponse, actualPageResult);
    assertSame(actualV3dlpPoliciesCollectionResponse, actualPageCountResult);
    assertSame(actualV3dlpPoliciesCollectionResponse, actualPoliciesResult);
    assertSame(actualV3dlpPoliciesCollectionResponse, actualSizeResult);
    assertSame(policies, actualPolicies);
  }
}
