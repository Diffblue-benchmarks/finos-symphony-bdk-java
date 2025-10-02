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

class ChannelSubscriberResponseDiffblueTest {
  /**
   * Test {@link ChannelSubscriberResponse#addDataItem(ChannelSubscriber)}.
   *
   * <ul>
   *   <li>Given {@link ChannelSubscriberResponse} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link ChannelSubscriberResponse#addDataItem(ChannelSubscriber)}
   */
  @Test
  @DisplayName(
      "Test addDataItem(ChannelSubscriber); given ChannelSubscriberResponse (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ChannelSubscriberResponse ChannelSubscriberResponse.addDataItem(ChannelSubscriber)"
  })
  void testAddDataItem_givenChannelSubscriberResponse() {
    // Arrange
    ChannelSubscriberResponse channelSubscriberResponse = new ChannelSubscriberResponse();

    // Act
    ChannelSubscriberResponse actualAddDataItemResult =
        channelSubscriberResponse.addDataItem(new ChannelSubscriber());

    // Assert
    assertSame(channelSubscriberResponse, actualAddDataItemResult);
  }

  /**
   * Test {@link ChannelSubscriberResponse#addDataItem(ChannelSubscriber)}.
   *
   * <ul>
   *   <li>Given {@link ChannelSubscriberResponse} (default constructor) data {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link ChannelSubscriberResponse#addDataItem(ChannelSubscriber)}
   */
  @Test
  @DisplayName(
      "Test addDataItem(ChannelSubscriber); given ChannelSubscriberResponse (default constructor) data ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ChannelSubscriberResponse ChannelSubscriberResponse.addDataItem(ChannelSubscriber)"
  })
  void testAddDataItem_givenChannelSubscriberResponseDataArrayList() {
    // Arrange
    ChannelSubscriberResponse channelSubscriberResponse = new ChannelSubscriberResponse();
    channelSubscriberResponse.data(new ArrayList<>());

    // Act
    ChannelSubscriberResponse actualAddDataItemResult =
        channelSubscriberResponse.addDataItem(new ChannelSubscriber());

    // Assert
    assertSame(channelSubscriberResponse, actualAddDataItemResult);
  }

  /**
   * Test {@link ChannelSubscriberResponse#equals(Object)}, and {@link
   * ChannelSubscriberResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ChannelSubscriberResponse#equals(Object)}
   *   <li>{@link ChannelSubscriberResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ChannelSubscriberResponse.equals(Object)",
    "int ChannelSubscriberResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ChannelSubscriberResponse channelSubscriberResponse = new ChannelSubscriberResponse();
    ChannelSubscriberResponse channelSubscriberResponse2 = new ChannelSubscriberResponse();

    // Act and Assert
    assertEquals(channelSubscriberResponse, channelSubscriberResponse2);
    assertEquals(channelSubscriberResponse.hashCode(), channelSubscriberResponse2.hashCode());
  }

  /**
   * Test {@link ChannelSubscriberResponse#equals(Object)}, and {@link
   * ChannelSubscriberResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ChannelSubscriberResponse#equals(Object)}
   *   <li>{@link ChannelSubscriberResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ChannelSubscriberResponse.equals(Object)",
    "int ChannelSubscriberResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ChannelSubscriberResponse channelSubscriberResponse = new ChannelSubscriberResponse();

    // Act and Assert
    assertEquals(channelSubscriberResponse, channelSubscriberResponse);
    int expectedHashCodeResult = channelSubscriberResponse.hashCode();
    assertEquals(expectedHashCodeResult, channelSubscriberResponse.hashCode());
  }

  /**
   * Test {@link ChannelSubscriberResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ChannelSubscriberResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ChannelSubscriberResponse.equals(Object)",
    "int ChannelSubscriberResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ChannelSubscriberResponse channelSubscriberResponse = new ChannelSubscriberResponse();
    channelSubscriberResponse.addDataItem(new ChannelSubscriber());

    // Act and Assert
    assertNotEquals(channelSubscriberResponse, new ChannelSubscriberResponse());
  }

  /**
   * Test {@link ChannelSubscriberResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ChannelSubscriberResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ChannelSubscriberResponse.equals(Object)",
    "int ChannelSubscriberResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ChannelSubscriberResponse channelSubscriberResponse = new ChannelSubscriberResponse();
    channelSubscriberResponse.offset(1L);
    channelSubscriberResponse.addDataItem(new ChannelSubscriber());

    // Act and Assert
    assertNotEquals(channelSubscriberResponse, new ChannelSubscriberResponse());
  }

  /**
   * Test {@link ChannelSubscriberResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ChannelSubscriberResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ChannelSubscriberResponse.equals(Object)",
    "int ChannelSubscriberResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ChannelSubscriberResponse channelSubscriberResponse = new ChannelSubscriberResponse();
    channelSubscriberResponse.setHasMore(true);
    channelSubscriberResponse.addDataItem(new ChannelSubscriber());

    // Act and Assert
    assertNotEquals(channelSubscriberResponse, new ChannelSubscriberResponse());
  }

  /**
   * Test {@link ChannelSubscriberResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ChannelSubscriberResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ChannelSubscriberResponse.equals(Object)",
    "int ChannelSubscriberResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    ChannelSubscriberResponse channelSubscriberResponse = new ChannelSubscriberResponse();
    channelSubscriberResponse.total(1);
    channelSubscriberResponse.addDataItem(new ChannelSubscriber());

    // Act and Assert
    assertNotEquals(channelSubscriberResponse, new ChannelSubscriberResponse());
  }

  /**
   * Test {@link ChannelSubscriberResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ChannelSubscriberResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ChannelSubscriberResponse.equals(Object)",
    "int ChannelSubscriberResponse.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ChannelSubscriberResponse(), null);
  }

  /**
   * Test {@link ChannelSubscriberResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ChannelSubscriberResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ChannelSubscriberResponse.equals(Object)",
    "int ChannelSubscriberResponse.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ChannelSubscriberResponse(), "Different type to ChannelSubscriberResponse");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link ChannelSubscriberResponse}
   *   <li>{@link ChannelSubscriberResponse#data(List)}
   *   <li>{@link ChannelSubscriberResponse#offset(Long)}
   *   <li>{@link ChannelSubscriberResponse#setData(List)}
   *   <li>{@link ChannelSubscriberResponse#setHasMore(Boolean)}
   *   <li>{@link ChannelSubscriberResponse#setOffset(Long)}
   *   <li>{@link ChannelSubscriberResponse#setTotal(Integer)}
   *   <li>{@link ChannelSubscriberResponse#total(Integer)}
   *   <li>{@link ChannelSubscriberResponse#hasMore(Boolean)}
   *   <li>{@link ChannelSubscriberResponse#toString()}
   *   <li>{@link ChannelSubscriberResponse#getData()}
   *   <li>{@link ChannelSubscriberResponse#getHasMore()}
   *   <li>{@link ChannelSubscriberResponse#getOffset()}
   *   <li>{@link ChannelSubscriberResponse#getTotal()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ChannelSubscriberResponse.<init>()",
    "ChannelSubscriberResponse ChannelSubscriberResponse.data(List)",
    "List ChannelSubscriberResponse.getData()",
    "Boolean ChannelSubscriberResponse.getHasMore()",
    "Long ChannelSubscriberResponse.getOffset()",
    "Integer ChannelSubscriberResponse.getTotal()",
    "ChannelSubscriberResponse ChannelSubscriberResponse.hasMore(Boolean)",
    "ChannelSubscriberResponse ChannelSubscriberResponse.offset(Long)",
    "void ChannelSubscriberResponse.setData(List)",
    "void ChannelSubscriberResponse.setHasMore(Boolean)",
    "void ChannelSubscriberResponse.setOffset(Long)",
    "void ChannelSubscriberResponse.setTotal(Integer)",
    "String ChannelSubscriberResponse.toString()",
    "ChannelSubscriberResponse ChannelSubscriberResponse.total(Integer)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    ChannelSubscriberResponse actualChannelSubscriberResponse = new ChannelSubscriberResponse();
    ChannelSubscriberResponse actualDataResult =
        actualChannelSubscriberResponse.data(new ArrayList<>());
    ChannelSubscriberResponse actualOffsetResult = actualChannelSubscriberResponse.offset(1L);
    ArrayList<ChannelSubscriber> data = new ArrayList<>();
    actualChannelSubscriberResponse.setData(data);
    actualChannelSubscriberResponse.setHasMore(true);
    actualChannelSubscriberResponse.setOffset(1L);
    actualChannelSubscriberResponse.setTotal(1);
    ChannelSubscriberResponse actualTotalResult = actualChannelSubscriberResponse.total(1);
    ChannelSubscriberResponse actualHasMoreResult = actualChannelSubscriberResponse.hasMore(true);
    String actualToStringResult = actualChannelSubscriberResponse.toString();
    List<ChannelSubscriber> actualData = actualChannelSubscriberResponse.getData();
    Boolean actualHasMore = actualChannelSubscriberResponse.getHasMore();
    Long actualOffset = actualChannelSubscriberResponse.getOffset();

    // Assert
    assertEquals(
        "class ChannelSubscriberResponse {\n    offset: 1\n    hasMore: true\n    total: 1\n    data: []\n}",
        actualToStringResult);
    assertEquals(1, actualChannelSubscriberResponse.getTotal().intValue());
    assertEquals(1L, actualOffset.longValue());
    assertTrue(actualHasMore);
    assertTrue(actualData.isEmpty());
    assertSame(actualChannelSubscriberResponse, actualDataResult);
    assertSame(actualChannelSubscriberResponse, actualHasMoreResult);
    assertSame(actualChannelSubscriberResponse, actualOffsetResult);
    assertSame(actualChannelSubscriberResponse, actualTotalResult);
    assertSame(data, actualData);
  }
}
