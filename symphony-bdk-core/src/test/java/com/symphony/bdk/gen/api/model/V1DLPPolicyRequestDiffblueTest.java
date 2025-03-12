package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V1DLPPolicyRequestDiffblueTest {
  /**
   * Test {@link V1DLPPolicyRequest#addContentTypesItem(String)}.
   * <p>
   * Method under test: {@link V1DLPPolicyRequest#addContentTypesItem(String)}
   */
  @Test
  @DisplayName("Test addContentTypesItem(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V1DLPPolicyRequest V1DLPPolicyRequest.addContentTypesItem(String)"})
  void testAddContentTypesItem() {
    // Arrange
    V1DLPPolicyRequest v1dlpPolicyRequest = new V1DLPPolicyRequest();

    // Act and Assert
    assertSame(v1dlpPolicyRequest, v1dlpPolicyRequest.addContentTypesItem("text/plain"));
  }

  /**
   * Test {@link V1DLPPolicyRequest#addDictionaryIdsItem(String)}.
   * <p>
   * Method under test: {@link V1DLPPolicyRequest#addDictionaryIdsItem(String)}
   */
  @Test
  @DisplayName("Test addDictionaryIdsItem(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V1DLPPolicyRequest V1DLPPolicyRequest.addDictionaryIdsItem(String)"})
  void testAddDictionaryIdsItem() {
    // Arrange
    V1DLPPolicyRequest v1dlpPolicyRequest = new V1DLPPolicyRequest();

    // Act and Assert
    assertSame(v1dlpPolicyRequest, v1dlpPolicyRequest.addDictionaryIdsItem("Dictionary Ids Item"));
  }

  /**
   * Test {@link V1DLPPolicyRequest#addScopesItem(String)}.
   * <p>
   * Method under test: {@link V1DLPPolicyRequest#addScopesItem(String)}
   */
  @Test
  @DisplayName("Test addScopesItem(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V1DLPPolicyRequest V1DLPPolicyRequest.addScopesItem(String)"})
  void testAddScopesItem() {
    // Arrange
    V1DLPPolicyRequest v1dlpPolicyRequest = new V1DLPPolicyRequest();

    // Act and Assert
    assertSame(v1dlpPolicyRequest, v1dlpPolicyRequest.addScopesItem("Scopes Item"));
  }

  /**
   * Test {@link V1DLPPolicyRequest#equals(Object)}, and {@link V1DLPPolicyRequest#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V1DLPPolicyRequest#equals(Object)}
   *   <li>{@link V1DLPPolicyRequest#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPPolicyRequest.equals(Object)", "int V1DLPPolicyRequest.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V1DLPPolicyRequest v1dlpPolicyRequest = new V1DLPPolicyRequest();
    V1DLPPolicyRequest v1dlpPolicyRequest2 = new V1DLPPolicyRequest();

    // Act and Assert
    assertEquals(v1dlpPolicyRequest, v1dlpPolicyRequest2);
    int expectedHashCodeResult = v1dlpPolicyRequest.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpPolicyRequest2.hashCode());
  }

  /**
   * Test {@link V1DLPPolicyRequest#equals(Object)}, and {@link V1DLPPolicyRequest#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V1DLPPolicyRequest#equals(Object)}
   *   <li>{@link V1DLPPolicyRequest#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPPolicyRequest.equals(Object)", "int V1DLPPolicyRequest.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V1DLPPolicyRequest v1dlpPolicyRequest = new V1DLPPolicyRequest();

    // Act and Assert
    assertEquals(v1dlpPolicyRequest, v1dlpPolicyRequest);
    int expectedHashCodeResult = v1dlpPolicyRequest.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpPolicyRequest.hashCode());
  }

  /**
   * Test {@link V1DLPPolicyRequest#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPPolicyRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPPolicyRequest.equals(Object)", "int V1DLPPolicyRequest.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V1DLPPolicyRequest v1dlpPolicyRequest = new V1DLPPolicyRequest();
    v1dlpPolicyRequest.addContentTypesItem("text/plain");

    // Act and Assert
    assertNotEquals(v1dlpPolicyRequest, new V1DLPPolicyRequest());
  }

  /**
   * Test {@link V1DLPPolicyRequest#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPPolicyRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPPolicyRequest.equals(Object)", "int V1DLPPolicyRequest.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V1DLPPolicyRequest v1dlpPolicyRequest = new V1DLPPolicyRequest();
    v1dlpPolicyRequest.addDictionaryIdsItem("Dictionary Ids Item");

    // Act and Assert
    assertNotEquals(v1dlpPolicyRequest, new V1DLPPolicyRequest());
  }

  /**
   * Test {@link V1DLPPolicyRequest#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPPolicyRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPPolicyRequest.equals(Object)", "int V1DLPPolicyRequest.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V1DLPPolicyRequest v1dlpPolicyRequest = new V1DLPPolicyRequest();
    v1dlpPolicyRequest.addScopesItem("Scopes Item");

    // Act and Assert
    assertNotEquals(v1dlpPolicyRequest, new V1DLPPolicyRequest());
  }

  /**
   * Test {@link V1DLPPolicyRequest#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPPolicyRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPPolicyRequest.equals(Object)", "int V1DLPPolicyRequest.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V1DLPPolicyRequest v1dlpPolicyRequest = new V1DLPPolicyRequest();
    v1dlpPolicyRequest.name("Name");
    v1dlpPolicyRequest.addScopesItem("Scopes Item");

    // Act and Assert
    assertNotEquals(v1dlpPolicyRequest, new V1DLPPolicyRequest());
  }

  /**
   * Test {@link V1DLPPolicyRequest#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPPolicyRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPPolicyRequest.equals(Object)", "int V1DLPPolicyRequest.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V1DLPPolicyRequest v1dlpPolicyRequest = new V1DLPPolicyRequest();
    v1dlpPolicyRequest.type("Type");

    // Act and Assert
    assertNotEquals(v1dlpPolicyRequest, new V1DLPPolicyRequest());
  }

  /**
   * Test {@link V1DLPPolicyRequest#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPPolicyRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPPolicyRequest.equals(Object)", "int V1DLPPolicyRequest.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPPolicyRequest(), null);
  }

  /**
   * Test {@link V1DLPPolicyRequest#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPPolicyRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPPolicyRequest.equals(Object)", "int V1DLPPolicyRequest.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPPolicyRequest(), "Different type to V1DLPPolicyRequest");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V1DLPPolicyRequest}
   *   <li>{@link V1DLPPolicyRequest#contentTypes(List)}
   *   <li>{@link V1DLPPolicyRequest#dictionaryIds(List)}
   *   <li>{@link V1DLPPolicyRequest#name(String)}
   *   <li>{@link V1DLPPolicyRequest#scopes(List)}
   *   <li>{@link V1DLPPolicyRequest#setContentTypes(List)}
   *   <li>{@link V1DLPPolicyRequest#setDictionaryIds(List)}
   *   <li>{@link V1DLPPolicyRequest#setName(String)}
   *   <li>{@link V1DLPPolicyRequest#setScopes(List)}
   *   <li>{@link V1DLPPolicyRequest#setType(String)}
   *   <li>{@link V1DLPPolicyRequest#type(String)}
   *   <li>{@link V1DLPPolicyRequest#toString()}
   *   <li>{@link V1DLPPolicyRequest#getContentTypes()}
   *   <li>{@link V1DLPPolicyRequest#getDictionaryIds()}
   *   <li>{@link V1DLPPolicyRequest#getName()}
   *   <li>{@link V1DLPPolicyRequest#getScopes()}
   *   <li>{@link V1DLPPolicyRequest#getType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V1DLPPolicyRequest.<init>()", "V1DLPPolicyRequest V1DLPPolicyRequest.contentTypes(List)",
      "V1DLPPolicyRequest V1DLPPolicyRequest.dictionaryIds(List)", "List V1DLPPolicyRequest.getContentTypes()",
      "List V1DLPPolicyRequest.getDictionaryIds()", "String V1DLPPolicyRequest.getName()",
      "List V1DLPPolicyRequest.getScopes()", "String V1DLPPolicyRequest.getType()",
      "V1DLPPolicyRequest V1DLPPolicyRequest.name(String)", "V1DLPPolicyRequest V1DLPPolicyRequest.scopes(List)",
      "void V1DLPPolicyRequest.setContentTypes(List)", "void V1DLPPolicyRequest.setDictionaryIds(List)",
      "void V1DLPPolicyRequest.setName(String)", "void V1DLPPolicyRequest.setScopes(List)",
      "void V1DLPPolicyRequest.setType(String)", "String V1DLPPolicyRequest.toString()",
      "V1DLPPolicyRequest V1DLPPolicyRequest.type(String)"})
  void testGettersAndSetters() {
    // Arrange and Act
    V1DLPPolicyRequest actualV1dlpPolicyRequest = new V1DLPPolicyRequest();
    V1DLPPolicyRequest actualContentTypesResult = actualV1dlpPolicyRequest.contentTypes(new ArrayList<>());
    V1DLPPolicyRequest actualDictionaryIdsResult = actualV1dlpPolicyRequest.dictionaryIds(new ArrayList<>());
    V1DLPPolicyRequest actualNameResult = actualV1dlpPolicyRequest.name("Name");
    V1DLPPolicyRequest actualScopesResult = actualV1dlpPolicyRequest.scopes(new ArrayList<>());
    ArrayList<String> contentTypes = new ArrayList<>();
    actualV1dlpPolicyRequest.setContentTypes(contentTypes);
    ArrayList<String> dictionaryIds = new ArrayList<>();
    actualV1dlpPolicyRequest.setDictionaryIds(dictionaryIds);
    actualV1dlpPolicyRequest.setName("Name");
    ArrayList<String> scopes = new ArrayList<>();
    actualV1dlpPolicyRequest.setScopes(scopes);
    actualV1dlpPolicyRequest.setType("Type");
    V1DLPPolicyRequest actualTypeResult = actualV1dlpPolicyRequest.type("Type");
    String actualToStringResult = actualV1dlpPolicyRequest.toString();
    List<String> actualContentTypes = actualV1dlpPolicyRequest.getContentTypes();
    List<String> actualDictionaryIds = actualV1dlpPolicyRequest.getDictionaryIds();
    String actualName = actualV1dlpPolicyRequest.getName();
    List<String> actualScopes = actualV1dlpPolicyRequest.getScopes();

    // Assert
    assertEquals("Name", actualName);
    assertEquals("Type", actualV1dlpPolicyRequest.getType());
    assertEquals("class V1DLPPolicyRequest {\n" + "    contentTypes: []\n" + "    dictionaryIds: []\n"
        + "    name: Name\n" + "    scopes: []\n" + "    type: Type\n" + "}", actualToStringResult);
    assertTrue(actualContentTypes.isEmpty());
    assertTrue(actualDictionaryIds.isEmpty());
    assertTrue(actualScopes.isEmpty());
    assertSame(actualV1dlpPolicyRequest, actualContentTypesResult);
    assertSame(actualV1dlpPolicyRequest, actualDictionaryIdsResult);
    assertSame(actualV1dlpPolicyRequest, actualNameResult);
    assertSame(actualV1dlpPolicyRequest, actualScopesResult);
    assertSame(actualV1dlpPolicyRequest, actualTypeResult);
    assertSame(contentTypes, actualContentTypes);
    assertSame(dictionaryIds, actualDictionaryIds);
    assertSame(scopes, actualScopes);
  }
}
