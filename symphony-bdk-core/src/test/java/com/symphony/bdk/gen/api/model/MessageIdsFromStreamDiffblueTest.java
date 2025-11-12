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

class MessageIdsFromStreamDiffblueTest {
  /**
   * Test {@link MessageIdsFromStream#addDataItem(String)}.
   *
   * <ul>
   *   <li>Given {@link MessageIdsFromStream} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link MessageIdsFromStream#addDataItem(String)}
   */
  @Test
  @DisplayName("Test addDataItem(String); given MessageIdsFromStream (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MessageIdsFromStream MessageIdsFromStream.addDataItem(String)"})
  void testAddDataItem_givenMessageIdsFromStream() {
    // Arrange
    MessageIdsFromStream messageIdsFromStream = new MessageIdsFromStream();

    // Act
    MessageIdsFromStream actualAddDataItemResult = messageIdsFromStream.addDataItem("Data Item");

    // Assert
    assertSame(messageIdsFromStream, actualAddDataItemResult);
  }

  /**
   * Test {@link MessageIdsFromStream#addDataItem(String)}.
   *
   * <ul>
   *   <li>Given {@link MessageIdsFromStream} (default constructor) data {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link MessageIdsFromStream#addDataItem(String)}
   */
  @Test
  @DisplayName(
      "Test addDataItem(String); given MessageIdsFromStream (default constructor) data ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MessageIdsFromStream MessageIdsFromStream.addDataItem(String)"})
  void testAddDataItem_givenMessageIdsFromStreamDataArrayList() {
    // Arrange
    MessageIdsFromStream messageIdsFromStream = new MessageIdsFromStream();
    messageIdsFromStream.data(new ArrayList<>());

    // Act
    MessageIdsFromStream actualAddDataItemResult = messageIdsFromStream.addDataItem("Data Item");

    // Assert
    assertSame(messageIdsFromStream, actualAddDataItemResult);
  }

  /**
   * Test {@link MessageIdsFromStream#equals(Object)}, and {@link MessageIdsFromStream#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MessageIdsFromStream#equals(Object)}
   *   <li>{@link MessageIdsFromStream#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageIdsFromStream.equals(Object)",
    "int MessageIdsFromStream.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MessageIdsFromStream messageIdsFromStream = new MessageIdsFromStream();
    MessageIdsFromStream messageIdsFromStream2 = new MessageIdsFromStream();

    // Act and Assert
    assertEquals(messageIdsFromStream, messageIdsFromStream2);
    assertEquals(messageIdsFromStream.hashCode(), messageIdsFromStream2.hashCode());
  }

  /**
   * Test {@link MessageIdsFromStream#equals(Object)}, and {@link MessageIdsFromStream#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MessageIdsFromStream#equals(Object)}
   *   <li>{@link MessageIdsFromStream#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageIdsFromStream.equals(Object)",
    "int MessageIdsFromStream.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MessageIdsFromStream messageIdsFromStream = new MessageIdsFromStream();

    // Act and Assert
    assertEquals(messageIdsFromStream, messageIdsFromStream);
    int expectedHashCodeResult = messageIdsFromStream.hashCode();
    assertEquals(expectedHashCodeResult, messageIdsFromStream.hashCode());
  }

  /**
   * Test {@link MessageIdsFromStream#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageIdsFromStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageIdsFromStream.equals(Object)",
    "int MessageIdsFromStream.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    MessageIdsFromStream messageIdsFromStream = new MessageIdsFromStream();
    messageIdsFromStream.addDataItem("Data Item");

    // Act and Assert
    assertNotEquals(messageIdsFromStream, new MessageIdsFromStream());
  }

  /**
   * Test {@link MessageIdsFromStream#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageIdsFromStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageIdsFromStream.equals(Object)",
    "int MessageIdsFromStream.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    MessageIdsFromStream messageIdsFromStream = new MessageIdsFromStream();
    messageIdsFromStream.totalNumberFound(1L);

    // Act and Assert
    assertNotEquals(messageIdsFromStream, new MessageIdsFromStream());
  }

  /**
   * Test {@link MessageIdsFromStream#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageIdsFromStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageIdsFromStream.equals(Object)",
    "int MessageIdsFromStream.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    MessageIdsFromStream messageIdsFromStream = new MessageIdsFromStream();
    messageIdsFromStream.numberReturned(1L);

    // Act and Assert
    assertNotEquals(messageIdsFromStream, new MessageIdsFromStream());
  }

  /**
   * Test {@link MessageIdsFromStream#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageIdsFromStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageIdsFromStream.equals(Object)",
    "int MessageIdsFromStream.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    MessageIdsFromStream messageIdsFromStream = new MessageIdsFromStream();
    messageIdsFromStream.nextStartNumber(1L);

    // Act and Assert
    assertNotEquals(messageIdsFromStream, new MessageIdsFromStream());
  }

  /**
   * Test {@link MessageIdsFromStream#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageIdsFromStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageIdsFromStream.equals(Object)",
    "int MessageIdsFromStream.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageIdsFromStream(), null);
  }

  /**
   * Test {@link MessageIdsFromStream#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageIdsFromStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageIdsFromStream.equals(Object)",
    "int MessageIdsFromStream.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageIdsFromStream(), "Different type to MessageIdsFromStream");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link MessageIdsFromStream}
   *   <li>{@link MessageIdsFromStream#data(List)}
   *   <li>{@link MessageIdsFromStream#nextStartNumber(Long)}
   *   <li>{@link MessageIdsFromStream#numberReturned(Long)}
   *   <li>{@link MessageIdsFromStream#setData(List)}
   *   <li>{@link MessageIdsFromStream#setNextStartNumber(Long)}
   *   <li>{@link MessageIdsFromStream#setNumberReturned(Long)}
   *   <li>{@link MessageIdsFromStream#setTotalNumberFound(Long)}
   *   <li>{@link MessageIdsFromStream#totalNumberFound(Long)}
   *   <li>{@link MessageIdsFromStream#toString()}
   *   <li>{@link MessageIdsFromStream#getData()}
   *   <li>{@link MessageIdsFromStream#getNextStartNumber()}
   *   <li>{@link MessageIdsFromStream#getNumberReturned()}
   *   <li>{@link MessageIdsFromStream#getTotalNumberFound()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void MessageIdsFromStream.<init>()",
    "MessageIdsFromStream MessageIdsFromStream.data(List)",
    "List MessageIdsFromStream.getData()",
    "Long MessageIdsFromStream.getNextStartNumber()",
    "Long MessageIdsFromStream.getNumberReturned()",
    "Long MessageIdsFromStream.getTotalNumberFound()",
    "MessageIdsFromStream MessageIdsFromStream.nextStartNumber(Long)",
    "MessageIdsFromStream MessageIdsFromStream.numberReturned(Long)",
    "void MessageIdsFromStream.setData(List)",
    "void MessageIdsFromStream.setNextStartNumber(Long)",
    "void MessageIdsFromStream.setNumberReturned(Long)",
    "void MessageIdsFromStream.setTotalNumberFound(Long)",
    "String MessageIdsFromStream.toString()",
    "MessageIdsFromStream MessageIdsFromStream.totalNumberFound(Long)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    MessageIdsFromStream actualMessageIdsFromStream = new MessageIdsFromStream();
    MessageIdsFromStream actualDataResult = actualMessageIdsFromStream.data(new ArrayList<>());
    MessageIdsFromStream actualNextStartNumberResult =
        actualMessageIdsFromStream.nextStartNumber(1L);
    MessageIdsFromStream actualNumberReturnedResult = actualMessageIdsFromStream.numberReturned(1L);
    ArrayList<String> data = new ArrayList<>();
    actualMessageIdsFromStream.setData(data);
    actualMessageIdsFromStream.setNextStartNumber(1L);
    actualMessageIdsFromStream.setNumberReturned(1L);
    actualMessageIdsFromStream.setTotalNumberFound(1L);
    MessageIdsFromStream actualTotalNumberFoundResult =
        actualMessageIdsFromStream.totalNumberFound(1L);
    String actualToStringResult = actualMessageIdsFromStream.toString();
    List<String> actualData = actualMessageIdsFromStream.getData();
    Long actualNextStartNumber = actualMessageIdsFromStream.getNextStartNumber();
    Long actualNumberReturned = actualMessageIdsFromStream.getNumberReturned();
    Long actualTotalNumberFound = actualMessageIdsFromStream.getTotalNumberFound();

    // Assert
    assertEquals(
        "class MessageIdsFromStream {\n"
            + "    data: []\n"
            + "    totalNumberFound: 1\n"
            + "    numberReturned: 1\n"
            + "    nextStartNumber: 1\n"
            + "}",
        actualToStringResult);
    assertEquals(1L, actualNextStartNumber.longValue());
    assertEquals(1L, actualNumberReturned.longValue());
    assertEquals(1L, actualTotalNumberFound.longValue());
    assertTrue(actualData.isEmpty());
    assertSame(actualMessageIdsFromStream, actualDataResult);
    assertSame(actualMessageIdsFromStream, actualNextStartNumberResult);
    assertSame(actualMessageIdsFromStream, actualNumberReturnedResult);
    assertSame(actualMessageIdsFromStream, actualTotalNumberFoundResult);
    assertSame(data, actualData);
  }
}
