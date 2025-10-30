package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V4MessageBlastResponseDiffblueTest {
  /**
   * Test {@link V4MessageBlastResponse#addMessagesItem(V4Message)}.
   * <p>
   * Method under test: {@link V4MessageBlastResponse#addMessagesItem(V4Message)}
   */
  @Test
  @DisplayName("Test addMessagesItem(V4Message)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V4MessageBlastResponse V4MessageBlastResponse.addMessagesItem(V4Message)"})
  void testAddMessagesItem() {
    // Arrange
    V4MessageBlastResponse v4MessageBlastResponse = new V4MessageBlastResponse();

    // Act and Assert
    assertSame(v4MessageBlastResponse, v4MessageBlastResponse.addMessagesItem(new V4Message()));
  }

  /**
   * Test {@link V4MessageBlastResponse#putErrorsItem(String, Error)}.
   * <p>
   * Method under test: {@link V4MessageBlastResponse#putErrorsItem(String, Error)}
   */
  @Test
  @DisplayName("Test putErrorsItem(String, Error)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V4MessageBlastResponse V4MessageBlastResponse.putErrorsItem(String, Error)"})
  void testPutErrorsItem() {
    // Arrange
    V4MessageBlastResponse v4MessageBlastResponse = new V4MessageBlastResponse();

    // Act and Assert
    assertSame(v4MessageBlastResponse, v4MessageBlastResponse.putErrorsItem("Key", new Error()));
  }

  /**
   * Test {@link V4MessageBlastResponse#equals(Object)}, and {@link V4MessageBlastResponse#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4MessageBlastResponse#equals(Object)}
   *   <li>{@link V4MessageBlastResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4MessageBlastResponse.equals(Object)", "int V4MessageBlastResponse.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4MessageBlastResponse v4MessageBlastResponse = new V4MessageBlastResponse();
    V4MessageBlastResponse v4MessageBlastResponse2 = new V4MessageBlastResponse();

    // Act and Assert
    assertEquals(v4MessageBlastResponse, v4MessageBlastResponse2);
    int expectedHashCodeResult = v4MessageBlastResponse.hashCode();
    assertEquals(expectedHashCodeResult, v4MessageBlastResponse2.hashCode());
  }

  /**
   * Test {@link V4MessageBlastResponse#equals(Object)}, and {@link V4MessageBlastResponse#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4MessageBlastResponse#equals(Object)}
   *   <li>{@link V4MessageBlastResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4MessageBlastResponse.equals(Object)", "int V4MessageBlastResponse.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4MessageBlastResponse v4MessageBlastResponse = new V4MessageBlastResponse();

    // Act and Assert
    assertEquals(v4MessageBlastResponse, v4MessageBlastResponse);
    int expectedHashCodeResult = v4MessageBlastResponse.hashCode();
    assertEquals(expectedHashCodeResult, v4MessageBlastResponse.hashCode());
  }

  /**
   * Test {@link V4MessageBlastResponse#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4MessageBlastResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4MessageBlastResponse.equals(Object)", "int V4MessageBlastResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V4MessageBlastResponse v4MessageBlastResponse = new V4MessageBlastResponse();
    v4MessageBlastResponse.addMessagesItem(new V4Message());

    // Act and Assert
    assertNotEquals(v4MessageBlastResponse, new V4MessageBlastResponse());
  }

  /**
   * Test {@link V4MessageBlastResponse#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4MessageBlastResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4MessageBlastResponse.equals(Object)", "int V4MessageBlastResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V4MessageBlastResponse v4MessageBlastResponse = new V4MessageBlastResponse();
    v4MessageBlastResponse.putErrorsItem("Key", new Error());

    // Act and Assert
    assertNotEquals(v4MessageBlastResponse, new V4MessageBlastResponse());
  }

  /**
   * Test {@link V4MessageBlastResponse#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4MessageBlastResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4MessageBlastResponse.equals(Object)", "int V4MessageBlastResponse.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4MessageBlastResponse(), null);
  }

  /**
   * Test {@link V4MessageBlastResponse#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4MessageBlastResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4MessageBlastResponse.equals(Object)", "int V4MessageBlastResponse.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4MessageBlastResponse(), "Different type to V4MessageBlastResponse");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V4MessageBlastResponse}
   *   <li>{@link V4MessageBlastResponse#errors(Map)}
   *   <li>{@link V4MessageBlastResponse#messages(List)}
   *   <li>{@link V4MessageBlastResponse#setErrors(Map)}
   *   <li>{@link V4MessageBlastResponse#setMessages(List)}
   *   <li>{@link V4MessageBlastResponse#toString()}
   *   <li>{@link V4MessageBlastResponse#getErrors()}
   *   <li>{@link V4MessageBlastResponse#getMessages()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V4MessageBlastResponse.<init>()",
      "V4MessageBlastResponse V4MessageBlastResponse.errors(Map)", "Map V4MessageBlastResponse.getErrors()",
      "List V4MessageBlastResponse.getMessages()", "V4MessageBlastResponse V4MessageBlastResponse.messages(List)",
      "void V4MessageBlastResponse.setErrors(Map)", "void V4MessageBlastResponse.setMessages(List)",
      "String V4MessageBlastResponse.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    V4MessageBlastResponse actualV4MessageBlastResponse = new V4MessageBlastResponse();
    V4MessageBlastResponse actualErrorsResult = actualV4MessageBlastResponse.errors(new HashMap<>());
    V4MessageBlastResponse actualMessagesResult = actualV4MessageBlastResponse.messages(new ArrayList<>());
    HashMap<String, Error> errors = new HashMap<>();
    actualV4MessageBlastResponse.setErrors(errors);
    ArrayList<V4Message> messages = new ArrayList<>();
    actualV4MessageBlastResponse.setMessages(messages);
    String actualToStringResult = actualV4MessageBlastResponse.toString();
    Map<String, Error> actualErrors = actualV4MessageBlastResponse.getErrors();
    List<V4Message> actualMessages = actualV4MessageBlastResponse.getMessages();

    // Assert
    assertEquals("class V4MessageBlastResponse {\n    messages: []\n    errors: {}\n}", actualToStringResult);
    assertTrue(actualMessages.isEmpty());
    assertTrue(actualErrors.isEmpty());
    assertSame(actualV4MessageBlastResponse, actualErrorsResult);
    assertSame(actualV4MessageBlastResponse, actualMessagesResult);
    assertSame(messages, actualMessages);
    assertSame(errors, actualErrors);
  }
}
