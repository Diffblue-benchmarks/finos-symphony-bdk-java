package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V4SymphonyElementsActionDiffblueTest {
  /**
   * Test {@link V4SymphonyElementsAction#equals(Object)}, and {@link
   * V4SymphonyElementsAction#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4SymphonyElementsAction#equals(Object)}
   *   <li>{@link V4SymphonyElementsAction#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4SymphonyElementsAction.equals(Object)",
    "int V4SymphonyElementsAction.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4SymphonyElementsAction v4SymphonyElementsAction = new V4SymphonyElementsAction();
    V4SymphonyElementsAction v4SymphonyElementsAction2 = new V4SymphonyElementsAction();

    // Act and Assert
    assertEquals(v4SymphonyElementsAction, v4SymphonyElementsAction2);
    assertEquals(v4SymphonyElementsAction.hashCode(), v4SymphonyElementsAction2.hashCode());
  }

  /**
   * Test {@link V4SymphonyElementsAction#equals(Object)}, and {@link
   * V4SymphonyElementsAction#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4SymphonyElementsAction#equals(Object)}
   *   <li>{@link V4SymphonyElementsAction#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4SymphonyElementsAction.equals(Object)",
    "int V4SymphonyElementsAction.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4SymphonyElementsAction v4SymphonyElementsAction = new V4SymphonyElementsAction();

    // Act and Assert
    assertEquals(v4SymphonyElementsAction, v4SymphonyElementsAction);
    int expectedHashCodeResult = v4SymphonyElementsAction.hashCode();
    assertEquals(expectedHashCodeResult, v4SymphonyElementsAction.hashCode());
  }

  /**
   * Test {@link V4SymphonyElementsAction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4SymphonyElementsAction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4SymphonyElementsAction.equals(Object)",
    "int V4SymphonyElementsAction.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4SymphonyElementsAction(), 1);
  }

  /**
   * Test {@link V4SymphonyElementsAction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4SymphonyElementsAction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4SymphonyElementsAction.equals(Object)",
    "int V4SymphonyElementsAction.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V4SymphonyElementsAction v4SymphonyElementsAction = new V4SymphonyElementsAction();
    v4SymphonyElementsAction.stream(new V4Stream());

    // Act and Assert
    assertNotEquals(v4SymphonyElementsAction, new V4SymphonyElementsAction());
  }

  /**
   * Test {@link V4SymphonyElementsAction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4SymphonyElementsAction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4SymphonyElementsAction.equals(Object)",
    "int V4SymphonyElementsAction.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V4SymphonyElementsAction v4SymphonyElementsAction = new V4SymphonyElementsAction();
    v4SymphonyElementsAction.formMessageId("42");

    // Act and Assert
    assertNotEquals(v4SymphonyElementsAction, new V4SymphonyElementsAction());
  }

  /**
   * Test {@link V4SymphonyElementsAction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4SymphonyElementsAction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4SymphonyElementsAction.equals(Object)",
    "int V4SymphonyElementsAction.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V4SymphonyElementsAction v4SymphonyElementsAction = new V4SymphonyElementsAction();
    v4SymphonyElementsAction.formId("42");

    // Act and Assert
    assertNotEquals(v4SymphonyElementsAction, new V4SymphonyElementsAction());
  }

  /**
   * Test {@link V4SymphonyElementsAction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4SymphonyElementsAction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4SymphonyElementsAction.equals(Object)",
    "int V4SymphonyElementsAction.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V4SymphonyElementsAction v4SymphonyElementsAction = new V4SymphonyElementsAction();
    v4SymphonyElementsAction.formValues("Form Values");

    // Act and Assert
    assertNotEquals(v4SymphonyElementsAction, new V4SymphonyElementsAction());
  }

  /**
   * Test {@link V4SymphonyElementsAction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4SymphonyElementsAction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4SymphonyElementsAction.equals(Object)",
    "int V4SymphonyElementsAction.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    V4SymphonyElementsAction v4SymphonyElementsAction = new V4SymphonyElementsAction();
    v4SymphonyElementsAction.formValues(new V4SymphonyElementsAction());

    // Act and Assert
    assertNotEquals(v4SymphonyElementsAction, new V4SymphonyElementsAction());
  }

  /**
   * Test {@link V4SymphonyElementsAction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4SymphonyElementsAction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4SymphonyElementsAction.equals(Object)",
    "int V4SymphonyElementsAction.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4SymphonyElementsAction(), null);
  }

  /**
   * Test {@link V4SymphonyElementsAction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4SymphonyElementsAction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4SymphonyElementsAction.equals(Object)",
    "int V4SymphonyElementsAction.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4SymphonyElementsAction(), "Different type to V4SymphonyElementsAction");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V4SymphonyElementsAction}
   *   <li>{@link V4SymphonyElementsAction#formId(String)}
   *   <li>{@link V4SymphonyElementsAction#formMessageId(String)}
   *   <li>{@link V4SymphonyElementsAction#formValues(Object)}
   *   <li>{@link V4SymphonyElementsAction#setFormId(String)}
   *   <li>{@link V4SymphonyElementsAction#setFormMessageId(String)}
   *   <li>{@link V4SymphonyElementsAction#setFormValues(Object)}
   *   <li>{@link V4SymphonyElementsAction#setStream(V4Stream)}
   *   <li>{@link V4SymphonyElementsAction#stream(V4Stream)}
   *   <li>{@link V4SymphonyElementsAction#toString()}
   *   <li>{@link V4SymphonyElementsAction#getFormId()}
   *   <li>{@link V4SymphonyElementsAction#getFormMessageId()}
   *   <li>{@link V4SymphonyElementsAction#getFormValues()}
   *   <li>{@link V4SymphonyElementsAction#getStream()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V4SymphonyElementsAction.<init>()",
    "V4SymphonyElementsAction V4SymphonyElementsAction.formId(String)",
    "V4SymphonyElementsAction V4SymphonyElementsAction.formMessageId(String)",
    "V4SymphonyElementsAction V4SymphonyElementsAction.formValues(Object)",
    "String V4SymphonyElementsAction.getFormId()",
    "String V4SymphonyElementsAction.getFormMessageId()",
    "Object V4SymphonyElementsAction.getFormValues()",
    "V4Stream V4SymphonyElementsAction.getStream()",
    "void V4SymphonyElementsAction.setFormId(String)",
    "void V4SymphonyElementsAction.setFormMessageId(String)",
    "void V4SymphonyElementsAction.setFormValues(Object)",
    "void V4SymphonyElementsAction.setStream(V4Stream)",
    "V4SymphonyElementsAction V4SymphonyElementsAction.stream(V4Stream)",
    "String V4SymphonyElementsAction.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V4SymphonyElementsAction actualV4SymphonyElementsAction = new V4SymphonyElementsAction();
    V4SymphonyElementsAction actualFormIdResult = actualV4SymphonyElementsAction.formId("42");
    V4SymphonyElementsAction actualFormMessageIdResult =
        actualV4SymphonyElementsAction.formMessageId("42");
    V4SymphonyElementsAction actualFormValuesResult =
        actualV4SymphonyElementsAction.formValues("Form Values");
    actualV4SymphonyElementsAction.setFormId("42");
    actualV4SymphonyElementsAction.setFormMessageId("42");
    actualV4SymphonyElementsAction.setFormValues("Form Values");
    actualV4SymphonyElementsAction.setStream(new V4Stream());
    V4Stream stream = new V4Stream();
    V4SymphonyElementsAction actualStreamResult = actualV4SymphonyElementsAction.stream(stream);
    String actualToStringResult = actualV4SymphonyElementsAction.toString();
    String actualFormId = actualV4SymphonyElementsAction.getFormId();
    String actualFormMessageId = actualV4SymphonyElementsAction.getFormMessageId();
    Object actualFormValues = actualV4SymphonyElementsAction.getFormValues();

    // Assert
    assertEquals("42", actualFormId);
    assertEquals("42", actualFormMessageId);
    assertEquals("Form Values", actualFormValues);
    assertEquals(
        "class V4SymphonyElementsAction {\n"
            + "    stream: class V4Stream {\n"
            + "        streamId: null\n"
            + "        streamType: null\n"
            + "        roomName: null\n"
            + "        members: null\n"
            + "        external: null\n"
            + "        crossPod: null\n"
            + "        recipientTenantIds: null\n"
            + "    }\n"
            + "    formMessageId: 42\n"
            + "    formId: 42\n"
            + "    formValues: Form Values\n"
            + "}",
        actualToStringResult);
    assertSame(stream, actualV4SymphonyElementsAction.getStream());
    assertSame(actualV4SymphonyElementsAction, actualFormIdResult);
    assertSame(actualV4SymphonyElementsAction, actualFormMessageIdResult);
    assertSame(actualV4SymphonyElementsAction, actualFormValuesResult);
    assertSame(actualV4SymphonyElementsAction, actualStreamResult);
  }
}
