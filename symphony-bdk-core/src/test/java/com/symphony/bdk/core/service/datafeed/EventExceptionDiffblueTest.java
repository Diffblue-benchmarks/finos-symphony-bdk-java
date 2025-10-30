package com.symphony.bdk.core.service.datafeed;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EventExceptionDiffblueTest {
  /**
   * Test {@link EventException#EventException(String)}.
   * <ul>
   *   <li>When {@code An error occurred}.</li>
   *   <li>Then return Cause is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventException#EventException(String)}
   */
  @Test
  @DisplayName("Test new EventException(String); when 'An error occurred'; then return Cause is 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void EventException.<init>(String)", "void EventException.<init>(String, Throwable)",
      "void EventException.<init>(Throwable)"})
  void testNewEventException_whenAnErrorOccurred_thenReturnCauseIsNull() {
    // Arrange and Act
    EventException actualEventException = new EventException("An error occurred");

    // Assert
    assertEquals("An error occurred", actualEventException.getMessage());
    assertNull(actualEventException.getCause());
    assertEquals(0, actualEventException.getSuppressed().length);
  }

  /**
   * Test {@link EventException#EventException(String, Throwable)}.
   * <ul>
   *   <li>When {@code An error occurred}.</li>
   *   <li>Then return Message is {@code An error occurred}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventException#EventException(String, Throwable)}
   */
  @Test
  @DisplayName("Test new EventException(String, Throwable); when 'An error occurred'; then return Message is 'An error occurred'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void EventException.<init>(String)", "void EventException.<init>(String, Throwable)",
      "void EventException.<init>(Throwable)"})
  void testNewEventException_whenAnErrorOccurred_thenReturnMessageIsAnErrorOccurred() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    EventException actualEventException = new EventException("An error occurred", cause);

    // Assert
    assertEquals("An error occurred", actualEventException.getMessage());
    assertEquals(0, actualEventException.getSuppressed().length);
    assertSame(cause, actualEventException.getCause());
  }

  /**
   * Test {@link EventException#EventException(Throwable)}.
   * <ul>
   *   <li>When {@link Throwable#Throwable()}.</li>
   *   <li>Then return Message is {@code Throwable}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventException#EventException(Throwable)}
   */
  @Test
  @DisplayName("Test new EventException(Throwable); when Throwable(); then return Message is 'java.lang.Throwable'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void EventException.<init>(String)", "void EventException.<init>(String, Throwable)",
      "void EventException.<init>(Throwable)"})
  void testNewEventException_whenThrowable_thenReturnMessageIsJavaLangThrowable() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    EventException actualEventException = new EventException(cause);

    // Assert
    assertEquals("java.lang.Throwable", actualEventException.getMessage());
    assertEquals(0, actualEventException.getSuppressed().length);
    assertSame(cause, actualEventException.getCause());
  }
}
