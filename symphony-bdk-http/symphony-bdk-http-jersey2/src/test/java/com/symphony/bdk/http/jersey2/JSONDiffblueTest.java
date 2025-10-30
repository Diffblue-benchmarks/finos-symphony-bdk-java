package com.symphony.bdk.http.jersey2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.MappingJsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std;
import com.fasterxml.jackson.databind.jsontype.impl.LaissezFaireSubTypeValidator;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class JSONDiffblueTest {
  /**
   * Test new {@link JSON} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link JSON}
   */
  @Test
  @DisplayName("Test new JSON (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void JSON.<init>()"})
  void testNewJson() {
    // Arrange, Act and Assert
    ObjectMapper context = (new JSON()).getContext(null);
    JsonFactory factory = context.getFactory();
    assertTrue(factory instanceof MappingJsonFactory);
    assertTrue(context.getDeserializationContext() instanceof DefaultDeserializationContext.Impl);
    assertTrue(context.getVisibilityChecker() instanceof Std);
    assertTrue(context.getPolymorphicTypeValidator() instanceof LaissezFaireSubTypeValidator);
    assertTrue(context.getSubtypeResolver() instanceof StdSubtypeResolver);
    assertTrue(context.getSerializerFactory() instanceof BeanSerializerFactory);
    assertTrue(context.getSerializerProvider() instanceof Impl);
    assertTrue(context.getSerializerProviderInstance() instanceof Impl);
    assertTrue(context.getDateFormat() instanceof RFC3339DateFormat);
    assertNull(context.getInjectableValues());
    assertNull(context.getPropertyNamingStrategy());
    assertEquals(2, context.getRegisteredModuleIds().size());
    assertSame(factory, context.getJsonFactory());
  }

  /**
   * Test {@link JSON#setDateFormat(DateFormat)}.
   * <p>
   * Method under test: {@link JSON#setDateFormat(DateFormat)}
   */
  @Test
  @DisplayName("Test setDateFormat(DateFormat)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void JSON.setDateFormat(DateFormat)"})
  void testSetDateFormat() {
    // Arrange
    JSON json = new JSON();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd");

    // Act
    json.setDateFormat(dateFormat);

    // Assert
    ObjectMapper context = json.getContext(null);
    SerializationConfig serializationConfig = context.getSerializationConfig();
    assertEquals(21803324, serializationConfig.getSerializationFeatures());
    assertSame(dateFormat, context.getDateFormat());
    assertSame(dateFormat, context.getDeserializationConfig().getDateFormat());
    assertSame(dateFormat, serializationConfig.getDateFormat());
  }

  /**
   * Test {@link JSON#setDateFormat(DateFormat)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then {@link JSON} (default constructor) Context is {@code null} DateFormat is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JSON#setDateFormat(DateFormat)}
   */
  @Test
  @DisplayName("Test setDateFormat(DateFormat); when 'null'; then JSON (default constructor) Context is 'null' DateFormat is 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void JSON.setDateFormat(DateFormat)"})
  void testSetDateFormat_whenNull_thenJsonContextIsNullDateFormatIsNull() {
    // Arrange
    JSON json = new JSON();

    // Act
    json.setDateFormat(null);

    // Assert
    ObjectMapper context = json.getContext(null);
    assertNull(context.getDateFormat());
    assertNull(context.getDeserializationConfig().getDateFormat());
    SerializationConfig serializationConfig = context.getSerializationConfig();
    assertNull(serializationConfig.getDateFormat());
    assertEquals(21803836, serializationConfig.getSerializationFeatures());
  }

  /**
   * Test {@link JSON#getContext(Class)}.
   * <p>
   * Method under test: {@link JSON#getContext(Class)}
   */
  @Test
  @DisplayName("Test getContext(Class)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ObjectMapper JSON.getContext(Class)"})
  void testGetContext() {
    // Arrange
    JSON json = new JSON();
    Class<Object> type = Object.class;

    // Act
    ObjectMapper actualContext = json.getContext(type);

    // Assert
    JsonFactory factory = actualContext.getFactory();
    assertTrue(factory instanceof MappingJsonFactory);
    assertTrue(actualContext.getDeserializationContext() instanceof DefaultDeserializationContext.Impl);
    assertTrue(actualContext.getVisibilityChecker() instanceof Std);
    assertTrue(actualContext.getPolymorphicTypeValidator() instanceof LaissezFaireSubTypeValidator);
    assertTrue(actualContext.getSubtypeResolver() instanceof StdSubtypeResolver);
    assertTrue(actualContext.getSerializerFactory() instanceof BeanSerializerFactory);
    assertTrue(actualContext.getSerializerProvider() instanceof Impl);
    assertTrue(actualContext.getSerializerProviderInstance() instanceof Impl);
    assertTrue(actualContext.getDateFormat() instanceof RFC3339DateFormat);
    assertNull(actualContext.getInjectableValues());
    assertNull(actualContext.getPropertyNamingStrategy());
    assertEquals(2, actualContext.getRegisteredModuleIds().size());
    assertSame(factory, actualContext.getJsonFactory());
  }
}
