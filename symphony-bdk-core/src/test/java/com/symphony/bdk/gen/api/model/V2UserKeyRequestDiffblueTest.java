package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V2UserKeyRequestDiffblueTest {
  /**
   * Test {@link V2UserKeyRequest#equals(Object)}, and {@link V2UserKeyRequest#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V2UserKeyRequest#equals(Object)}
   *   <li>{@link V2UserKeyRequest#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2UserKeyRequest.equals(Object)", "int V2UserKeyRequest.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2UserKeyRequest v2UserKeyRequest = new V2UserKeyRequest();
    V2UserKeyRequest v2UserKeyRequest2 = new V2UserKeyRequest();

    // Act and Assert
    assertEquals(v2UserKeyRequest, v2UserKeyRequest2);
    int expectedHashCodeResult = v2UserKeyRequest.hashCode();
    assertEquals(expectedHashCodeResult, v2UserKeyRequest2.hashCode());
  }

  /**
   * Test {@link V2UserKeyRequest#equals(Object)}, and {@link V2UserKeyRequest#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V2UserKeyRequest#equals(Object)}
   *   <li>{@link V2UserKeyRequest#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2UserKeyRequest.equals(Object)", "int V2UserKeyRequest.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2UserKeyRequest v2UserKeyRequest = new V2UserKeyRequest();

    // Act and Assert
    assertEquals(v2UserKeyRequest, v2UserKeyRequest);
    int expectedHashCodeResult = v2UserKeyRequest.hashCode();
    assertEquals(expectedHashCodeResult, v2UserKeyRequest.hashCode());
  }

  /**
   * Test {@link V2UserKeyRequest#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2UserKeyRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2UserKeyRequest.equals(Object)", "int V2UserKeyRequest.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2UserKeyRequest(), 1);
  }

  /**
   * Test {@link V2UserKeyRequest#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2UserKeyRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2UserKeyRequest.equals(Object)", "int V2UserKeyRequest.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V2UserKeyRequest v2UserKeyRequest = new V2UserKeyRequest();
    v2UserKeyRequest.key("Key");

    // Act and Assert
    assertNotEquals(v2UserKeyRequest, new V2UserKeyRequest());
  }

  /**
   * Test {@link V2UserKeyRequest#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2UserKeyRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2UserKeyRequest.equals(Object)", "int V2UserKeyRequest.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V2UserKeyRequest v2UserKeyRequest = new V2UserKeyRequest();
    v2UserKeyRequest.expirationDate(1L);

    // Act and Assert
    assertNotEquals(v2UserKeyRequest, new V2UserKeyRequest());
  }

  /**
   * Test {@link V2UserKeyRequest#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2UserKeyRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2UserKeyRequest.equals(Object)", "int V2UserKeyRequest.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V2UserKeyRequest v2UserKeyRequest = new V2UserKeyRequest();
    v2UserKeyRequest.action("Action");

    // Act and Assert
    assertNotEquals(v2UserKeyRequest, new V2UserKeyRequest());
  }

  /**
   * Test {@link V2UserKeyRequest#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2UserKeyRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2UserKeyRequest.equals(Object)", "int V2UserKeyRequest.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2UserKeyRequest(), null);
  }

  /**
   * Test {@link V2UserKeyRequest#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2UserKeyRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2UserKeyRequest.equals(Object)", "int V2UserKeyRequest.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2UserKeyRequest(), "Different type to V2UserKeyRequest");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V2UserKeyRequest}
   *   <li>{@link V2UserKeyRequest#action(String)}
   *   <li>{@link V2UserKeyRequest#expirationDate(Long)}
   *   <li>{@link V2UserKeyRequest#key(String)}
   *   <li>{@link V2UserKeyRequest#setAction(String)}
   *   <li>{@link V2UserKeyRequest#setExpirationDate(Long)}
   *   <li>{@link V2UserKeyRequest#setKey(String)}
   *   <li>{@link V2UserKeyRequest#toString()}
   *   <li>{@link V2UserKeyRequest#getAction()}
   *   <li>{@link V2UserKeyRequest#getExpirationDate()}
   *   <li>{@link V2UserKeyRequest#getKey()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V2UserKeyRequest.<init>()", "V2UserKeyRequest V2UserKeyRequest.action(String)",
      "V2UserKeyRequest V2UserKeyRequest.expirationDate(Long)", "String V2UserKeyRequest.getAction()",
      "Long V2UserKeyRequest.getExpirationDate()", "String V2UserKeyRequest.getKey()",
      "V2UserKeyRequest V2UserKeyRequest.key(String)", "void V2UserKeyRequest.setAction(String)",
      "void V2UserKeyRequest.setExpirationDate(Long)", "void V2UserKeyRequest.setKey(String)",
      "String V2UserKeyRequest.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    V2UserKeyRequest actualV2UserKeyRequest = new V2UserKeyRequest();
    V2UserKeyRequest actualActionResult = actualV2UserKeyRequest.action("Action");
    V2UserKeyRequest actualExpirationDateResult = actualV2UserKeyRequest.expirationDate(1L);
    V2UserKeyRequest actualKeyResult = actualV2UserKeyRequest.key("Key");
    actualV2UserKeyRequest.setAction("Action");
    actualV2UserKeyRequest.setExpirationDate(1L);
    actualV2UserKeyRequest.setKey("Key");
    String actualToStringResult = actualV2UserKeyRequest.toString();
    String actualAction = actualV2UserKeyRequest.getAction();
    Long actualExpirationDate = actualV2UserKeyRequest.getExpirationDate();

    // Assert
    assertEquals("Action", actualAction);
    assertEquals("Key", actualV2UserKeyRequest.getKey());
    assertEquals("class V2UserKeyRequest {\n    key: Key\n    expirationDate: 1\n    action: Action\n}",
        actualToStringResult);
    assertEquals(1L, actualExpirationDate.longValue());
    assertSame(actualV2UserKeyRequest, actualActionResult);
    assertSame(actualV2UserKeyRequest, actualExpirationDateResult);
    assertSame(actualV2UserKeyRequest, actualKeyResult);
  }
}
