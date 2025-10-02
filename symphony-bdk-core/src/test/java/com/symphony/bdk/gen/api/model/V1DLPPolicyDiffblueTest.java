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

class V1DLPPolicyDiffblueTest {
  /**
   * Test {@link V1DLPPolicy#addContentTypesItem(String)}.
   *
   * <p>Method under test: {@link V1DLPPolicy#addContentTypesItem(String)}
   */
  @Test
  @DisplayName("Test addContentTypesItem(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V1DLPPolicy V1DLPPolicy.addContentTypesItem(String)"})
  void testAddContentTypesItem() {
    // Arrange
    V1DLPPolicy v1dlpPolicy = new V1DLPPolicy();

    // Act
    V1DLPPolicy actualAddContentTypesItemResult = v1dlpPolicy.addContentTypesItem("text/plain");

    // Assert
    assertSame(v1dlpPolicy, actualAddContentTypesItemResult);
  }

  /**
   * Test {@link V1DLPPolicy#addDictionaryRefsItem(V1DLPDictionaryRef)}.
   *
   * <p>Method under test: {@link V1DLPPolicy#addDictionaryRefsItem(V1DLPDictionaryRef)}
   */
  @Test
  @DisplayName("Test addDictionaryRefsItem(V1DLPDictionaryRef)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V1DLPPolicy V1DLPPolicy.addDictionaryRefsItem(V1DLPDictionaryRef)"})
  void testAddDictionaryRefsItem() {
    // Arrange
    V1DLPPolicy v1dlpPolicy = new V1DLPPolicy();

    // Act
    V1DLPPolicy actualAddDictionaryRefsItemResult =
        v1dlpPolicy.addDictionaryRefsItem(new V1DLPDictionaryRef());

    // Assert
    assertSame(v1dlpPolicy, actualAddDictionaryRefsItemResult);
  }

  /**
   * Test {@link V1DLPPolicy#addScopesItem(String)}.
   *
   * <p>Method under test: {@link V1DLPPolicy#addScopesItem(String)}
   */
  @Test
  @DisplayName("Test addScopesItem(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V1DLPPolicy V1DLPPolicy.addScopesItem(String)"})
  void testAddScopesItem() {
    // Arrange
    V1DLPPolicy v1dlpPolicy = new V1DLPPolicy();

    // Act
    V1DLPPolicy actualAddScopesItemResult = v1dlpPolicy.addScopesItem("Scopes Item");

    // Assert
    assertSame(v1dlpPolicy, actualAddScopesItemResult);
  }

  /**
   * Test {@link V1DLPPolicy#equals(Object)}, and {@link V1DLPPolicy#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V1DLPPolicy#equals(Object)}
   *   <li>{@link V1DLPPolicy#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPPolicy.equals(Object)", "int V1DLPPolicy.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V1DLPPolicy v1dlpPolicy = new V1DLPPolicy();
    V1DLPPolicy v1dlpPolicy2 = new V1DLPPolicy();

    // Act and Assert
    assertEquals(v1dlpPolicy, v1dlpPolicy2);
    assertEquals(v1dlpPolicy.hashCode(), v1dlpPolicy2.hashCode());
  }

  /**
   * Test {@link V1DLPPolicy#equals(Object)}, and {@link V1DLPPolicy#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V1DLPPolicy#equals(Object)}
   *   <li>{@link V1DLPPolicy#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPPolicy.equals(Object)", "int V1DLPPolicy.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V1DLPPolicy v1dlpPolicy = new V1DLPPolicy();

    // Act and Assert
    assertEquals(v1dlpPolicy, v1dlpPolicy);
    int expectedHashCodeResult = v1dlpPolicy.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpPolicy.hashCode());
  }

  /**
   * Test {@link V1DLPPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPPolicy.equals(Object)", "int V1DLPPolicy.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V1DLPPolicy v1dlpPolicy = new V1DLPPolicy();
    v1dlpPolicy.addContentTypesItem("text/plain");

    // Act and Assert
    assertNotEquals(v1dlpPolicy, new V1DLPPolicy());
  }

  /**
   * Test {@link V1DLPPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPPolicy.equals(Object)", "int V1DLPPolicy.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V1DLPPolicy v1dlpPolicy = new V1DLPPolicy();
    v1dlpPolicy.active(true);
    v1dlpPolicy.addContentTypesItem("text/plain");

    // Act and Assert
    assertNotEquals(v1dlpPolicy, new V1DLPPolicy());
  }

  /**
   * Test {@link V1DLPPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPPolicy.equals(Object)", "int V1DLPPolicy.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V1DLPPolicy v1dlpPolicy = new V1DLPPolicy();
    v1dlpPolicy.addDictionaryRefsItem(new V1DLPDictionaryRef());

    // Act and Assert
    assertNotEquals(v1dlpPolicy, new V1DLPPolicy());
  }

  /**
   * Test {@link V1DLPPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPPolicy.equals(Object)", "int V1DLPPolicy.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V1DLPPolicy v1dlpPolicy = new V1DLPPolicy();
    v1dlpPolicy.addScopesItem("Scopes Item");

    // Act and Assert
    assertNotEquals(v1dlpPolicy, new V1DLPPolicy());
  }

  /**
   * Test {@link V1DLPPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPPolicy.equals(Object)", "int V1DLPPolicy.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V1DLPPolicy v1dlpPolicy = new V1DLPPolicy();
    v1dlpPolicy.creationDate(1L);
    v1dlpPolicy.addDictionaryRefsItem(new V1DLPDictionaryRef());

    // Act and Assert
    assertNotEquals(v1dlpPolicy, new V1DLPPolicy());
  }

  /**
   * Test {@link V1DLPPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPPolicy.equals(Object)", "int V1DLPPolicy.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    V1DLPPolicy v1dlpPolicy = new V1DLPPolicy();
    v1dlpPolicy.creatorId("42");
    v1dlpPolicy.addDictionaryRefsItem(new V1DLPDictionaryRef());

    // Act and Assert
    assertNotEquals(v1dlpPolicy, new V1DLPPolicy());
  }

  /**
   * Test {@link V1DLPPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPPolicy.equals(Object)", "int V1DLPPolicy.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    V1DLPPolicy v1dlpPolicy = new V1DLPPolicy();
    v1dlpPolicy.lastDisabledDate(1L);
    v1dlpPolicy.addScopesItem("Scopes Item");

    // Act and Assert
    assertNotEquals(v1dlpPolicy, new V1DLPPolicy());
  }

  /**
   * Test {@link V1DLPPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPPolicy.equals(Object)", "int V1DLPPolicy.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    V1DLPPolicy v1dlpPolicy = new V1DLPPolicy();
    v1dlpPolicy.lastUpdatedDate(1L);
    v1dlpPolicy.addScopesItem("Scopes Item");

    // Act and Assert
    assertNotEquals(v1dlpPolicy, new V1DLPPolicy());
  }

  /**
   * Test {@link V1DLPPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPPolicy.equals(Object)", "int V1DLPPolicy.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    V1DLPPolicy v1dlpPolicy = new V1DLPPolicy();
    v1dlpPolicy.name("Name");
    v1dlpPolicy.addScopesItem("Scopes Item");

    // Act and Assert
    assertNotEquals(v1dlpPolicy, new V1DLPPolicy());
  }

  /**
   * Test {@link V1DLPPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPPolicy.equals(Object)", "int V1DLPPolicy.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual10() {
    // Arrange
    V1DLPPolicy v1dlpPolicy = new V1DLPPolicy();
    v1dlpPolicy.policyId("42");
    v1dlpPolicy.addScopesItem("Scopes Item");

    // Act and Assert
    assertNotEquals(v1dlpPolicy, new V1DLPPolicy());
  }

  /**
   * Test {@link V1DLPPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPPolicy.equals(Object)", "int V1DLPPolicy.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual11() {
    // Arrange
    V1DLPPolicy v1dlpPolicy = new V1DLPPolicy();
    v1dlpPolicy.type("Type");

    // Act and Assert
    assertNotEquals(v1dlpPolicy, new V1DLPPolicy());
  }

  /**
   * Test {@link V1DLPPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPPolicy.equals(Object)", "int V1DLPPolicy.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual12() {
    // Arrange
    V1DLPPolicy v1dlpPolicy = new V1DLPPolicy();
    v1dlpPolicy.version("1.0.2");

    // Act and Assert
    assertNotEquals(v1dlpPolicy, new V1DLPPolicy());
  }

  /**
   * Test {@link V1DLPPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPPolicy.equals(Object)", "int V1DLPPolicy.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPPolicy(), null);
  }

  /**
   * Test {@link V1DLPPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPPolicy.equals(Object)", "int V1DLPPolicy.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPPolicy(), "Different type to V1DLPPolicy");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V1DLPPolicy}
   *   <li>{@link V1DLPPolicy#active(Boolean)}
   *   <li>{@link V1DLPPolicy#contentTypes(List)}
   *   <li>{@link V1DLPPolicy#creationDate(Long)}
   *   <li>{@link V1DLPPolicy#creatorId(String)}
   *   <li>{@link V1DLPPolicy#dictionaryRefs(List)}
   *   <li>{@link V1DLPPolicy#lastDisabledDate(Long)}
   *   <li>{@link V1DLPPolicy#lastUpdatedDate(Long)}
   *   <li>{@link V1DLPPolicy#name(String)}
   *   <li>{@link V1DLPPolicy#policyId(String)}
   *   <li>{@link V1DLPPolicy#scopes(List)}
   *   <li>{@link V1DLPPolicy#setActive(Boolean)}
   *   <li>{@link V1DLPPolicy#setContentTypes(List)}
   *   <li>{@link V1DLPPolicy#setCreationDate(Long)}
   *   <li>{@link V1DLPPolicy#setCreatorId(String)}
   *   <li>{@link V1DLPPolicy#setDictionaryRefs(List)}
   *   <li>{@link V1DLPPolicy#setLastDisabledDate(Long)}
   *   <li>{@link V1DLPPolicy#setLastUpdatedDate(Long)}
   *   <li>{@link V1DLPPolicy#setName(String)}
   *   <li>{@link V1DLPPolicy#setPolicyId(String)}
   *   <li>{@link V1DLPPolicy#setScopes(List)}
   *   <li>{@link V1DLPPolicy#setType(String)}
   *   <li>{@link V1DLPPolicy#setVersion(String)}
   *   <li>{@link V1DLPPolicy#type(String)}
   *   <li>{@link V1DLPPolicy#version(String)}
   *   <li>{@link V1DLPPolicy#toString()}
   *   <li>{@link V1DLPPolicy#getActive()}
   *   <li>{@link V1DLPPolicy#getContentTypes()}
   *   <li>{@link V1DLPPolicy#getCreationDate()}
   *   <li>{@link V1DLPPolicy#getCreatorId()}
   *   <li>{@link V1DLPPolicy#getDictionaryRefs()}
   *   <li>{@link V1DLPPolicy#getLastDisabledDate()}
   *   <li>{@link V1DLPPolicy#getLastUpdatedDate()}
   *   <li>{@link V1DLPPolicy#getName()}
   *   <li>{@link V1DLPPolicy#getPolicyId()}
   *   <li>{@link V1DLPPolicy#getScopes()}
   *   <li>{@link V1DLPPolicy#getType()}
   *   <li>{@link V1DLPPolicy#getVersion()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V1DLPPolicy.<init>()",
    "V1DLPPolicy V1DLPPolicy.active(Boolean)",
    "V1DLPPolicy V1DLPPolicy.contentTypes(List)",
    "V1DLPPolicy V1DLPPolicy.creationDate(Long)",
    "V1DLPPolicy V1DLPPolicy.creatorId(String)",
    "V1DLPPolicy V1DLPPolicy.dictionaryRefs(List)",
    "Boolean V1DLPPolicy.getActive()",
    "List V1DLPPolicy.getContentTypes()",
    "Long V1DLPPolicy.getCreationDate()",
    "String V1DLPPolicy.getCreatorId()",
    "List V1DLPPolicy.getDictionaryRefs()",
    "Long V1DLPPolicy.getLastDisabledDate()",
    "Long V1DLPPolicy.getLastUpdatedDate()",
    "String V1DLPPolicy.getName()",
    "String V1DLPPolicy.getPolicyId()",
    "List V1DLPPolicy.getScopes()",
    "String V1DLPPolicy.getType()",
    "String V1DLPPolicy.getVersion()",
    "V1DLPPolicy V1DLPPolicy.lastDisabledDate(Long)",
    "V1DLPPolicy V1DLPPolicy.lastUpdatedDate(Long)",
    "V1DLPPolicy V1DLPPolicy.name(String)",
    "V1DLPPolicy V1DLPPolicy.policyId(String)",
    "V1DLPPolicy V1DLPPolicy.scopes(List)",
    "void V1DLPPolicy.setActive(Boolean)",
    "void V1DLPPolicy.setContentTypes(List)",
    "void V1DLPPolicy.setCreationDate(Long)",
    "void V1DLPPolicy.setCreatorId(String)",
    "void V1DLPPolicy.setDictionaryRefs(List)",
    "void V1DLPPolicy.setLastDisabledDate(Long)",
    "void V1DLPPolicy.setLastUpdatedDate(Long)",
    "void V1DLPPolicy.setName(String)",
    "void V1DLPPolicy.setPolicyId(String)",
    "void V1DLPPolicy.setScopes(List)",
    "void V1DLPPolicy.setType(String)",
    "void V1DLPPolicy.setVersion(String)",
    "String V1DLPPolicy.toString()",
    "V1DLPPolicy V1DLPPolicy.type(String)",
    "V1DLPPolicy V1DLPPolicy.version(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V1DLPPolicy actualV1dlpPolicy = new V1DLPPolicy();
    V1DLPPolicy actualActiveResult = actualV1dlpPolicy.active(true);
    V1DLPPolicy actualContentTypesResult = actualV1dlpPolicy.contentTypes(new ArrayList<>());
    V1DLPPolicy actualCreationDateResult = actualV1dlpPolicy.creationDate(1L);
    V1DLPPolicy actualCreatorIdResult = actualV1dlpPolicy.creatorId("42");
    V1DLPPolicy actualDictionaryRefsResult = actualV1dlpPolicy.dictionaryRefs(new ArrayList<>());
    V1DLPPolicy actualLastDisabledDateResult = actualV1dlpPolicy.lastDisabledDate(1L);
    V1DLPPolicy actualLastUpdatedDateResult = actualV1dlpPolicy.lastUpdatedDate(1L);
    V1DLPPolicy actualNameResult = actualV1dlpPolicy.name("Name");
    V1DLPPolicy actualPolicyIdResult = actualV1dlpPolicy.policyId("42");
    V1DLPPolicy actualScopesResult = actualV1dlpPolicy.scopes(new ArrayList<>());
    actualV1dlpPolicy.setActive(true);
    ArrayList<String> contentTypes = new ArrayList<>();
    actualV1dlpPolicy.setContentTypes(contentTypes);
    actualV1dlpPolicy.setCreationDate(1L);
    actualV1dlpPolicy.setCreatorId("42");
    ArrayList<V1DLPDictionaryRef> dictionaryRefs = new ArrayList<>();
    actualV1dlpPolicy.setDictionaryRefs(dictionaryRefs);
    actualV1dlpPolicy.setLastDisabledDate(1L);
    actualV1dlpPolicy.setLastUpdatedDate(1L);
    actualV1dlpPolicy.setName("Name");
    actualV1dlpPolicy.setPolicyId("42");
    ArrayList<String> scopes = new ArrayList<>();
    actualV1dlpPolicy.setScopes(scopes);
    actualV1dlpPolicy.setType("Type");
    actualV1dlpPolicy.setVersion("1.0.2");
    V1DLPPolicy actualTypeResult = actualV1dlpPolicy.type("Type");
    V1DLPPolicy actualVersionResult = actualV1dlpPolicy.version("1.0.2");
    String actualToStringResult = actualV1dlpPolicy.toString();
    Boolean actualActive = actualV1dlpPolicy.getActive();
    List<String> actualContentTypes = actualV1dlpPolicy.getContentTypes();
    Long actualCreationDate = actualV1dlpPolicy.getCreationDate();
    String actualCreatorId = actualV1dlpPolicy.getCreatorId();
    List<V1DLPDictionaryRef> actualDictionaryRefs = actualV1dlpPolicy.getDictionaryRefs();
    Long actualLastDisabledDate = actualV1dlpPolicy.getLastDisabledDate();
    Long actualLastUpdatedDate = actualV1dlpPolicy.getLastUpdatedDate();
    String actualName = actualV1dlpPolicy.getName();
    String actualPolicyId = actualV1dlpPolicy.getPolicyId();
    List<String> actualScopes = actualV1dlpPolicy.getScopes();
    String actualType = actualV1dlpPolicy.getType();

    // Assert
    assertEquals("1.0.2", actualV1dlpPolicy.getVersion());
    assertEquals("42", actualCreatorId);
    assertEquals("42", actualPolicyId);
    assertEquals("Name", actualName);
    assertEquals("Type", actualType);
    assertEquals(
        "class V1DLPPolicy {\n"
            + "    active: true\n"
            + "    contentTypes: []\n"
            + "    creationDate: 1\n"
            + "    creatorId: 42\n"
            + "    dictionaryRefs: []\n"
            + "    lastDisabledDate: 1\n"
            + "    lastUpdatedDate: 1\n"
            + "    name: Name\n"
            + "    policyId: 42\n"
            + "    scopes: []\n"
            + "    type: Type\n"
            + "    version: 1.0.2\n"
            + "}",
        actualToStringResult);
    assertEquals(1L, actualCreationDate.longValue());
    assertEquals(1L, actualLastDisabledDate.longValue());
    assertEquals(1L, actualLastUpdatedDate.longValue());
    assertTrue(actualActive);
    assertTrue(actualContentTypes.isEmpty());
    assertTrue(actualDictionaryRefs.isEmpty());
    assertTrue(actualScopes.isEmpty());
    assertSame(actualV1dlpPolicy, actualActiveResult);
    assertSame(actualV1dlpPolicy, actualContentTypesResult);
    assertSame(actualV1dlpPolicy, actualCreationDateResult);
    assertSame(actualV1dlpPolicy, actualCreatorIdResult);
    assertSame(actualV1dlpPolicy, actualDictionaryRefsResult);
    assertSame(actualV1dlpPolicy, actualLastDisabledDateResult);
    assertSame(actualV1dlpPolicy, actualLastUpdatedDateResult);
    assertSame(actualV1dlpPolicy, actualNameResult);
    assertSame(actualV1dlpPolicy, actualPolicyIdResult);
    assertSame(actualV1dlpPolicy, actualScopesResult);
    assertSame(actualV1dlpPolicy, actualTypeResult);
    assertSame(actualV1dlpPolicy, actualVersionResult);
    assertSame(contentTypes, actualContentTypes);
    assertSame(dictionaryRefs, actualDictionaryRefs);
    assertSame(scopes, actualScopes);
  }
}
