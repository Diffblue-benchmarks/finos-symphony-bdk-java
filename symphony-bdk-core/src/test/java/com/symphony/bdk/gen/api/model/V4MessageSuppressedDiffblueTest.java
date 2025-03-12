package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V4MessageSuppressedDiffblueTest {
  /**
   * Test {@link V4MessageSuppressed#equals(Object)}, and {@link V4MessageSuppressed#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4MessageSuppressed#equals(Object)}
   *   <li>{@link V4MessageSuppressed#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4MessageSuppressed.equals(Object)", "int V4MessageSuppressed.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4MessageSuppressed v4MessageSuppressed = new V4MessageSuppressed();
    V4MessageSuppressed v4MessageSuppressed2 = new V4MessageSuppressed();

    // Act and Assert
    assertEquals(v4MessageSuppressed, v4MessageSuppressed2);
    int expectedHashCodeResult = v4MessageSuppressed.hashCode();
    assertEquals(expectedHashCodeResult, v4MessageSuppressed2.hashCode());
  }

  /**
   * Test {@link V4MessageSuppressed#equals(Object)}, and {@link V4MessageSuppressed#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4MessageSuppressed#equals(Object)}
   *   <li>{@link V4MessageSuppressed#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4MessageSuppressed.equals(Object)", "int V4MessageSuppressed.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4MessageSuppressed v4MessageSuppressed = new V4MessageSuppressed();

    // Act and Assert
    assertEquals(v4MessageSuppressed, v4MessageSuppressed);
    int expectedHashCodeResult = v4MessageSuppressed.hashCode();
    assertEquals(expectedHashCodeResult, v4MessageSuppressed.hashCode());
  }

  /**
   * Test {@link V4MessageSuppressed#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4MessageSuppressed#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4MessageSuppressed.equals(Object)", "int V4MessageSuppressed.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4MessageSuppressed(), 1);
  }

  /**
   * Test {@link V4MessageSuppressed#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4MessageSuppressed#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4MessageSuppressed.equals(Object)", "int V4MessageSuppressed.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V4MessageSuppressed v4MessageSuppressed = new V4MessageSuppressed();
    v4MessageSuppressed.messageId("42");

    // Act and Assert
    assertNotEquals(v4MessageSuppressed, new V4MessageSuppressed());
  }

  /**
   * Test {@link V4MessageSuppressed#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4MessageSuppressed#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4MessageSuppressed.equals(Object)", "int V4MessageSuppressed.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V4MessageSuppressed v4MessageSuppressed = new V4MessageSuppressed();
    v4MessageSuppressed.stream(new V4Stream());

    // Act and Assert
    assertNotEquals(v4MessageSuppressed, new V4MessageSuppressed());
  }

  /**
   * Test {@link V4MessageSuppressed#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4MessageSuppressed#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4MessageSuppressed.equals(Object)", "int V4MessageSuppressed.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4MessageSuppressed(), null);
  }

  /**
   * Test {@link V4MessageSuppressed#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4MessageSuppressed#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4MessageSuppressed.equals(Object)", "int V4MessageSuppressed.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4MessageSuppressed(), "Different type to V4MessageSuppressed");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V4MessageSuppressed}
   *   <li>{@link V4MessageSuppressed#messageId(String)}
   *   <li>{@link V4MessageSuppressed#setMessageId(String)}
   *   <li>{@link V4MessageSuppressed#setStream(V4Stream)}
   *   <li>{@link V4MessageSuppressed#stream(V4Stream)}
   *   <li>{@link V4MessageSuppressed#toString()}
   *   <li>{@link V4MessageSuppressed#getMessageId()}
   *   <li>{@link V4MessageSuppressed#getStream()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V4MessageSuppressed.<init>()", "String V4MessageSuppressed.getMessageId()",
      "V4Stream V4MessageSuppressed.getStream()", "V4MessageSuppressed V4MessageSuppressed.messageId(String)",
      "void V4MessageSuppressed.setMessageId(String)", "void V4MessageSuppressed.setStream(V4Stream)",
      "V4MessageSuppressed V4MessageSuppressed.stream(V4Stream)", "String V4MessageSuppressed.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    V4MessageSuppressed actualV4MessageSuppressed = new V4MessageSuppressed();
    V4MessageSuppressed actualMessageIdResult = actualV4MessageSuppressed.messageId("42");
    actualV4MessageSuppressed.setMessageId("42");
    actualV4MessageSuppressed.setStream(new V4Stream());
    V4Stream stream = new V4Stream();
    V4MessageSuppressed actualStreamResult = actualV4MessageSuppressed.stream(stream);
    String actualToStringResult = actualV4MessageSuppressed.toString();
    String actualMessageId = actualV4MessageSuppressed.getMessageId();

    // Assert
    assertEquals("42", actualMessageId);
    assertEquals("class V4MessageSuppressed {\n" + "    messageId: 42\n" + "    stream: class V4Stream {\n"
        + "        streamId: null\n" + "        streamType: null\n" + "        roomName: null\n"
        + "        members: null\n" + "        external: null\n" + "        crossPod: null\n"
        + "        recipientTenantIds: null\n" + "    }\n" + "}", actualToStringResult);
    assertSame(actualV4MessageSuppressed, actualMessageIdResult);
    assertSame(actualV4MessageSuppressed, actualStreamResult);
    assertSame(stream, actualV4MessageSuppressed.getStream());
  }
}
