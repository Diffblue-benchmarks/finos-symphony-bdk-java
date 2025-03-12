package com.symphony.bdk.core.config;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.fasterxml.jackson.databind.node.MissingNode;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.symphony.bdk.core.config.exception.BdkConfigException;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkConfigParserDiffblueTest {
  /**
   * Test {@link BdkConfigParser#parse(InputStream)}.
   * <ul>
   *   <li>When {@link ByteArrayInputStream#ByteArrayInputStream(byte[])} with array of {@code byte} with minus one and {@code X}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkConfigParser#parse(InputStream)}
   */
  @Test
  @DisplayName("Test parse(InputStream); when ByteArrayInputStream(byte[]) with array of byte with minus one and 'X'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"JsonNode BdkConfigParser.parse(InputStream)"})
  void testParse_whenByteArrayInputStreamWithArrayOfByteWithMinusOneAndX() throws BdkConfigException {
    // Arrange
    BdkConfigParser bdkConfigParser = new BdkConfigParser();

    // Act and Assert
    assertThrows(BdkConfigException.class,
        () -> bdkConfigParser.parse(new ByteArrayInputStream(new byte[]{-1, 'X', 'A', 'X', 'A', 'X', 'A', 'X'})));
  }

  /**
   * Test {@link BdkConfigParser#parse(InputStream)}.
   * <ul>
   *   <li>When {@link ByteArrayInputStream#ByteArrayInputStream(byte[])} with array of {@code byte} with zero and {@code X}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkConfigParser#parse(InputStream)}
   */
  @Test
  @DisplayName("Test parse(InputStream); when ByteArrayInputStream(byte[]) with array of byte with zero and 'X'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"JsonNode BdkConfigParser.parse(InputStream)"})
  void testParse_whenByteArrayInputStreamWithArrayOfByteWithZeroAndX() throws BdkConfigException {
    // Arrange
    BdkConfigParser bdkConfigParser = new BdkConfigParser();

    // Act and Assert
    assertThrows(BdkConfigException.class,
        () -> bdkConfigParser.parse(new ByteArrayInputStream(new byte[]{0, 'X', 'A', 'X', 'A', 'X', 'A', 'X'})));
  }

  /**
   * Test {@link BdkConfigParser#parse(InputStream)}.
   * <ul>
   *   <li>When {@link ByteArrayInputStream#ByteArrayInputStream(byte[])} with {@code AXAXAXAX} Bytes is {@code UTF-8}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkConfigParser#parse(InputStream)}
   */
  @Test
  @DisplayName("Test parse(InputStream); when ByteArrayInputStream(byte[]) with 'AXAXAXAX' Bytes is 'UTF-8'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"JsonNode BdkConfigParser.parse(InputStream)"})
  void testParse_whenByteArrayInputStreamWithAxaxaxaxBytesIsUtf8()
      throws BdkConfigException, UnsupportedEncodingException {
    // Arrange
    BdkConfigParser bdkConfigParser = new BdkConfigParser();

    // Act and Assert
    assertThrows(BdkConfigException.class,
        () -> bdkConfigParser.parse(new ByteArrayInputStream("AXAXAXAX".getBytes("UTF-8"))));
  }

  /**
   * Test {@link BdkConfigParser#parse(InputStream)}.
   * <ul>
   *   <li>When {@link ByteArrayInputStream#ByteArrayInputStream(byte[])} with empty array of {@code byte}.</li>
   *   <li>Then return {@link MissingNode}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkConfigParser#parse(InputStream)}
   */
  @Test
  @DisplayName("Test parse(InputStream); when ByteArrayInputStream(byte[]) with empty array of byte; then return MissingNode")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"JsonNode BdkConfigParser.parse(InputStream)"})
  void testParse_whenByteArrayInputStreamWithEmptyArrayOfByte_thenReturnMissingNode() throws BdkConfigException {
    // Arrange
    BdkConfigParser bdkConfigParser = new BdkConfigParser();

    // Act
    JsonNode actualParseResult = bdkConfigParser.parse(new ByteArrayInputStream(new byte[]{}));

    // Assert
    assertTrue(actualParseResult instanceof MissingNode);
    assertTrue(actualParseResult.traverse() instanceof TreeTraversingParser);
    assertEquals("", actualParseResult.toPrettyString());
    assertEquals(0, actualParseResult.size());
    assertEquals(JsonNodeType.MISSING, actualParseResult.getNodeType());
    assertFalse(actualParseResult.isArray());
    assertFalse(actualParseResult.isBigDecimal());
    assertFalse(actualParseResult.isBigInteger());
    assertFalse(actualParseResult.isBinary());
    assertFalse(actualParseResult.isBoolean());
    assertFalse(actualParseResult.isContainerNode());
    assertFalse(actualParseResult.isDouble());
    assertFalse(actualParseResult.isFloat());
    assertFalse(actualParseResult.isFloatingPointNumber());
    assertFalse(actualParseResult.isInt());
    assertFalse(actualParseResult.isIntegralNumber());
    assertFalse(actualParseResult.isLong());
    assertFalse(actualParseResult.isNull());
    assertFalse(actualParseResult.isNumber());
    assertFalse(actualParseResult.isObject());
    assertFalse(actualParseResult.isPojo());
    assertFalse(actualParseResult.isShort());
    assertFalse(actualParseResult.isTextual());
    assertFalse(actualParseResult.isValueNode());
    assertFalse(actualParseResult.iterator().hasNext());
    assertTrue(actualParseResult.isEmpty());
    assertTrue(actualParseResult.isMissingNode());
  }

  /**
   * Test {@link BdkConfigParser#parseJsonNode(InputStream)}.
   * <ul>
   *   <li>Then return {@link MissingNode}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkConfigParser#parseJsonNode(InputStream)}
   */
  @Test
  @DisplayName("Test parseJsonNode(InputStream); then return MissingNode")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"JsonNode BdkConfigParser.parseJsonNode(InputStream)"})
  void testParseJsonNode_thenReturnMissingNode() throws BdkConfigException {
    // Arrange
    BdkConfigParser bdkConfigParser = new BdkConfigParser();

    // Act
    JsonNode actualParseJsonNodeResult = bdkConfigParser.parseJsonNode(new ByteArrayInputStream(new byte[]{}));

    // Assert
    assertTrue(actualParseJsonNodeResult instanceof MissingNode);
    assertTrue(actualParseJsonNodeResult.traverse() instanceof TreeTraversingParser);
    assertEquals("", actualParseJsonNodeResult.toPrettyString());
    assertEquals(0, actualParseJsonNodeResult.size());
    assertEquals(JsonNodeType.MISSING, actualParseJsonNodeResult.getNodeType());
    assertFalse(actualParseJsonNodeResult.isArray());
    assertFalse(actualParseJsonNodeResult.isBigDecimal());
    assertFalse(actualParseJsonNodeResult.isBigInteger());
    assertFalse(actualParseJsonNodeResult.isBinary());
    assertFalse(actualParseJsonNodeResult.isBoolean());
    assertFalse(actualParseJsonNodeResult.isContainerNode());
    assertFalse(actualParseJsonNodeResult.isDouble());
    assertFalse(actualParseJsonNodeResult.isFloat());
    assertFalse(actualParseJsonNodeResult.isFloatingPointNumber());
    assertFalse(actualParseJsonNodeResult.isInt());
    assertFalse(actualParseJsonNodeResult.isIntegralNumber());
    assertFalse(actualParseJsonNodeResult.isLong());
    assertFalse(actualParseJsonNodeResult.isNull());
    assertFalse(actualParseJsonNodeResult.isNumber());
    assertFalse(actualParseJsonNodeResult.isObject());
    assertFalse(actualParseJsonNodeResult.isPojo());
    assertFalse(actualParseJsonNodeResult.isShort());
    assertFalse(actualParseJsonNodeResult.isTextual());
    assertFalse(actualParseJsonNodeResult.isValueNode());
    assertFalse(actualParseJsonNodeResult.iterator().hasNext());
    assertTrue(actualParseJsonNodeResult.isEmpty());
    assertTrue(actualParseJsonNodeResult.isMissingNode());
  }

  /**
   * Test {@link BdkConfigParser#parseJsonNode(InputStream)}.
   * <ul>
   *   <li>When {@link ByteArrayInputStream#ByteArrayInputStream(byte[])} with array of {@code byte} with minus one and {@code X}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkConfigParser#parseJsonNode(InputStream)}
   */
  @Test
  @DisplayName("Test parseJsonNode(InputStream); when ByteArrayInputStream(byte[]) with array of byte with minus one and 'X'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"JsonNode BdkConfigParser.parseJsonNode(InputStream)"})
  void testParseJsonNode_whenByteArrayInputStreamWithArrayOfByteWithMinusOneAndX() throws BdkConfigException {
    // Arrange
    BdkConfigParser bdkConfigParser = new BdkConfigParser();

    // Act and Assert
    assertThrows(BdkConfigException.class, () -> bdkConfigParser
        .parseJsonNode(new ByteArrayInputStream(new byte[]{-1, 'X', 'A', 'X', 'A', 'X', 'A', 'X'})));
  }

  /**
   * Test {@link BdkConfigParser#parseJsonNode(InputStream)}.
   * <ul>
   *   <li>When {@link ByteArrayInputStream#ByteArrayInputStream(byte[])} with array of {@code byte} with zero and {@code X}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkConfigParser#parseJsonNode(InputStream)}
   */
  @Test
  @DisplayName("Test parseJsonNode(InputStream); when ByteArrayInputStream(byte[]) with array of byte with zero and 'X'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"JsonNode BdkConfigParser.parseJsonNode(InputStream)"})
  void testParseJsonNode_whenByteArrayInputStreamWithArrayOfByteWithZeroAndX() throws BdkConfigException {
    // Arrange
    BdkConfigParser bdkConfigParser = new BdkConfigParser();

    // Act and Assert
    assertThrows(BdkConfigException.class, () -> bdkConfigParser
        .parseJsonNode(new ByteArrayInputStream(new byte[]{0, 'X', 'A', 'X', 'A', 'X', 'A', 'X'})));
  }

  /**
   * Test {@link BdkConfigParser#parseJsonNode(InputStream)}.
   * <ul>
   *   <li>When {@link ByteArrayInputStream#ByteArrayInputStream(byte[])} with {@code AXAXAXAX} Bytes is {@code UTF-8}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkConfigParser#parseJsonNode(InputStream)}
   */
  @Test
  @DisplayName("Test parseJsonNode(InputStream); when ByteArrayInputStream(byte[]) with 'AXAXAXAX' Bytes is 'UTF-8'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"JsonNode BdkConfigParser.parseJsonNode(InputStream)"})
  void testParseJsonNode_whenByteArrayInputStreamWithAxaxaxaxBytesIsUtf8()
      throws BdkConfigException, UnsupportedEncodingException {
    // Arrange
    BdkConfigParser bdkConfigParser = new BdkConfigParser();

    // Act and Assert
    assertThrows(BdkConfigException.class,
        () -> bdkConfigParser.parseJsonNode(new ByteArrayInputStream("AXAXAXAX".getBytes("UTF-8"))));
  }

  /**
   * Test {@link BdkConfigParser#interpolateProperties(JsonNode)}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add Instance.</li>
   *   <li>Then calls {@link JsonNode#iterator()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkConfigParser#interpolateProperties(JsonNode)}
   */
  @Test
  @DisplayName("Test interpolateProperties(JsonNode); given ArrayList() add Instance; then calls iterator()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BdkConfigParser.interpolateProperties(JsonNode)"})
  void testInterpolateProperties_givenArrayListAddInstance_thenCallsIterator() {
    // Arrange
    BdkConfigParser bdkConfigParser = new BdkConfigParser();

    ArrayList<JsonNode> jsonNodeList = new ArrayList<>();
    jsonNodeList.add(MissingNode.getInstance());
    ArrayNode jsonNode = mock(ArrayNode.class);
    when(jsonNode.iterator()).thenReturn(jsonNodeList.iterator());
    when(jsonNode.isArray()).thenReturn(true);

    // Act
    bdkConfigParser.interpolateProperties(jsonNode);

    // Assert
    verify(jsonNode).iterator();
    verify(jsonNode).isArray();
  }

  /**
   * Test {@link BdkConfigParser#interpolateProperties(JsonNode)}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} iterator.</li>
   *   <li>Then calls {@link JsonNode#iterator()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkConfigParser#interpolateProperties(JsonNode)}
   */
  @Test
  @DisplayName("Test interpolateProperties(JsonNode); given ArrayList() iterator; then calls iterator()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BdkConfigParser.interpolateProperties(JsonNode)"})
  void testInterpolateProperties_givenArrayListIterator_thenCallsIterator() {
    // Arrange
    BdkConfigParser bdkConfigParser = new BdkConfigParser();
    ArrayNode jsonNode = mock(ArrayNode.class);

    ArrayList<JsonNode> jsonNodeList = new ArrayList<>();
    when(jsonNode.iterator()).thenReturn(jsonNodeList.iterator());
    when(jsonNode.isArray()).thenReturn(true);

    // Act
    bdkConfigParser.interpolateProperties(jsonNode);

    // Assert
    verify(jsonNode).iterator();
    verify(jsonNode).isArray();
  }
}
