package com.symphony.bdk.core.activity.parsing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CashtagDiffblueTest {
  /**
   * Test {@link Cashtag#toString()}.
   *
   * <p>Method under test: {@link Cashtag#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String Cashtag.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("Text", new Cashtag("Text", "42").toString());
  }
}
