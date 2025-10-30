package com.symphony.bdk.http.jersey2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.GregorianCalendar;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RFC3339DateFormatDiffblueTest {
  /**
   * Test {@link RFC3339DateFormat#format(Date, StringBuffer, FieldPosition)} with {@code Date}, {@code StringBuffer}, {@code FieldPosition}.
   * <p>
   * Method under test: {@link RFC3339DateFormat#format(Date, StringBuffer, FieldPosition)}
   */
  @Test
  @DisplayName("Test format(Date, StringBuffer, FieldPosition) with 'Date', 'StringBuffer', 'FieldPosition'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"StringBuffer RFC3339DateFormat.format(Date, StringBuffer, FieldPosition)"})
  void testFormatWithDateStringBufferFieldPosition() {
    // Arrange
    RFC3339DateFormat rfc3339DateFormat = new RFC3339DateFormat();
    Date date = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
    StringBuffer toAppendTo = new StringBuffer("foo");

    // Act
    StringBuffer actualFormatResult = rfc3339DateFormat.format(date, toAppendTo, new FieldPosition(1));

    // Assert
    assertEquals("foo1970-01-01T00:00:00.000Z", toAppendTo.toString());
    assertSame(toAppendTo, actualFormatResult);
  }

  /**
   * Test new {@link RFC3339DateFormat} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link RFC3339DateFormat}
   */
  @Test
  @DisplayName("Test new RFC3339DateFormat (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void RFC3339DateFormat.<init>()"})
  void testNewRFC3339DateFormat() {
    // Arrange and Act
    RFC3339DateFormat actualRfc3339DateFormat = new RFC3339DateFormat();

    // Assert
    assertTrue(actualRfc3339DateFormat.getNumberFormat() instanceof DecimalFormat);
    assertTrue(actualRfc3339DateFormat.getCalendar() instanceof GregorianCalendar);
  }
}
